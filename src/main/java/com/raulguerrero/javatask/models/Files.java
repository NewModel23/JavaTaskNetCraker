package com.raulguerrero.javatask.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Files {

	@JsonProperty("archivo")
	private String archivo;

	public String getArchivo() {
		return archivo;
	}

	public void setArchivo(String archivo) {
		this.archivo = archivo;
	}

	@Override
	public String toString() {
		return "Files [archivo=" + archivo + "]";
	}

	public Files(String archivo) {
		super();
		this.archivo = archivo;
	}
	
	
	

		

}
