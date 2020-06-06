package com.codigorupestre.spacenative.model;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.model.menu.MenuModel;

@Named
@RequestScoped
public class ButtonView {
 
    private MenuModel model;
 
    @PostConstruct
    public void init() {
    	System.out.println("============== POST CONSTRUCT ===============");
    
    }
 
    public MenuModel getModel() {
        return model;
    }
 
    public String save() {
    	System.out.println("================asdasdasd");
        return null;
    }
 
    public void update() {
    	System.out.println("================asdasdasd");

        addMessage("Data updated");
    }
 
    public void delete() {
    	System.out.println("================asdasdasd");

        addMessage("Data deleted");
    }
 
    public void buttonAction() {
    	System.out.println("================asdasdasd");

        addMessage("Welcome to PrimeFaces!!");
    }
 
    public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
        FacesContext.getCurrentInstance().addMessage(null, message);
        
    	System.out.println("================asdasdasd");

    }
}