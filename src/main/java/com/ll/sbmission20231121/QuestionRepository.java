package com.ll.sbmission20231121;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// @Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {
}
