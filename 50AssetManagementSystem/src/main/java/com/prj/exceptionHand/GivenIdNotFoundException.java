package com.prj.exceptionHand;

public class GivenIdNotFoundException extends RuntimeException {

	public GivenIdNotFoundException(String msg) {
		super(msg);
	}
}
