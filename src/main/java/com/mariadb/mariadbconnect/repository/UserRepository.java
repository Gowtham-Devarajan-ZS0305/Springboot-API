package com.mariadb.mariadbconnect.repository;


import com.mariadb.mariadbconnect.entity.Test;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Test, Integer> {


  public   Optional<Test> findByname(String add);

  Optional<Test> findByaddress(String adds);

  ;
}
