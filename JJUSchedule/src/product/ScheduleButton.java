package product;

import javax.swing.JButton;

import javax.swing.JOptionPane;

import dialog.RegData;
import panel.TimeTable;

public class ScheduleButton {
	
	//배열번호
	static int btnInfoNum;
	//버튼x좌표
	static String dayInfo;
	static int day_x;
	//버튼y시작좌표
	static String sTimeInfo;
	static int sTime_y;
	//버튼 y끝좌표
	static String eTimeInfo;
	static int eTime_y;
	
	

	public ScheduleButton() {
		
		
		//x좌표 결정
		switch(dayInfo) {
		case "월":
			day_x = 650;	break;
		case "화":
			day_x = 750;	break;
		case "수":
			day_x = 850;	break;
		case "목":
			day_x = 950;	break;
		case "금":
			day_x = 1050;	break;
		case "토":
			day_x = 1150; 	break;
		}
		//y좌표 시작위치 결정
		switch(sTimeInfo) {
		case "09:00":
			sTime_y = 50;	break;
		case "09:30":
			sTime_y = 80;	break;
		case "10:00":
			sTime_y = 110;	break;
		case "10:30":
			sTime_y = 140;	break;
		case "11:00":
			sTime_y = 170;	break;
		case "11:30":
			sTime_y = 200;	break;
		case "12:00":
			sTime_y = 230;	break;
		case "12:30":
			sTime_y = 260;	break;
		case "13:00":
			sTime_y = 290;	break;
		case "13:30":
			sTime_y = 320;	break;
		case "14:00":
			sTime_y = 350;	break;
		case "14:30":
			sTime_y = 380;	break;
		case "15:00":
			sTime_y = 410;	break;
		case "15:30":
			sTime_y = 440;	break;
		case "16:00":
			sTime_y = 470;	break;
		case "16:30":	
			sTime_y = 500;	break;
		case "17:00":
			sTime_y = 530;	break;
		case "17:30":
			sTime_y = 560;	break;
		default:
			JOptionPane.showMessageDialog(null, "잘못된 시간입니다.");	break;
		}
		//y좌표 끝위치 결정
		switch(eTimeInfo) {
		case "09:30":
			eTime_y = 80;	break;
		case "10:00":
			eTime_y = 110;	break;
		case "10:30":
			eTime_y = 140;	break;
		case "11:00":
			eTime_y = 170;	break;
		case "11:30":
			eTime_y = 200;	break;
		case "12:00":
			eTime_y = 230;	break;
		case "12:30":
			eTime_y = 260;	break;
		case "13:00":
			eTime_y = 290;	break;
		case "13:30":
			eTime_y = 320;	break;
		case "14:00":
			eTime_y = 350;	break;
		case "14:30":
			eTime_y = 380;	break;
		case "15:00":
			eTime_y = 410;	break;
		case "15:30":
			eTime_y = 440;	break;
		case "16:00":
			eTime_y = 470;	break;
		case "16:30":	
			eTime_y = 500;	break;
		case "17:00":
			eTime_y = 530;	break;
		case "17:30":
			eTime_y = 560;	break;
		case "18:00":
			eTime_y = 590;	break;
		default:
			JOptionPane.showMessageDialog(null, "잘못된 시간입니다.");	break;
		}
		
	
		TimeTable.addBtnInfo(day_x, sTime_y, 100, eTime_y - sTime_y);
		
		
	}
	
	public static void setbtnInfoNum(int num) {
		ScheduleButton.btnInfoNum = num;
	}
	
	public static int getInfoNum2() {
		return btnInfoNum;
	}
	public static void setDayInfo(String str) {
		ScheduleButton.dayInfo = RegData.getDay(btnInfoNum);
	}
	public static void setSTime(String str) {
		ScheduleButton.sTimeInfo = RegData.getSTime(btnInfoNum);
	}
	public static void setETime(String str) {
		ScheduleButton.eTimeInfo = RegData.getETime(btnInfoNum);
	}
	
	
		
}


	
