package com.ikm.assessment.contract;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CitizenDTO {
    private int id;
    private String name;
    private String address;
    private String phone;
    private Date dateOfBirth;
}
