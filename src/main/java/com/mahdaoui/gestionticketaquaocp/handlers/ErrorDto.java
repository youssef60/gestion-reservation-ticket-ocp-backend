package com.mahdaoui.gestionticketaquaocp.handlers;

import com.mahdaoui.gestionticketaquaocp.exceptions.ErrorCodes;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ErrorDto {

    private Integer httpCode;

    private ErrorCodes errorCodes;

    private String message;

    private List<String> errors = new ArrayList<>();
}
