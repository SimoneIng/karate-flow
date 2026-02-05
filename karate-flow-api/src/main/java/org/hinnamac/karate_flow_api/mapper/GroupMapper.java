package org.hinnamac.karate_flow_api.mapper;

import org.hinnamac.karate_flow_api.domain.Group;
import org.hinnamac.karate_flow_api.dto.request.CreateGroupRequest;
import org.hinnamac.karate_flow_api.dto.response.GroupResponse;

public class GroupMapper {

    Group toEntity(CreateGroupRequest createGroup) {
        Group group = new Group();

        return group;
    }

    GroupResponse toDto(Group group) {
        GroupResponse groupResponse = new GroupResponse();

        return groupResponse;
    }

}
