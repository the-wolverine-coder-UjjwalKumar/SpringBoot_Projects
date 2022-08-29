package com.ekart.dto;

public class ErrorDTO {

	private String message;
	private Integer status;

	public ErrorDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ErrorDTO(String message, Integer status) {
		super();
		this.message = message;
		this.status = status;
	}

	public ErrorDTO(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
