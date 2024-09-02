package gui_1;
import javax.swing.*;
import java.awt.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Confirmok extends JDialog {
	public Confirmok() {
		setTitle("提示");
		
		JLabel lblNewLabel = new JLabel("提示");
		lblNewLabel.setFont(new Font("微软雅黑", Font.PLAIN, 26));
		
		JLabel lblNewLabel_1 = new JLabel("成功！");
		lblNewLabel_1.setFont(new Font("微软雅黑", Font.PLAIN, 22));
		
		JLabel lblNewLabel_2 = new JLabel("当看到这条时说明所做的操作已成功执行。");
		lblNewLabel_2.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		
		JButton btnNewButton = new JButton("确定");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(66)
							.addComponent(lblNewLabel_2))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(176)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(lblNewLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblNewLabel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(166)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(66, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(33)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(32, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
	}
}
