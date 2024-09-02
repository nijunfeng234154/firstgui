package gui_1;


import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.List;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
 
//import com.xiaoniucr.dao.StudentDao;
//import com.xiaoniucr.entity.Student;
 
public class UserListView extends JFrame {
 
    private JPanel contentPane;
    private JTable table;
    private JTextField nameText;
 
//    private StudentDao studentDao = new StudentDao();
 
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UserListView frame = new UserListView();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
 
    /**
     * Create the frame.
     */
    public UserListView() {
 
        setTitle("学生列表");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 337);
        setLocationRelativeTo(null);
         
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
 
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 39, 564, 232);
        contentPane.add(scrollPane);
 
        Object[] columns = { "ID", "学号", "姓名", "年级", "添加时间" };// 字段
        Object[][] data = null;// 需要展示的数据，一般是二维数组
        DefaultTableModel model = new DefaultTableModel(data, columns);
        table = new JTable(model);
        //加载学生数据
  //     load(null);
       scrollPane.setViewportView(table);
// 
        JLabel lblNewLabel = new JLabel("姓名");
        lblNewLabel.setBounds(10, 10, 42, 15);
//        contentPane.add(lblNewLabel);
// 
        nameText = new JTextField();
        nameText.setBounds(44, 8, 115, 21);
        contentPane.add(nameText);
       nameText.setColumns(10);
// 
//        //查询按钮
//        JButton searchBtn = new JButton("查询");
//        searchBtn.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                load(nameText.getText());
//            }
//        });
//        searchBtn.setBounds(169, 8, 63, 23);
//        contentPane.add(searchBtn);
// 
//        //添加按钮
//        JButton addBtn = new JButton("添加");
//        addBtn.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
////                AddView view = new AddView();
//                view.setVisible(true);
//            }
//        });
//        addBtn.setBounds(365, 8, 63, 23);
//        contentPane.add(addBtn);
// 
//        //修改按钮
//        JButton updateBtn = new JButton("修改");
//        updateBtn.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                // 获取选中行
//                int row = table.getSelectedRow();
//                if (row < 0) {
//                    JOptionPane.showMessageDialog(contentPane, "请选择一条记录", "系统提示", JOptionPane.WARNING_MESSAGE);
//                    return;
//                }
//                int id = Integer.valueOf(table.getValueAt(row, 0).toString());
////                UpdateView view = new UpdateView(id);
//                view.setVisible(true);
//                 
//            }
//        });
//        updateBtn.setBounds(438, 8, 63, 23);
// 
//        //删除按钮
//        JButton deleteBtn = new JButton("删除");
//        deleteBtn.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                // 获取选中行
//                int row = table.getSelectedRow();
//                if (row < 0) {
//                    JOptionPane.showMessageDialog(contentPane, "请选择一条记录", "系统提示", JOptionPane.WARNING_MESSAGE);
//                    return;
//                }
//                int result = JOptionPane.showConfirmDialog(contentPane, "确认删除该学生吗？", "提示",
//                        JOptionPane.YES_NO_OPTION);
//                if (result == 0) {
//                    int id = Integer.valueOf(table.getValueAt(row, 0).toString());
//                    boolean flag = studentDao.delete(id);
//                    if(flag){
//                        JOptionPane.showMessageDialog(contentPane, "删除成功!");
//                        load(null);
//                    }else{
//                        JOptionPane.showMessageDialog(contentPane, "操作失败", "系统提示", JOptionPane.WARNING_MESSAGE);
//                         
//                    }
//                }
//                return;
//            }
//        });
//        deleteBtn.setBounds(511, 8, 63, 23);
//        contentPane.add(deleteBtn);
//        contentPane.add(updateBtn);
    }
 
    // 填充表格数据
//    public void load(String name){
//        List<Student> list = studentDao.queryList(name);
//        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
//        tableModel.setRowCount(0);// 清除原有行
//        // 填充数据
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        for (Student item : list) {
//            String[] arr = new String[5];
//            arr[0] = item.getId() + "";
//            arr[1] = item.getStuno();
//            arr[2] = item.getName();
//            arr[3] = item.getGrade();
//            arr[4] = sdf.format(item.getCreatTime());
//            // 添加数据到表格
//            tableModel.addRow(arr);
//        }
//    }
}