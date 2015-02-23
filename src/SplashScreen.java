
import java.awt.*;

import javax.swing.*;

public class SplashScreen extends JWindow {

	private int duration;

	private JPanel content = (JPanel) getContentPane();
	private JProgressBar progressBar = new JProgressBar();


	public SplashScreen(int duration) {
		this.duration = duration;

	}

	public void showScreen() {

		content.setBackground(Color.white);
		Point center = GraphicsEnvironment.getLocalGraphicsEnvironment()
				.getCenterPoint();
		int windowWidth = 400;
		int windowHeight = 450;
		// set position and size
		setBounds(center.x - windowWidth / 2, center.y - windowHeight / 2,
				windowWidth, windowHeight);

		ImageIcon ii = new ImageIcon(this.getClass().getResource(
				"Resources/TravelGuru.png"));
		JLabel label = new JLabel(ii);
		JLabel copyrt = new JLabel("Copyright 2015, TravelGuru", JLabel.CENTER);
		copyrt.setFont(new Font("Sans-Serif", Font.BOLD, 12));
		content.add(label, BorderLayout.CENTER);
		content.add(copyrt, BorderLayout.SOUTH);
		content.setBorder(BorderFactory.createLineBorder(Color.black, 10));

		setVisible(true);
		loadProgress();
		progressBar.setMaximum(50);
		progressBar.setBounds(70, 380, 250, 15);

		content.add(progressBar);

		try {
			Thread.sleep(duration);
		} catch (Exception e) {
		}

		setVisible(false);
	}

	public void loadProgress() {

		for (int i = 0; i < 50; i++) {
			progressBar.setValue(i);

		}

	}

	public void showAndExit() {
		showScreen();
		
		content.setVisible(false);
	}
}