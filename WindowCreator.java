import javax.swing.*;
import java.awt.*;

public class WindowCreator {
    public static void main(String[] args) {

        CustomWindow customWindow = new CustomWindow();
        customWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        customWindow.setTitle("Shapes Manager - play with Shapes");
        customWindow.setVisible(true);
    }
}
