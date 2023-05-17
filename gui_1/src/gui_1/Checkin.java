package gui_1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Checkin extends JFrame{
	private JTextField textField;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 new Checkin().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Checkin() {
		this.setTitle("签到面板");
		
		JLabel lblNewLabel = new JLabel("欢迎！请输入学号签到");
		lblNewLabel.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("确认");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resettoCheckinok(e);
			}
		});
		btnNewButton.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		
		JButton btnNewButton_1 = new JButton("取消");
		btnNewButton_1.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		
		JButton btnNewButton_2 = new JButton("返回");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resettoWelcomCover(e);
			}
		});
		btnNewButton_2.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(419, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(120)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
							.addGap(124))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE))
							.addContainerGap())))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addGap(7)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addGap(74)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton))
					.addContainerGap(216, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
		this.setBounds(100,100,450,400);
		this.setLocationRelativeTo(null);
	}
	protected void resettoCheckinok(ActionEvent e) {
		// TODO Auto-generated method stub
		this.setVisible(false);
		new Checkinok().setVisible(true);
	}
	protected void resettoWelcomCover(ActionEvent e) {
		// TODO Auto-generated method stub
		this.setVisible(false);
		new WelcomCover().setVisible(true);
	}
}
