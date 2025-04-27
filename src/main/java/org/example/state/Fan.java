package org.example.state;

public class Fan {
    static final int OFF = 0;
    static final int LOW = 1;
    static final int MED = 2;

    int state = OFF;

    public Fan() {}

    public void pullChain() {
        if (state == OFF) {
            System.out.println("Turning fan on to low.");
            state = LOW;
        } else if (state == LOW) {
            System.out.println("Turning fan on to medium.");
            state = MED;
        } else if (state == MED) {
            System.out.println("Turning fan off.");
            state = OFF;
        }
    }

    @Override
    public String toString() {
        if (state == OFF) {
            return "Fan is off";
        } else if (state == LOW) {
            return "Fan is low";
        } else if (state == MED) {
            return "Fan is medium";
        }
        return "Invalid state";
    }
}
