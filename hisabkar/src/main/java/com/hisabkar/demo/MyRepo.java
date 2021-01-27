package com.hisabkar.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyRepo extends JpaRepository<MyTable, Integer> {

}
