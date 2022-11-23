import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class kanban extends JFrame{


    private JPanel mainPanel;
    private JTabbedPane tabbedPane1;
    private JButton newTaskButton;
    private JList todoList;
    private JList progressList;
    private JList doneList;
    private JButton backButton;
    private JButton closeButton;

    static DefaultListModel todo = new DefaultListModel<String>();
    static DefaultListModel progress = new DefaultListModel<String>();
    static DefaultListModel done = new DefaultListModel<String>();
    public kanban(){
        super("Kanban");
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(550, 500);

        todoList.setModel(todo);
        todoList.setModel(progress);
        todoList.setModel(done);

        newTaskButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                form.run();
            }
        });
    }

    public static void add(){
        System.out.println("Dodano!");
        todo.addElement(form.r[0]);
    }

    public static void run(){
        kanban frame = new kanban();
        frame.setVisible(true);
    }
}
