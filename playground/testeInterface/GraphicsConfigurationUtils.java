import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;

public class GraphicsConfigurationUtils {
	private int width;
	private int height;	
	
	public GraphicsConfigurationUtils() {
		GraphicsEnvironment environment = GraphicsEnvironment.getLocalGraphicsEnvironment();
      		Rectangle screen = environment.getMaximumWindowBounds();
      		height = (int)screen.getHeight();
		width = (int)screen.getWidth();
	}
	public int getHeight() {
		return width;
	}
	public int getWidth() {
		return height;
	}

};
