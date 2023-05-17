package gui_1;
import javax.swing.*;
import java.awt.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Checkinok extends JDialog {
    //construct method 构造方法初始化弹窗样式
    Checkinok(){
        this.setTitle("");
        this.setVisible(true);
        this.setLocation(200,200);
        this.setSize(427,352);
        //add one label
        Container contentPane = this.getContentPane();
        
        JLabel lblNewLabel = new JLabel("提示");
        lblNewLabel.setFont(new Font("微软雅黑", Font.PLAIN, 26));
        
        JLabel lblNewLabel_1 = new JLabel("签到成功！");
        lblNewLabel_1.setFont(new Font("微软雅黑", Font.PLAIN, 22));
        
        JButton btnNewButton = new JButton("返回");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		resettoWelcomCover(e);
        	}
        });
        btnNewButton.setFont(new Font("微软雅黑", Font.PLAIN, 13));
        
        JButton btnNewButton_1 = new JButton("继续签到");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		resettoCheckin(e);
        	}
        });
        btnNewButton_1.setFont(new Font("微软雅黑", Font.PLAIN, 13));
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(145)
        					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(81)
        					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
        					.addGap(27)
        					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(130)
        					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(94, Short.MAX_VALUE))
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(61)
        			.addComponent(lblNewLabel)
        			.addGap(36)
        			.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
        			.addGap(55)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        			.addContainerGap())
        );
        getContentPane().setLayout(groupLayout);
        this.setBounds(300,400,400,400);
		this.setLocationRelativeTo(null);

    }

	protected void resettoCheckin(ActionEvent e) {
		// TODO Auto-generated method stub
		this.setVisible(false);
		new Checkin().setVisible(true);
	}

	protected void resettoWelcomCover(ActionEvent e) {
		// TODO Auto-generated method stub
		this.setVisible(false);
		new WelcomCover().setVisible(true);
	}
}
