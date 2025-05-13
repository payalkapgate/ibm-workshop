package com.ibm.spring;

public class TextEditor {
	public SpellChecker spellChecker;
	public TextEditor() {
		
	}
	public TextEditor(SpellChecker spellChecker){
		System.out.println("Inside Text Editor constructor");
		this.spellChecker = spellChecker;
	}
	
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	public void spellCheck() {
		spellChecker.checkSpelling();
	}
	
	
	
	
}
