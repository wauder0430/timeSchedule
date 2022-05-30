package dialog;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import product.ScheduleButton;

public class RegDialog extends JFrame{
	
	JLabel lb1 = new JLabel("���Ǹ�");
	JLabel lb2 = new JLabel("���۽ð�");
	JLabel lb3 = new JLabel("����ð�");
	JTextField clazzTF = new JTextField(10);
	JCheckBox cb1 = new JCheckBox("����");
	JCheckBox cb2 = new JCheckBox("���");
	JCheckBox cb3 = new JCheckBox("�ǽð� ����");
	String wayInfo = "����";
	// 10�̸� ���� 20�̸� �ð�����
	int errorInt = 10;
	int errorStr = 10;
	
	public static JButton regBtn1;
	
	public int v = 0;
	public static int regNum;
	
	JComboBox<String> dCom;
	JComboBox<String> sCom;
	JComboBox<String> eCom;
	
	
	public RegDialog() {
		
		
		
		
		Dimension frameSize = this.getSize(); // ������ ������
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); // ����� ������
		this.setLocation((screenSize.width - frameSize.width)/2-125, 150); // ȭ�� �߾�
		this.setSize(250, 300);
		this.setVisible(true);
		GridBagLayout gbl = new GridBagLayout();
		this.setLayout(gbl);
		GridBagConstraints[] gbc = new GridBagConstraints[12];
		for(int i=0; i<12; i++)
			gbc[i] = new GridBagConstraints();
		
		
		//���Ǹ� ���
		gbc[0].gridx = 1;
		gbc[0].gridy = 0;
		this.add(lb1,gbc[0]);
		
		
		
		gbc[1].gridx = 2;
		gbc[1].gridy = 0;
		this.add(clazzTF,gbc[1]);
		
		//Box wayBox = Box.createVerticalBox();
		
		//���� ��� ���
		
		
		ButtonGroup bg = new ButtonGroup();		//üũ �ڽ� ������ �� �ϳ��� ���õǵ��� ����
		gbc[2].gridx = 1;
		gbc[2].gridy = 1;
		gbc[3].gridx = 1;
		gbc[3].gridy = 2;
		gbc[4].gridx = 1;
		gbc[4].gridy = 3;
		bg.add(cb1);
		bg.add(cb2);
		bg.add(cb3);
		this.add(cb1,gbc[2]);
		this.add(cb2,gbc[3]);
		this.add(cb3,gbc[4]);
		//wayBox.add(new JCheckBox("����"));
		//wayBox.add(new JCheckBox("���"));
		//wayBox.add(new JCheckBox("�ǽð� ����"));
		
		//����� üũ�Ǿ��ִ��� Ȯ��
		cb1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED)
					wayInfo = "���";	//���
			}
		});
		cb2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED)
					wayInfo = "����";	//����
			}
		});
		cb3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED)
					wayInfo = "�ǽð� ����";	//�ǽð�
			}
		});
		
		
		
		//���� ���� ���
		
		String dDay[] = {"��","ȭ","��","��","��","��"};
		dCom = new JComboBox<String>(dDay);
		JScrollPane dDayScroll = new JScrollPane(dCom);
		gbc[5].gridx = 2;
		gbc[5].gridy = 4;
		this.add(dDayScroll, gbc[5]);
		//���� �ð� ���� �ð� ���
		
		String sTime[] = {"09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", 
				"15:30", "16:00", "16:30", "17:00", "17:30", };
		String eTime[] = {"09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", 
				"15:30", "16:00", "16:30", "17:00", "17:30", "18:00"};
		sCom = new JComboBox<String>(sTime);
		JScrollPane sTimeScroll = new JScrollPane(sCom);
		gbc[6].gridx = 1;
		gbc[6].gridy = 5;
		this.add(lb2,gbc[6]);
		gbc[7].gridx = 2;
		gbc[7].gridy = 5;
		this.add(sTimeScroll,gbc[7]);
		eCom = new JComboBox<String>(eTime);
		JScrollPane eTimeScroll = new JScrollPane(eCom);
		gbc[8].gridx = 1;
		gbc[8].gridy = 6;
		this.add(lb3,gbc[8]);
		gbc[9].gridx = 2;
		gbc[9].gridy = 6;
		this.add(eTimeScroll,gbc[9]);
		
		
		//��� ��� ��ư 
		regBtn1 = new JButton("���");
		JButton endBtn1 = new JButton("���");
		gbc[10].gridx = 1;
		gbc[10].gridy = 7;
		this.add(regBtn1,gbc[10]);
		gbc[11].gridx = 2;
		gbc[11].gridy = 7;
		this.add(endBtn1,gbc[11]);
		
		//��Ͻ�
		regBtn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//���ǹ�� ���þȵ�
				if(wayInfo=="����") {
					JOptionPane.showMessageDialog(null, "���� ����� �������ּ���");
					errorInt = 20;
					return;
				}
				try {
					new RegInFile();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				insertData();
				
				
				if(errorInt==20 ) {
					errorInt = 10;
					dispose();
				}
				
				else {
					try {
						new RegOutFile();
						
					} catch(Exception e1) {
						e1.getStackTrace();
					}
					
					
					new ScheduleButton();
					
					
					JOptionPane.showMessageDialog(null,"��ϵǾ����ϴ�.\n�ð�ǥ ����� �����ּ���.");
					
					RegInFile.rIF_init();
					
					dispose();
					
				}
			}
		});
		//��ҽ�
		endBtn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("���\n");
				dispose();
				
			}
		});
	
		
		setResizable(false);
		setLocationRelativeTo(null);
	}

	public void insertData() {
		//���̻� ������
		if(RegData.infoNum >= RegData.MAXNUM) {
			JOptionPane.showMessageDialog(null, "�� �̻� �Է� \n���� �� �����ϴ�.");
			errorInt = 20;
			dispose();
		}
		String clazzName = clazzTF.getText();
		
		String clazzWay = wayInfo;
		
				
		String clazzDay = (String)dCom.getSelectedItem();
		String clazzSTime = (String)sCom.getSelectedItem();
		String clazzETime = (String)eCom.getSelectedItem();
		
		
		//�ð� ���� ����� ���� ����
		String splitEx1 = clazzSTime.split(":")[0];
		String splitEx2 = clazzSTime.split(":")[1];
		String splitEx3 = clazzETime.split(":")[0];
		String splitEx4 = clazzETime.split(":")[1];
					
		int comInt1 = Integer.parseInt(splitEx1)*100 + Integer.parseInt(splitEx2), 
			comInt2 = Integer.parseInt(splitEx3)*100 + Integer.parseInt(splitEx4);
		if(comInt1 >= comInt2) {
			JOptionPane.showMessageDialog(null, "�ð� ����");
			errorInt = 20;
			dispose();
		}
		
		
		RegData.setName(clazzName, regNum);
		RegData.setWay(clazzWay, regNum);
		RegData.setDay(clazzDay, regNum);
		RegData.setSTime(clazzSTime, regNum);
		RegData.setETime(clazzETime, regNum);
		RegData.setState("true",regNum);
		
		ScheduleButton.setDayInfo(clazzDay);
		ScheduleButton.setSTime(clazzSTime);
		ScheduleButton.setETime(clazzETime);
		System.out.printf("����: %s ..\n", clazzName);
		
	}
	
	public static void set_regNum(int num) {
		RegDialog.regNum = num;
	}
	
	
}


