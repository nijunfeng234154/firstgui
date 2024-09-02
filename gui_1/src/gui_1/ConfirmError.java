package gui_1;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.LayoutStyle.ComponentPlacement;

public class ConfirmError extends JDialog{
	public ConfirmError() {
		   this.setTitle("");
	        this.setVisible(true);
	        this.setLocation(200,200);
	        this.setSize(427,352);
	        //add one label
	        Container contentPane = this.getContentPane();
	        
	        JLabel lblNewLabel = new JLabel("提示");
	        lblNewLabel.setFont(new Font("微软雅黑", Font.PLAIN, 26));
	        
	        JLabel lblNewLabel_1 = new JLabel("操作失败！");
	        lblNewLabel_1.setFont(new Font("微软雅黑", Font.PLAIN, 22));
	        
	        JLabel lblNewLabel_2 = new JLabel("表单中有相同的字段或操作不符合规范");
	        lblNewLabel_2.setFont(new Font("微软雅黑", Font.PLAIN, 16));
	        
	        JButton btnNewButton_1 = new JButton("重试");
	        btnNewButton_1.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		resettoLogin(e);
	        	}
	        });
	        btnNewButton_1.setFont(new Font("微软雅黑", Font.PLAIN, 13));
	        GroupLayout groupLayout = new GroupLayout(getContentPane());
	        groupLayout.setHorizontalGroup(
	        	groupLayout.createParallelGroup(Alignment.TRAILING)
	        		.addGroup(groupLayout.createSequentialGroup()
	        			.addGap(132)
	        			.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
	        			.addContainerGap(134, Short.MAX_VALUE))
	        		.addGroup(groupLayout.createSequentialGroup()
	        			.addContainerGap(60, Short.MAX_VALUE)
	        			.addComponent(lblNewLabel_2)
	        			.addGap(54))
	        		.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
	        			.addGap(148)
	        			.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
	        			.addContainerGap(167, Short.MAX_VALUE))
	        		.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
	        			.addGap(131)
	        			.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
	        			.addContainerGap(150, Short.MAX_VALUE))
	        );
	        groupLayout.setVerticalGroup(
	        	groupLayout.createParallelGroup(Alignment.LEADING)
	        		.addGroup(groupLayout.createSequentialGroup()
	        			.addGap(62)
	        			.addComponent(lblNewLabel)
	        			.addGap(29)
	        			.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
	        			.addGap(30)
	        			.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
	        			.addGap(13)
	        			.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        			.addGap(76))
	        );
	        getContentPane().setLayout(groupLayout);
	        this.setBounds(300,400,400,400);
			this.setLocationRelativeTo(null);

	    }

		protected void resettoLogin(ActionEvent e) {
			// TODO Auto-generated method stub
			this.setVisible(false);
			new login().setVisible(true);
		}
}
