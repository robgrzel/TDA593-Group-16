// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------
package g16_tda593;

import project.Point;
import project.SimulatorController;
import simbad.sim.AbstractWall;
import simbad.sim.Boundary;
import simbad.sim.EnvironmentDescription;
import simbad.sim.HorizontalBoundary;
import simbad.sim.HorizontalWall;
import simbad.sim.VerticalBoundary;
import simbad.sim.VerticalWall;

public class PhysArea extends Area{
	public EnvironmentDescription e;
	public PhysArea(EnvironmentDescription e) {
		this.e = e;
	}
	public EnvironmentDescription getArea() {
		return e;
	}
}