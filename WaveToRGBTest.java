package TestPractice;

import javax.swing.JFrame;

public class WaveToRGBTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setBounds(20, 40, 300, 300);
		WaveToRGB panel = new WaveToRGB();
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
