import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Converter extends JFrame implements ActionListener{
    private Container pane;
    private JLabel l;
    private JTextField t; 
    private JButton c, f;

    public Converter(){
	this.setTitle("Celsius <--> Fahrenheit");
	this.setSize(600, 400);
	this.setLocation(100, 100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	pane = this.getContentPane();
	pane.setLayout(new FlowLayout());
   
	l = new JLabel("Enter an Integer:");
	t = new JTextField(5);
	c = new JButton("Convert to Celsius");
	f = new JButton("Convert to Fahrenheit");

	c.setActionCommand("Celsius");
	c.addActionListener(this);
	f.setActionCommand("Fahrenheit");
	f.addActionListener(this);

	pane.add(l);
	pane.add(t);
	pane.add(c);
	pane.add(f);
    }
    
    public void actionPerformed(ActionEvent e){
	String action = e.getActionCommand();
	if (action.equals("Celsius")){
	    String n = t.getText();
	    int fahr = Integer.parseInt(n);
	    int cels = ((fahr - 32) * 5 / 9);
	    System.out.println(fahr + "F = " + cels + "C");
	}
	if (action.equals("Fahrenheit")){
	    String n = t.getText();
	    int cels = Integer.parseInt(n);
	    int fahr = (cels * 9 / 5 + 32);
	    System.out.println(cels + "C = " + fahr + "F");
	}
    }

    public static void main(String[]args){
	Converter c = new Converter();
	c.setVisible(true);
    }
}
