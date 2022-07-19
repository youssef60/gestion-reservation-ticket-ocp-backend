package com.mahdaoui.gestionticketaquaocp.exceptions;

public enum ErrorCodes {
    COLLABORATEUR_NOT_FOUND(1000),
    ENFANT_NOT_FOUND(1001),
    TICKET_NOT_FOUND(1002),
    TYPETICKET_NOT_FOUND(1003),
    CONJOINT_NOT_FOUND(1004),

    COLLABORATEUR_NOT_VALID(2000),
    ENFANT_NOT_VALID(2001),
    TICKET_NOT_VALID(2002),
    TYPETICKET_NOT_VALID(2003),
    CONJOINT_NOT_VALID(2004);

    private int code;
    ErrorCodes(int code){this.code = code;}
    public int getCode(){ return code; }
}
