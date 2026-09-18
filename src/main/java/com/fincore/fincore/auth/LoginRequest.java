package com.fincore.fincore.auth; import jakarta.validation.constraints.*; public record LoginRequest(@NotBlank @Email String email,@NotBlank String password){}
