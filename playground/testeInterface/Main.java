import java.awt.GridBagLayout;
import javax.swing.*;

public class Main {
	public static void main (String[] args) {
		JFrame screen = new JFrame("Meu novo App");
		GraphicsConfigurationUtils configs = new GraphicsConfigurationUtils();
        screen.setSize(configs.getWidth(),configs.getHeight());


		JButton btn1 = new JButton("click");//creating instance of JButton  
		btn1.setBounds(200, 100, 10, 40);//x axis, y axis, width, height 
		JButton btn2 = new JButton("click");//creating instance of JButton  
		btn2.setBounds(400, 100, 10, 40);//x axis, y axis, width, height 

		screen.add(btn1);//adding button in JFrame
		screen.add(btn2);//adding button in JFrame 
        screen.setVisible(true);
	}
};
