package com.can.util.validation.exception;

/**
 * @description: 参数校验错误异常
 *
 * @author: LCN
 * @date: 2018-07-03 16:02
 */
public class AssertException extends RuntimeException {


	public AssertException() {
	}

	public AssertException(String message) {
		super(message);
	}


	public AssertException(Throwable cause) {
		super(cause);
	}

	public AssertException(String message, Throwable cause) {
		super(message, cause);
	}


}
