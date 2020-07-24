import java.awt.*;
import javax.swing.*;

public class client extends JFrame {
	public client() {
		setTitle("jhpaint");
		setSize(720,480);
		setVisible(true);
		
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	public static void main(String[] args) {
		new client();
	}
}
