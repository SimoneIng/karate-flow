package org.hinnamac.karate_flow_api.repository;

import org.hinnamac.karate_flow_api.domain.Athlete;
import org.hinnamac.karate_flow_api.dto.response.AthleteResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AthleteRepository extends MongoRepository<Athlete, String> {
    Page<AthleteResponse> getAthletesByGroupName(String groupName, Pageable pageable);
}
