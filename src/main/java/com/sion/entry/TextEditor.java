package com.sion.entry;

import org.springframework.beans.factory.annotation.Autowired;
public class TextEditor {
    private SpellChecker spellChecker;

    public TextEditor(SpellChecker spellChecker){
        System.out.println("Inside TextEditor constructor");
        this.spellChecker = spellChecker;
    }
/*    public void setSpellChecker( SpellChecker spellChecker ){
        this.spellChecker = spellChecker;
    }*/

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
