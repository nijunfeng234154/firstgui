package gui_1;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;

import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login extends JFrame{
	private JTextField textField;
	private JTextField textField_1;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 new login().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public login() {
		this.setTitle("注册/登入");
		
		JLabel lblNewLabel = new JLabel("欢迎您！HR");
		lblNewLabel.setFont(new Font("微软雅黑", Font.PLAIN, 23));
		
		JButton btnNewButton = new JButton("注册");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				//如果没有和数据匹配就弹出报错
				resettoLoginok(e);
			}
		});
		btnNewButton.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("姓名");
		lblNewLabel_1.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		
		JLabel lblNewLabel_1_1 = new JLabel("授权号");
		lblNewLabel_1_1.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(142)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(232)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(168, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(20)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
					.addGap(38)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(textField)
						.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(50)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1_1)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(100)
					.addComponent(btnNewButton)
					.addGap(69))
		);
		getContentPane().setLayout(groupLayout);
		this.setBounds(400,400,600,600);
		this.setLocationRelativeTo(null);
	}
	protected void resettoLoginok(ActionEvent e) {
		this.setVisible(false);
		new loginok().setVisible(true);
	}
}
