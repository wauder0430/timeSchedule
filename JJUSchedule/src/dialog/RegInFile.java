package dialog;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import panel.TimeTable;
import product.ScheduleButton;



public class RegInFile {
	
	static int fileNo;
	public RegInFile() throws IOException {
		  
		System.out.printf("레그다이알로그에서 등록버튼을 눌러 레그인파일 실행됨\n");
		
		Reader reader1 = new FileReader("test.txt");
		BufferedReader in = new BufferedReader(new FileReader("test.txt")); 
		while(in.readLine() != null) 
			fileNo++; 
			
		reader1.close();
		System.out.println(fileNo);
		RegDialog.set_regNum(fileNo);
		RegData.setInfoNum(fileNo);
		RegOutFile.set_info1(fileNo);
		ScheduleButton.setbtnInfoNum(fileNo);
		TimeTable.set_TBtnInfoNum(fileNo);
		
		
	}
	
	public static int rIF() {
		System.out.printf("파일입력에서 읽은 갯수 : %d\n", fileNo);
		return fileNo; 
	}
	
	public static int rIF_init() {
		fileNo = 0;
		return fileNo;
	}
}
