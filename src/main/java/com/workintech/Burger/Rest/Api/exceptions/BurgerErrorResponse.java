package com.workintech.Burger.Rest.Api.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BurgerErrorResponse {

    private int status;
    private String message;
    private long timestamp;
}
