package controller;

import java.util.HashMap;
import java.util.Map;

import util.Paintable;

public class PaintManager {
	Map<String, Paintable> myPaintMap;
	public PaintManager() {
		myPaintMap = new HashMap<String, Paintable>();
	}

	public Paintable getPaintable(String name){
		return myPaintMap.get(name);
	}
}
