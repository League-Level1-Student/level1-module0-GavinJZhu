package _03_gui_with_help._2_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

public class PhotoQuiz {

    public void run() {

        JFrame quizWindow = new JFrame();
        quizWindow.setVisible(true);
        // This will make sure the program exits when you close the window
        quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 1. find an image on the internet, and put its URL in a String
        // variable (from your browser, right click on the image, and select
        // “Copy Image Address” )

        // 2. create a variable of type "Component" that will hold your image
        Component image;
        // 3. use the "createImage()" method below to initialize your Component
        String httpImage = "https://media.istockphoto.com/id/487506120/photo/reticulated-python.jpg?s=612x612&w=0&k=20&c=Kiq69SnelQIakIoNWrmUD0jTmVKkG2KAarG3JYHLBw0=";
        image = createImage(httpImage);
        // 4. add the image to the quiz window
        quizWindow.add(image);
        // 5. call the pack() method on the quiz window
        quizWindow.pack();
        // 6. ask a question that relates to the image
        String question = JOptionPane.showInputDialog(null, "What animal is in the image?");
        // 7. print "CORRECT" if the user gave the right answer
        if (question.equalsIgnoreCase("snake")) {
            JOptionPane.showMessageDialog(null, "You are correct!");
        }

        // 8. print "INCORRECT" if the answer is wrong
        else {
            JOptionPane.showMessageDialog(null, "Incorrect!");
        }
        // 9. remove the component from the quiz window (you may not see the
        // effect of this until step 12)
        quizWindow.remove(image);
        // 10. find another image and create it (might take more than one line
        // of code)
        String image2 = "https://cdn.britannica.com/33/1733-004-5BA407D6/FLAG-Ireland.jpg";
        // 11. add the second image to the quiz window
        image = createImage(image2);
        quizWindow.add(image);
        // 12. pack the quiz window
        quizWindow.pack();
        // 13. ask another question
        String flag = JOptionPane.showInputDialog(null, "What country has this flag?");
        // 14+ check answer, say if correct or incorrect, etc.
        if (flag.equalsIgnoreCase("IRELAND")) {
            JOptionPane.showMessageDialog(null, "Correct!");
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect!");
        }
    }

    private Component createImage(String imageUrl) {
        JLabel imageLabel = new JLabel();
        URL url;
        try {
            url = new URL(imageUrl);
            Icon icon = new ImageIcon(url);
            imageLabel.setIcon(icon);
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            JOptionPane.showMessageDialog(null, "I can't find your image!!");
        }

        return imageLabel;
    }

    /* OPTIONAL */
    // *14. add scoring to your quiz
    // *15. make something happen when mouse enters image
    // (imageComponent.addMouseMotionListener())
}
