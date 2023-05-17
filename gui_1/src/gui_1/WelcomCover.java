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
import javax.swing.WindowConstants;
import javax.swing.JMenu;
import java.awt.Panel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
public class WelcomCover extends JFrame{
	public WelcomCover(){

	//	JFrame frame = new JFrame();
		this.setTitle("面试人员信息管理系统");
		
		JTextPane textPane = new JTextPane();
		textPane.setText("版权信息：\r\n当前版本：\r\n");
		
		JButton btnNewButton = new JButton("调试模式");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resettoManageWindow(e);
			}
		});
		JButton btnNewButton_1 = new JButton("日志管理");
		
		JButton btnNewButton_2 = new JButton("注册/登入");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resettoMainWindow(e);
			}
		});
		
		JLabel lblNewLabel = new JLabel("面试人员信息管理系统");
		//lblNewLabel.setIcon(new ImageIcon(WelcomCover.class.getResource("/org/eclipse/jface/contentassist/images/content_assist_cue.png")));
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 31));
		
		JButton btnNewButton_2_1 = new JButton("人员签到");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ressettoCheckin(e);
			}
		});
		
		GroupLayout groupLayout = new GroupLayout(this.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(151)
							.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(111)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnNewButton_2, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_2_1, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(54)
							.addComponent(lblNewLabel)))
					.addContainerGap(88, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(28)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addGap(63)
					.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnNewButton_2_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		this.getContentPane().setLayout(groupLayout);
		this.setBounds(100,100,468,453);
		this.setLocationRelativeTo(null);
	}
	protected void ressettoCheckin(ActionEvent e) {
		// TODO Auto-generated method stub
		this.setVisible(false);
		new Checkin().setVisible(true);
	}
	protected void resettoMainWindow(ActionEvent e) {
		// TODO Auto-generated method stub
		this.setVisible(false);
		new login().setVisible(true);
		
	}
	protected void resettoManageWindow(ActionEvent e) {
		// TODO Auto-generated method stub
		this.setVisible(false);
		new MainWindow().setVisible(true);
		//这里需要修改，如果不是面试官不能使用调试模式
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 new WelcomCover().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

