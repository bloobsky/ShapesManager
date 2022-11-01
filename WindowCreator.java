
import javax.swing.*;

public class WindowCreator {
    public static void main(String[] args) {

        //Create and configure our JFrame (window)
        CustomWindow customWindow = new CustomWindow();
        customWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        customWindow.setTitle("Test Window");
        customWindow.setVisible(true);
    }
}
