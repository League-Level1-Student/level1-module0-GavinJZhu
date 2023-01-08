package _04_gui_from_scratch._1_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class fortune_cookie implements ActionListener {



		  
	
	public void showButton() {
        System.out.println("Button clicked");
        JFrame frame = new JFrame();
        frame.setVisible(true);
        JButton button = new JButton();
	    frame.add(button);
	    frame.pack();
	    button.addActionListener(this);
	    button.setText("Press this button for your fortune!");
   }
	@Override
	public void actionPerformed(ActionEvent arg0) {
	
		int rand = new Random().nextInt(5);
		  if (rand == 5) {
			  JOptionPane.showMessageDialog(null, "You will make lots of money.");
		  }
		  else if (rand == 1) {
			  JOptionPane.showMessageDialog(null, "You will be healthy.");
		  }
		  else if (rand == 2) {
			  JOptionPane.showMessageDialog(null, "Its on etsy for $9.99!");
		  }
		  else if (rand == 3) {
			  JOptionPane.showMessageDialog(null, "Your end is near.");
		  }
		  else if (rand == 4) {
			  JOptionPane.showMessageDialog(null, "You will recieve a mysterious package in the mail.");
	}
	}
	}
