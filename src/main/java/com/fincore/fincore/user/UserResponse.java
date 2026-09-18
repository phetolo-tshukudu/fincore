package com.fincore.fincore.user;
import java.time.Instant;
public record UserResponse(Long id,String firstName,String lastName,String email,Role role,Instant createdAt){ public static UserResponse from(User u){return new UserResponse(u.getId(),u.getFirstName(),u.getLastName(),u.getEmail(),u.getRole(),u.getCreatedAt());}}
