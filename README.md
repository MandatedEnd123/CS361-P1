# CS361-P1
P1

**Date**
09/27/2020

**Names**
Chazz Chandler
Joey Kitzhaber

**Assignment**
Project 1 - DFA

**Class**
CS361-FA20

**Files**
DFA.java
DFADriver.java
DFAInterface.java
DFAState.java
Pair.Java
FAInterface.java
State.java

**Overview**
DFA is a program that will take an input file which contains a FinalState, StartState, Characters for the Finite Automotons Alphabet, States and Transitions.

The Program will read the file line by line and character by charcter creating a DFA and inputting those states and transitions into the DFA for reading and evaluation.

End function is to print out the states of the DFA after transitions.

**Building and Running**
from the directory containing the files, compile and test.

compile using $javac DFADriver.java

Test with the following command:
$java DFADriver <testfile.txt>

Console will display the output of the file.

**Program Design**
DFA - The Core class to the program, this class is what collects and stores the States in a series or sets and the transitions in a HashMap. The system collects all of the states and inputs the characters into an alphabet Set for evaluation later. The Transitions are stored within a HashMap the utilizes a Pair for a Key and a toState for the value. Pulling the Key and checking the key and Value of the pair to then return the toState. DFA also has the ability to create a compliment Set which is the opposite of each state entered into the normal Set of states.

DFADriver - Written by professor, simply creates the DFA and adds States and Transitions to the DFA class created.

DFAState - Contains the required information for a DFAState, a Name for the state, if it is a Final or Start State as well as the ability to return a Boolean value indicating if it is a Final or Start state.

PAIR - Java Pair Class which was utilized for the HashMap for the Transitions used within the DFA Class.

State - Contains the requirements for the State to exist a name and the ability to print the state.

**testing**
We compiled and ran tests on ONYX to check the output and the functionality of our code. We updated coding issues accordingly with the outputs and errors recieved when code was ran and prompted with either errors or the output was not as expected.

**Discussion**
This was a difficult yet easy assignment, we had issues due to busy personal lives which led to delays in being able to code. When we coded we both were able to make great strides and resolve issues in swift manners. Communication for the assignment also proved to be difficult as with covid in person communication is limited thus all communication is locked to email. We were able to iron out most of our issues and make the program function to the best of our ability and limited time.


