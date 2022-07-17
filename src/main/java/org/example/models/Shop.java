package org.example.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Shop {

    private String shopName;

    private City city;

    private int squareSurface;

}
