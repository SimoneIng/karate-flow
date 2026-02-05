package org.hinnamac.karate_flow_api.service.implementation;

import org.hinnamac.karate_flow_api.domain.Athlete;
import org.hinnamac.karate_flow_api.dto.response.AthleteResponse;
import org.hinnamac.karate_flow_api.service.AthleteService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class AthleteServiceImpl implements AthleteService {

    @Override
    public Page<AthleteResponse> getAthletes(Pageable pageable) {
        return null;
    }

    @Override
    public AthleteResponse getAthleteById(String id) {
        return null;
    }

    @Override
    public AthleteResponse createAthlete(Athlete athlete) {
        return null;
    }

    @Override
    public AthleteResponse updateAthlete(Athlete athlete) {
        return null;
    }

    @Override
    public void deleteAthleteById(String id) {

    }

}
