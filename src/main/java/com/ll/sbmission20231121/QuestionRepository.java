package com.ll.sbmission20231121;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


// @Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {
}