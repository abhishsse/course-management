package com.in.att.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.in.att.security.entity.SecurityUserEntity;

@Repository
public interface SecurityUserRepositoryI  extends JpaRepository<SecurityUserEntity, Long>{

}
