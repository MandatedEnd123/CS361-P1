package fa.dfa;
import java.util.HashSet;
import fa.State;

import java.util.Set;

public class DFA implements DFAInterface {
    Set<State> qNotArray = new HashSet<State>();
    Set<State> qArray = new HashSet<State>();
    Set<State> fArray = new HashSet<State>();
    Set<Character> sigma = new HashSet<Character>();

    @Override
    public boolean accepts(String s) {
        return false;
    }

    @Override
    public State getToState(DFAState from, char onSymb) {
        return null;
    }

    @Override
    public void addStartState(String name) {
        DFAState sState = new DFAState();
        sState.setName(name);
        sState.setStartState(true);
        qNotArray.add(sState);
        qArray.add(sState);
    }

    @Override
    public void addState(String name) {
        DFAState qState = new DFAState();
        qState.setName(name);
        qArray.add(qState);
    }

    @Override
    public void addFinalState(String name) {
        DFAState fState = new DFAState();
        fState.setName(name);
        fState.setFinalState(true);
        fArray.add(fState);
        qArray.add(fState);
    }

    @Override
    public void addTransition(String fromState, char onSymb, String toState) {

    }

    @Override
    public Set<? extends State> getStates() {
        return qArray;
    }

    @Override
    public Set<? extends State> getFinalStates() {
        return fArray;
    }

    @Override
    public State getStartState() {
        return qNotArray.iterator().next();
    }

    @Override
    public Set<Character> getABC() {
        return null;
    }

    @Override
    public DFA complement() {
        return null;
    }
}
