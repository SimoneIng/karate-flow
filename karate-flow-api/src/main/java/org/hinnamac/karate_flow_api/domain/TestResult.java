package org.hinnamac.karate_flow_api.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor @AllArgsConstructor
public class TestResult {

    private String exerciseId;

    private String exerciseName;

    private String unitOfMeasure;

    private Boolean higherIsBetter;

    private Double value;

}
