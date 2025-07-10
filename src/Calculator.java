import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calculator implements ActionListener {
	
	JFrame frame;
	JTextField textfield;
	JButton[] numberbutton= new JButton[10];
	JButton[] fuctionButton= new JButton[9];
	JButton addbutton,subbutton,mulbutton,divbutton;
	JButton decbutton,equbutton,clrbutton,delbutton,negbutton;
	JPanel panel;
	Font font = new Font("Ink Free",Font.BOLD,30);
	double num1=0,num2=0,result=0;
	char operator;
	
	
Calculator()
{
 frame= new JFrame("Calculator");
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setSize(420,550);
 frame.setLayout(null);
 
 textfield= new JTextField();
 textfield.setBounds(50,25,300,50);
 textfield.setFont(font);
 textfield.setEditable(false);

 
 addbutton = new JButton("+");
 subbutton = new JButton("-");
 mulbutton = new JButton("*");
 divbutton = new JButton("/");
 decbutton = new JButton(".");
 equbutton= new JButton("=");
 delbutton = new JButton("Delete");
 clrbutton = new JButton("Clear");
 negbutton = new JButton("(-)");
 

 fuctionButton[0]=addbutton;
 fuctionButton[1]=subbutton;
 fuctionButton[2]=mulbutton;
 fuctionButton[3]=divbutton;
 fuctionButton[4]=decbutton;
 fuctionButton[5]=equbutton;
 fuctionButton[6]=delbutton;
 fuctionButton[7]=clrbutton;
 fuctionButton[8]=negbutton;
 
 for(int i=0;i<9;i++)
 {
	 fuctionButton[i].addActionListener(this);
	 fuctionButton[i].setFont(font);
	 fuctionButton[i].setFocusable(false);
	 
 }
 for(int i=0;i<10;i++)
 {
	 numberbutton[i]= new JButton(String.valueOf(i));
	 numberbutton[i].addActionListener(this);
	 numberbutton[i].setFont(font);
	 numberbutton[i].setFocusable(false);
	 
 }
 negbutton.setBounds(50, 430, 100, 50);
 delbutton.setBounds(150, 430, 100, 50);
 clrbutton.setBounds(250, 430, 100, 50);
 
 panel= new JPanel();
 panel.setBounds(50, 100, 300, 300);
 panel.setLayout(new GridLayout(4,4,10,10));

 
 panel.add(numberbutton[1]);
 panel.add(numberbutton[2]);
 panel.add(numberbutton[3]);
 panel.add(addbutton);
 panel.add(numberbutton[4]);
 panel.add(numberbutton[5]);
 panel.add(numberbutton[6]);
 panel.add(subbutton);
 panel.add(numberbutton[7]);
 panel.add(numberbutton[8]);
 panel.add(numberbutton[9]);
 panel.add(mulbutton);
 panel.add(decbutton);
 panel.add(numberbutton[0]);
 panel.add(equbutton);
 panel.add(divbutton);
 panel.add(negbutton);
 
 frame.add(delbutton);
 frame.add(textfield);
 frame.add(clrbutton);
 frame.add(panel);
 frame.add(negbutton);
 frame.setVisible(true);
}
	public static void main(String[] args) {
		Calculator calc = new Calculator();
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{
			if(e.getSource()==numberbutton[i])
			{
				textfield.setText(textfield.getText().concat(String.valueOf(i)));
			}
		
		}
		if(e.getSource()==decbutton)
		{
			textfield.setText(textfield.getText().concat("."));
		}
		
		if(e.getSource()==addbutton)
		{
			num1=Double.parseDouble(textfield.getText());
			operator='+';
			textfield.setText("");
		}
		if(e.getSource()==subbutton)
		{
			num1=Double.parseDouble(textfield.getText());
			operator='-';
			textfield.setText("");
		}
		if(e.getSource()==mulbutton)
		{
			num1=Double.parseDouble(textfield.getText());
			operator='*';
			textfield.setText("");
		}
		if(e.getSource()==divbutton)
		{
			num1=Double.parseDouble(textfield.getText());
			operator='/';
			textfield.setText("");
		}
		if(e.getSource()==equbutton)
		{
			num2=Double.parseDouble(textfield.getText());
			switch(operator)
			{
			case '+':
				result=num1+num2;
				break;
				
			case '-':
				result=num1-num2;
				break;
			case '*':
				result=num1*num2;
				break;
			case '/':
				result=num1/num2;
				break;
			}
			textfield.setText(String.valueOf(result));
			num1=result;
		}
		if(e.getSource()==clrbutton)
		{
			textfield.setText("");
		}
		if(e.getSource()==delbutton)
		{
			String string=textfield.getText();
			textfield.setText("");
			for(int i=0;i<string.length()-1;i++)
			{
			textfield.setText(textfield.getText()+string.charAt(i));
			}
		}
		if(e.getSource()==negbutton)
		{
			double temp=Double.parseDouble(textfield.getText());
			temp*=-1;
			textfield.setText(String.valueOf(temp));
		}
		}
	
	}



