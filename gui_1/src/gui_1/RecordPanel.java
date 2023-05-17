package gui_1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RecordPanel extends JPanel {
    private JRadioButton addRecordRadioButton;
    private JRadioButton deleteRecordRadioButton;
    private JRadioButton updateRecordRadioButton;
    private JRadioButton queryRecordRadioButton;
    private JTextField studentIdTextField;
    private JTextField evaluationTextField;
    private JTextField scoreTextField;
    private JTextField mainHrTextField;
    private JTextField subHrTextField;

    public RecordPanel() {
        setLayout(new GridLayout(6, 2));

        // 创建单选按钮
        addRecordRadioButton = new JRadioButton("添加记录");
        deleteRecordRadioButton = new JRadioButton("删除记录");
        updateRecordRadioButton = new JRadioButton("更改记录");
        queryRecordRadioButton = new JRadioButton("查询记录");

        // 创建输入框
        studentIdTextField = new JTextField();
        evaluationTextField = new JTextField();
        scoreTextField = new JTextField();
        mainHrTextField = new JTextField();
        subHrTextField = new JTextField();

        // 添加单选按钮到按钮组
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(addRecordRadioButton);
        buttonGroup.add(deleteRecordRadioButton);
        buttonGroup.add(updateRecordRadioButton);
        buttonGroup.add(queryRecordRadioButton);

        // 添加组件到面板
        add(new JLabel("操作："));
        add(addRecordRadioButton);
        add(deleteRecordRadioButton);
        add(updateRecordRadioButton);
        add(queryRecordRadioButton);
        add(new JLabel("学号："));
        add(studentIdTextField);
        add(new JLabel("评价："));
        add(evaluationTextField);
        add(new JLabel("分数："));
        add(scoreTextField);
        add(new JLabel("主HR打分："));
        add(mainHrTextField);
        add(new JLabel("副HR打分："));
        add(subHrTextField);

        // 添加监听器
        ActionListener radioButtonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (addRecordRadioButton.isSelected()) {
                    // 执行添加记录操作
                    String studentId = studentIdTextField.getText();
                    String evaluation = evaluationTextField.getText();
                    String score = scoreTextField.getText();
                    String mainHr = mainHrTextField.getText();
                    String subHr = subHrTextField.getText();
                    // 在此处编写添加记录的逻辑
                    System.out.println("添加记录：" + studentId + " " + evaluation + " " + score + " " + mainHr + " " + subHr);
                } else if (deleteRecordRadioButton.isSelected()) {
                    // 执行删除记录操作
                    String studentId = studentIdTextField.getText();
                    // 在此处编写删除记录的逻辑
                    System.out.println("删除记录：" + studentId);
                } else if (updateRecordRadioButton.isSelected()) {
                    // 执行更改记录操作
                    String studentId = studentIdTextField.getText();
                    String evaluation = evaluationTextField.getText();
                    String score = scoreTextField.getText();
                    String mainHr = mainHrTextField.getText();
                    String subHr = subHrTextField.getText();
                    // 在此处编写更改记录的逻辑
                    System.out.println("更改记录：" + studentId + " " + evaluation + " " + score +

