import java.awt.*;
import javax.swing.*;
public class BSITGUIApp extends JFrame {
    private JButton btnClicks;
    private JLabel lblClicks;
    private int noClicks;
    private Container contentPane;
    private JPanel jplComponents;
    public static void main(String[] args) {
        new BSITGUIApp();
    }
    public BSITGUIApp(){
     createFrame();
     createComponents();
     createContainer();
     addComponents();
    }

    private void createFrame(){

        
        setTitle("swingApplication");
        setSize(250,150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    private void createComponents(){
        noClicks=0;
        btnClicks=new JButton("I am swing button!");
        lblClicks= new JLabel("Number of clicks"+noClicks);

    }
    private void createContainer(){
        contentPane=getContentPane();
        jplComponents=new JPanel();
    }
    private void addComponents(){
        jplComponents.add(btnClicks);
        jplComponents.add(lblClicks);
        contentPane.add(jplComponents);
    }
} 
