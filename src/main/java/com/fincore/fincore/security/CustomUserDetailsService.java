package com.fincore.fincore.security;
import org.springframework.security.core.userdetails.*; import org.springframework.stereotype.Service; import com.fincore.fincore.user.UserRepository;
@Service public class CustomUserDetailsService implements UserDetailsService { private final UserRepository repo; public CustomUserDetailsService(UserRepository r){repo=r;} public UserDetails loadUserByUsername(String email){return AuthenticatedUser.from(repo.findByEmailIgnoreCase(email).orElseThrow(()->new UsernameNotFoundException("User not found")));}}
