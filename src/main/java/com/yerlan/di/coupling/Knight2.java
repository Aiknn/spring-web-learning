package com.yerlan.di.coupling;

public class Knight2 {
    private Quest quest;

    public Knight2(Quest quest) {
        this.quest = quest;
    }

    public void doSmth(){
        quest.start();
    }
}

/*
    Knight2 gives the actions of Quest instance creation to the Constructor.
    So the main method will manage it, as long as Quest object implements Quest interface.
    Its Loose coupling.
    Easy to test and maintain.

    main method;
    Knight2 knight2 = new Knight2(new KillDragon());
    knight2.doSmth();
 */
