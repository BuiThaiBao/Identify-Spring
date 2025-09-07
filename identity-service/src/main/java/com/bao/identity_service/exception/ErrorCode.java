package com.bao.identity_service.exception;

public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(9999,"Uncategorized error"),
    INVALID_KEY(1001,"Invalid message key"),
    USER_EXISTED(1002 , "User existed"),
    USERNAME_INVALID(1003,"Username must be at least 3 character"),
    PASSWORD_INVALID(1004,"Password must be at least 8 character"),
    USER_NOT_EXISTS(1005,"User existed"),
    UNAUTHENTICATED(1006,"Unauthenticated")
    ;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
