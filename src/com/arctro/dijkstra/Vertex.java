package com.arctro.dijkstra;

//Stores a vertex
public class Vertex {
	int id;
	VertexLink[] linkedVertices;
	
	public Vertex(){}

	public Vertex(int id) {
		super();
		this.id = id;
	}

	public Vertex(int id, VertexLink[] linkedVertexes) {
		super();
		this.id = id;
		this.linkedVertices = linkedVertexes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public VertexLink[] getLinkedVertexes() {
		return linkedVertices;
	}

	public void setLinkedVertexes(VertexLink[] linkedVertexes) {
		this.linkedVertices = linkedVertexes;
	}
	
	public boolean equals(Object o){
		if(!(o instanceof Vertex)){
			return false;
		}
		return ((Vertex)o).getId() == getId();
	}
}
