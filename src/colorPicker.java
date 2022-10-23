import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class colorPicker extends JFrame {
    private JButton OKButton;
    private JPanel mainPanel;
    private JTextField redField;
    private JTextField greenField;
    private JTextField blueField;

    private JTextField fields[] = {redField, greenField, blueField}; // Pola tekstowe pobierajace poszczegolne kolory
    private JPanel colorPanel; // Panel wyswietlajacy mieszanke kolorow
    private JPanel redPanel;
    private JPanel bluePanel;
    private JPanel greenPanel;
    private JPanel panels[] = {redPanel, greenPanel, bluePanel}; // Panele przedstawiajace poszczegolne kolory

    int red,green,blue;
    String colorFields[] = new String[3];
    boolean doable = true;

    public boolean isInt(String a){
        try {
            int i = Integer.parseInt(a);
        }catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
    public colorPicker(){
        super("Color Picker");
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(650,500);
        this.setResizable(false);
        colorPanel.setVisible(true);


        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(int k=0; k<3; k++){
                    panels[k].setVisible(true);
                    colorFields[k] = fields[k].getText(); // Pobieram wartosc z pol tekstowych
                    if(isInt(colorFields[k]) == false){ // Jak nie jest liczba calkowita to ustawiam tlo na czerwone
                        fields[k].setBackground(Color.RED);
                        doable = false;
                        break;
                    }
                    else
                    {
                        doable = true;
                        fields[k].setBackground(new Color(255,255,255)); // zmieniam kolor pola
                        if(Integer.valueOf(colorFields[k]) < 0) colorFields[k] = String.valueOf(-Integer.valueOf(colorFields[k]));
                        if(Integer.valueOf(colorFields[k]) > 255)   colorFields[k] = String.valueOf(255); // Jesli wartosc wieksza od 255 to zamianiam na 255
                        switch(k){ // Ustawiam poszczegolne kolory
                            case 0:
                                panels[0].setBackground(new Color(Integer.valueOf(colorFields[0]),0,0));
                                break;

                            case 1:
                                panels[1].setBackground(new Color(0,Integer.valueOf(colorFields[1]),0));
                                break;

                            case 2:
                                panels[2].setBackground(new Color(0,0,Integer.valueOf(colorFields[2])));
                                break;
                        }
                        }
                    }
                    if(doable)  colorPanel.setBackground(new Color(Integer.valueOf(colorFields[0]),Integer.valueOf(colorFields[1]),Integer.valueOf(colorFields[2])));
            }
        });
}
    public static void colors(){
        colorPicker frame = new colorPicker();
        frame.setVisible(true);
    }
}
