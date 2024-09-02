package gui_1;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.LayoutStyle.ComponentPlacement;

public class InputError extends JDialog{
	public InputError() {
		setTitle("提示");
		
		JButton btnNewButton = new JButton("确定");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resettoMainWindow(e);
			}
		});
		btnNewButton.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		
		JLabel lblNewLabel = new JLabel("提示");
		lblNewLabel.setFont(new Font("微软雅黑", Font.PLAIN, 26));
		
		JLabel lblNewLabel_1 = new JLabel("输入错误");
		lblNewLabel_1.setFont(new Font("微软雅黑", Font.PLAIN, 22));
		
		JLabel lblNewLabel_2 = new JLabel("您的输入格式不正确");
		lblNewLabel_2.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(166)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(141, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(141, Short.MAX_VALUE)
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
					.addGap(137))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(161)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(164, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(36)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(20, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
	}

	protected void resettoMainWindow(ActionEvent e) {
		// TODO Auto-generated method stub
		this.setVisible(false);
	}
}
