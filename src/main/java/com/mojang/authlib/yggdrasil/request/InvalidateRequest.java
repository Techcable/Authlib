package com.mojang.authlib.yggdrasil.request;

import com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication;

public class InvalidateRequest
{
    private String accessToken;
    private String clientToken;
    
    public InvalidateRequest(final YggdrasilUserAuthentication authenticationService) {
        super();
        this.accessToken = authenticationService.getAuthenticatedToken();
        this.clientToken = authenticationService.getAuthenticationService().getClientToken();
    }
}
