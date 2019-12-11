package com.clay7.movies.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author Kneotrino
 * @date 11/12/19
 */
@Entity
@Table(name = "movie_details")
@Data
public class MoviesModel extends AuditBaseModel {

  private static final long serialVersionUID = 564290241;

  @Id
  @GeneratedValue(generator = "movie_generator")
  @SequenceGenerator(
      name = "movie_generator",
      sequenceName = "movie_sequence",
      initialValue = 10_000)
  private Integer id;


  @NotBlank
  private String company;

  @NotBlank
  private String country;

  @NotBlank
  private String director;

  @NotBlank
  private String genre;

  @NotBlank
  private String name;

  @NotBlank
  private String rating;

  @NotBlank
  private String star;

  @NotBlank
  private String writer;

  @Min(-1)
  private Short runtime;

  @Digits(integer = 8, fraction = 2)
  @Min(-1)
  private Float score;

  @Min(1900)
  @Max(2100)
  private Short year;

  @Min(-1)
  private Integer votes;

  @Digits(integer = 20, fraction = 2)
  private BigDecimal gross;

  @Digits(integer = 20, fraction = 2)
  private BigDecimal budget;

  private LocalDate released;


}
