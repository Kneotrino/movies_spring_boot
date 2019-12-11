package com.clay7.movies;

import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@Data
public class MoviesApplication {

  public static void main(String[] args) {
    SpringApplication.run(MoviesApplication.class, args);
  }

}
