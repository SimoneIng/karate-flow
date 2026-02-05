package org.hinnamac.karate_flow_api.service.implementation;

import org.hinnamac.karate_flow_api.domain.Group;
import org.hinnamac.karate_flow_api.dto.request.CreateGroupRequest;
import org.hinnamac.karate_flow_api.dto.response.GroupResponse;
import org.hinnamac.karate_flow_api.service.GroupService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupServiceImpl implements GroupService {

    @Override
    public List<Group> getGroups() {
        return List.of();
    }

    @Override
    public GroupResponse getGroupByName(String groupName) {
        return null;
    }

    @Override
    public GroupResponse updateGroup(Group group) {
        return null;
    }

    @Override
    public GroupResponse createGroup(CreateGroupRequest group) {
        return null;
    }

    @Override
    public void deleteGroup(String groupName) {

    }
}
