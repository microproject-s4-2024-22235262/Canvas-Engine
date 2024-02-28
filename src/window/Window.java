package window;

import javax.swing.*;

public class Window extends JFrame {
    public Window(String title, int width, int height){
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(width, height);
        setVisible(true);
    }
}
