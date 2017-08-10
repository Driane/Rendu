package org.formation.jsf.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;



@ManagedBean(name ="articleBean")
@SessionScoped
public class ArticleBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String contenu; 
	private String name; 
	
	public ArticleBean() {
		
		this.reset();
	}
	
	public void reset() {
		this.name ="Nouvel article";
		this.contenu = " ";
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
