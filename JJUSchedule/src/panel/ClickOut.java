package panel;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import dialog.RegData;

public class ClickOut {
	static int info2 = RegData.infoNum;
	public ClickOut() {
	File file = new File("test.txt");	
	
	if( file.exists() )
		file.delete();
	
	try {
		Writer writer = new FileWriter("test.txt");
		for(int i=0; i<info2; i++) {
			String wr1 = RegData.getName(i);
			String wr2 = RegData.getWay(i);
			String wr3 = RegData.getDay(i);
			String wr4 = RegData.getSTime(i);
			String wr5 = RegData.getETime(i);
			String wr6 = RegData.getState(i);
			//후에 스플릿기능을 사용하기 위함
			String regSplit ="##";
			writer.write(wr1);writer.flush();writer.write(regSplit);
			writer.write(wr2);writer.flush();writer.write(regSplit);
			writer.write(wr3);writer.flush();writer.write(regSplit);
			writer.write(wr4);writer.flush();writer.write(regSplit);
			writer.write(wr5);writer.flush();writer.write(regSplit);
			writer.write(wr6);writer.flush();writer.write(regSplit);
			writer.write("\n");
			
		}
		writer.close();
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	
	}	
}
