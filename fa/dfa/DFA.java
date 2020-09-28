package fa.dfa;
import java.util.HashMap;
import java.util.HashSet;
import fa.State;
import java.util.Map;
import java.util.Set;


/**
 * This Class is the DFA that contains all of the DFAStates.
 *
 * The Class contains all of the Sets for the States that the DFA contains
 * as well as a compliment to said Set.
 * The Class also contains a Character Set for the Alphabet and a Map that contains a Pair for the Key,
 * which consists of the symbol it is using to transition and the state from which is shdifts from.
 * The value returned from this pair is the toState in which it will shift to.
 *
 * This class also contains an acceptor which verifies if the character checked is in the alphabet or not.
 *
 * The class lastly contains the basic functions such as addState, addFinal, addStart, addTransition and lastly
 * getToState which utilizes the map function mentioned above.
 *
 *
 * @author Chazz Chandler and Joey Kitzhaber
 */

public class DFA implements DFAInterface {
    Set<State> qNotArray = new HashSet<State>();
    Set<State> qArray = new HashSet<State>();
    Set<State> fArray = new HashSet<State>();
    Set<Character> sigma = new HashSet<Character>();//Alphabet Array
    Map<Pair<Character, String>, String> tMap = new HashMap<Pair<Character,String>, String>();
    private Object Pair;

    @Override
    public boolean accepts(String s) {

        Boolean acceptor;

        if(qArray.contains(s)){
            acceptor = true;
        } else {
            acceptor = false;
        }

        return acceptor;
    }

    @Override
    public State getToState(DFAState from, char onSymb) {

        DFAState newState = new DFAState();

        Pair pair = new Pair(onSymb, from);
        String s = "";

        if(tMap.containsKey(pair)){
            s = tMap.getOrDefault(pair, s);
        }

        newState.setName(s);

        return newState;
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

        char c = name.charAt(0);

        if(!sigma.contains(name)){//Alphabet Check/adder
            sigma.add(c);
        }

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

        Pair p = new Pair(onSymb, fromState);

        tMap.putIfAbsent(p, toState);

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
        return sigma;
    }

    @Override
    public DFA complement() {
        DFA compDFA = new DFA();

        while (this.qArray.iterator().hasNext()){
            compDFA.addState(qArray.iterator().next().getName());
        }

        compDFA.addStartState(qNotArray.iterator().next().getName());

        while (compDFA.getStates().iterator().hasNext()){
            String compName = compDFA.getStates().iterator().next().getName();

            while (this.fArray.iterator().hasNext()){
                State finalState = this.fArray.iterator().next();

                if (compName != finalState.getName()){
                    compDFA.addFinalState(compName);
                }
            }
        }

        return compDFA;
    }

}
