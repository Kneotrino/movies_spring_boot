package com.clay7.movies.model;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Kneotrino
 * @date 11/12/19
 */
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter
public abstract class AuditBaseModel implements Serializable {
  @Column(name = "time_created", nullable = false, updatable = false)
  @CreatedDate
  private LocalDateTime timeCreated;

  @Column(name = "time_updated", nullable = false)
  @LastModifiedDate
  private LocalDateTime timeUpdated;
}