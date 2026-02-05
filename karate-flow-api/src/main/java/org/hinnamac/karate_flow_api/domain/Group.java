package org.hinnamac.karate_flow_api.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "groups")
public class Group {

    @Id
    private String id;

    private String name;

    private Integer athleteCount;

}
