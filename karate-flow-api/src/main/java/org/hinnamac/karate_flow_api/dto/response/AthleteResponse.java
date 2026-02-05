package org.hinnamac.karate_flow_api.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class AthleteResponse {

    private String firstName;
    private String lastName;

    @JsonFormat(pattern = "yyyy/mm/dd")
    private LocalDateTime birthDate;

    private Integer age;

    private String groupName;

}
