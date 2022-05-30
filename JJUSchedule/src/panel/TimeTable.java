package panel;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.*;

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

import dialog.RegData;
import dialog.RegDialog;
import dialog.RegInFile;
import product.ScheduleButton;



public class TimeTable extends JPanel {
	
	
	public static int boundsInt1=0;
	public static int boundsInt2=0;
	public static int boundsInt3=0;
	public static int boundsInt4=0;
	public JButton testBtn = new JButton(new ImageIcon("�ð�ǥ���.jpg"));
	//��ư ��ȣ
	public boolean bb = false;
	public static JButton regBtn;
	public static JButton initBtn;
	public static JButton MondayBtn;
	
	public static JButton testBtnEx[] = new JButton[30];
	public static int TBtnInfoNum;
	
	
	public TimeTable() {
	
		
		setLayout(null);
		
		
		JLabel [] label = new JLabel [6];
		String[] day = { "��","ȭ","��","��","��","��"};
		JLabel [] tLabel = new JLabel [9];
		JLabel [][] mLabel = new JLabel [6][18];
		
		
		
		
		//RegDialog.regBtn1.addActionListener(listentestBtn);
		
		
		
		//����
		for(int i=0; i<label.length; i++) {

			label[i] = new JLabel(day[i]);
			label[i].setFont(new Font("���� ���",Font.ITALIC,20));
			label[i].setHorizontalAlignment(JLabel.CENTER);
			label[i].setSize(100,50);
			label[i].setLocation(i*100+650,0);
			label[i].setBackground(Color.decode("#f0f0f0")); 
			//label[i].setOpaque(true);
			label[i].setBorder(new LineBorder(Color.black,1));
			add(label[i]);

		}
		//�ð�
		for(int i=0; i<tLabel.length; i++) {

			tLabel[i] = new JLabel(Integer.toString(i+9));
			tLabel[i].setFont(new Font("���� ���",Font.ITALIC,20));
			tLabel[i].setHorizontalAlignment(JLabel.CENTER);
			tLabel[i].setSize(100,60);
			tLabel[i].setLocation(550,60*i+50);
			tLabel[i].setBackground(Color.decode("#f0f0f0")); 		//�� ���� ���
			//tLabel[i].setOpaque(true);
			tLabel[i].setBorder(new LineBorder(Color.black,1));
			add(tLabel[i]);
			
		}
		//�ð�ǥĭ
		for(int i=0; i<mLabel.length; i++) {
			for(int j=0; j<mLabel[i].length; j++) {
			mLabel[i][j] = new JLabel();
			mLabel[i][j].setSize(100,30);
			mLabel[i][j].setLocation(100*i+650,30*j+50);
			if(j%2 == 0)
				mLabel[i][j].setBackground(Color.decode("#ffffff")); 
			else
				mLabel[i][j].setBackground(Color.decode("#fcfcfc")); 
			//mLabel[i][j].setOpaque(true);
			mLabel[i][j].setBorder(new MatteBorder(0,1,1,1,Color.BLACK));
			add(mLabel[i][j]);
			}

		}
		
//RegDialog���� ��Ϲ�ư�� ������ �ð�ǥ ��ư�� ������
		
		//���� ��� ��ư
		regBtn = new JButton(new ImageIcon("���ǵ��.jpg"));
		regBtn.setToolTipText("���Ǹ� ����մϴ�.");
		this.add(regBtn);
		regBtn.setBorderPainted(false);//�ܰ���
		regBtn.setContentAreaFilled(false);//���뿪�� ä��� ����			
		regBtn.setMargin(new Insets(0,0,0,0));		//���� ���� setMargin
		regBtn.setFont(new Font("���� ���",Font.ITALIC,20));		//font����
		regBtn.setSize(250,80);
		regBtn.setLocation(280, 40);
		regBtn.setVisible(true);
		regBtn.addActionListener(new ActionListener() {
					
			public void actionPerformed(ActionEvent e) {
						
					new RegDialog();
						
				}
						
		});
		
		//������ ��ư
		MondayBtn = new JButton(new ImageIcon("�������ʱ�ȭ.jpg"));
		MondayBtn.setToolTipText("��� ���Ǹ� �̼��� ���·� ����ϴ�.");
		add(MondayBtn);
		MondayBtn.setBorderPainted(false);//�ܰ���
		MondayBtn.setContentAreaFilled(false);//���뿪�� ä��� ����			regBtn.setBackground(Color.WHITE);
		MondayBtn.setMargin(new Insets(0,0,0,0));		//���� ���� setMargin
		MondayBtn.setFont(new Font("���� ���",Font.ITALIC,20));		//font����
		MondayBtn.setSize(250,80);
		MondayBtn.setLocation(280, 200);
		MondayBtn.setVisible(true);
		MondayBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				int result2 = JOptionPane.showConfirmDialog(null,"������ �ʱ�ȭ �Ͻðڽ��ϱ�??","Confirm",JOptionPane.YES_NO_OPTION);
				
				if(result2 == JOptionPane.CLOSED_OPTION) {
					
				}
					
				else if(result2 == JOptionPane.YES_OPTION) {//==
					for(int i=0; i<RegData.infoNum; i++) {
						String wayInfo3 = RegData.getWay(i);
						switch(wayInfo3) {
		            	case "���":
		            		testBtnEx[i].setBackground(Color.decode("#ffc4dd")); break;
		            	case "����":
		            		testBtnEx[i].setBackground(Color.decode("#D5FFC4")); break;
		            	case "�ǽð� ����":
		            		testBtnEx[i].setBackground(Color.decode("#C2D3FC")); break;
		            	}
					}
					
					new ClickOut2();
						
					
				}
					
				else {
					
				}
				
			}
		});
		
		
		//�ʱ�ȭ��ư
			
		initBtn = new JButton(new ImageIcon("�ð�ǥ�ʱ�ȭ.jpg"));
		initBtn.setToolTipText("�ð�ǥ�� �ʱ�ȭ�մϴ�.");
		add(initBtn);
		initBtn.setBorderPainted(false);//�ܰ���
		initBtn.setContentAreaFilled(false);//���뿪�� ä��� ����			regBtn.setBackground(Color.WHITE);
		initBtn.setMargin(new Insets(0,0,0,0));		//���� ���� setMargin
		initBtn.setFont(new Font("���� ���",Font.ITALIC,20));		//font����
		initBtn.setSize(250,80);
		initBtn.setLocation(280, 280);
		initBtn.setVisible(true);
		initBtn.addActionListener(new ActionListener() {
						
			public void actionPerformed(ActionEvent e) {
							
					int result = JOptionPane.showConfirmDialog(null,"�ʱ�ȭ �Ͻðڽ��ϱ�?","Confirm",JOptionPane.YES_NO_OPTION);
					
					if(result == JOptionPane.CLOSED_OPTION) {
						
					}
						
					else if(result == JOptionPane.YES_OPTION) {
						for(int i=0; i<RegData.infoNum; i++) {
							testBtnEx[i].setVisible(false);
						}
						RegData.setInfoNum(0);
						File file = new File("test.txt"); 
						if( file.exists() ){ 
							if(file.delete()){ 
								System.out.println("���ϻ��� ����"); 
								}else{ 
									System.out.println("���ϻ��� ����"); 
									} 
							}
						else{ 
							System.out.println("������ �������� �ʽ��ϴ�."); 
							}
				    }
						
					else {
						
					}
						
								
				}
							
		});
		//�ð�ǥ��Ϲ�ư		
		add(testBtn);
		testBtn.setToolTipText("���� �ð�ǥ�� �߰���ŵ�ϴ�.");
		testBtn.setBorderPainted(false);//�ܰ���
		testBtn.setContentAreaFilled(false);//���뿪�� ä��� ����
		testBtn.setBackground(Color.WHITE);
		testBtn.setMargin(new Insets(0,0,0,0));		//���� ���� setMargin
		testBtn.setFont(new Font("���� ���",Font.ITALIC,20));		//font����
		testBtn.setSize(250,80);
		testBtn.setLocation(280, 120);
		
		
		
		
		testBtn.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				
                testBtnEx[TBtnInfoNum] = new JButton(RegData.getName(TBtnInfoNum));
                testBtnEx[TBtnInfoNum].setBounds(boundsInt1,boundsInt2,boundsInt3,boundsInt4);
                testBtnEx[TBtnInfoNum].setFocusPainted(false);
                
              //�����
            	//String wayInfo1 = RegData.getWay(TBtnInfoNum);
            	switch(RegData.getWay(TBtnInfoNum)) {
            	case "���":
            		testBtnEx[TBtnInfoNum].setBackground(Color.decode("#ffc4dd")); break;
            	case "����":
            		testBtnEx[TBtnInfoNum].setBackground(Color.decode("#D5FFC4")); break;
            	case "�ǽð� ����":
            		testBtnEx[TBtnInfoNum].setBackground(Color.decode("#C2D3FC")); break;
            	}
            	add(testBtnEx[TBtnInfoNum]);
            	
            	repaint();
            	System.out.println(TBtnInfoNum);
            	int TBtnInfoNum2 = TBtnInfoNum;
            	TBtnInfoNum++;
            	RegData.numUp();
            	
            	testBtnEx[TBtnInfoNum2].addActionListener(new ActionListener() {
        			
        			@Override
        			public void actionPerformed(ActionEvent e) {
        				
        				switch(RegData.getWay(TBtnInfoNum2)) {
        	        	case "���":
        	        		switch(RegData.btn_state[TBtnInfoNum2]) {
        	        		case "false":
        	        			RegData.N_btn(TBtnInfoNum2);
        	        			testBtnEx[TBtnInfoNum2].setBackground(Color.decode("#ffc4dd")); new ClickOut();
        	        			break;
        	        		case "true":
        	        			RegData.P_btn(TBtnInfoNum2);
        	        			testBtnEx[TBtnInfoNum2].setBackground(Color.decode("#f368a3")); new ClickOut();
        	        			break;
        	        		}
        	        		break;
        	        	case "����":
        	        		switch(RegData.btn_state[TBtnInfoNum2]) {
        	        		case "false":
        	        			RegData.N_btn(TBtnInfoNum2);
        	        			testBtnEx[TBtnInfoNum2].setBackground(Color.decode("#D5FFC4")); new ClickOut();
        	        			break;
        	        		case "true":
        	        			RegData.P_btn(TBtnInfoNum2);
        	        			testBtnEx[TBtnInfoNum2].setBackground(Color.decode("#44e10e")); new ClickOut();
        	        			break;
        	        		}
        	        		break;
        	        		
        	        	case "�ǽð� ����":
        	        		switch(RegData.btn_state[TBtnInfoNum2]) {
        	        		case "false":
        	        			RegData.N_btn(TBtnInfoNum2);
        	        			testBtnEx[TBtnInfoNum2].setBackground(Color.decode("#C2D3FC")); 
        	        			new ClickOut();
        	        			break;
        	        		case "true":
        	        			RegData.P_btn(TBtnInfoNum2);
        	        			testBtnEx[TBtnInfoNum2].setBackground(Color.decode("#92abed")); 
        	        			new ClickOut();
        	        			break;
        	        		}
        	        		break;
        	        		
        	        	}
        				
        			}
        		});
            
			}
			
		});
		
		
		new TxtRead();
		
		
		//for(int i=0; i<)
		for(int i=0; i<RegData.infoNum; i++) {
			ScheduleButton.setbtnInfoNum(i);
			ScheduleButton.setDayInfo(RegData.clazzDay[i]);
			ScheduleButton.setSTime(RegData.clazzSTime[i]);
			ScheduleButton.setETime(RegData.clazzETime[i]);
			
			new ScheduleButton();
			String btn_name = RegData.getName(i);
			testBtnEx[i] = new JButton(btn_name);
            testBtnEx[i].setBounds(boundsInt1,boundsInt2,boundsInt3,boundsInt4);
            testBtnEx[i].setFocusPainted(false);
        	String wayInfo1 = RegData.getWay(i);
        	String stateInfo1 = RegData.getState(i);
        	switch(wayInfo1) {
        	case "���":
        		switch(stateInfo1) {
        		case "true":
        			testBtnEx[i].setBackground(Color.decode("#ffc4dd")); break;
        		case "false":
        			testBtnEx[i].setBackground(Color.decode("#f368a3")); break;
        		}
        		break;
        	case "����":
        		switch(stateInfo1) {
        		case "true":
        			testBtnEx[i].setBackground(Color.decode("#D5FFC4")); break;
        		case "false":
        			testBtnEx[i].setBackground(Color.decode("#44e10e")); break;
        		}
        		break;
        		
        	case "�ǽð� ����":
        		switch(stateInfo1) {
        		case "true":
        			testBtnEx[i].setBackground(Color.decode("#C2D3FC")); break;
        		case "false":
        			testBtnEx[i].setBackground(Color.decode("#92abed")); break;
        		}
        		break;
        		
        	}
        	int listenerI = i;
        	
        	add(testBtnEx[i]);
        	
        	testBtnEx[i].addActionListener(new ActionListener() {
    			
    			@Override
    			public void actionPerformed(ActionEvent e) {
    				
    				switch(wayInfo1) {
    	        	case "���":
    	        		switch(RegData.btn_state[listenerI]) {
    	        		case "false":
    	        			RegData.N_btn(listenerI);
    	        			testBtnEx[listenerI].setBackground(Color.decode("#ffc4dd")); new ClickOut();
    	        			break;
    	        		case "true":
    	        			RegData.P_btn(listenerI);
    	        			testBtnEx[listenerI].setBackground(Color.decode("#f368a3")); new ClickOut();
    	        			break;
    	        		}
    	        		break;
    	        	case "����":
    	        		switch(RegData.btn_state[listenerI]) {
    	        		case "false":
    	        			RegData.N_btn(listenerI);
    	        			testBtnEx[listenerI].setBackground(Color.decode("#D5FFC4")); new ClickOut();
    	        			break;
    	        		case "true":
    	        			RegData.P_btn(listenerI);
    	        			testBtnEx[listenerI].setBackground(Color.decode("#44e10e")); new ClickOut();
    	        			break;
    	        		}
    	        		break;
    	        		
    	        	case "�ǽð� ����":
    	        		switch(RegData.btn_state[listenerI]) {
    	        		case "false":
    	        			RegData.N_btn(listenerI);
    	        			testBtnEx[listenerI].setBackground(Color.decode("#C2D3FC")); 
    	        			new ClickOut();
    	        			break;
    	        		case "true":
    	        			RegData.P_btn(listenerI);
    	        			testBtnEx[listenerI].setBackground(Color.decode("#92abed")); 
    	        			new ClickOut();
    	        			break;
    	        		}
    	        		break;
    	        		
    	        	}
    				
    				
    			}
    		});
        	repaint();
        	
		}
		
		
		//���ִ� Ȩ������ ���� ��ư
		JButton JJBtn = new JButton(new ImageIcon("�ִ�.jpg"));
		JJBtn.setToolTipText("���ִ� ����Ʈ�� ����˴ϴ�.");
		JJBtn.setBorderPainted(false);//�ܰ���
		JJBtn.setContentAreaFilled(false);//���뿪�� ä��� ����
		JJBtn.setBackground(Color.WHITE);
		JJBtn.setMargin(new Insets(0,0,0,0));		//���� ���� setMargin
		JJBtn.setFont(new Font("���� ���",Font.ITALIC,20));		//font����
		JJBtn.setSize(200,70);
		JJBtn.setLocation(0, 100);
		add(JJBtn);
		JJBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (Desktop.isDesktopSupported()) {
		            Desktop desktop = Desktop.getDesktop();
		            try {
		                URI uri = new URI("http://www.jj.ac.kr/jj/index.jsp");
		                desktop.browse(uri);
		            } catch (IOException ex) {
		                ex.printStackTrace();
		            } catch (URISyntaxException ex) {
		                ex.printStackTrace();
		            }
				}
			}
		});
		//���ִ� ���̹� ķ�۽� ���� ��ư
		JButton JCBtn = new JButton(new ImageIcon("��ķ.png"));
		JCBtn.setToolTipText("���ִ� ���̹�ķ�۽��� ����˴ϴ�.");
		JCBtn.setBorderPainted(false);//�ܰ���
		JCBtn.setContentAreaFilled(false);//���뿪�� ä��� ����
		JCBtn.setBackground(Color.WHITE);
		JCBtn.setMargin(new Insets(0,0,0,0));		//���� ���� setMargin
		JCBtn.setFont(new Font("���� ���",Font.ITALIC,20));		//font����
		JCBtn.setSize(200,70);
		JCBtn.setLocation(0, 170);
		add(JCBtn);
		JCBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (Desktop.isDesktopSupported()) {
		            Desktop desktop = Desktop.getDesktop();
		            try {
		                URI uri = new URI("https://cyber.jj.ac.kr/login.php");
		                desktop.browse(uri);
		            } catch (IOException ex) {
		                ex.printStackTrace();
		            } catch (URISyntaxException ex) {
		                ex.printStackTrace();
		            }
				}
			}
		});
                
		
		setBackground(Color.WHITE);
		
		
		JButton way1Btn1 = new JButton();
		JButton way1Btn2 = new JButton();
		
		JButton way2Btn1 = new JButton();
		JButton way2Btn2 = new JButton();
		
		JButton way3Btn1 = new JButton();
		JButton way3Btn2 = new JButton();
		
		way1Btn1.setBackground(Color.decode("#ffc4dd"));
		way1Btn2.setBackground(Color.decode("#ec1370"));
		way2Btn1.setBackground(Color.decode("#D5FFC4"));
		way2Btn2.setBackground(Color.decode("#44e10e"));
		way3Btn1.setBackground(Color.decode("#C2D3FC"));
		way3Btn2.setBackground(Color.decode("#1f48b7"));
		

        way1Btn1.setBounds(530,560,10,10);
        way1Btn1.setFocusPainted(false);
        way1Btn2.setBounds(540,560,10,10);
        way1Btn2.setFocusPainted(false);
        way2Btn1.setBounds(530,570,10,10);
        way2Btn1.setFocusPainted(false);
        way2Btn2.setBounds(540,570,10,10);
        way2Btn2.setFocusPainted(false);
        way3Btn1.setBounds(530,580,10,10);
        way3Btn1.setFocusPainted(false);
        way3Btn2.setBounds(540,580,10,10);
        way3Btn2.setFocusPainted(false);
        add(way1Btn1);add(way1Btn2);add(way2Btn1);
        add(way2Btn2);add(way3Btn1);add(way3Btn2);
		
		
	}
	
	public static void addBtnInfo(int x1, int x2, int y1, int y2) {
		
		TimeTable.boundsInt1 = x1;
		TimeTable.boundsInt2 = x2;
		TimeTable.boundsInt3 = y1;
		TimeTable.boundsInt4 = y2;
		
	}
	
	
	public static void set_TBtnInfoNum(int num) {
		TimeTable.TBtnInfoNum = num;
	}
	
	
	
}
