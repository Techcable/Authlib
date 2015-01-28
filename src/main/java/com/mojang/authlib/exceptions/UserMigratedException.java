package com.mojang.authlib.exceptions;

import com.mojang.authlib.exceptions.InvalidCredentialsException;

public class UserMigratedException extends InvalidCredentialsException
{
    public UserMigratedException() {
        super();
    }
    
    public UserMigratedException(final String message) {
        super(message);
    }
    
    public UserMigratedException(final String message, final Throwable cause) {
        super(message, cause);
    }
    
    public UserMigratedException(final Throwable cause) {
        super(cause);
    }
}
