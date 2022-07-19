package com.mahdaoui.gestionticketaquaocp.exceptions;

import java.util.List;

public class InvalidEntityException extends RuntimeException {

    private ErrorCodes errorCodes;
    private List<String> erros;

    public InvalidEntityException(String message) { super(message); }

    public InvalidEntityException(String message , Throwable cause){ super(message,cause); }

    public InvalidEntityException(String message , Throwable cause, ErrorCodes errorCodes){
        super(message,cause);
        this.errorCodes = errorCodes;
    }

    public InvalidEntityException(String message , Throwable cause, ErrorCodes errorCodes , List<String> erros){
        super(message,cause );
        this.errorCodes = errorCodes;
        this.erros = erros;
    }

    public InvalidEntityException(String message , ErrorCodes errorCodes){
        super(message);
        this.errorCodes = errorCodes;
    }

    public InvalidEntityException(String message , ErrorCodes errorCodes,List<String> erros){
        super(message);
        this.errorCodes = errorCodes;
        this.erros = erros;
    }



    public ErrorCodes getErrorCodes(){ return errorCodes; }

    public List<String> getErros(){ return erros; }
}
