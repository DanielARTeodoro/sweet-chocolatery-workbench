package br.edu.ifms.workbenchapp.exception.handler;

import br.edu.ifms.workbenchapp.exception.ExceptionDetails;
import br.edu.ifms.workbenchapp.exception.NotNumericException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@RestController
@ControllerAdvice // Captura as Exceções
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<ExceptionDetails> handleAllExceptions(Exception ex, WebRequest request) {
        var exceptionResponse = new ExceptionDetails(new Date(), ex.getMessage(), request.getDescription(false), HttpStatus.INTERNAL_SERVER_ERROR.toString());
        return new ResponseEntity<>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(NotNumericException.class)
    public final ResponseEntity<ExceptionDetails> handleBadRequestExceptions(Exception ex, WebRequest request) {
        var exceptionResponse = new ExceptionDetails(new Date(), ex.getMessage(), request.getDescription(false), HttpStatus.BAD_REQUEST.toString());
        return new ResponseEntity<>(exceptionResponse, HttpStatus.BAD_REQUEST);
    }
}
