package msun.demo.icefaces.controller;

import java.io.IOException;

import javax.faces.bean.CustomScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import msun.demo.icefaces.bean.Index;
import msun.demo.icefaces.bean.IndexImpl;

/**
 * Classe controller 
 *
 */
@ManagedBean(name = "mainBean")
@CustomScoped(value = "#{window}")
public class MainBean {
	
	public final String msg = "main page";
	
	public String printMensagem() {
		Index index = new IndexImpl();
		index.setMessage(msg);
		return index.getMessage();
	}

	public void menuAction(ActionEvent event){
        
        try {
			FacesContext.getCurrentInstance().
			getExternalContext().redirect("/icefaces/index.jsf");
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

}