package com.practice.PropertEditor;

import java.beans.PropertyEditorSupport;


//this is we created property Editor class need to extend the PropertyEditorSupport and 
//in setAsText Method need to write logic that's it ....
public class NamedEditor extends PropertyEditorSupport {
@Override
public void setAsText(String text) throws IllegalArgumentException {
	String covertedtoupper =text.toUpperCase();
	
//	this will set value for our object...
	setValue(covertedtoupper);
}
}
