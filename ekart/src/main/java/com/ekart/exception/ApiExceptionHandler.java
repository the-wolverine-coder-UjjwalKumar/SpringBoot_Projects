package com.ekart.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ekart.dto.ErrorDTO;

/**
 * Application Global Exception Handler
 */
@ControllerAdvice
public class ApiExceptionHandler {

	/**
	 * Exception handler for any Exception or NullPointerException
	 */
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDTO> handleException(Exception e) {
		String errorMessage = e.getMessage();
		if (e instanceof NullPointerException) {
			errorMessage = errorMessage != null ? errorMessage : "INTERNAL_SERVER_ERROR";
		}
		return new ResponseEntity<ErrorDTO>(new ErrorDTO(errorMessage), HttpStatus.INTERNAL_SERVER_ERROR);
	}

	/**
	 * Exception handler for Data validation exception and Invalid HTTP Method means
	 * for BAD REQUEST
	 */
	@ExceptionHandler({ MethodArgumentNotValidException.class, BindException.class,
			HttpMessageNotReadableException.class, HttpRequestMethodNotSupportedException.class })
	public ResponseEntity<ErrorDTO> handleDataValidationException(Exception e) {
		String errorMessage = null;

		if (e instanceof BindException) {
			BindException be = (BindException) e;
			errorMessage = be.getBindingResult().getFieldError().getDefaultMessage();
		} else if (e instanceof MethodArgumentNotValidException) {
			MethodArgumentNotValidException me = (MethodArgumentNotValidException) e;
			errorMessage = me.getBindingResult().getFieldError().getDefaultMessage();
		} else if (e instanceof HttpMessageNotReadableException) {
			HttpMessageNotReadableException je = (HttpMessageNotReadableException) e;
			errorMessage = je.getMostSpecificCause().getMessage();
		} else if (e instanceof HttpRequestMethodNotSupportedException) {
			HttpRequestMethodNotSupportedException he = (HttpRequestMethodNotSupportedException) e;
			errorMessage = he.getMessage();
		}

		return new ResponseEntity<ErrorDTO>(new ErrorDTO(errorMessage), HttpStatus.BAD_REQUEST);
	}

	/**
	 * Exception handler for APIException
	 */
	@ExceptionHandler(APIException.class)
	public ResponseEntity<ErrorDTO> handleDataValidationException(APIException e) {
		return new ResponseEntity<ErrorDTO>(new ErrorDTO(e.getMessage()), e.getHttpStatus());
	}

}
