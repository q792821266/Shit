package plant;

import java.awt.*;
import javax.swing.*;

public class MainFrame {
	public void paint(){
		Frame nw = new Frame("1");
		Panel nn = new Panel();
		Label a1 = new Label("2");
		Label a2 = new Label("3");
		Button b =  new Button("4");
		nn.add(a1);
		nn.add(a2);
		nn.add(b);
		nw.add(nn);
		nw.setSize(300,300);
		nw.setVisible(true);
		
	}
}
