package com.sample.sample;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.propertyeditors.CustomDateEditor;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyPropertyEditorRegister implements PropertyEditorRegistrar {
    @Override
    public void registerCustomEditors(PropertyEditorRegistry propertyEditorRegistry) {
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        CustomDateEditor editor = new CustomDateEditor(formatter, false);
        propertyEditorRegistry.registerCustomEditor(Date.class, editor);
    }
}
