package org.example.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Worker {

    private Shop shop;

    private String name;

    private String secondName;

    private int age;
}
