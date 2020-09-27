package fa.dfa;

import fa.State;

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
