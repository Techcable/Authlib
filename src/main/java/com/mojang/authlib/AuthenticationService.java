package com.mojang.authlib;

import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.UserAuthentication;
import com.mojang.authlib.Agent;

public interface AuthenticationService
{
    UserAuthentication createUserAuthentication(Agent p0);
    
    MinecraftSessionService createMinecraftSessionService();
    
    GameProfileRepository createProfileRepository();
}
