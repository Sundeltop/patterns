package com.example.singleton.level3;

public enum Singleton {

    INSTANCE;

    private String value;

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
