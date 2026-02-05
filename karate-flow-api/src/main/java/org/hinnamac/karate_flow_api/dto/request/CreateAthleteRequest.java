package org.hinnamac.karate_flow_api.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class CreateAthleteRequest {

    @NotBlank(message = "Inserire il nome")
    @NotEmpty(message =  "Inserire il nome")
    @Size(min = 3, max = 20, message = "Il nome dev'essere compreso tra 3 e 20 caratteri")
    private String firstName;

    @NotBlank(message = "Inserire il nome")
    @NotEmpty(message =  "Inserire il nome")
    @Size(min = 3, max = 20, message = "Il nome dev'essere compreso tra 3 e 20 caratteri")
    private String lastName;

    @NotNull(message = "Specifica il nome del gruppo")
    private String groupName;

    @NotNull(message = "Specifica data di nascita")
    private LocalDateTime birthDate;

    @NotNull(message = "Inserisci età")
    @Size(min = 8, max = 40, message = "Inserisci età corretta")
    private Integer age;


}
