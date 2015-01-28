package com.mojang.authlib;

import com.mojang.authlib.GameProfile;

public interface ProfileLookupCallback
{
    void onProfileLookupSucceeded(GameProfile p0);
    
    void onProfileLookupFailed(GameProfile p0, Exception p1);
}
