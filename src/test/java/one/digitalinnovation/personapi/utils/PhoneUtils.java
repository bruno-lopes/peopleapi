package one.digitalinnovation.personapi.utils;

import one.digitalinnovation.personapi.dto.request.PhoneDTO;
import one.digitalinnovation.personapi.entity.Phone;
import one.digitalinnovation.personapi.enums.PhoneType;

public class PhoneUtils {

    private static final String PHONE_NUMBER = "12331241";

    public static PhoneDTO createFakeDTO() {
        return PhoneDTO.builder().number(PHONE_NUMBER).type(PhoneType.COMMERCIAL).build();
    }

    public static Phone createFakeEntity() {
        return Phone.builder().number(PHONE_NUMBER).type(PhoneType.COMMERCIAL).build();
    }
    
}
