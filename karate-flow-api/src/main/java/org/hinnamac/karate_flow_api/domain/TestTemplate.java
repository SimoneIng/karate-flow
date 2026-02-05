package org.hinnamac.karate_flow_api.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "test_templates")
public class TestTemplate {

    @Id
    private String id;

    private String title;
    private String description;

    private List<ExerciseTemplate> exercises;

}

