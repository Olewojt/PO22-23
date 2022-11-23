import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class checkboxy extends JFrame{
    private JCheckBox checkbox1;
    private JCheckBox checkbox3;
    private JCheckBox checkbox2;
    private JCheckBox checkbox4;

    private JCheckBox checkboxes[] = {checkbox1,checkbox2,checkbox3,checkbox4};
    private JButton OKButton;
    private JPanel mainPanel;
    String message="";

    public checkboxy() {
        super("Checkboxy");
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400,400);

        int sel[] = new int[4];

        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(checkboxes[0].isSelected()) message+=checkboxes[0].getText()+"\n";
                if(checkboxes[1].isSelected()) message+=checkboxes[1].getText()+"\n";
                if(checkboxes[2].isSelected()) message+=checkboxes[2].getText()+"\n";
                if(checkboxes[3].isSelected()) message+=checkboxes[3].getText()+"\n";

                JOptionPane.showMessageDialog(null, message);
            }
        });
    };

    public static void checkboxRun(){
        checkboxy frame = new checkboxy();
        frame.setVisible(true);
    }
}
