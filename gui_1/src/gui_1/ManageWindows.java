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
public class ManageWindows extends JFrame{
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
		public ManageWindows() {
			this.setTitle("管理员界面");
			JPanel panel = new JPanel();
			GroupLayout groupLayout = new GroupLayout(this.getContentPane());
			groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
					.addComponent(panel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
			);
			groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
			);
			
			JLabel lblNewLabel = new JLabel("管理员界面");
			lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 29));
			
			JButton btnNewButton = new JButton("表查阅");
			
			JButton btnNewButton_1 = new JButton("权限修改");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			
			JButton btnNewButton_2 = new JButton("信息管理");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			
			JButton btnNewButton_3 = new JButton("返回");
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					resettoWelcomCover(e);
				}
			});
			GroupLayout gl_panel = new GroupLayout(panel);
			gl_panel.setHorizontalGroup(
				gl_panel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel.createSequentialGroup()
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel.createSequentialGroup()
								.addGap(130)
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
									.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
									.addGroup(gl_panel.createSequentialGroup()
										.addGap(10)
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
											.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
											.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
											.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)))))
							.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(91, Short.MAX_VALUE))
			);
			gl_panel.setVerticalGroup(
				gl_panel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel.createSequentialGroup()
						.addComponent(btnNewButton_3)
						.addGap(4)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addGap(18))
			);
			panel.setLayout(gl_panel);
			this.getContentPane().setLayout(groupLayout);
			this.setBounds(100,100,400,400);
			this.setLocationRelativeTo(null);

		}
		protected void resettoWelcomCover(ActionEvent e) {
			// TODO Auto-generated method stub
			this.setVisible(false);
			new WelcomCover().setVisible(true);
		}
}
		

