package fa.dfa;

import fa.State;

/**
 * 9/27/2020
 *
 * This class contains the base information that a DFAState should contain.
 * a name for the State, if it is a Final or Start state.
 * The class also returns true or false if it is a Start or Final State.
 *
 * @author Chazz Chandler and Joey Kitzhaber
 */
public class DFAState extends State {

    boolean isFinalState = false;
    boolean isStartState = false;
    String sName = "";

    public void setName(String label){
        name = label;
    }

    public void setFinalState(boolean bool){
        isFinalState = bool;
    }

    public void setStartState(boolean bool){
        isStartState = bool;
    }

    public boolean getFinalState(){
        return isFinalState;
    }

    public boolean getStartState(){
        return isStartState;
    }

}
