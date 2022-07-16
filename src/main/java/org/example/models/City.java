package org.example.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class City {

    private String cityName;

    private String country;

    private int populationNumber;

}
