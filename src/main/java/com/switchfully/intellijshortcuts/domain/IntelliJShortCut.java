package com.switchfully.intellijshortcuts.domain;

public class IntelliJShortCut {
    private String description;
    private String shortcut;

    public IntelliJShortCut(String description, String shortcut) {
        this.description = description;
        this.shortcut = shortcut;
    }

    public String getDescription() {
        return description;
    }

    public String getShortcut() {
        return shortcut;
    }
}
