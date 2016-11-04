package com.arctro.dijkstra;

//Stores the state of a vertex for the dijkstra
public class VertexState {
	//The vertex it is attached to
	Vertex v;
	//The next vertex in the chain
	Vertex last;
	//If the vertex has been visited yet
	boolean visited;
	//The weight
	double weight;
	
	public VertexState(){
		
	}

	public VertexState(Vertex v) {
		super();
		this.v = v;
		this.last = null;
		this.visited = false;
		this.weight = Double.POSITIVE_INFINITY;
	}

	public VertexState(Vertex v, Vertex last) {
		super();
		this.v = v;
		this.last = last;
		this.visited = false;
		this.weight = Double.POSITIVE_INFINITY;
	}

	public VertexState(Vertex v, double weight) {
		super();
		this.v = v;
		this.last = v;
		this.visited = true;
		this.weight = weight;
	}

	public Vertex getVertex() {
		return v;
	}

	public void setVertex(Vertex v) {
		this.v = v;
	}
	
	public Vertex getLast() {
		return last;
	}

	public void setLast(Vertex last) {
		this.last = last;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public boolean equals(Object o){
		if(!(o instanceof VertexState)){
			return false;
		}
		
		VertexState vs = (VertexState)o;
		return vs.getVertex() == getVertex() && vs.getLast() == vs.getLast();
	}
}
