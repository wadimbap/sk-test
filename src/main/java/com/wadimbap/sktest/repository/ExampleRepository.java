package com.wadimbap.sktest.repository;

import com.wadimbap.sktest.model.ExampleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExampleRepository extends JpaRepository<ExampleEntity, Long> {
}
