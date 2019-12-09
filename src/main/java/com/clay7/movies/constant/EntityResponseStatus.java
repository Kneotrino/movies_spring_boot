package com.clay7.movies.constant;

import lombok.Getter;

/**
 * @author: steventjoa
 * @date: 2019/10/10
 * @modifiedby:
 */

@Getter
@lombok.ToString
public enum EntityResponseStatus {
  // SUCCESS
  RESPONSE_SUCCESS(0, "SUCCESS"),

  // SPRING BOOT ERROR
  RESOURCE_NOT_FOUND(-101, "RESOURCE NOT FOUND"),
  ILLEGALS_ARGUMENTS(-102, "ARGUMENT NOT VALID"),
  DUPLICATE_ENTRY(-103, "DUPLICATE ENTRY"),
  PASSWORD_NOT_VALID(-104, "PASSWORD NOT VALID"),

  // OUTSIDE OF SPRING BOOT ERROR
  DATABASE_SQL_EXCEPTION(-305, "DATABASE EXCEPTION");

  private final int value;
  private final String reasonPhrase;

  EntityResponseStatus(int value, String reasonPhrase) {
    this.value = value;
    this.reasonPhrase = reasonPhrase;
  }

}
