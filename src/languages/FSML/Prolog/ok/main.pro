% Wellness of FSMs
okFsm(Fsm) :-
  fsmSingleInitial(Fsm),
  fsmDistinctIds(Fsm),
  fsmResolvable(Fsm),
  fsmDeterministic(Fsm),
  fsmReachable(Fsm).
