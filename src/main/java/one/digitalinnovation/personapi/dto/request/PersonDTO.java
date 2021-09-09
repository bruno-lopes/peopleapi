package one.digitalinnovation.personapi.dto.request;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PersonDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String cpf;
    private String birthDate;
    private List<PhoneDTO> phones;
}
