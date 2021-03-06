package bus;

import java.util.LinkedList;
/**
 * This structure represents an edge in the graph where the stops were grouped by Street
 */
public class SpotEdge {
	Spot from;
	Spot to;
	int weight;
	String name;
	
	SpotEdge(Spot f, Spot t){
		this.from = f;
		this.to = t;
		this.name = f.code+"-"+t.code;
		this.weight = 1;
		//this.lines = new LinkedList<BusLine>();
	}
	
	void print(){
		System.out.println("edge: "+this.name+" weight: "+this.weight);
	}
	
}
