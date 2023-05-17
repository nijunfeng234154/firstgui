package gui_1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Button;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.UIManager;
import javax.swing.JMenu;
import java.awt.Panel;
import java.awt.Window;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import java.awt.Font;
public class MainWindows extends JFrame{
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 new MainWindows().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private JLayeredPane lowestPane;
	private JLayeredPane employeeinf;
	private JLayeredPane scoreinf;
	private JLayeredPane numbercall;
	private JLayeredPane HRinf;
	public MainWindows() {
//		layeredPane=this.getLayeredPane();
//		layeredPane_1=this.getLayeredPane();
//		layeredPane_2=this.getLayeredPane();
//		layeredPane_3=this.getLayeredPane();
		this.setTitle("主界面");
		Panel panel2 = new Panel();
		Panel panel3 = new Panel();
		this.setBounds(100,100,721,535);
		this.setLocationRelativeTo(null);
		
	    lowestPane = new JLayeredPane();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(lowestPane, GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(lowestPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
		);
		
		JButton btnNewButton = new JButton("信息录入");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetPanelemployeeinf(e);
			}
		});
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 17));
		
		JButton btnNewButton_1 = new JButton("打分面板");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetPanelscoreinf(e);
			}
		});
		btnNewButton_1.setFont(new Font("宋体", Font.PLAIN, 17));
		
		JButton btnNewButton_2 = new JButton("叫号面板");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetPanelnumbercall(e);
			}
		});
		btnNewButton_2.setFont(new Font("宋体", Font.PLAIN, 17));
		
		JButton btnHr = new JButton("HR信息录入");
		btnHr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetPanelHRinf(e);
			}
		});
		btnHr.setFont(new Font("宋体", Font.PLAIN, 17));
		
		JSeparator separator = new JSeparator();
		
		employeeinf = new JLayeredPane();
		GroupLayout gl_lowestPane = new GroupLayout(lowestPane);
		gl_lowestPane.setHorizontalGroup(
			gl_lowestPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_lowestPane.createSequentialGroup()
					.addGroup(gl_lowestPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_lowestPane.createSequentialGroup()
							.addGap(83)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
							.addGap(29)
							.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnHr, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_lowestPane.createSequentialGroup()
							.addGap(34)
							.addComponent(separator, GroupLayout.PREFERRED_SIZE, 624, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_lowestPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(employeeinf, GroupLayout.PREFERRED_SIZE, 683, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(14, Short.MAX_VALUE))
		);
		gl_lowestPane.setVerticalGroup(
			gl_lowestPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_lowestPane.createSequentialGroup()
					.addGap(21)
					.addGroup(gl_lowestPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
						.addComponent(btnNewButton_2, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
						.addComponent(btnHr, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
					.addComponent(employeeinf, GroupLayout.PREFERRED_SIZE, 425, GroupLayout.PREFERRED_SIZE))
		);
		
		JLabel lblNewLabel = new JLabel("employee");
		
		scoreinf = new JLayeredPane();
		GroupLayout gl_employeeinf = new GroupLayout(employeeinf);
		gl_employeeinf.setHorizontalGroup(
			gl_employeeinf.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_employeeinf.createSequentialGroup()
					.addGroup(gl_employeeinf.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_employeeinf.createSequentialGroup()
							.addGap(57)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE))
						.addComponent(scoreinf, GroupLayout.PREFERRED_SIZE, 684, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_employeeinf.setVerticalGroup(
			gl_employeeinf.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_employeeinf.createSequentialGroup()
					.addComponent(scoreinf, GroupLayout.PREFERRED_SIZE, 426, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		JLabel lblNewLabel_1 = new JLabel("scoreinf");
		lblNewLabel_1.setBounds(87, 93, 120, 73);
		scoreinf.add(lblNewLabel_1);
		
	    numbercall = new JLayeredPane();
		numbercall.setBounds(0, 0, 684, 426);
		scoreinf.add(numbercall);
		
		JLabel lblNewLabel_1_1 = new JLabel("numbercall");
		
		HRinf = new JLayeredPane();
		GroupLayout gl_numbercall = new GroupLayout(numbercall);
		gl_numbercall.setHorizontalGroup(
			gl_numbercall.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_numbercall.createSequentialGroup()
					.addGroup(gl_numbercall.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_numbercall.createSequentialGroup()
							.addGap(109)
							.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))
						.addComponent(HRinf, GroupLayout.PREFERRED_SIZE, 687, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_numbercall.setVerticalGroup(
			gl_numbercall.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_numbercall.createSequentialGroup()
					.addComponent(HRinf, GroupLayout.PREFERRED_SIZE, 427, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
		);
		
		JLabel lblNewLabel_2 = new JLabel("HRinf");
		lblNewLabel_2.setFont(new Font("宋体", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(233, 130, 120, 74);
		HRinf.add(lblNewLabel_2);
		numbercall.setLayout(gl_numbercall);
		employeeinf.setLayout(gl_employeeinf);
		lowestPane.setLayout(gl_lowestPane);
		getContentPane().setLayout(groupLayout);
		this.numbercall.setVisible(false);
		this.scoreinf.setVisible(false);
		this.employeeinf.setVisible(false);
		this.HRinf.setVisible(false);
	}
	protected void resetPanelHRinf(ActionEvent e) {
		// TODO Auto-generated method stub
		this.employeeinf.setVisible(false);
		this.lowestPane.removeAll();
		this.lowestPane.add(HRinf);
		this.setVisible(true);
	}
	protected void resetPanelnumbercall(ActionEvent e) {
		// TODO Auto-generated method stub
		this.employeeinf.setVisible(false);
		this.lowestPane.removeAll();
		this.lowestPane.add(numbercall);
		this.setVisible(true);
	}
	protected void resetPanelscoreinf(ActionEvent e) {
		// TODO Auto-generated method stub
//		this.lowestPane.moveToFront(scoreinf);
//		this.scoreinf.setVisible(true);
		this.employeeinf.setVisible(false);
		this.lowestPane.removeAll();
		this.lowestPane.add(scoreinf);
		this.setVisible(true);
	}
	protected void resetPanelemployeeinf(ActionEvent e) {
	// TODO Auto-generated method stub
		this.employeeinf.setVisible(false);
		this.lowestPane.removeAll();
		this.lowestPane.add(employeeinf);
		this.setVisible(true);

	}
}
