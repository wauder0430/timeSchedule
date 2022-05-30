package dialog;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class RegData {
	
	public static int infoNum;
	
	public static final int MAXNUM = 30;
	
	public static String clazzName[] = new String[MAXNUM];
	public static String clazzWay[] = new String[MAXNUM];
	public static String clazzDay[] = new String[MAXNUM];
	public static String clazzSTime[] = new String[MAXNUM];
	public static String clazzETime[] = new String[MAXNUM];
	public static String btn_state[] = new String[MAXNUM];
	
	public static String getName(int num) {
		return clazzName[num];
	}
	public static void setName(String clazzName, int num) {
	
		RegData.clazzName[num] = clazzName;
	}
	
	public static String getWay(int num) {
		return clazzWay[num];
	}
	public static void setWay(String clazzWay, int num) {
		RegData.clazzWay[num] = clazzWay;
	}
	
	public static String getDay(int num) {
		return clazzDay[num];
	}
	public static void setDay(String clazzDay, int num) {
		RegData.clazzDay[num] = clazzDay;
	}
	
	public static String getSTime(int num) {
		return clazzSTime[num];
	}
	public static void setSTime(String clazzSTime, int num) {
		RegData.clazzSTime[num] = clazzSTime;
	}
	
	public static String getETime(int num) {
		return clazzETime[num];
	}
	public static void setETime(String clazzETime, int num) {
		RegData.clazzETime[num] = clazzETime;
	}
	
	public static int getInfoNum() {
		return infoNum;
	}
	
	
	public static void numUp() {
		infoNum++;
		
	}
	
	public static void setInfoNum(int num) {
		RegData.infoNum = num;
	}
	
	public static void setState(String btn_state, int num) {
		RegData.btn_state[num] = btn_state;
	}
	public static String getState(int num) {
		return RegData.btn_state[num];
	}
	
	public static void N_btn(int num) {
		RegData.btn_state[num] = "true";
	}
	
	public static void P_btn(int num) {
		RegData.btn_state[num] = "false";
	}
	
}


