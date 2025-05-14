package com.ibm.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	public SpellChecker spellChecker;
	public TextEditor() {
		
	}
	
	public TextEditor(SpellChecker spellChecker){
		System.out.println("Inside Text Editor constructor");
		this.spellChecker = spellChecker;
	}
	@Autowired
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	public void spellCheck() {
		spellChecker.checkSpelling();
	}
	
	
	
	
}
