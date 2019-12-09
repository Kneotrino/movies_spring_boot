package com.clay7.movies.controller;

import com.clay7.movies.constant.EntityResponseStatus;
import com.clay7.movies.response.EntityResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kneotrino
 * @date 09/12/19
 */
@RestController
public class BaseController {

  @GetMapping("/greeting")
  public EntityResponse greeting() {
    return new EntityResponse<>(EntityResponseStatus.RESPONSE_SUCCESS, "Hello, World!");
  }
}
