package com.arctro.dijkstra;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//Implementation of list with some extra functions specific to VertexState
public class VertexStateList implements List<VertexState>{
	List<VertexState> vertexStates;
	
	public VertexStateList(){
		vertexStates = new ArrayList<VertexState>();
	}
	
	public List<VertexState> getParent(){
		return vertexStates;
	}
	
	//Get a vertex state by id
	public VertexState getById(int id){
		for(int i = 0; i < vertexStates.size(); i++){
			if(vertexStates.get(i).getVertex().getId() == id){
				return vertexStates.get(i);
			}
		}
		
		return null;
	}
	
	//Get a VertexState by vertex
	public VertexState getByVertex(Vertex v){
		for(int i = 0; i < vertexStates.size(); i++){
			if(vertexStates.get(i).getVertex().equals(v)){
				return vertexStates.get(i);
			}
		}
		
		return null;
	}

	@Override
	public boolean add(VertexState e) {
		return vertexStates.add(e);
	}

	@Override
	public void add(int index, VertexState element) {
		vertexStates.add(index, element);
	}

	@Override
	public boolean addAll(Collection<? extends VertexState> c) {
		return vertexStates.addAll(c);
	}

	@Override
	public boolean addAll(int index, Collection<? extends VertexState> c) {
		return vertexStates.addAll(index, c);
	}

	@Override
	public void clear() {
		vertexStates.clear();
	}

	@Override
	public boolean contains(Object o) {
		return vertexStates.contains(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return vertexStates.containsAll(c);
	}

	@Override
	public VertexState get(int index) {
		return vertexStates.get(index);
	}

	@Override
	public int indexOf(Object o) {
		return vertexStates.indexOf(o);
	}

	@Override
	public boolean isEmpty() {
		return vertexStates.isEmpty();
	}

	@Override
	public Iterator<VertexState> iterator() {
		return vertexStates.iterator();
	}

	@Override
	public int lastIndexOf(Object o) {
		return vertexStates.lastIndexOf(o);
	}

	@Override
	public ListIterator<VertexState> listIterator() {
		return vertexStates.listIterator();
	}

	@Override
	public ListIterator<VertexState> listIterator(int index) {
		return vertexStates.listIterator(index);
	}

	@Override
	public boolean remove(Object o) {
		return vertexStates.remove(o);
	}

	@Override
	public VertexState remove(int index) {
		return vertexStates.remove(index);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return vertexStates.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return vertexStates.retainAll(c);
	}

	@Override
	public VertexState set(int index, VertexState element) {
		return vertexStates.set(index, element);
	}

	@Override
	public int size() {
		return vertexStates.size();
	}

	@Override
	public List<VertexState> subList(int fromIndex, int toIndex) {
		return vertexStates.subList(fromIndex, toIndex);
	}

	@Override
	public Object[] toArray() {
		return vertexStates.toArray();
	}
	
	public VertexState[] toVertexArray() {
		return vertexStates.toArray(new VertexState[vertexStates.size()]);
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return vertexStates.toArray(a);
	}
}
