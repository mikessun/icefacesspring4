package msun.demo.icefaces.controller;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.faces.bean.CustomScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.WebApplicationContextUtils;

import msun.demo.icefaces.bean.Index;

/**
 * Classe controller
 *
 */
@ManagedBean(name = "mainBean")
@CustomScoped(value = "#{window}")
public class MainBean {

	public final String msg = "main page";

	@Autowired
	Index index;

	public String printMensagem() {
		index.setMessage(msg);
		return index.getMessage();
	}

	public void menuAction(ActionEvent event) {

		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect("/icefaces/index.jsf");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@PostConstruct
	private void init() {
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		ServletContext servletContext = (ServletContext) externalContext.getContext();
		WebApplicationContextUtils.getRequiredWebApplicationContext(servletContext).getAutowireCapableBeanFactory()
				.autowireBean(this);
	}

}