package com.arctro.dijkstra;

//Stores a vertex
public class Vertex {
	int id;
	VertexLink[] linkedVertexes;
	
	public Vertex(){}

	public Vertex(int id) {
		super();
		this.id = id;
	}

	public Vertex(int id, VertexLink[] linkedVertexes) {
		super();
		this.id = id;
		this.linkedVertexes = linkedVertexes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public VertexLink[] getLinkedVertexes() {
		return linkedVertexes;
	}

	public void setLinkedVertexes(VertexLink[] linkedVertexes) {
		this.linkedVertexes = linkedVertexes;
	}
	
	public boolean equals(Object o){
		if(!(o instanceof Vertex)){
			return false;
		}
		return ((Vertex)o).getId() == getId();
	}
}
