import javax.swing.*;
import java.awt.*;

public class CustomWindow extends JFrame {

    private CustomPanel main_panel;
    private ShapesManager shapes_manager;

    public CustomWindow(ShapesManager shapes_manager)
    {
        this.shapes_manager = shapes_manager;
        main_panel = new CustomPanel(shapes_manager);

        //add our new panel to the frame
        add(main_panel, BorderLayout.CENTER);
        //set the dimensions of the frame/window from consts.java
        setSize(Consts.FRAME_WIDTH, Consts.FRAME_HEIGHT);
    }

}
