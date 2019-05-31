package edu.cg.models;
import com.jogamp.opengl.*;
import edu.cg.models.Car.Specification;
import edu.cg.models.Car.Spolier;
import edu.cg.models.Car.Wheel;
import edu.cg.models.Car.PairOfWheels;
import edu.cg.models.Car.Back;
import edu.cg.models.Car.Center;
import edu.cg.models.Car.Front;
import edu.cg.models.Car.F1Car;

/**
 * A simple axes dummy
 *
 */
public class Empty implements IRenderable {

	private SkewedBox box = new SkewedBox(0.1, 0.2, 0.1, 0.2, 0.1);
	private Spolier spoiler = new Spolier();
	private Wheel wheel = new Wheel();
	private PairOfWheels wheels = new PairOfWheels();
	private Back back = new Back();
	private Center center = new Center();
	private Front front = new Front();
	private F1Car f1Car = new F1Car();

	public void render(GL2 gl) {
//		box.render(gl);
//		wheel.render(gl);
//		wheels.render(gl);
//		back.render(gl);
//		center.render(gl);
//		front.render(gl);
		f1Car.render(gl);

	}

	@Override
	public String toString() {
		return "Empty";
	}

	@Override
	public void init(GL2 gl) {

	}
}
