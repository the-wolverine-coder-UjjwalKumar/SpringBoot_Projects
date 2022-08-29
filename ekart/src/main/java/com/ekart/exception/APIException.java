package com.ekart.exception;

import java.util.Map;

import org.springframework.http.HttpStatus;

public class APIException extends RuntimeException {
	private static final long serialVersionUID = 100L;

	private String message;
	private Map<String, String> mParam;
	private HttpStatus httpStatus;

	public APIException() {
		super();
	}

	public APIException(String message) {
		super(message);
	}

	public APIException(String message, HttpStatus httpStatus) {
		this(message);
		this.message = message;
		this.httpStatus = httpStatus;
	}

	public APIException(String message, Map<String, String> mParam, HttpStatus httpStatus) {
		this(message);
		this.message = message;
		this.httpStatus = httpStatus;
		this.mParam = mParam;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Map<String, String> getmParam() {
		return mParam;
	}

	public void setmParam(Map<String, String> mParam) {
		this.mParam = mParam;
	}
}
