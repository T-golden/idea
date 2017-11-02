package com.example.demo.model;

import java.io.Serializable;

public class JsonResult implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -7215336791496380967L;

	private Integer status;

    private String msg;

    private Object data;

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data==null?"":data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}