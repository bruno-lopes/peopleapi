package one.digitalinnovation.personapi.utils;

import java.time.LocalDate;
import java.util.Collections;

import one.digitalinnovation.personapi.dto.request.PersonDTO;
import one.digitalinnovation.personapi.entity.Person;

public class PersonUtils {
    private static final String FIRST_NAME = "Bruno";
    private static final String LAST_NAME = "Lopes";
    private static final String CPF_NUMBER = "149.338.028-15";
    private static final LocalDate BIRTH_DATE = LocalDate.of(1994, 04, 04);

    public static PersonDTO createFakeDTO() {
        return PersonDTO.builder()
            .firstName(FIRST_NAME)
            .lastName(LAST_NAME)
            .cpf(CPF_NUMBER)
            .birthDate("04-04-1994")
            .phones(Collections.singletonList(PhoneUtils.createFakeDTO()))
            .build();
    }

    public static Person createFakeEntity() {
        return Person.builder()
            .id(1l)
            .firstName(FIRST_NAME)
            .lastName(LAST_NAME)
            .cpf(CPF_NUMBER)
            .birthDate(BIRTH_DATE)
            .phones(Collections.singletonList(PhoneUtils.createFakeEntity()))
            .build();
    }
}
