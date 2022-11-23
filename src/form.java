import datechooser.beans.DateChooserCombo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.Calendar;

public class form extends JFrame {
    private JPanel mainPanel;
    private JTextField titleField;
    private JComboBox priorityComboBox;
    private JButton applyButton;
    private JButton closeButton;
    private DateChooserCombo dateField;

    public static String[] r = {"Title", "Priority", "Date"};

    public form(){
        super("Add form");
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setSize(500, 500);

        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        applyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String title = titleField.getText();
                String priority = priorityComboBox.getSelectedItem().toString();
                String date = dateField.getText();
                if(title.length()>0){
                    r[0] = title;
                    r[1] = priority;
                    r[2] = date;
                    kanban.add();
                }
            }
        });

    }

    public static void run(){
        form frame = new form();
        frame.setVisible(true);
    }
}
