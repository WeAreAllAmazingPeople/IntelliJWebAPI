package com.switchfully.intellijshortcuts.service;

import com.switchfully.intellijshortcuts.repository.IntelliJShortcutDatabase;
import com.switchfully.intellijshortcuts.domain.IntelliJShortCut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class IntelliJShortcutService {

    private final IntelliJShortcutDatabase database;

    @Autowired
    public IntelliJShortcutService(IntelliJShortcutDatabase database) {
        this.database = database;
    }

    public List<IntelliJShortCut> getAllShortCuts() {
        return database.getAllShortCuts();
    }

    public IntelliJShortCut getShortCut(String key) {
        return database.getShortcut(key);
    }

    public void addShortCut(IntelliJShortCut newShortcut) {
        database.addShortcut(newShortcut);
    }
}
