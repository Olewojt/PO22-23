import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class table extends JFrame{

    private JPanel mainPanel;
    private JPanel labelPanel;
    private JPanel comboPanel;
    private JComboBox comboBox2;
    private JComboBox comboBox1;
    private JTextField textField1;
    private JTable showTable;
    private JPanel tablePanel;
    private JPanel buttonPanel;
    private JButton imdbButton;
    private JButton episodeButton;

    public static void run(){
        table frame = new table();
        frame.setVisible(true);
    }

    private void createTable(){
        Object[][] data = {
                {"film 1", 2022, 8.123, 12341},
                {"film 2", 2022, 9.73, 1234231},
                {"film 3", 2022, 8.123, 341},
        };

        showTable.setModel(new DefaultTableModel(
                data, new String[]{"Tytul", "Rok", "Ranking", "Liczba opinii"}
        ));
    }

    public table(){
        super("tabelki");
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,500);

        createTable();
    }
}
