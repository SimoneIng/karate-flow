package org.hinnamac.karate_flow_api.service;

import org.hinnamac.karate_flow_api.domain.Group;
import org.hinnamac.karate_flow_api.dto.request.CreateGroupRequest;
import org.hinnamac.karate_flow_api.dto.response.GroupResponse;

import java.util.List;

public interface GroupService {
    List<Group> getGroups();
    GroupResponse getGroupByName(String groupName);
    GroupResponse updateGroup(Group group);
    GroupResponse createGroup(CreateGroupRequest group);
    void deleteGroup(String groupName);
}
