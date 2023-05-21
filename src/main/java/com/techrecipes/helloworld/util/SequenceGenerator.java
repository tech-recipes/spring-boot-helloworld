package com.techrecipes.helloworld.util;

import java.util.concurrent.atomic.AtomicInteger;

public class SequenceGenerator {

    private final String prefix;
    private final AtomicInteger sequence = new AtomicInteger(0);

    public SequenceGenerator(String prefix){
        this.prefix = prefix;
    }

    public String nextSequence() {
        return prefix + " - " + sequence.incrementAndGet();
    }
}
