package org.hinnamac.karate_flow_api.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Document(collection = "tests")
public class Test {

    @Id
    private String id;

    private String name;

    private String athleteId;
    private AthleteInfo athleteInfo;

    private LocalDate createdAt;

    private List<TestResult> results;

}

