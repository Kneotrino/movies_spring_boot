package com.clay7.movies.response;

import com.clay7.movies.constant.EntityResponseStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: steventjoa
 * @date: 2019/10/09
 * @modifiedby:
 */

@NoArgsConstructor
@Data
public class EntityResponse<T> {
  private int code;
  private String msg;
  private T body;

  public EntityResponse(int code, String msg, T body) {
    this.code = code;
    this.msg = msg;
    this.body = body;
  }

  public EntityResponse(EntityResponseStatus entityResponseStatus, T body) {
    this.code = entityResponseStatus.getValue();
    this.msg = entityResponseStatus.getReasonPhrase();
    this.body = body;
  }
}
