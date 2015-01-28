package com.mojang.authlib;

import com.mojang.authlib.ProfileLookupCallback;
import com.mojang.authlib.Agent;

public interface GameProfileRepository
{
    void findProfilesByNames(String[] p0, Agent p1, ProfileLookupCallback p2);
}
