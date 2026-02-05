package org.hinnamac.karate_flow_api.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.hinnamac.karate_flow_api.domain.Group;
import org.hinnamac.karate_flow_api.dto.response.GroupResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/groups")
@RequiredArgsConstructor
public class GroupController {

    @PutMapping
    public ResponseEntity<List<GroupResponse>> getGroups() {
        return ResponseEntity.ok().body(List.of());
    }

    @PostMapping
    public ResponseEntity<GroupResponse> createGroup(@Valid @RequestBody Group group) {

        return ResponseEntity.ok().body(null);
    }

}
