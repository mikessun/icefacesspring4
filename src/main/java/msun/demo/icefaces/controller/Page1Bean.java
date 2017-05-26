package msun.demo.icefaces.controller;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import msun.demo.icefaces.bean.Index;
import msun.demo.icefaces.bean.IndexImpl;

/**
 * Classe controller 
 *
 */
@ManagedBean(name = "page1Bean")
@ViewScoped
public class Page1Bean {
	
	public final String msg = "Page 1";
	
	public String printMensagem() {
		Index index = new IndexImpl();
		index.setMessage(msg);
		return index.getMessage();		
	}

	public void menuAction(ActionEvent event){
        
        try {
			FacesContext.getCurrentInstance().
			getExternalContext().redirect("/icefaces/page1.jsf");
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}