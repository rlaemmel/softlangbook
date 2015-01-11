package org.softlang;

import java.util.HashMap;

public class Fsm {
	private class Edge {
		private String action;
		private String target;
	}
	private String initial = null;
	private String state = null;
	private HashMap<String, HashMap<String, Edge>> fsm =
			new HashMap<String, HashMap<String, Edge>>();
	public Fsm state(String state) {
		if (initial == null)
			initial = state;
		this.state = state;
		if (fsm.containsKey(state))
			throw new FsmlException();
		fsm.put(state, new HashMap<String, Edge>());
		return this;
	}
	public Fsm transition(String event, String action, String target) {
		if (fsm.get(state).containsKey(event))
			throw new FsmlException();
		Edge edge = new Edge();
		edge.action = action;
		edge.target = target;
		fsm.get(state).put(event, edge);
		return this;
	}
	public String getInitial() { 
		return initial; 
	}
	public String getAction(String state, String event) {
		return fsm.get(state).get(event).action;
	}
	public String getTarget(String state, String event) {
		return fsm.get(state).get(event).target;
	}	
}
