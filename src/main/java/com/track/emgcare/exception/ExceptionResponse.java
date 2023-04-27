package com.track.emgcare.exception;

import lombok.Data;

@Data
public class ExceptionResponse {
	private String errorMessage;
	private String requestedURI;
}
