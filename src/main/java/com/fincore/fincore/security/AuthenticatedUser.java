package com.fincore.fincore.security;
import java.util.Collection; import java.util.List; import org.springframework.security.core.GrantedAuthority; import org.springframework.security.core.authority.SimpleGrantedAuthority; import org.springframework.security.core.userdetails.UserDetails; import com.fincore.fincore.user.User;
public record AuthenticatedUser(Long id,String email,String password,String role) implements UserDetails { public static AuthenticatedUser from(User u){return new AuthenticatedUser(u.getId(),u.getEmail(),u.getPassword(),u.getRole().name());} public Collection<? extends GrantedAuthority> getAuthorities(){return List.of(new SimpleGrantedAuthority("ROLE_"+role));} public String getUsername(){return email;} public boolean isAccountNonExpired(){return true;} public boolean isAccountNonLocked(){return true;} public boolean isCredentialsNonExpired(){return true;} public boolean isEnabled(){return true;}
@Override
public String getPassword() {
	// TODO Auto-generated method stub
	return password;
} }
