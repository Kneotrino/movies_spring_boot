package com.clay7.movies.repository;

import com.clay7.movies.model.MoviesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Kneotrino
 * @date 11/12/19
 */
@Repository
public interface MoviesRepository extends JpaRepository<MoviesModel, Integer> {
}
