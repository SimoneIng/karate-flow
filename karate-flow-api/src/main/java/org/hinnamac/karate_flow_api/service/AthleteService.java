package org.hinnamac.karate_flow_api.service;

import org.hinnamac.karate_flow_api.domain.Athlete;
import org.hinnamac.karate_flow_api.dto.response.AthleteResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface AthleteService {
    Page<AthleteResponse> getAthletes(Pageable pageable);
    AthleteResponse getAthleteById(String id);
    AthleteResponse createAthlete(Athlete athlete);
    AthleteResponse updateAthlete(Athlete athlete);
    void deleteAthleteById(String id);
}
