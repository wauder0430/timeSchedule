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
		setTitle("전주대 시간표");
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
		String[] itemTitle1 = { "시간표 등록" };
		//JMenu setMenu = new JMenu("설정");
		//JMenu etcMenu = new JMenu("기타");
		//mb.add(setMenu);
		//mb.add(etcMenu);
		
		setJMenuBar(mb);	//메뉴바를 프레임에 붙임
		
	}
	
	public JTabbedPane createTabbedPane() {
		JTabbedPane tPane = new JTabbedPane();
		tPane.addTab("시간표", new TimeTable());
		
		//나중에 기능추가
		//tPane.addTab("과제 보기", new MyPanel2());
		//tPane.addTab("강의 현황", new MyPanel3());
		return tPane;
	}
	
	
}

