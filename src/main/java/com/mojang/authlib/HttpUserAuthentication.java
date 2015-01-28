package com.mojang.authlib;

import com.mojang.authlib.AuthenticationService;
import com.mojang.authlib.HttpAuthenticationService;
import com.mojang.authlib.BaseUserAuthentication;

public abstract class HttpUserAuthentication extends BaseUserAuthentication
{
    protected HttpUserAuthentication(final HttpAuthenticationService authenticationService) {
        super(authenticationService);
    }
    
    @Override
    public HttpAuthenticationService getAuthenticationService() {
        return (HttpAuthenticationService)super.getAuthenticationService();
    }
}
