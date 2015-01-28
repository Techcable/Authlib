package com.mojang.authlib.exceptions;

import com.mojang.authlib.exceptions.AuthenticationException;

public class InvalidCredentialsException extends AuthenticationException
{
    public InvalidCredentialsException() {
        super();
    }
    
    public InvalidCredentialsException(final String message) {
        super(message);
    }
    
    public InvalidCredentialsException(final String message, final Throwable cause) {
        super(message, cause);
    }
    
    public InvalidCredentialsException(final Throwable cause) {
        super(cause);
    }
}
