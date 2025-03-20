package org.example.mediator.demo;

import java.util.Timer;
import java.util.TimerTask;

public class MediatorDemo {
    private final Timer timer;

    public MediatorDemo(int seconds) {
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds * 1000);
        timer.schedule(new RemindTaskWithoutBeep(), seconds * 2 * 1000);
    }

    class RemindTask extends TimerTask {
        public void run() {
            System.out.println("Time's up!");
        }
    }

    class RemindTaskWithoutBeep extends TimerTask {
        public void run() {
            System.out.println("Now Time's really up!");
            timer.cancel();
        }
    }

    public static void main(String[] args) {
        System.out.println("About to schedule task.");
        new MediatorDemo(3);
        //avem 2 programari si una nu stie de cealalta
        //nu avem referinte ca unul sa-l apeleze pe celalalt
        System.out.println("Task scheduled.");
    }
}
