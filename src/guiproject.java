import javax.swing.*;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.util.Stack;

public class guiproject implements ActionListener {
	JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8, tf9, tf10, tf11;
	JTextArea tA;
	JButton b1, b2, b3;
	JLabel l0,l1, l2, l3, l4;
	static String result = "";

	public static String printSorted(String s, int l) {

				
		// Primary stack
		Stack<Character> stack = new Stack<Character>();

		// Secondary stack
		Stack<Character> tempstack = new Stack<Character>();

		// Append first character
		stack.push(s.charAt(0)); 

		// Iterate for all character in string
		for (int i = 1; i < l; i++) { 

			// i-th character ASCII
			int a = s.charAt(i);

			// Stack's top element ASCII
			int b = (int) ((char) stack.peek());

			// If greater or equal to top element
			// then push to stack
			if ((a - b) >= 1 || (a == b)) {
				stack.push(s.charAt(i));
			}

			// If smaller, then push all element
			// to the temporary stack
			else if ((b - a) >= 1) {

				// Push all greater elements
				while ((b - a) >= 1) {

					// Push operation
					tempstack.push(stack.peek());
					stack.pop(); 

					// Push till the stack is not-empty
					if (stack.size() > 0) {
						b = (int) ((char) stack.peek());
					} else {
						break;
					}
				}

				// Push the i-th character
				stack.push(s.charAt(i)); 

				// Push the tempstack back to stack
				while (tempstack.size() > 0) {
					stack.push(tempstack.peek());
					tempstack.pop();
				}
			}
		}
		
		// Print the stack in reverse order
		while (stack.size() > 0) { 
			result = stack.peek() + result;
			stack.pop();
		}
		return result;
	}

	public guiproject() {

		JFrame f = new JFrame("Sorting String Of Characters Using Stack");
		f.getContentPane().setBackground(Color.LIGHT_GRAY);
		Font font = new Font("Verdana", Font.BOLD, 10);
		Border border = BorderFactory.createLineBorder(Color.BLACK);
		Font font1 = new Font("Verdana", Font.BOLD, 12);
		l0 = new JLabel("Enter A String: ");
		l0.setFont(font1);
		l0.setBounds(10, 10, 150, 20);
		f.getContentPane().add(l0);
		tf1 = new JTextField();
		tf1.setBounds(10, 30, 150, 20);
		f.getContentPane().add(tf1);
		tf2 = new JTextField();
		tf2.setBounds(320, 10, 150, 20);
		tf2.setBorder(border);
		tf2.setEditable(false);
		tf2.setText(null);
		f.getContentPane().add(tf2);
		tf3 = new JTextField();
		tf3.setBounds(320, 40, 150, 20);
		tf3.setBorder(border);
		tf3.setEditable(false);
		tf3.setText(null);
		f.getContentPane().add(tf3);
		tf4 = new JTextField();
		tf4.setBounds(320, 70, 150, 20);
		tf4.setBorder(border);
		tf4.setEditable(false);
		tf4.setText(null);
		f.getContentPane().add(tf4);
		tf5 = new JTextField();
		tf5.setBounds(320, 100, 150, 20);
		tf5.setBorder(border);
		tf5.setEditable(false);
		tf5.setText(null);
		f.getContentPane().add(tf5);
		tf6 = new JTextField();
		tf6.setBounds(320, 130, 150, 20);
		tf6.setBorder(border);
		tf6.setEditable(false);
		tf6.setText(null);
		f.getContentPane().add(tf6);
		tf7 = new JTextField();
		tf7.setBounds(320, 160, 150, 20);
		tf7.setBorder(border);
		tf7.setEditable(false);
		tf7.setText(null);
		f.getContentPane().add(tf7);
		tf8 = new JTextField();
		tf8.setBounds(320, 190, 150, 20);
		tf8.setBorder(border);
		tf8.setEditable(false);
		tf8.setText(null);
		f.getContentPane().add(tf8);
		tf9 = new JTextField();
		tf9.setBounds(320, 220, 150, 20);
		tf9.setBorder(border);
		tf9.setEditable(false);
		tf9.setText(null);
		f.getContentPane().add(tf9);
		tf10 = new JTextField();
		tf10.setBounds(320, 250, 150, 20);
		tf10.setBorder(border);
		tf10.setEditable(false);
		tf10.setText(null);
		f.getContentPane().add(tf10);
		tf11 = new JTextField();
		tf11.setBounds(320, 280, 150, 20);
		tf11.setBorder(border);
		tf11.setEditable(false);
		tf11.setText("");
		f.getContentPane().add(tf11);
		b1 = new JButton("Sort");
		b1.setBounds(10, 61, 100, 44);
		b1.addActionListener(this);
		f.getContentPane().add(b1);
		b2 = new JButton("Insert");
		b2.setBounds(120, 60, 100, 20);
		b2.addActionListener(this);
		f.getContentPane().add(b2);
		b3 = new JButton("Delete");
		b3.setBounds(120, 85, 100, 20);
		b3.addActionListener(this);
		f.getContentPane().add(b3);
		l1 = new JLabel();
		l1.setFont(font);
		l1.setBorder(border);
		l1.setBounds(10, 110, 100, 20);
		f.getContentPane().add(l1);
		l2 = new JLabel();
		l2.setFont(font);
		l2.setBorder(border);
		l2.setBounds(120, 110, 100, 20);
		f.getContentPane().add(l2);
		l3 = new JLabel();
		l3.setFont(font);
		l3.setBorder(border);
		l3.setBounds(10, 135, 100, 20);
		f.getContentPane().add(l3);
		l4 = new JLabel();
		l4.setFont(font);
		l4.setBorder(border);
		l4.setBounds(120, 135, 100, 20);
		f.getContentPane().add(l4);
		Font font2 = new Font("Verdana", Font.BOLD, 20);
		tA = new JTextArea();
		tA.setBackground(Color.DARK_GRAY);
		tA.setForeground(Color.WHITE);
		tA.setFont(font2);
		tA.setBounds(10, 160, 300, 140);
		tA.setEditable(false);
		f.getContentPane().add(tA);
		f.setSize(300, 300);
		f.setBounds(500, 200, 500, 350);
		f.getContentPane().setLayout(null);
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == b1) {
			l1.setText("Before Sorting: ");
			String s = tf1.getText();
			l2.setText(s);
			int sl = s.length();
			printSorted(s, sl);
			tA.setText(result);
			l3.setText("After Sorting: ");
			l4.setText(result);
			tf1.setText(null);
			result = "";
		}
		if (e.getSource() == b2) {
			result = tA.getText();
			if (tf2.getText().equals("")) {
				if (tf3.getText().equals("")) {
					if (tf4.getText().equals("")) {
						if (tf5.getText().equals("")) {
							if (tf6.getText().equals("")) {
								if (tf7.getText().equals("")) {
									if (tf8.getText().equals("")) {
										if (tf9.getText().equals("")) {
											if (tf10.getText().equals("")) {
												if (tf11.getText().equals("")) {
													tf11.setText(result);
												} else
													tf10.setText(result);
											} else
												tf9.setText(result);
										} else
											tf8.setText(result);
									} else
										tf7.setText(result);
								} else
									tf6.setText(result);
							} else
								tf5.setText(result);
						} else
							tf4.setText(result);
					} else
						tf3.setText(result);
				} else
					tf2.setText(result);
			}
			else
				JOptionPane.showMessageDialog(null,"Stack Overflow","Error",JOptionPane.WARNING_MESSAGE);
			result = "";
			tA.setText("");
		}
		if (e.getSource() == b3) {
			l1.setText(null);
			l2.setText(null);
			l3.setText(null);
			l4.setText(null);
			tA.setText("");
			if (tf2.getText().equals("")) {
				if (tf3.getText().equals("")) {
					if (tf4.getText().equals("")) {
						if (tf5.getText().equals("")) {
							if (tf6.getText().equals("")) {
								if (tf7.getText().equals("")) {
									if (tf8.getText().equals("")) {
										if (tf9.getText().equals("")) {
											if (tf10.getText().equals("")) {
												if (tf11.getText().equals("")) {
													JOptionPane.showMessageDialog(null,"Stack Underflow","Error",JOptionPane.WARNING_MESSAGE); 
												} else
													tf11.setText("");
											} else
												tf10.setText("");
										} else
											tf9.setText("");
									} else	
										tf8.setText("");
								} else
									tf7.setText("");
							} else
								tf6.setText("");
						} else
							tf5.setText("");
					} else
						tf4.setText("");
				} else
					tf3.setText("");
			} else
				tf2.setText("");
		}
	}

	public static void main(String[] args) {
		new guiproject();
	}
}
