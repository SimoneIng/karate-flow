package org.hinnamac.karate_flow_api.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateGroupRequest {

    @NotBlank(message = "Specifica il nome del gruppo")
    private String name;

}
