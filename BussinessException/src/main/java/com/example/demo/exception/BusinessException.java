package com.example.demo.exception;

public class BusinessException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String code;
	private String message;
    public BusinessException(String code, BusinessExceptionReason usernamealreadyregister ) {
    	this.code=code;
    	message = usernamealreadyregister.getMessage();
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}    
}
