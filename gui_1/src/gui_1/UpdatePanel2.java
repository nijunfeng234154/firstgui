package gui_1;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.LayoutStyle.ComponentPlacement;

public class UpdatePanel2 extends JDialog{
	private JTextField text1;
	private JTextField text2;
	private JTextField text3;
	private JTextField text4;
	private JTextField text5;
	public UpdatePanel2() {
		setTitle("更新页面");
		
		JPanel employeeinf_2 = new JPanel();
		
		JLabel lblNewLabel = new JLabel("学号");
		lblNewLabel.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		
		text1 = new JTextField();
		text1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("姓名");
		lblNewLabel_4.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		
		text2 = new JTextField();
		text2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("工作时间");
		lblNewLabel_5.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		
		text3 = new JTextField();
		text3.setColumns(10);
		
		JLabel lblNewLabel_5_1 = new JLabel("电话");
		lblNewLabel_5_1.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		
		text4 = new JTextField();
		text4.setColumns(10);
		
		JButton btnNewButton = new JButton("确认更改");
		
		JButton btnNewButton_1 = new JButton("取消");
		
		text5 = new JTextField();
		text5.setColumns(10);
		
		JLabel lblNewLabel_5_2 = new JLabel("面试组别");
		lblNewLabel_5_2.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		GroupLayout gl_employeeinf_2 = new GroupLayout(employeeinf_2);
		gl_employeeinf_2.setHorizontalGroup(
			gl_employeeinf_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_employeeinf_2.createSequentialGroup()
					.addGap(80)
					.addGroup(gl_employeeinf_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_employeeinf_2.createSequentialGroup()
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_employeeinf_2.createSequentialGroup()
							.addGroup(gl_employeeinf_2.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel_5_2, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_5_1)
								.addComponent(lblNewLabel)
								.addComponent(lblNewLabel_4)
								.addComponent(lblNewLabel_5))
							.addGap(18)
							.addGroup(gl_employeeinf_2.createParallelGroup(Alignment.LEADING)
								.addComponent(text5, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
								.addComponent(text4, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
								.addComponent(text3, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
								.addComponent(text2, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
								.addComponent(text1, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))))
					.addGap(399))
		);
		gl_employeeinf_2.setVerticalGroup(
			gl_employeeinf_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_employeeinf_2.createSequentialGroup()
					.addGap(47)
					.addGroup(gl_employeeinf_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(text1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_employeeinf_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(text2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_employeeinf_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(text3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addGap(21)
					.addGroup(gl_employeeinf_2.createParallelGroup(Alignment.TRAILING)
						.addComponent(text4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(21)
					.addGroup(gl_employeeinf_2.createParallelGroup(Alignment.TRAILING)
						.addComponent(text5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5_2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(89)
					.addGroup(gl_employeeinf_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(124, Short.MAX_VALUE))
		);
		employeeinf_2.setLayout(gl_employeeinf_2);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(employeeinf_2, GroupLayout.PREFERRED_SIZE, 419, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(employeeinf_2, GroupLayout.PREFERRED_SIZE, 466, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
	}
}
