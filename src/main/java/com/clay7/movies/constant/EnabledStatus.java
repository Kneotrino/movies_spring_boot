package com.clay7.movies.constant;

/**
 * @author Kneotrino
 * @date 17/10/19
 */
public enum EnabledStatus {
  ENABLED("E"),
  DISABLED("D");

  public final String CODE;

  EnabledStatus(String code) {
    this.CODE = code;
  }

  public String getCODE() {
    return CODE;
  }
}
