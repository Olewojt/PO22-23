import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class contactsApp extends JFrame{
    private JPanel mainPanel;
    private JTextField nameField;
    private JTextField emailField;
    private JTextField numberField;
    private JTextField addressField;
    private JTextField birthField;
    private JButton saveNewButton;
    private JButton saveExistingButton;
    private JList contactList;
    private JLabel ageLabel;

    public static void run(){
        contactsApp frame = new contactsApp();
        frame.setVisible(true);
    }

    contact dataList[] = new contact[50];

    private void createList() {
        contactList.setModel(new DefaultListModel());
    }

    class contact{
        String name;
        String email;
        String number;
        String address;
        String date_of_birth;

        public contact(String name, String email, String number, String address, String date_of_birth){
            this.name = name;
            this.email = email;
            this.number = number;
            this.address = address;
            this.date_of_birth = date_of_birth;
        }

        public void setName(String name){this.name = name;}
        public void setEmail(String email){this.email = email;}
        public void setNumber(String number){this.number = number;}
        public void setAddress(String adress){this.address = address;}
        public void setDate_of_birth(String date_of_birth){this.date_of_birth = date_of_birth;}
    }

    public contactsApp(){
        super("Ciupapi");
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,500);


        createList();

        saveNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        saveExistingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }
}
