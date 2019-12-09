package com.clay7.movies.handler;

import com.clay7.movies.constant.EntityResponseStatus;
import com.clay7.movies.exception.DuplicateEntryException;
import com.clay7.movies.exception.PasswordNotValidException;
import com.clay7.movies.exception.ResourceNotFoundException;
import com.clay7.movies.exception.SqlException;
import com.clay7.movies.response.EntityResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * @author: steventjoa
 * @date: 2019/10/10
 * @modifiedby:
 */

@SuppressWarnings({"unchecked", "rawtypes"})
@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

  @ExceptionHandler(ResourceNotFoundException.class)
  public ResponseEntity<EntityResponse> resourceNotFoundHandlerException(Exception ex, WebRequest request) {
    EntityResponse entityResponse = new EntityResponse(EntityResponseStatus.RESOURCE_NOT_FOUND, ex.getMessage());
    return new ResponseEntity<>(entityResponse, HttpStatus.NOT_FOUND);
  }

  @ExceptionHandler(DuplicateEntryException.class)
  public ResponseEntity<EntityResponse> duplicateEntryHandlerException(Exception ex, WebRequest request) {
    EntityResponse entityResponse = new EntityResponse(EntityResponseStatus.DUPLICATE_ENTRY, ex.getMessage());
    return new ResponseEntity<>(entityResponse, HttpStatus.NOT_FOUND);
  }

  @ExceptionHandler(SqlException.class)
  public ResponseEntity<EntityResponse> sqlHandlerException(Exception ex, WebRequest request) {
    EntityResponse entityResponse = new EntityResponse(EntityResponseStatus.DATABASE_SQL_EXCEPTION, ex.getMessage());
    return new ResponseEntity<>(entityResponse, HttpStatus.NOT_FOUND);
  }

  @ExceptionHandler(PasswordNotValidException.class)
  public ResponseEntity<EntityResponse> passwordNotValidHandlerException(Exception ex, WebRequest request) {
    EntityResponse entityResponse = new EntityResponse(EntityResponseStatus.PASSWORD_NOT_VALID, ex.getMessage());
    return new ResponseEntity<>(entityResponse, HttpStatus.NOT_FOUND);
  }

  @Override
  protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException exception, HttpHeaders headers, HttpStatus status, WebRequest request) {
    String bodyOfResponse = exception.getMessage();
    EntityResponse entityResponse = new EntityResponse(EntityResponseStatus.ILLEGALS_ARGUMENTS, bodyOfResponse);
    return new ResponseEntity<>(entityResponse, headers, status);
  }

}