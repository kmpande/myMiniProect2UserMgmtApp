package com.UMA.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.UMA.entities.StateMasterEntity;

public interface StateRepository  extends JpaRepository<StateMasterEntity, Serializable>{

}
