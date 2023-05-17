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
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class MainWindow extends JFrame{
	private JTextField stdid1;
	private JTextField name1;
	private JTextField sex1;
	private JTextField tel1;
	private JTextField sex2;
	private JTextField name2;
	private JTextField sex3;
	private JTextField name3;
	private JTextField tel3;
	private JTextField mail3;
	private JTextField mail1;
	private JTextField stdid2;
	private JTextField stdid3;
	private JTextField mail4;
	private JTextField tel4;
	private JTextField sex4;
	private JTextField name4;
	private JTextField stdid4;
	private JTextField stdidtext;
	private JTextField reviewtext;
	private JTextField mHRtext;
	private JTextField sHRtext;
	private JTextField totalscoretext;
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						new MainWindow().setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
		public MainWindow() {
			this.setTitle("主界面");
			
			JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.setToolTipText("");
			
			JPanel employeeinf = new JPanel();
			tabbedPane.addTab("面试人员信息", null, employeeinf, null);
			
			JTabbedPane employeechange = new JTabbedPane(JTabbedPane.LEFT);
			
			JPanel employeeinf_2 = new JPanel();
			employeechange.addTab("添加信息", null, employeeinf_2, null);
			
			JButton btnNewButton = new JButton("确认添加");
			
			JButton btnNewButton_1 = new JButton("取消");
			
			JButton btnNewButton_2 = new JButton("返回");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					resettoWelcomCover(e);
				}
			});
			
			stdid1 = new JTextField();
			stdid1.setColumns(10);
			
			JLabel lblNewLabel_4 = new JLabel("姓名");
			lblNewLabel_4.setFont(new Font("微软雅黑", Font.PLAIN, 17));
			
			JLabel lblNewLabel_5 = new JLabel("性别");
			lblNewLabel_5.setFont(new Font("微软雅黑", Font.PLAIN, 17));
			
			JLabel lblNewLabel_5_1 = new JLabel("电话");
			lblNewLabel_5_1.setFont(new Font("微软雅黑", Font.PLAIN, 17));
			
			JLabel lblNewLabel = new JLabel("学号");
			lblNewLabel.setFont(new Font("微软雅黑", Font.PLAIN, 17));
			
			name1 = new JTextField();
			name1.setColumns(10);
			
			sex1 = new JTextField();
			sex1.setColumns(10);
			
			tel1 = new JTextField();
			tel1.setColumns(10);
			
			JLabel lblNewLabel_5_1_1 = new JLabel("邮箱");
			lblNewLabel_5_1_1.setFont(new Font("微软雅黑", Font.PLAIN, 17));
			
			mail1 = new JTextField();
			mail1.setColumns(10);
			GroupLayout gl_employeeinf_2 = new GroupLayout(employeeinf_2);
			gl_employeeinf_2.setHorizontalGroup(
				gl_employeeinf_2.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_employeeinf_2.createSequentialGroup()
						.addGroup(gl_employeeinf_2.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_employeeinf_2.createSequentialGroup()
								.addGap(10)
								.addComponent(btnNewButton_2))
							.addGroup(gl_employeeinf_2.createSequentialGroup()
								.addGap(95)
								.addComponent(lblNewLabel)
								.addGap(18)
								.addComponent(stdid1, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_employeeinf_2.createSequentialGroup()
								.addGap(95)
								.addComponent(lblNewLabel_4)
								.addGap(18)
								.addComponent(name1, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_employeeinf_2.createSequentialGroup()
								.addGap(95)
								.addComponent(lblNewLabel_5)
								.addGap(18)
								.addComponent(sex1, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_employeeinf_2.createSequentialGroup()
								.addGap(95)
								.addComponent(lblNewLabel_5_1)
								.addGap(18)
								.addComponent(tel1, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_employeeinf_2.createSequentialGroup()
								.addGap(95)
								.addComponent(lblNewLabel_5_1_1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(mail1, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_employeeinf_2.createSequentialGroup()
								.addGap(80)
								.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(102, Short.MAX_VALUE))
			);
			gl_employeeinf_2.setVerticalGroup(
				gl_employeeinf_2.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_employeeinf_2.createSequentialGroup()
						.addGap(11)
						.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addGap(13)
						.addGroup(gl_employeeinf_2.createParallelGroup(Alignment.LEADING)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_employeeinf_2.createSequentialGroup()
								.addGap(3)
								.addComponent(stdid1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGap(17)
						.addGroup(gl_employeeinf_2.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_employeeinf_2.createSequentialGroup()
								.addGap(1)
								.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
							.addComponent(name1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(17)
						.addGroup(gl_employeeinf_2.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_employeeinf_2.createSequentialGroup()
								.addGap(1)
								.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
							.addComponent(sex1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(21)
						.addGroup(gl_employeeinf_2.createParallelGroup(Alignment.TRAILING)
							.addComponent(tel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNewLabel_5_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_employeeinf_2.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNewLabel_5_1_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addComponent(mail1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(72)
						.addGroup(gl_employeeinf_2.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(103, Short.MAX_VALUE))
			);
			employeeinf_2.setLayout(gl_employeeinf_2);
			
			JPanel employeeinf_2_1 = new JPanel();
			employeechange.addTab("删除信息", null, employeeinf_2_1, null);
			
			JButton btnNewButton_2_2 = new JButton("返回");
			btnNewButton_2_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					resettoWelcomCover(e);
				}
			});
			
			JButton btnNewButton_4 = new JButton("确认删除");
			
			JButton btnNewButton_1_2 = new JButton("取消");
			
			JLabel lblNewLabel_4_2 = new JLabel("性别");
			lblNewLabel_4_2.setFont(new Font("微软雅黑", Font.PLAIN, 17));
			
			sex2 = new JTextField();
			sex2.setColumns(10);
			
			JLabel lblNewLabel_7 = new JLabel("姓名");
			lblNewLabel_7.setFont(new Font("微软雅黑", Font.PLAIN, 17));
			
			name2 = new JTextField();
			name2.setColumns(10);
			
			JLabel lblNewLabel_10 = new JLabel("输入以上任意信息，删除对应的记录");
			lblNewLabel_10.setFont(new Font("微软雅黑", Font.PLAIN, 16));
			
			JLabel lblNewLabel_7_1 = new JLabel("学号");
			lblNewLabel_7_1.setFont(new Font("微软雅黑", Font.PLAIN, 17));
			
			stdid2 = new JTextField();
			stdid2.setColumns(10);
			GroupLayout gl_employeeinf_2_1 = new GroupLayout(employeeinf_2_1);
			gl_employeeinf_2_1.setHorizontalGroup(
				gl_employeeinf_2_1.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_employeeinf_2_1.createSequentialGroup()
						.addGroup(gl_employeeinf_2_1.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_employeeinf_2_1.createSequentialGroup()
								.addGap(10)
								.addComponent(btnNewButton_2_2))
							.addGroup(gl_employeeinf_2_1.createSequentialGroup()
								.addGap(90)
								.addComponent(btnNewButton_4, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(btnNewButton_1_2, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_employeeinf_2_1.createSequentialGroup()
								.addGap(95)
								.addGroup(gl_employeeinf_2_1.createParallelGroup(Alignment.TRAILING)
									.addComponent(lblNewLabel_7)
									.addComponent(lblNewLabel_4_2)
									.addComponent(lblNewLabel_7_1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(gl_employeeinf_2_1.createParallelGroup(Alignment.LEADING)
									.addComponent(stdid2, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
									.addComponent(name2, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
									.addComponent(sex2, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))))
						.addContainerGap(107, Short.MAX_VALUE))
					.addGroup(gl_employeeinf_2_1.createSequentialGroup()
						.addGap(83)
						.addComponent(lblNewLabel_10, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGap(83))
			);
			gl_employeeinf_2_1.setVerticalGroup(
				gl_employeeinf_2_1.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_employeeinf_2_1.createSequentialGroup()
						.addGap(10)
						.addGroup(gl_employeeinf_2_1.createParallelGroup(Alignment.TRAILING)
							.addGroup(gl_employeeinf_2_1.createSequentialGroup()
								.addComponent(btnNewButton_2_2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
								.addGap(39)
								.addComponent(lblNewLabel_7_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
							.addComponent(stdid2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_employeeinf_2_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addComponent(name2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_employeeinf_2_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNewLabel_4_2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addComponent(sex2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(34)
						.addComponent(lblNewLabel_10, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addGap(33)
						.addGroup(gl_employeeinf_2_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnNewButton_4, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnNewButton_1_2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
						.addGap(96))
			);
			employeeinf_2_1.setLayout(gl_employeeinf_2_1);
			GroupLayout gl_employeeinf = new GroupLayout(employeeinf);
			gl_employeeinf.setHorizontalGroup(
				gl_employeeinf.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_employeeinf.createSequentialGroup()
						.addGap(10)
						.addComponent(employeechange, GroupLayout.PREFERRED_SIZE, 488, GroupLayout.PREFERRED_SIZE))
			);
			gl_employeeinf.setVerticalGroup(
				gl_employeeinf.createParallelGroup(Alignment.LEADING)
					.addComponent(employeechange, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
			);
			
			JPanel employeeinf_2_2 = new JPanel();
			employeechange.addTab("查询信息", null, employeeinf_2_2, null);
			
			JButton btnNewButton_2_3 = new JButton("返回");
			btnNewButton_2_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					resettoWelcomCover(e);
				}
			});
			
			JButton btnNewButton_5 = new JButton("确认查询");
			
			JButton btnNewButton_1_3 = new JButton("取消");
			
			JLabel lblNewLabel_4_3 = new JLabel("性别");
			lblNewLabel_4_3.setFont(new Font("微软雅黑", Font.PLAIN, 17));
			
			sex3 = new JTextField();
			sex3.setColumns(10);
			
			JLabel lblNewLabel_8 = new JLabel("姓名");
			lblNewLabel_8.setFont(new Font("微软雅黑", Font.PLAIN, 17));
			
			name3 = new JTextField();
			name3.setColumns(10);
			
			JLabel lblNewLabel_5_4 = new JLabel("电话");
			lblNewLabel_5_4.setFont(new Font("微软雅黑", Font.PLAIN, 17));
			
			tel3 = new JTextField();
			tel3.setColumns(10);
			
			JLabel lblNewLabel_5_1_3 = new JLabel("邮箱");
			lblNewLabel_5_1_3.setFont(new Font("微软雅黑", Font.PLAIN, 17));
			
			mail3 = new JTextField();
			mail3.setColumns(10);
			
			JLabel lblNewLabel_8_1 = new JLabel("学号");
			lblNewLabel_8_1.setFont(new Font("微软雅黑", Font.PLAIN, 17));
			
			stdid3 = new JTextField();
			stdid3.setColumns(10);
			GroupLayout gl_employeeinf_2_2 = new GroupLayout(employeeinf_2_2);
			gl_employeeinf_2_2.setHorizontalGroup(
				gl_employeeinf_2_2.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_employeeinf_2_2.createSequentialGroup()
						.addGroup(gl_employeeinf_2_2.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_employeeinf_2_2.createSequentialGroup()
								.addContainerGap()
								.addComponent(btnNewButton_2_3))
							.addGroup(gl_employeeinf_2_2.createSequentialGroup()
								.addGroup(gl_employeeinf_2_2.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_employeeinf_2_2.createSequentialGroup()
										.addGap(98)
										.addGroup(gl_employeeinf_2_2.createParallelGroup(Alignment.LEADING)
											.addGroup(Alignment.TRAILING, gl_employeeinf_2_2.createSequentialGroup()
												.addComponent(lblNewLabel_5_1_3, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
												.addComponent(mail3, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))
											.addGroup(Alignment.TRAILING, gl_employeeinf_2_2.createSequentialGroup()
												.addComponent(lblNewLabel_5_4, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
												.addComponent(tel3, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))
											.addGroup(Alignment.TRAILING, gl_employeeinf_2_2.createSequentialGroup()
												.addComponent(lblNewLabel_4_3, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
												.addComponent(sex3, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))
											.addGroup(Alignment.TRAILING, gl_employeeinf_2_2.createSequentialGroup()
												.addComponent(lblNewLabel_8)
												.addPreferredGap(ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
												.addComponent(name3, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))
											.addGroup(gl_employeeinf_2_2.createSequentialGroup()
												.addComponent(lblNewLabel_8_1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
												.addComponent(stdid3, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)))
										.addGap(14))
									.addGroup(gl_employeeinf_2_2.createSequentialGroup()
										.addGap(84)
										.addComponent(btnNewButton_5, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(btnNewButton_1_3, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)))
								.addGap(165)))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
			);
			gl_employeeinf_2_2.setVerticalGroup(
				gl_employeeinf_2_2.createParallelGroup(Alignment.TRAILING)
					.addGroup(gl_employeeinf_2_2.createSequentialGroup()
						.addContainerGap()
						.addComponent(btnNewButton_2_3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addGap(9)
						.addGroup(gl_employeeinf_2_2.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNewLabel_8_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addComponent(stdid3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_employeeinf_2_2.createParallelGroup(Alignment.BASELINE)
							.addComponent(name3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNewLabel_8, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_employeeinf_2_2.createParallelGroup(Alignment.BASELINE)
							.addComponent(sex3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNewLabel_4_3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addGap(22)
						.addGroup(gl_employeeinf_2_2.createParallelGroup(Alignment.TRAILING)
							.addComponent(tel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNewLabel_5_4, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
						.addGroup(gl_employeeinf_2_2.createParallelGroup(Alignment.TRAILING)
							.addComponent(mail3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNewLabel_5_1_3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addGap(31)
						.addGroup(gl_employeeinf_2_2.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnNewButton_5, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnNewButton_1_3, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
						.addGap(141))
			);
			employeeinf_2_2.setLayout(gl_employeeinf_2_2);
			
			JPanel employeeinf_2_3 = new JPanel();
			employeechange.addTab("更改信息", null, employeeinf_2_3, null);
			
			JButton btnNewButton_2_4 = new JButton("返回");
			btnNewButton_2_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					resettoWelcomCover(e);
				}
			});
			
			JButton btnNewButton_6 = new JButton("确认更改");
			
			JButton btnNewButton_1_4 = new JButton("取消");
			
			JLabel lblNewLabel_5_1_3_1 = new JLabel("邮箱");
			lblNewLabel_5_1_3_1.setFont(new Font("微软雅黑", Font.PLAIN, 17));
			
			mail4 = new JTextField();
			mail4.setColumns(10);
			
			JLabel lblNewLabel_5_4_1 = new JLabel("电话");
			lblNewLabel_5_4_1.setFont(new Font("微软雅黑", Font.PLAIN, 17));
			
			tel4 = new JTextField();
			tel4.setColumns(10);
			
			JLabel lblNewLabel_4_3_1 = new JLabel("性别");
			lblNewLabel_4_3_1.setFont(new Font("微软雅黑", Font.PLAIN, 17));
			
			sex4 = new JTextField();
			sex4.setColumns(10);
			
			JLabel lblNewLabel_8_2 = new JLabel("姓名");
			lblNewLabel_8_2.setFont(new Font("微软雅黑", Font.PLAIN, 17));
			
			name4 = new JTextField();
			name4.setColumns(10);
			
			JLabel lblNewLabel_8_1_1 = new JLabel("学号");
			lblNewLabel_8_1_1.setFont(new Font("微软雅黑", Font.PLAIN, 17));
			
			stdid4 = new JTextField();
			stdid4.setColumns(10);
			GroupLayout gl_employeeinf_2_3 = new GroupLayout(employeeinf_2_3);
			gl_employeeinf_2_3.setHorizontalGroup(
				gl_employeeinf_2_3.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_employeeinf_2_3.createSequentialGroup()
						.addContainerGap()
						.addComponent(btnNewButton_2_4))
					.addGroup(gl_employeeinf_2_3.createSequentialGroup()
						.addGap(79)
						.addComponent(btnNewButton_6, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addComponent(btnNewButton_1_4, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_employeeinf_2_3.createSequentialGroup()
						.addGap(93)
						.addGroup(gl_employeeinf_2_3.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_employeeinf_2_3.createSequentialGroup()
								.addComponent(lblNewLabel_8_1_1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
								.addGap(27)
								.addComponent(stdid4, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_employeeinf_2_3.createSequentialGroup()
								.addComponent(lblNewLabel_8_2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
								.addGap(27)
								.addComponent(name4, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_employeeinf_2_3.createSequentialGroup()
								.addComponent(lblNewLabel_4_3_1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
								.addGap(27)
								.addComponent(sex4, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_employeeinf_2_3.createSequentialGroup()
								.addComponent(lblNewLabel_5_4_1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
								.addGap(27)
								.addComponent(tel4, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_employeeinf_2_3.createSequentialGroup()
								.addComponent(lblNewLabel_5_1_3_1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
								.addGap(27)
								.addComponent(mail4, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))))
			);
			gl_employeeinf_2_3.setVerticalGroup(
				gl_employeeinf_2_3.createParallelGroup(Alignment.TRAILING)
					.addGroup(gl_employeeinf_2_3.createSequentialGroup()
						.addContainerGap()
						.addComponent(btnNewButton_2_4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addGap(35)
						.addGroup(gl_employeeinf_2_3.createParallelGroup(Alignment.LEADING)
							.addComponent(lblNewLabel_8_1_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_employeeinf_2_3.createSequentialGroup()
								.addGap(3)
								.addComponent(stdid4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGap(18)
						.addGroup(gl_employeeinf_2_3.createParallelGroup(Alignment.LEADING)
							.addComponent(lblNewLabel_8_2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_employeeinf_2_3.createSequentialGroup()
								.addGap(3)
								.addComponent(name4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGap(18)
						.addGroup(gl_employeeinf_2_3.createParallelGroup(Alignment.LEADING)
							.addComponent(lblNewLabel_4_3_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_employeeinf_2_3.createSequentialGroup()
								.addGap(3)
								.addComponent(sex4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGap(22)
						.addGroup(gl_employeeinf_2_3.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_employeeinf_2_3.createSequentialGroup()
								.addGap(1)
								.addComponent(lblNewLabel_5_4_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
							.addComponent(tel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(24)
						.addGroup(gl_employeeinf_2_3.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_employeeinf_2_3.createSequentialGroup()
								.addGap(1)
								.addComponent(lblNewLabel_5_1_3_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
							.addComponent(mail4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(40)
						.addGroup(gl_employeeinf_2_3.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnNewButton_6, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnNewButton_1_4, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
						.addGap(105))
			);
			employeeinf_2_3.setLayout(gl_employeeinf_2_3);
			employeeinf.setLayout(gl_employeeinf);
			
			JPanel numbercall = new JPanel();
			tabbedPane.addTab("叫号面板", null, numbercall, null);
			
			JLabel lblNewLabel_2 = new JLabel("numbercall");
			GroupLayout gl_numbercall = new GroupLayout(numbercall);
			gl_numbercall.setHorizontalGroup(
				gl_numbercall.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_numbercall.createSequentialGroup()
						.addGap(142)
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(504, Short.MAX_VALUE))
			);
			gl_numbercall.setVerticalGroup(
				gl_numbercall.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_numbercall.createSequentialGroup()
						.addGap(138)
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(309, Short.MAX_VALUE))
			);
			numbercall.setLayout(gl_numbercall);
			
			JPanel scoreinf = new JPanel();
			tabbedPane.addTab("打分面板", null, scoreinf, null);
			
			JRadioButton rdbtnNewRadioButton = new JRadioButton("更改记录");
			rdbtnNewRadioButton.setFont(new Font("微软雅黑", Font.PLAIN, 15));
			
			JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("删除记录");
			rdbtnNewRadioButton_1.setFont(new Font("微软雅黑", Font.PLAIN, 15));
			
			JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("添加记录");
			rdbtnNewRadioButton_2.setFont(new Font("微软雅黑", Font.PLAIN, 15));
			
			JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("查询记录");
			rdbtnNewRadioButton_3.setFont(new Font("微软雅黑", Font.PLAIN, 15));
			
			JButton btnNewButton_3 = new JButton("确认");
			
			JButton btnNewButton_7 = new JButton("取消");
			
			JLabel lblNewLabel_1 = new JLabel("学号");
			lblNewLabel_1.setFont(new Font("微软雅黑", Font.PLAIN, 17));
			
			stdidtext = new JTextField();
			stdidtext.setColumns(10);
			
			JLabel lblNewLabel_1_1 = new JLabel("评价");
			lblNewLabel_1_1.setFont(new Font("微软雅黑", Font.PLAIN, 17));
			
			reviewtext = new JTextField();
			reviewtext.setColumns(10);
			
			JLabel lblNewLabel_1_1_1 = new JLabel("主HR");
			lblNewLabel_1_1_1.setFont(new Font("微软雅黑", Font.PLAIN, 17));
			
			mHRtext = new JTextField();
			mHRtext.setColumns(10);
			
			JLabel lblNewLabel_1_1_1_1 = new JLabel("副HR");
			lblNewLabel_1_1_1_1.setFont(new Font("微软雅黑", Font.PLAIN, 17));
			
			sHRtext = new JTextField();
			sHRtext.setColumns(10);
			
			JLabel lblNewLabel_1_1_2 = new JLabel("总分数");
			lblNewLabel_1_1_2.setFont(new Font("微软雅黑", Font.PLAIN, 17));
			
			totalscoretext = new JTextField();
			totalscoretext.setColumns(10);
			GroupLayout gl_scoreinf = new GroupLayout(scoreinf);
			gl_scoreinf.setHorizontalGroup(
				gl_scoreinf.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_scoreinf.createSequentialGroup()
						.addGroup(gl_scoreinf.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_scoreinf.createSequentialGroup()
								.addGap(97)
								.addGroup(gl_scoreinf.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_scoreinf.createSequentialGroup()
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(rdbtnNewRadioButton, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(rdbtnNewRadioButton_3, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
									.addGroup(gl_scoreinf.createSequentialGroup()
										.addGap(21)
										.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(btnNewButton_7, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
									.addGroup(gl_scoreinf.createSequentialGroup()
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(gl_scoreinf.createParallelGroup(Alignment.LEADING)
											.addGroup(gl_scoreinf.createSequentialGroup()
												.addGap(8)
												.addComponent(lblNewLabel_1_1_2)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(totalscoretext, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
											.addGroup(gl_scoreinf.createSequentialGroup()
												.addComponent(rdbtnNewRadioButton_2, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
												.addGap(18)
												.addComponent(rdbtnNewRadioButton_1, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))))))
							.addGroup(gl_scoreinf.createSequentialGroup()
								.addGap(111)
								.addGroup(gl_scoreinf.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_scoreinf.createSequentialGroup()
										.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(reviewtext, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))
									.addGroup(gl_scoreinf.createSequentialGroup()
										.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(stdidtext, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))
									.addGroup(gl_scoreinf.createParallelGroup(Alignment.LEADING, false)
										.addGroup(gl_scoreinf.createSequentialGroup()
											.addComponent(lblNewLabel_1_1_1_1, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(sHRtext))
										.addGroup(gl_scoreinf.createSequentialGroup()
											.addComponent(lblNewLabel_1_1_1, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(mHRtext, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))))
						.addContainerGap(127, Short.MAX_VALUE))
			);
			gl_scoreinf.setVerticalGroup(
				gl_scoreinf.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_scoreinf.createSequentialGroup()
						.addGap(43)
						.addGroup(gl_scoreinf.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addComponent(stdidtext, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_scoreinf.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addComponent(reviewtext, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_scoreinf.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNewLabel_1_1_1)
							.addComponent(mHRtext, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_scoreinf.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNewLabel_1_1_1_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
							.addComponent(sHRtext, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_scoreinf.createParallelGroup(Alignment.BASELINE)
							.addComponent(totalscoretext, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNewLabel_1_1_2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addGap(33)
						.addGroup(gl_scoreinf.createParallelGroup(Alignment.TRAILING)
							.addComponent(rdbtnNewRadioButton_1)
							.addComponent(rdbtnNewRadioButton_2))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(gl_scoreinf.createParallelGroup(Alignment.LEADING)
							.addComponent(rdbtnNewRadioButton_3)
							.addComponent(rdbtnNewRadioButton))
						.addGap(28)
						.addGroup(gl_scoreinf.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnNewButton_7, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
						.addGap(81))
			);
			scoreinf.setLayout(gl_scoreinf);
			
			JPanel HRinf = new JPanel();
			tabbedPane.addTab("HR信息", null, HRinf, null);
			
			JLabel lblNewLabel_3 = new JLabel("HR");
			GroupLayout gl_HRinf = new GroupLayout(HRinf);
			gl_HRinf.setHorizontalGroup(
				gl_HRinf.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_HRinf.createSequentialGroup()
						.addGap(190)
						.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(501, Short.MAX_VALUE))
			);
			gl_HRinf.setVerticalGroup(
				gl_HRinf.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_HRinf.createSequentialGroup()
						.addGap(85)
						.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(371, Short.MAX_VALUE))
			);
			HRinf.setLayout(gl_HRinf);
			GroupLayout groupLayout = new GroupLayout(getContentPane());
			groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
					.addGroup(groupLayout.createSequentialGroup()
						.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 501, Short.MAX_VALUE)
						.addContainerGap())
			);
			groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
					.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
			);
			getContentPane().setLayout(groupLayout);
			this.setBounds(100,100,525,500);
			this.setLocationRelativeTo(null);
		}
		protected void resettoWelcomCover(ActionEvent e) {
			// TODO Auto-generated method stub
			this.setVisible(false);
			new WelcomCover().setVisible(true);
		}
}



	

