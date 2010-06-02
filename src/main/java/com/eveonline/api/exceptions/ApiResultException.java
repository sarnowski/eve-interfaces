/**
 * (c) 2010 Tobias Sarnowski
 * All rights reserved.
 */
package com.eveonline.api.exceptions;

/**
 * @author Tobias Sarnowski
 */
public class ApiResultException extends ApiException {
	private int errorCode;
	private String errorMessage;

	public ApiResultException(int errorCode, String errorMessage) {
		super(errorCode + ": " + errorMessage);
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
}
