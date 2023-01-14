package _04_gui_from_scratch._2_jack_in_the_box;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class JackInTheBox implements ActionListener {


    private void showPicture(String fileName) {
        try {
            JLabel imageLabel = createLabelImage(fileName);
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(imageLabel);
            frame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private JLabel createLabelImage(String fileName) {
        try {
            URL imageURL = getClass().getResource(fileName);
            if (imageURL == null) {
                System.err.println("Could not find image " + fileName);
                return new JLabel();
            } else {
                Icon icon = new ImageIcon(imageURL);
                JLabel imageLabel = new JLabel(icon);
                return imageLabel;
            }
        } catch (Exception e) {
            System.err.println("Could not find image " + fileName);
            return new JLabel();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    //add logic here (click 5 times
        //create variable nr of clicks
    }
    public void showButton(){
        JFrame frame = new JFrame();
        JButton button = new JButton();
        frame.setVisible(true);
        frame.add(button);
        button.setText("Surprise");
        frame.pack();
        button.addActionListener(this);
    }
}
