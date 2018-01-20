package com.jairosousa.cursomc.services.exceptios;

public class FileException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public FileException(String message, Throwable cause) {
		super(message, cause);

	}

	public FileException(String message) {
		super(message);

	}

}