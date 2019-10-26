package gpa;

import java.awt.Color;

import java.awt.Dimension;

import java.awt.Font;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.BorderFactory;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.JTextArea;

import javax.swing.border.Border;

public class gpa implements ActionListener {

	JFrame frame = new JFrame();

	JPanel panel = new JPanel();

	JTextArea tarea = new JTextArea(2, 10);

	// Buttons

	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JButton button5 = new JButton();
	JButton button6 = new JButton();
	JButton button7 = new JButton();
	JButton button8 = new JButton();
	JButton button9 = new JButton();
	JButton button0 = new JButton();
	JButton buttonEqual = new JButton();
	JButton buttonCalculate = new JButton();
	JButton buttonClear = new JButton();
	JButton Acedemic = new JButton();
	JButton honors = new JButton();
	JButton AP = new JButton();
	JButton help = new JButton();

	double number1, number2, result, result1, result2;
	int addc = 0, mulc = 0, divc = 0, subc = 0, square = 0, d = 0, A = 0;
	double gpa=0;
	double r;
	int h=0, a=0;

	public gpa() {

		frame.setSize(450, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("SBHS Unweigthed GPA calculator by Viraj");
		frame.add(panel);
		panel.setBackground(Color.YELLOW);
		Border border = BorderFactory.createLineBorder(Color.BLACK, 4);
		panel.setBorder(border);
		panel.add(tarea);
		tarea.setBackground(Color.WHITE);
		Border border1 = BorderFactory.createLineBorder(Color.BLACK);
		tarea.setBorder(border1);
		Font font = new Font("font", Font.BOLD, 15);
		tarea.setFont(font);
		tarea.setForeground(Color.black);
		tarea.setPreferredSize(new Dimension(400, 530));
		tarea.setLineWrap(true);
		tarea.setText("Please Press Help and after reading, press clear. ");

		panel.add(buttonClear);
		panel.add(buttonCalculate);
		panel.add(buttonEqual);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(button0);
		panel.add(help);
		panel.add(honors);
		panel.add(AP);

		button1.setPreferredSize(new Dimension(100, 43));
		button1.setText("A");
		button1.setBackground(Color.ORANGE);

		button2.setPreferredSize(new Dimension(100, 43));
		button2.setText("A-");
		button2.setBackground(Color.ORANGE);

		button3.setPreferredSize(new Dimension(100, 43));
		button3.setText("B+");
		button3.setBackground(Color.ORANGE);

		button4.setPreferredSize(new Dimension(100, 43));
		button4.setText("B");
		button4.setBackground(Color.ORANGE);

		button5.setPreferredSize(new Dimension(100, 43));
		button5.setText("B-");
		button5.setBackground(Color.ORANGE);

		button6.setPreferredSize(new Dimension(100, 43));
		button6.setText("C+");
		button6.setBackground(Color.ORANGE);

		button7.setPreferredSize(new Dimension(100, 43));
		button7.setText("C");
		button7.setBackground(Color.ORANGE);

		button8.setPreferredSize(new Dimension(100, 43));
		button8.setText("C-");
		button8.setBackground(Color.ORANGE);

		button9.setPreferredSize(new Dimension(70, 43));
		button9.setText("D");
		button9.setBackground(Color.ORANGE);

		button0.setPreferredSize(new Dimension(70, 43));
		button0.setText("F");
		button0.setBackground(Color.ORANGE);

		buttonClear.setPreferredSize(new Dimension(133, 43));
		buttonClear.setText("Clear");
		buttonClear.setBackground(Color.ORANGE);

		Acedemic.setPreferredSize(new Dimension(133, 43));
		Acedemic.setText("Acedemic");
		Acedemic.setBackground(Color.ORANGE);

		help.setPreferredSize(new Dimension(70, 43));
		help.setText("Help");
		help.setBackground(Color.ORANGE);
		
		honors.setPreferredSize(new Dimension(90, 43));
		honors.setText("honors");
		honors.setBackground(Color.ORANGE);

		AP.setPreferredSize(new Dimension(70, 43));
		AP.setText("AP");
		AP.setBackground(Color.ORANGE);

		buttonEqual.setPreferredSize(new Dimension(133, 43));
		buttonEqual.setText("Enter");
		buttonEqual.setBackground(Color.ORANGE);

		buttonCalculate.setPreferredSize(new Dimension(133, 43));
		buttonCalculate.setText("Calculate");
		buttonCalculate.setBackground(Color.ORANGE);

		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		button0.addActionListener(this);
		buttonClear.addActionListener(this);
		buttonCalculate.addActionListener(this);
		buttonEqual.addActionListener(this);
		help.addActionListener(this);
		honors.addActionListener(this);
		AP.addActionListener(this);
	}

	int zz=1;
	
	
	public void actionPerformed(ActionEvent e) {

		Object source = e.getSource();

		
			if (source == button1) {
			
				gpa += 4.00;
				tarea.setText("Gpa "+zz+": 4.00\nCurrent Gpa: "+ gpa);
				zz++;			
			}
			if (source == button2) {
				
				gpa += 3.67;
				tarea.setText("Gpa "+zz+": 3.67\nCurrent Gpa: "+ gpa);
				zz++;	
			}
			if (source == button3) {
			
				gpa += 3.33;
				tarea.setText("Gpa "+zz+": 3.33\nCurrent Gpa: "+ gpa);
				zz++;	
			}
			if (source == button4) {
				
				gpa += 3.00;
				tarea.setText("Gpa "+zz+": 3.00\nCurrent Gpa: "+ gpa);
				zz++;	
			}
			if (source == button5) {
				
				gpa += 2.67;
				tarea.setText("Gpa "+zz+": 2.67\nCurrent Gpa: "+ gpa);
				zz++;	
			}
			if (source == button6) {
			
				gpa += 2.33;
				tarea.setText("Gpa "+zz+": 2.33\nCurrent Gpa: "+ gpa);
				zz++;	
			}
			if (source == button7) {
			
				gpa += 2.00;
				tarea.setText("Gpa "+zz+": 2.00\nCurrent Gpa: "+ gpa);
				zz++;	
			}
			if (source == button8) {
				
				gpa += 1.67;
				tarea.setText("Gpa "+zz+": 1.67\nCurrent Gpa: "+ gpa);
				zz++;	
			}
			if (source == button9) {
			
				gpa += 1.00;
				tarea.setText("Gpa "+zz+": 1.00\nCurrent Gpa: "+ gpa);
				zz++;	
				
			}
			if (source == button0) {
				
				gpa += 0;
				tarea.setText("Gpa "+zz+": 0.00\nCurrent Gpa: "+ gpa);
				zz++;	
				
			}

			if (source == buttonClear) {
				gpa = 0;
				tarea.setText("");
				zz=1;
			}
			
			if(source == buttonEqual) {
				tarea.setText("");
				
			}
			
			if(source == buttonCalculate) {
				tarea.setText("");
				gpa += h*0.5;
				gpa += a*1;
				double totalGpa = (gpa*5)/40;
				tarea.setText("Your Unweighted Gpa is "+totalGpa);
			}
			
			if(source == honors) {
				h++;
				
				tarea.setText("You have "+h+" honor and "+a+" AP\n This will now be added to your gpa.\nPress Calculate after your done. ");
					
			}
			
			if(source == AP) {
				a++;
				
				tarea.setText("You have "+h+" honor and "+a+" AP\n This will now be added to your gpa.\nPress Calculate after your done. ");
				
			}
			
			if(source == help) {
				tarea.setText("This is a Weighted GPA caluculator made by Viraj Kulkarni. In this, you will find your weighted gpa. To find out your unweighted"
						+ "gpa which doesn't includes honors and ap classes(.5 or 1 addition) go to kviraj223.wix.com/computerprogramingx. To use this"
						+ "gpa calculator, the classes you have are 8, not more, not less and the total credits are 40 which is for this gpa calculator."
						+ "I dont think you have more or less than that, but if you do, my bad and bye. Every class you input will be 5 credits. Now, "
						+ "press the first grade you have. It will show some text with your gpa and current gpa. Don't worry about current gpa, just "
						+ "look at the gpa that is above that. The current gpa is the calculation being made to make sure it's adding properly. Then "
						+ "press enter. Enter a second grade and press enter. Repeat process 8 times. Afterwards, click the amount of times you have a"
						+ "honors or ap class. If you don't have one, just click calculate and you're done. If you are failing your specific honors or ap class with a d or a f, then do not click the honors or ap button at all for those classes. This is only for students that have their honors and ap grades with c- or higher. After clicking how many times you have a honors or ap class, then click calculate and that will give you you're weigthed gpa."
						+ "This will now show your weighted gpa. If it looks weird, repeat process again"
						+ "but it should work. This is for weighted, visit website above for the unweighted gpa calculator. Thank you and bye.");
			}

		}
	
	

	

	public double number_reader() {
		double num1;

		String s;

		s = tarea.getText();

		num1 = Double.valueOf(s);

		return num1;

	}

}
