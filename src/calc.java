import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class calc extends JFrame implements ActionListener
{
JTextField text;
JPanel panel;
JButton[] number=new JButton[10];
JButton[] function=new JButton[9];
JButton add,sub,mul,div,eql,clr;
double num1=0,num2=0,result=0;
char operator;

	
	calc()
	{
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(450,500);
		this.setLayout(null);
	
		
		text=new JTextField();
		text.setBounds(50,25,300,50);
		
		add=new JButton("+");
		sub=new JButton("-");
		mul=new JButton("*");
		div=new JButton("/");
		eql=new JButton("=");
		clr=new JButton("Clear");
		
		function[0]=add;
		function[1]=sub;
		function[2]=mul;
		function[3]=div;
		function[4]=eql;
		function[5]=clr;
		
		for(int i=0;i<9;i++)
		{
			function[i].addActionListener(this);
			
		}
		for(int i=0;i<10;i++)
		{
			number[i]=new JButton(String.valueOf(i));
			number[i].addActionListener(this);
			
		}
		
		panel=new JPanel();
		panel.setBounds(50,100,300,300);
		panel.setLayout(new GridLayout(4,4,10,10));
		panel.add(number[1]);
		panel.add(number[2]);
		
		
		
		
		//add(text);
        add(panel);
    	this.setVisible(true);
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

    public static void main(String[] args)
    {
      new calc();  
    }
}