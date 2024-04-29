import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class BSITGUIApp extends JFrame implements ActionListener {
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
    
    public void actionperformed(ActionEvent e){
        if (e.getSource()==btnClicks){
            noClicks++;
            lblClicks.setText("No of button clicks:"+noClicks);
          System.out.println("Button clicked!");
        }

    }
    public   void handleEvent(){
        btnClicks.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
  
  
} 
