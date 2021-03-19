package com.switchfully.intellijshortcuts.repository;

import com.switchfully.intellijshortcuts.domain.IntelliJShortCut;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class IntelliJShortcutDatabase {
    Map<String, IntelliJShortCut> shortcuts = new HashMap<>();

    public List<IntelliJShortCut> getAllShortCuts() {
        return new ArrayList<>(shortcuts.values());
    }

    public IntelliJShortCut getShortcut(String id) {
        return shortcuts.get(id);
    }

    public void addShortcut(IntelliJShortCut newShortcut) {
        shortcuts.put(newShortcut.getDescription(), newShortcut);
    }
}
