package com.clay7.movies.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author: steventjoa
 * @date: 2019/10/09
 * @modifiedby:
 */

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
public class SqlException extends Exception {

  public SqlException(String message) {
    super(message);
  }

}
