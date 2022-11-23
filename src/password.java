import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class password extends JFrame{
    private JPasswordField passwordField;
    private JButton loginButton;
    private JPanel mainPanel;
    private JPanel usernamePanel;
    private JPanel passwordPanel;
    private JPanel buttonPanel;
    private JPanel labelPanel;
    private JLabel resultLabel;
    private JTextField usernameField;

    public password(){
        super("Password Field Example");
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400,400);
        String username = "admin";
        String password = "admin";

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String getUser = usernameField.getText();
                String getPass = new String(passwordField.getPassword());

//                System.out.println(passwordField.getPassword());

                if(getUser.equals(username) && getPass.equals(password)){
                    resultLabel.setText("Udalo sie!");
                }else{
                    resultLabel.setText("Nie udao sie :(");
                }
            }
        });
    }

    public static void passwordExample(){
        password frame = new password();
        frame.setVisible(true);
    }
}
