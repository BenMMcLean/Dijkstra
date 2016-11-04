package com.arctro.dijkstra;

import java.util.Iterator;
import java.util.LinkedList;

public class Path implements Iterable<Vertex>{
	LinkedList<Vertex> path;
	
	public Path(){
		path = new LinkedList<Vertex>();
	}
	
	public void add(Vertex v){
		path.addFirst(v);
	}
	
	public Vertex getStart(){
		return path.getFirst();
	}
	
	public Vertex getEnd(){
		return path.getLast();
	}
	
	public LinkedList<Vertex> getLinkedList(){
		return path;
	}
	
	@Override
	public Iterator<Vertex> iterator() {
		return path.iterator();
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < path.size(); i++){
			sb.append("(").append(path.get(i).getId()).append(") -> ");
		}
		
		sb.setLength(sb.length() - 4);
		
		return sb.toString();
	}

}
