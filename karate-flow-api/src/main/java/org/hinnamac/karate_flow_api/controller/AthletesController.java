package org.hinnamac.karate_flow_api.controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.hinnamac.karate_flow_api.dto.request.CreateAthleteRequest;
import org.hinnamac.karate_flow_api.dto.response.AthleteResponse;
import org.hinnamac.karate_flow_api.service.AthleteService;
import org.hinnamac.karate_flow_api.util.PageResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/athletes")
@AllArgsConstructor
public class AthletesController {

    private final AthleteService athleteService;

    @GetMapping
    public ResponseEntity<PageResponse<AthleteResponse>> getAthletes(
    ) {

       return ResponseEntity.ok().body(null);
    }

    @PostMapping
    public ResponseEntity<AthleteResponse> createAthlete(
            @Valid @RequestBody CreateAthleteRequest athlete
    ) {
        return ResponseEntity.ok().body(null);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<AthleteResponse> deleteAthlete(
            @PathVariable String id
    ) {
        return ResponseEntity.ok().body(null);
    }

}