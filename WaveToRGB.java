package TestPractice;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class WaveToRGB extends JPanel {
	private JButton convertButton;
	private JTextField wavelengthTextfield;
	
	private double wavelength;
	private int red, green, blue;
	private Color color = new Color (0, 0, 0);
	private int x, y, width, height;
	
	private static final double gamma = 0.8;
	private static final double intensityMax = 255;
	
	public WaveToRGB() {
		x = 50;
		y = 50;
		width = 200;
		height = 200;
		
		wavelengthTextfield = new JTextField(10);
		wavelengthTextfield.setHorizontalAlignment(SwingConstants.RIGHT);
		
		convertButton = new JButton("Convert to color");
		convertButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				wavelength = Double.parseDouble(wavelengthTextfield.getText());
				convert();
				repaint();
				
			}
			
		});
		convertButton.setHorizontalAlignment(SwingConstants.RIGHT);
		this.add(wavelengthTextfield);
		this.add(convertButton);	
		

	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		
		g.setColor(color);
		g.drawRect(x, y, width, height);
		g.fillRect(x, y, width, height);
	}
	
	
	public void convert() {
		if(wavelength <= 380 || wavelength >= 750) {
			JOptionPane.showMessageDialog(this, "The wavelength must be in the 400-700 nm range");
			color = new Color (0, 0, 0);
			this.red = 0;
			this.green = 0;
			this.blue = 0;
			return;
		}
	    double factor;
	    double red, green, blue;

	    if((wavelength >= 380) && (wavelength < 440)) {
	        red = -(wavelength - 440) / (440 - 380);
	        green = 0.0;
	        blue = 1.0;
	    } else if((wavelength >= 440) && (wavelength < 490)) {
	        red = 0.0;
	        green = (wavelength - 440) / (490 - 440);
	        blue = 1.0;
	    } else if((wavelength >= 490) && (wavelength < 510)) {
	        red = 0.0;
	        green = 1.0;
	        blue = -(wavelength - 510) / (510 - 490);
	    } else if((wavelength >= 510) && (wavelength < 580)) {
	        red = (wavelength - 510) / (580 - 510);
	        green = 1.0;
	        blue = 0.0;
	    } else if((wavelength >= 580) && (wavelength < 645)) {
	        red = 1.0;
	        green = -(wavelength - 645) / (645 - 580);
	        blue = 0.0;
	    } else if((wavelength >= 645) && (wavelength < 781)) {
	        red = 1.0;
	        green = 0.0;
	        blue = 0.0;
	    } else {
	        red = 0.0;
	        green = 0.0;
	        blue = 0.0;
	    }

	    // Let the intensity fall off near the vision limits

	    if((wavelength >= 380) && (wavelength < 420)) {
	        factor = 0.3 + 0.7 * (wavelength - 380) / (420 - 380);
	    } else if((wavelength >= 420) && (wavelength < 701)) {
	        factor = 1.0;
	    } else if((wavelength >= 701) && (wavelength < 781)) {
	        factor = 0.3 + 0.7 * (780 - wavelength) / (780 - 700);
	    } else {
	        factor = 0.0;
	    }
	    
	    this.red = red == 0.0 ? 0 : (int)Math.round(intensityMax * Math.pow(red * factor, gamma));
	    this.green = green == 0.0 ? 0 : (int)Math.round(intensityMax * Math.pow(green * factor, gamma));
	    this.blue = blue == 0.0 ? 0 : (int)Math.round(intensityMax * Math.pow(blue * factor, gamma));
	    
	    color = new Color(this.red, this.green,this.blue);
	    System.out.println("r: " + this.red + " g: " + this.green + " b: " + this.blue );

	}
	

}
