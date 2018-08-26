package com.lwsoft.api.entity;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Head implements Serializable{

	
	private static final long serialVersionUID = -3252135485613342631L;
	
	private String consumer;
	
	private String host;

	public String getConsumer() {
		return consumer;
	}

	public void setConsumer(String consumer) {
		this.consumer = consumer;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}
	

	
	

}
