package io.github.qyvlik.rabbitmqdynamic.handle;

import java.io.Serializable;

public class MyMessage implements Serializable {
    private String name;

    public MyMessage() {

    }

    public MyMessage(String name) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
