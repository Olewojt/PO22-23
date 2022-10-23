import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class temp extends JFrame{


    private JPanel MainPanel;
    private JTextField tempField;
    private JButton OKButton;
    private JPanel tempPanel;
    private JLabel fLabel;
    private JLabel displayLabel;
    private JLabel cLabel;
    private double Ctemp, Ftemp;

    public temp(){
        super("Konwerter temperatury");
        this.setContentPane(MainPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400,400);
        tempPanel.setVisible(true);
//        displayLabel.setForeground(Color.WHITE);

        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ctemp = Double.parseDouble(tempField.getText());
                Ftemp = Ctemp*1.8 + 32;

                displayLabel.setText(String.valueOf(String.format("%.2f",Ftemp)));

                if(Ctemp <= 0) tempPanel.setBackground(Color.BLUE);
                else if(Ctemp >= 30) tempPanel.setBackground(Color.RED);
                else tempPanel.setBackground(new Color(255,92,51));
            }
        });
    }

    public static void tempGui(){
        temp frame = new temp();
        frame.setVisible(true);
    }
}
