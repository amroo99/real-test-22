package movie;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Movie extends JFrame implements ActionListener{

    public static void main(String[] args) {
        Movie Mv=new Movie();
    }
    JTextField text1,text2,text3,text4;
    JButton button1;
     JLabel label1,label2,label3,label4,label5,label6,label7;
     String [] hall={"hall 1","hall 2","hall 3","hall 4","hall 5","hall 6"};
     String [] Type={"First class","Second class","Normal"};
     JComboBox com1,com2;
     JPanel panel1, panel2,panel3,panel4,panel5;
     public Movie()
     {
        this.setTitle("Movie Ticket Booking");
        this.setSize(500, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(10, 10)); 
        panel1=new JPanel();
        panel2=new JPanel(new GridLayout(6, 1));
        panel3=new JPanel(new GridLayout(6, 1));
        panel4=new JPanel(new GridLayout(6, 1));
        panel5=new JPanel();
        label1=new JLabel("Select Movie and number of Ticket");
        label1.setForeground(Color.blue);
        label2=new JLabel("Select Movie");
        label3=new JLabel("Type of Ticket");
        label4=new JLabel("Total of ticket");
        label5=new JLabel("Avaiable Tickes");
        label6=new JLabel("Needed Ticket");
        label7=new JLabel("price");
         text1=new JTextField(10);
        text2=new JTextField(10);
        text3=new JTextField(10);
        text1.setText(String.valueOf(100));
        text1.setEditable(false);
        text2.setText(String.valueOf(70));
        text2.setEditable(false);
        text4=new JTextField(10);
        label1.setFont(new Font("San-Serif", 1, 28));
        label2.setFont(new Font("San-Serif", 2, 18));
        label3.setFont(new Font("San-Serif", 2, 18));
        label4.setFont(new Font("San-Serif", 2, 18));
        label5.setFont(new Font("San-Serif", 2, 18));
        label6.setFont(new Font("San-Serif", 2, 18));
        label7.setFont(new Font("San-Serif", 2, 18));
        com1=new JComboBox(hall);
        com2=new JComboBox(Type);
        button1=new JButton("Calculate price");
        panel1.add(label1);
        panel2.add(label2);
        panel2.add(com1);
         panel3.add(label3);
        panel3.add(com2);
        panel4.add(label4);
        panel4.add(text1);
        panel4.add(label5);
        panel4.add(text2);
        panel4.add(label6);
        panel4.add(text3);
        panel5.add(button1);
        panel5.add(label7);
        panel5.add(text4);
        this.add(panel1,BorderLayout.NORTH);
        this.add(panel2,BorderLayout.WEST);
        this.add(panel3,BorderLayout.CENTER);
        this.add(panel4,BorderLayout.EAST);
        this.add(panel5,BorderLayout.SOUTH);
        button1.addActionListener(this);
         this.setResizable(false);
        this.setVisible(true);
     }
    public void actionPerformed(ActionEvent e) {
        try{
        int need=Integer.parseInt(text3.getText());
        int found=Integer.parseInt(text2.getText());
        int tickettype=com2.getSelectedIndex();
        if(need<=found)
        {
            text2.setText(String.valueOf(found-need));
            if(tickettype==0)
            {
                text4.setText(String.valueOf(need*100));
                text4.setEnabled(false);
            }
           else if(tickettype==1)
            {
                text4.setText(String.valueOf(need*75));
                 text4.setEnabled(false);
            }
           else if(tickettype==2)
            {
                text4.setText(String.valueOf(need*50));
                 text4.setEnabled(false);
            }
        }
        }
        catch(Exception e1)
        {
            JOptionPane.showMessageDialog(null, "Enter number of needed ticket");
        }
    }
    
}