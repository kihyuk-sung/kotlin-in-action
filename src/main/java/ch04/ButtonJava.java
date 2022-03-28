package ch04;

import org.jetbrains.annotations.NotNull;

public class ButtonJava implements View{

    @NotNull
    @Override
    public State getCurrentState() {
        return new ButtonState();
    }

    @Override
    public void restoreState(@NotNull State state) {

    }

    private class ButtonState implements State {
    }
}
