package dialog;

import java.io.FileWriter;
import java.io.Writer;

public class RegOutFile {
	
	static int info1;
	public RegOutFile() throws Exception{

		Writer writer = new FileWriter("test.txt",true);
		
		String wr1 = RegData.getName(info1);
		String wr2 = RegData.getWay(info1);
		String wr3 = RegData.getDay(info1);
		String wr4 = RegData.getSTime(info1);
		String wr5 = RegData.getETime(info1);
		String wr6 = RegData.getState(info1);
		//후에 스플릿기능을 사용하기 위함
		String regSplit ="##";
		
	
		writer.write(wr1);writer.flush();writer.write(regSplit);
		writer.write(wr2);writer.flush();writer.write(regSplit);
		writer.write(wr3);writer.flush();writer.write(regSplit);
		writer.write(wr4);writer.flush();writer.write(regSplit);
		writer.write(wr5);writer.flush();writer.write(regSplit);
		writer.write(wr6);writer.flush();writer.write(regSplit);
		writer.write("\n");
		writer.close();
	}
	
	public static void set_info1(int num) {
		RegOutFile.info1 = num;
	}
}
