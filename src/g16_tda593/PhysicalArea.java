// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package g16_tda593;

import java.awt.Color;

import simbad.sim.AbstractWall;
import simbad.sim.EnvironmentDescription;
import simbad.sim.HorizontalWall;
import simbad.sim.VerticalWall;

/************************************************************/
/**
 * 
 */
public class PhysicalArea extends Area {
	
	public PhysicalArea(Span span, int reward) {
		super(span, reward);
	}

	public PhysicalArea(float f, float g, float h, float i, int reward) {
		super(f,g,h,i, reward);
	}

	/**
	 * 
	 * @param a starting position of wall
	 * @param b Width/height (i don't really get it either)
	 * @param c Width/height (i don't really get it either)
	 * @param direction Specifies if the wall is horizontal (h) or vertical (v) if not specified it defaults to v.
	 */
	public void addWall(float a, float b, float c, char direction, EnvironmentDescription e, Color color) {
		if(direction == 'h') {
			AbstractWall wall = new HorizontalWall(a,b,c,e, color);
		}else {
			super.getEnvironment().add(new VerticalWall(a,b,c,e, color));
		}
	}

	/**
	 * 
	 * @return this areas environmentDescription
	 */
	public EnvironmentDescription getEnvironment() {
		return super.getEnvironment();
	}

	/**
	 * 
	 * @return 
	 */
	public Span getSpan() {
		return super.getSpan();
	}
};
