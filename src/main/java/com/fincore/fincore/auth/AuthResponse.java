package com.fincore.fincore.auth; import com.fincore.fincore.user.UserResponse; public record AuthResponse(String token,String tokenType,UserResponse user){}
