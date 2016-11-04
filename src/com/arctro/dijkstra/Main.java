package com.arctro.dijkstra;

public class Main {

	public static void main(String[] args) {
		//Test data
		Vertex[] vs = {new Vertex(0), new Vertex(1), new Vertex(2), new Vertex(3), new Vertex(4)};
		
		//Setup links
		VertexLink[] vl0 = {new VertexLink(vs[1], 1), new VertexLink(vs[2], 1), new VertexLink(vs[3], 1)};
		vs[0].setLinkedVertices(vl0);
		
		VertexLink[] vl1 = {new VertexLink(vs[0], 1), new VertexLink(vs[3], 1)};
		vs[1].setLinkedVertices(vl1);
		
		VertexLink[] vl2 = {new VertexLink(vs[0], 1), new VertexLink(vs[3], 1)};
		vs[2].setLinkedVertices(vl2);
		
		VertexLink[] vl3 = {new VertexLink(vs[0], 1), new VertexLink(vs[1], 1), new VertexLink(vs[2], 1), new VertexLink(vs[4], 1)};
		vs[3].setLinkedVertices(vl3);
		
		VertexLink[] vl4 = {new VertexLink(vs[3], 1)};
		vs[4].setLinkedVertices(vl4);
		
		//Run algorithm
		Dijkstra d = new Dijkstra(vs);
		Path p = d.getPath(0 , 4);
		
		//Print algorithm
		System.out.println(p);
	}

}
