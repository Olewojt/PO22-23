import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class radio extends JFrame{
    private JRadioButton linuxRadioButton;
    private JRadioButton windowsRadioButton;
    private JRadioButton macOSRadioButton;

    private JRadioButton buttons[] = {linuxRadioButton, windowsRadioButton, macOSRadioButton};
    private JButton OKButton;
    private JPanel mainPanel;
    private JPanel radioPanel;
    private JPanel imagePanel;
    private JPanel buttonPanel;
    private JLabel imageDisplay;
    private JLabel imageArea;

    public ImageIcon setImageSize(ImageIcon img){
        Image photo = img.getImage();
        Image newPhoto = photo.getScaledInstance(imageDisplay.getWidth(), imageDisplay.getHeight(), Image.SCALE_SMOOTH);
        return new ImageIcon(newPhoto);
    };

    public radio(){
        super("Kture lepsze");
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400,400);

        ImageIcon linux = new ImageIcon(getClass().getResource("assets/linux.png"));
        ImageIcon windows = new ImageIcon(getClass().getResource("assets/windows.jpg"));
        ImageIcon macos = new ImageIcon(getClass().getResource("assets/macos.jpg"));

        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttons[0].isSelected()) JOptionPane.showMessageDialog(null, String.format("Wybrales: gowno"));
                if(buttons[1].isSelected()) JOptionPane.showMessageDialog(null, String.format("Wybrales: Windows"));
                if(buttons[2].isSelected()) JOptionPane.showMessageDialog(null, String.format("Wybrales: mniejszeGowno"));
            }
        });
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttons[0].isSelected()) imageDisplay.setIcon(setImageSize(linux));
                if(buttons[1].isSelected()) imageDisplay.setIcon(setImageSize(windows));
                if(buttons[2].isSelected()) imageDisplay.setIcon(setImageSize(macos));
            }
        };
        linuxRadioButton.addActionListener(listener);
        windowsRadioButton.addActionListener(listener);
        macOSRadioButton.addActionListener(listener);
    }

    public static void radioRun(){
        radio frame = new radio();
        frame.setVisible(true);
    }
}
