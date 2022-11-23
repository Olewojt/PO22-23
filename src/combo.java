import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class combo extends JFrame{
    private JPanel mainPanel;
    private JComboBox comboBox1;
    private JButton showButton;
    private JLabel labelText;

    public static void run(){
        combo frame = new combo();
        frame.setVisible(true);
    }

    private void createComboBox(){
        String[] opcje = {
                "C++",
                "Pyhon",
                "Java",
        };

        comboBox1.setModel(new DefaultComboBoxModel(opcje));
    }

    public combo(){
        super("Comboboxy");
        this.setContentPane(this.mainPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400,400);

        createComboBox();
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = "Wybrano jezyk: " + comboBox1.getItemAt(comboBox1.getSelectedIndex());
                labelText.setText(data);
            }
        });
        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dataSelect = (String) comboBox1.getSelectedItem();
                JOptionPane.showMessageDialog(combo.this, "Wybrano jezyk: "+dataSelect);
            }
        });
    }
}
