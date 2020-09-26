package fa.dfa;
import java.util.ArrayList;
import fa.State;

import java.util.Set;

public class DFA implements DFAInterface {
    ArrayList<State> qNotArray = new ArrayList<State>();
    ArrayList<State> qArray = new ArrayList<State>();
    ArrayList<State> fArray = new ArrayList<State>();

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
    }

    @Override
    public void addTransition(String fromState, char onSymb, String toState) {

    }

    @Override
    public Set<? extends State> getStates() {
        return null;
    }

    @Override
    public Set<? extends State> getFinalStates() {
        return null;
    }

    @Override
    public State getStartState() {
        return null;
    }

    @Override
    public Set<Character> getABC() {
        return null;
    }

    @Override
    public DFA complement() {
        return null;
    }
    //TEST TEST TEST TEST
}
