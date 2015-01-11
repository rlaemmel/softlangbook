package org.softlang;

import java.util.ArrayList;

public class FsmlSimulator {
	private Fsm fsm;
	public FsmlSimulator(Fsm fsm) {
		this.fsm = fsm;
	}
	public String[] run(String[] input) {
		ArrayList<String> output = new ArrayList<String>();
		String state = fsm.getInitial();
		for (String event : input) {
			String action = fsm.getAction(state, event);
			if (action != null) output.add(action);
			state = fsm.getTarget(state, event);
		}
		return output.toArray(new String[output.size()]);
	}
}
