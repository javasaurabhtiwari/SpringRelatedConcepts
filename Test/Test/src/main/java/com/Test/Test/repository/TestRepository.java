package com.Test.Test.repository;

import com.Test.Test.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;

@Repository
public interface TestRepository extends JpaRepository<Test,Integer> {

     Test findByUserName(String username);
}
