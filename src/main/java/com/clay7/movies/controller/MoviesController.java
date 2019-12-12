package com.clay7.movies.controller;

import com.clay7.movies.constant.EntityResponseStatus;
import com.clay7.movies.exception.ResourceNotFoundException;
import com.clay7.movies.model.MoviesModel;
import com.clay7.movies.repository.MoviesRepository;
import com.clay7.movies.response.EntityResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.SortDefault;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author Kneotrino
 * @date 11/12/19
 */

@RestController
@RequestMapping("api/movie")
public class MoviesController {

  @Autowired
  private MoviesRepository moviesRepository;

  @GetMapping("/page")
  public EntityResponse<Page<MoviesModel>> getMovieByPage(@SortDefault.SortDefaults({
      @SortDefault(sort = "id", direction = Sort.Direction.DESC)}) Pageable pageable) {
    return new EntityResponse<>(EntityResponseStatus.RESPONSE_SUCCESS, moviesRepository.findAll(pageable));
  }

  @GetMapping("/list")
  public EntityResponse<java.util.List<MoviesModel>> getMovieAll() {
    return new EntityResponse<>(EntityResponseStatus.RESPONSE_SUCCESS, moviesRepository.findAll());
  }

  @GetMapping("/{id}")
  public EntityResponse<MoviesModel> getMovieById(@PathVariable Integer id) {
    return new EntityResponse(EntityResponseStatus.RESPONSE_SUCCESS, moviesRepository.findById(id));
  }

  @DeleteMapping("/{id}")
  public EntityResponse<String> deleteMovieById(@PathVariable Integer id) throws ResourceNotFoundException {
    return moviesRepository.findById(id)
        .map(question -> {
          moviesRepository.delete(question);
          return new EntityResponse(EntityResponseStatus.RESPONSE_SUCCESS, "Deleted Movies Model with id succesfully");
        }).orElseThrow(() -> new ResourceNotFoundException("Question not found with id " + id));
  }

  @PutMapping("/{id}")
  public EntityResponse<MoviesModel> updateMovieById(@PathVariable Integer id,
                                                     @Valid @RequestBody MoviesModel moviesModel) throws ResourceNotFoundException {
    MoviesModel updated = moviesRepository.findById(id)
        .map(model -> moviesRepository.save(moviesModel.toBuilder().id(id).build())).orElseThrow(() -> new ResourceNotFoundException("MoviesModel not found with id " + id));
    return new EntityResponse<>(EntityResponseStatus.RESPONSE_SUCCESS, moviesRepository.findById(id).get());
  }

  @PostMapping("/create")
  public EntityResponse<MoviesModel> createMovie(@Valid @RequestBody MoviesModel moviesModel) {
    return new EntityResponse(EntityResponseStatus.RESPONSE_SUCCESS, moviesRepository.save(moviesModel));
  }
}
