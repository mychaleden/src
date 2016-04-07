import java.net.URI;

import javax.swing.JOptionPane;

public class SoundtrackToLife {

	public static void main(String[] args) {

		// 1. Adjust this pop-up to find out what mood the user is in.
		int userMood = JOptionPane.showOptionDialog(null, "how do you feel today?", "SoundtrackToLife", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "stressed out", "eh", "happy" }, null);

		// 2. Their answer is stored in the userMood variable. Print it out.
		
		// 3. If they are in a stressed mood, use the playVideo method to play a calming song from YouTube.
		if (userMood == 0) {
			 playVideo("https://www.youtube.com/watch?v=pXRviuL6vMY");


		}
        if (userMood == 1) {
        	playVideo("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
	
}
        if (userMood == 2) {
        	playVideo("https://www.youtube.com/watch?v=1prZmb5r6kI");
        }
	}

	static void playVideo(String youTubeLink) {
		try {
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
/**
 * If you can’t think of any, here are some you can use... bit.ly/video-for-happy bit.ly/video-for-sad
 * bit.ly/video-for-angry
 **/
