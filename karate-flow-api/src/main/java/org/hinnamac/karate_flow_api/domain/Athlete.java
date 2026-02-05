package org.hinnamac.karate_flow_api.domain;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDate;

@Document(collection = "athletes")
public class Athlete {

    @MongoId
    private String id;

    private String firstName;
    private String lastName;

    private String groupName;

    private LocalDate birthDate;
    private Integer age;

    private LocalDate lastTestDate;
    private String lastTestId;

}