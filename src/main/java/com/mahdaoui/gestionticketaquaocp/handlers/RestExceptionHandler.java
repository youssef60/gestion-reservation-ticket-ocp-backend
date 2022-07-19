package com.mahdaoui.gestionticketaquaocp.handlers;

import com.mahdaoui.gestionticketaquaocp.exceptions.EntityNotFoundException;
import com.mahdaoui.gestionticketaquaocp.exceptions.InvalidEntityException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;


@RestControllerAdvice
@Slf4j
public class RestExceptionHandler {

        @ExceptionHandler(EntityNotFoundException.class)
        public ResponseEntity<ErrorDto> handleException(EntityNotFoundException exception, WebRequest webRequest){
                final HttpStatus notFound = HttpStatus.NOT_FOUND;
                final ErrorDto errorDto = ErrorDto.builder()
                        .httpCode(notFound.value())
                        .errorCodes( exception.getErrorCodes() )
                        .message(exception.getMessage())
                        .build();
                return new ResponseEntity<>(errorDto,notFound);
        }

        @ExceptionHandler(InvalidEntityException.class)
        public ResponseEntity<ErrorDto> handleException(InvalidEntityException exception,WebRequest webRequest){
                final HttpStatus badRequest = HttpStatus.BAD_REQUEST;
                final ErrorDto errorDto = ErrorDto.builder()
                        .errorCodes(exception.getErrorCodes())
                        .errors(exception.getErros())
                        .httpCode(badRequest.value())
                        .build();

                return new  ResponseEntity<>(errorDto,badRequest);
        }
}
