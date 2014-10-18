package org.gerdl.openstrato.model;

import java.util.List;
import java.util.Vector;

public abstract class ShipSystem {
	
	// convenience:
	protected Ship myship;
	protected Sim  mysim;
	
	protected List<SystemTile> space = new Vector<SystemTile>();
	protected int              dx,dy;  // system's coordinates, relative to ship zero.

	// physics:
	double mass;
	double dir = 0;   // A system can be built in any direction.
	
	
	public ShipSystem(Ship _myship, Sim _mysim) {
		myship = _myship;
		mysim  = _mysim;
	}
}
