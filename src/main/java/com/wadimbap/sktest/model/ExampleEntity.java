package com.wadimbap.sktest.model;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import jakarta.persistence.*;
import org.hibernate.annotations.Type;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Entity
@Table(name = "sk_example_table")
@Getter
@Setter
public class ExampleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Type(JsonBinaryType.class)
    @Column(columnDefinition = "jsonb", nullable = false)
    private Map<String, Object> obj;
}
