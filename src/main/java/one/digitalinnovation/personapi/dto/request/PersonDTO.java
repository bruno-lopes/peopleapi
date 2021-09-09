package one.digitalinnovation.personapi.dto.request;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;

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
    
    @NotEmpty
    @Size(min = 2, max = 100)
    private String firstName;
    @Size(min = 2, max = 100)
    private String lastName;
    @NotEmpty
    @CPF
    private String cpf;

    private String birthDate;

    @NotEmpty
    @Valid // Valida cada elemento da lista
    private List<PhoneDTO> phones;
}
