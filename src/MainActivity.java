import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
 
public class MainActivity {
    
   private JFrame mainFrame;
   private JLabel headerLabel;
   private JLabel statusLabel;
   private JPanel controlPanel;
   private ArrayList<String> isbnList = new ArrayList<String>();
   private ArrayList<String> titleList = new ArrayList<String>();

   public MainActivity(){
      prepareGUI();
   }

   public static void main(String[] args){
      MainActivity  bookCompare = new MainActivity();      
      bookCompare.showButton();
   }

   private void prepareGUI(){
      mainFrame = new JFrame("Compare Textbooks Application");
      mainFrame.setSize(400,400);
      mainFrame.setLayout(new GridLayout(3, 1));
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });    
      headerLabel = new JLabel("", JLabel.CENTER);        
      statusLabel = new JLabel("",JLabel.CENTER);    

      statusLabel.setSize(350,100);

      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);  
   }

   private void showButton(){

      headerLabel.setText("Choose your destiny:"); 

      JButton searchButton = new JButton("Search ISBN");        
      JButton listButton = new JButton("Display list");
      JButton manualButton = new JButton("Manual entry");
      JButton closeButton = new JButton("Close");
      closeButton.setHorizontalTextPosition(SwingConstants.LEFT);   

      searchButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            statusLabel.setText("Search ISBN");
         }          
      });

      listButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            statusLabel.setText("Display List");
         }
      });
      
      manualButton.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
             statusLabel.setText("Manual List Entry");
          }
       });

      closeButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            System.exit(0);
         }
      });

      controlPanel.add(searchButton);
      controlPanel.add(listButton);
      controlPanel.add(manualButton);
      controlPanel.add(closeButton);       

      mainFrame.setVisible(true);  
   }
}