package frame;

import java.awt.*;


public class MainFrame {
    private static Frame f;

    static {
        f = new Frame("主界面");
    }

    public MainFrame(){
        f.setSize(500,400);
        f.setLocation(300,200);
        f.setLayout(new FlowLayout());
        Button btnSmt=new Button("读取");
        f.add(btnSmt);
    }

}
