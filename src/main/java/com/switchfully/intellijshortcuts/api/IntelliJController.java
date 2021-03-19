package com.switchfully.intellijshortcuts.api;

import com.switchfully.intellijshortcuts.domain.IntelliJShortCut;
import com.switchfully.intellijshortcuts.service.IntelliJShortcutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/intellij")
public class IntelliJController {

    private final IntelliJShortcutService service;

    @Autowired
    public IntelliJController(IntelliJShortcutService myShortcuts) {
        this.service = myShortcuts;
    }

    @GetMapping(produces = "application/json")
    public List<IntelliJShortCut> getIntelliJShortcuts() {
        return service.getAllShortCuts();
    }

    @GetMapping(path = "/{id}",produces = "application/json")
    public IntelliJShortCut getShortcut(@PathVariable("id") String id){
        return service.getShortCut(id);
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void createNewShortcut(@RequestBody IntelliJShortCut newShortcut) {
        service.addShortCut(newShortcut);
    }

    @PutMapping(path = "/{id}", consumes = "application/json", produces = "application/json")
    public void updateShortcut(@RequestBody IntelliJShortCut shortCutToUpdate, @PathVariable String id){
        throw new UnsupportedOperationException();
    }

}
