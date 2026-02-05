package org.hinnamac.karate_flow_api.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "exercises")
public class Exercise {

    @Id
    private String id;

    private String name;
    private String description;

    private String category;

    private boolean isHigherBetter;
    private Unit unit;

}
