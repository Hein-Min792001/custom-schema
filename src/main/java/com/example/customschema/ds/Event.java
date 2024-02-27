package com.example.customschema.ds;

import java.time.LocalDate;
import java.util.Date;

public record Event(
        Integer id,
        String name,
        LocalDate startDate,
        LocalDate endDate,
        String website
) {

}
