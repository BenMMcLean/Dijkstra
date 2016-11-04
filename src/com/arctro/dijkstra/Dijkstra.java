package com.arctro.dijkstra;

public class Dijkstra {
	Vertex[] vertices;
	
	public Dijkstra(Vertex[] vertices){
		this.vertices = vertices;
	}
	
	public Path getPath(int from, int to){
		return getPath(getById(from), getById(to));
	}
	
	public Path getPath(Vertex from, Vertex to){
		//Check if either parameter is null
		if(from == null || to == null){
			return null;
		}
		//Check if parameters are the same
		if(from == to){
			Path p = new Path();
			p.add(from);
			return p;
		}
		
		//The current vertex
		VertexState currentVertex;
		//The list of vertex states (weights, visited, next in chain)
		VertexStateList search = new VertexStateList();
		
		//Initialize the search list
		search.add(currentVertex = new VertexState(from, 0));
		for(int i = 0; i < vertices.length; i++){
			if(!vertices[i].equals(from)){
				search.add(new VertexState(vertices[i]));
			}
		}
		
		//Search the vertices
		boolean searching = true;
		while(searching){
			//Set the current vertex to be visited
			currentVertex.setVisited(true);
			
			//Calculate path weights
			//Get the currentVertex's links
			VertexLink[] links = currentVertex.getVertex().getLinkedVertexes();
			//Search those links
			for(int i = 0; i < links.length; i++){
				//Get the state of the link being checked
				VertexState linkedState = search.getByVertex(links[i].getLink());
				
				//Calculate the weight if the path went through the currentVertex
				double weight = currentVertex.getWeight() + links[i].getWeight();
				
				//Check if going through the current vertex is a better path
				if(weight < linkedState.getWeight()){
					//If so update the weight and the vertex chain
					linkedState.setWeight(weight);
					linkedState.setLast(currentVertex.getVertex());
				}
			}
			
			//Get next step
			VertexState next = null;
			for(int i = 0; i < search.size(); i++){
				VertexState check = search.get(i);
				
				//Find the lowest weighted, unvisited, vertex
				if((next == null || next.getWeight() > check.getWeight()) && !check.isVisited() && !check.getVertex().equals(currentVertex.getVertex())){
					next = check;
				}
			}
			
			//If no next vertex found, no path exists
			if(next == null){
				return null;
			}
			
			//If the destination is found, return a path
			if(next.getVertex() == to){
				Path p = new Path();
				p.add(to);
				return generatePath(p, search, search.getByVertex(to));
			}
			
			//Update the currentVertex to the next vertex
			currentVertex = next;
		}
		
		return null;
	}
	
	//Generate a path backwards from a vertex
	private Path generatePath(Path p, VertexStateList search, VertexState current){
		//If the current is at the beginning (i.e it links to itself), return path
		if(current.getLast() == null || current.getLast().equals(current.getVertex())){
			return p;
		}
		
		//Add the current vertex to the path
		p.add(current.getLast());
		//Check next vertex in chain
		return generatePath(p, search, search.getByVertex(current.getLast()));
	}
	
	//Get a vertex by id
	public Vertex getById(int id){
		for(int i = 0; i < vertices.length; i++){
			if(vertices[i].getId() == id){
				return vertices[i];
			}
		}
		
		return null;
	}
}
