package edu.cg.models;

import com.jogamp.opengl.*;
import edu.cg.models.Car.Specification;
import edu.cg.models.Car.Spolier;

/**
 * A simple axes dummy
 *
 */
public class Empty implements IRenderable {

	private SkewedBox box = new SkewedBox(0.1, 0.2,
			0.1, 0.2, 0.1);
	private Spolier spoiler = new Spolier();

	public void render(GL2 gl) {
		box.render(gl);
	}

	@Override
	public String toString() {
		return "Empty";
	}

	@Override
	public void init(GL2 gl) {

	}
}
