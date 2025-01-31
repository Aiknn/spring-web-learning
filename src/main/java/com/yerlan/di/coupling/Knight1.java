package com.yerlan.di.coupling;

public class Knight1 {
    private Quest quest;

    public Knight1() {
        this.quest = new KillDragon();
    }

    public void doSmth(){
        quest.start();
    }
}

/*
    Knight1 creates own instance of Quest, and make its Tightly coupling.
    Difficult to test, maintain.

    main method;
    Knight1 knight1 = new Knight1();
    knight1.doSmth();
 */
