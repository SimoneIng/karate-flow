package org.hinnamac.karate_flow_api.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor @AllArgsConstructor
public class AthleteInfo {
    private String firstName;
    private String lastName;
    private String groupName;
}
