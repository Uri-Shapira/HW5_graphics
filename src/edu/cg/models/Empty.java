package edu.cg.models;

import com.jogamp.opengl.*;
import edu.cg.models.Car.Specification;

/**
 * A simple axes dummy
 *
 */
public class Empty implements IRenderable {

	private SkewedBox backBox = new SkewedBox(0.1, 0.2,
			0.1, 0.2, 0.1);

	public void render(GL2 gl) {
		backBox.render(gl);
	}

	@Override
	public String toString() {
		return "Empty";
	}

	@Override
	public void init(GL2 gl) {

	}
}
