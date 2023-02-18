package practice.sara.msscbeer.web.controller;

import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class MVCExceptionHandler {

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<List> constraintExceptionHandler(ConstraintViolationException exception) {
        List<String> errors = new ArrayList<>();
        exception.getConstraintViolations().forEach(constraintViolation -> {
           errors.add(constraintViolation.getPropertyPath() + ": " + constraintViolation.getMessage());
        });
        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(BindException.class)
    public ResponseEntity<List>  handleBindException(BindException exception) {

        return new ResponseEntity<>(exception.getAllErrors(), HttpStatus.BAD_REQUEST);
    }
}
