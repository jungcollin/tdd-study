package com.tdd.study.tdd_1;

public class Dollar {

    public int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public boolean equals (Object object) {
        Dollar dollar = (Dollar) object;
        return this.amount == dollar.amount;
    }

    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}
