package com.clay7.movies.controller;

import com.clay7.movies.model.MoviesModel;
import com.clay7.movies.repository.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kneotrino
 * @date 11/12/19
 */

@RestController
@RequestMapping("/movie")
public class MoviesController {

  @Autowired
  private MoviesRepository moviesRepository;

  @GetMapping("/list")
  public Page<MoviesModel> getQuestions(Pageable pageable) {
    return moviesRepository.findAll(pageable);
  }


}
