package com.SpringAssignment.SpringFramework.CDI;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Named
public class CDIBussiness {
	
	@Inject
	CDIData cdidata;

	public CDIData getCdidata() {
		return cdidata;
	}

	public void setCdidata(CDIData cdidata) {
		this.cdidata = cdidata;
	}
	
	
	
	
}
