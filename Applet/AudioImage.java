//AudioImage

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Graphics;
import java.awt.Image;

public class AudioImage extends Applet {

	Image img;
	AudioClip audio;

	@Override
	public void init() {

		System.out.println("Image path is found");
		img = getImage(getCodeBase(), "src//image.gif");
		audio = getAudioClip(getCodeBase(), "src//hornmusic.au");
	}

	public void start() {
		System.out.println("start");
		audio.play();
	}

	public void stop() {
		System.out.println("stop");
		audio.stop();
	}

	public void paint(Graphics g) {
		System.out.println("DrawImage");
		g.drawImage(img, 50, 50, this);
	}

}
