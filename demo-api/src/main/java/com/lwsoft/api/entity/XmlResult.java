package com.lwsoft.api.entity;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class XmlResult<T> implements Serializable{

	private static final long serialVersionUID = -6621262285143154931L;
	
	private Head head;
	
	private Object object;

	public Head getHead() {
		return head;
	}

	public void setHead(Head head) {
		this.head = head;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

}
