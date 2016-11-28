package elr.calculatortest1.io;

/**
 * Created by Emmet on 27/11/2016.
 */

public abstract class NumberInputHandler {

    private UserInput userInput;

    public NumberInputHandler(UserInput userInput){
        super();
        this.userInput = userInput;
    }

    public void handleInput(){
        this.userInput.updateCurrentInput(getInputValue());
    }

    protected abstract double getInputValue();

}
