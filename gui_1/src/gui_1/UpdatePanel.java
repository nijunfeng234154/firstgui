package gui_1;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.LayoutStyle.ComponentPlacement;

public class UpdatePanel extends JDialog{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	public UpdatePanel() {
		setTitle("更新页面");
		
		JPanel employeeinf_2 = new JPanel();
		
		JLabel lblNewLabel = new JLabel("学号");
		lblNewLabel.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("姓名");
		lblNewLabel_4.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("性别");
		lblNewLabel_5.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5_1 = new JLabel("电话");
		lblNewLabel_5_1.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("邮箱");
		lblNewLabel_5_1_1.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("确认更改");
		
		JButton btnNewButton_1 = new JButton("取消");
		GroupLayout gl_employeeinf_2 = new GroupLayout(employeeinf_2);
		gl_employeeinf_2.setHorizontalGroup(
			gl_employeeinf_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 419, Short.MAX_VALUE)
				.addGroup(gl_employeeinf_2.createSequentialGroup()
					.addGroup(gl_employeeinf_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_employeeinf_2.createSequentialGroup()
							.addGap(95)
							.addComponent(lblNewLabel)
							.addGap(18)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_employeeinf_2.createSequentialGroup()
							.addGap(95)
							.addComponent(lblNewLabel_4)
							.addGap(18)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_employeeinf_2.createSequentialGroup()
							.addGap(95)
							.addComponent(lblNewLabel_5)
							.addGap(18)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_employeeinf_2.createSequentialGroup()
							.addGap(95)
							.addComponent(lblNewLabel_5_1)
							.addGap(18)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_employeeinf_2.createSequentialGroup()
							.addGap(95)
							.addComponent(lblNewLabel_5_1_1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_employeeinf_2.createSequentialGroup()
							.addGap(80)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(117, Short.MAX_VALUE))
		);
		gl_employeeinf_2.setVerticalGroup(
			gl_employeeinf_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 466, Short.MAX_VALUE)
				.addGroup(gl_employeeinf_2.createSequentialGroup()
					.addGap(55)
					.addGroup(gl_employeeinf_2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_employeeinf_2.createSequentialGroup()
							.addGap(3)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(17)
					.addGroup(gl_employeeinf_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_employeeinf_2.createSequentialGroup()
							.addGap(1)
							.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(17)
					.addGroup(gl_employeeinf_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_employeeinf_2.createSequentialGroup()
							.addGap(1)
							.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(21)
					.addGroup(gl_employeeinf_2.createParallelGroup(Alignment.TRAILING)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_employeeinf_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_5_1_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(72)
					.addGroup(gl_employeeinf_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(121, Short.MAX_VALUE))
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
