package _04_gui_from_scratch._3_sound_effects_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class soundEffects implements ActionListener{
		JButton sound1 = new JButton("sound1");
	    JButton sound2 = new JButton("sound2");
	    JButton sound3 = new JButton("sound3");
	    public void showButton(){
	        JFrame frame = new JFrame();
	        JPanel panel = new JPanel();
	        panel.add(sound1);
	        panel.add(sound2);
	        panel.add(sound3);
	        sound1.addActionListener(this);
	        sound2.addActionListener(this);
	        sound3.addActionListener(this);
	        frame.add(panel);
	        frame.setVisible(true);
	        frame.pack();
	        
	}
	    String baDumTssss= "196196__paththeir__ba-dum-tishh-remix.wav";
		String splat = "616476__deleted_user_13668154__splatwav.wav";
		String deezNuts = "deez_nuts.wav";
	    private void playSound(String soundFile) {
		String path ="src/_04_gui_from_scratch/_3_sound_effects_machine/";
				File	sound = new File(path+soundFile);
				if (sound.exists()) {
					new Thread(() -> {
					try {
						Clip clip = AudioSystem.getClip();
						clip.open(AudioSystem.getAudioInputStream(sound));
						clip.start();
						Thread.sleep(clip.getMicrosecondLength()/1000);
					}
					catch (Exception e) {
						e.printStackTrace();
						System.out.println("Could not play this sound");
					}}).start();
		 		}
				else {
					System.out.println("File does not exist");
					System.out.println("Working Directory = " + System.getProperty("user.dir"));
					System.out.println(sound);
				}
			
		}
	    @Override
		public void actionPerformed(ActionEvent e) {
	    	if (e.getSource() == sound1) {
	            playSound(baDumTssss);
	        }
	    	if (e.getSource() == sound2) {
				playSound(splat);
			}
			if (e.getSource() == sound3){
				playSound(deezNuts);
			}
		}
}
