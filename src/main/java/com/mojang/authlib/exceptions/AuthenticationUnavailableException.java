package com.mojang.authlib.exceptions;

import com.mojang.authlib.exceptions.AuthenticationException;

public class AuthenticationUnavailableException extends AuthenticationException
{
    public AuthenticationUnavailableException() {
        super();
    }
    
    public AuthenticationUnavailableException(final String message) {
        super(message);
    }
    
    public AuthenticationUnavailableException(final String message, final Throwable cause) {
        super(message, cause);
    }
    
    public AuthenticationUnavailableException(final Throwable cause) {
        super(cause);
    }
}
