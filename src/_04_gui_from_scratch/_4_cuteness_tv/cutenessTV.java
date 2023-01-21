package _04_gui_from_scratch._4_cuteness_tv;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

public class cutenessTV implements ActionListener {
    JButton duck = new JButton("duck");
    JButton frog = new JButton("frog");
    JButton fish = new JButton("fish");
    public void showButton(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.add(duck);
        panel.add(frog);
        panel.add(fish);
        fish.addActionListener(this);
        frog.addActionListener(this);
        duck.addActionListener(this);
        frame.add(panel);
        frame.setVisible(true);
        frame.pack();

    }
    void showDucks() {
        playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
    }

    void showFrog() {
        playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
    }

    void showFish() {
        playVideo("https://www.youtube.com/watch?v=WEVFRI6A0lI");
    }

    void playVideo(String videoID) {

        // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't
        //work on some Linux implementations
        try {
            if (System.getProperty("os.name").toLowerCase().contains("linux")) {
                if (Runtime.getRuntime().exec(new String[] {
                        "which", "xdg- open" }).getInputStream().read() != -1) {
                    Runtime.getRuntime().exec(new String[] { "xdg-open", videoID });
                }
            } else {
                URI uri = new URI(videoID);
                java.awt.Desktop.getDesktop().browse(uri);
            }      } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getSource());
        if (e.getSource() == duck) {
            showDucks();
        }
        else if (e.getSource() == fish) {
            showFish();
        }
        else if (e.getSource() == frog) {
            showFrog();
        }
    }
}