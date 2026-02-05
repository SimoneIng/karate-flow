package org.hinnamac.karate_flow_api.repository;

import org.hinnamac.karate_flow_api.domain.Group;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends MongoRepository<Group, String> {
}
