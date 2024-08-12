package com.wadimbap.sktest.service;

import com.wadimbap.sktest.model.ExampleEntity;
import com.wadimbap.sktest.repository.ExampleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class ExampleService {

    private final ExampleRepository exampleRepository;

    @Transactional
    public Integer modifyCurrent(Long id, Integer addValue) {
        ExampleEntity entity = exampleRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Entity not found"));

        Map<String, Object> obj = entity.getObj();
        Integer currentValue = (Integer) obj.get("current");

        currentValue += addValue;
        obj.put("current", currentValue);

        exampleRepository.save(entity);

        return currentValue;
    }
}









