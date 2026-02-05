package org.hinnamac.karate_flow_api.mapper;

import org.hinnamac.karate_flow_api.domain.Athlete;
import org.hinnamac.karate_flow_api.dto.request.CreateAthleteRequest;
import org.hinnamac.karate_flow_api.dto.response.AthleteResponse;
import org.springframework.stereotype.Component;

@Component
public class AthleteMapper {

    Athlete toEntity(CreateAthleteRequest createAthleteRequest) {
        return new Athlete();
    }

    AthleteResponse toDto(Athlete athlete) {
        return new AthleteResponse();
    }


}
