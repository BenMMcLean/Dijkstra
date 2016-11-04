package com.arctro.dijkstra;

//The paths between vertices
public class VertexLink {
	Vertex link;
	double weight;
	
	public VertexLink(){}

	public VertexLink(Vertex link, double weight) {
		super();
		this.link = link;
		this.weight = weight;
	}

	public Vertex getLink() {
		return link;
	}

	public void setLink(Vertex link) {
		this.link = link;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
}
