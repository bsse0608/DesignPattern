package allShapes;

import java.awt.Shape;
import java.util.ArrayList;

public class Rectangle extends CompositShape{

	@Override
	public void buildShap() {
		shapes.add(new Line());
		shapes.add(new Line());
		shapes.add(new Line());
		shapes.add(new Line());
	}

}
