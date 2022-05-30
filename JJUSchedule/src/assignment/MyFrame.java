package assignment;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;

import panel.MyPanel2;
import panel.MyPanel3;
import panel.TimeTable;


public class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("���ִ� �ð�ǥ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		createMenu();
		JTabbedPane tPane = createTabbedPane();
		c.add(tPane);
		setResizable(false);
		
		setSize(1300,700);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	public void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenuItem[] menuItem1 = new JMenuItem [1];
		String[] itemTitle1 = { "�ð�ǥ ���" };
		//JMenu setMenu = new JMenu("����");
		//JMenu etcMenu = new JMenu("��Ÿ");
		//mb.add(setMenu);
		//mb.add(etcMenu);
		
		setJMenuBar(mb);	//�޴��ٸ� �����ӿ� ����
		
	}
	
	public JTabbedPane createTabbedPane() {
		JTabbedPane tPane = new JTabbedPane();
		tPane.addTab("�ð�ǥ", new TimeTable());
		
		//���߿� ����߰�
		//tPane.addTab("���� ����", new MyPanel2());
		//tPane.addTab("���� ��Ȳ", new MyPanel3());
		return tPane;
	}
	
	
}

