package com.fincore.fincore.user;
import org.springframework.security.core.annotation.AuthenticationPrincipal; import org.springframework.web.bind.annotation.*; import com.fincore.fincore.security.AuthenticatedUser;
@RestController @RequestMapping("/api/v1/users")
public class UserController { private final UserRepository repo; public UserController(UserRepository r){repo=r;} @GetMapping("/me") public UserResponse me(@AuthenticationPrincipal AuthenticatedUser p){return UserResponse.from(repo.findById(p.id()).orElseThrow());}}
