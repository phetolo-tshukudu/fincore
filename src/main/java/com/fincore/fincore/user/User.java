package com.fincore.fincore.user;
import java.time.Instant;
import jakarta.persistence.*;
@Entity @Table(name="users")
public class User {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @Column(name="first_name",nullable=false,length=100) private String firstName;
 @Column(name="last_name",nullable=false,length=100) private String lastName;
 @Column(nullable=false,unique=true,length=255) private String email;
 @Column(nullable=false,length=255) private String password;
 @Enumerated(EnumType.STRING) @Column(nullable=false,length=30) private Role role=Role.USER;
 @Column(name="created_at",nullable=false,updatable=false) private Instant createdAt;
 @Column(name="updated_at",nullable=false) private Instant updatedAt;
 protected User(){}
 public User(String f,String l,String e,String p,Role r){firstName=f;lastName=l;email=e;password=p;role=r;}
 @PrePersist void create(){var n=Instant.now();createdAt=n;updatedAt=n;} @PreUpdate void update(){updatedAt=Instant.now();}
 public Long getId(){return id;} public String getFirstName(){return firstName;} public String getLastName(){return lastName;} public String getEmail(){return email;} public String getPassword(){return password;} public Role getRole(){return role;} public Instant getCreatedAt(){return createdAt;} public Instant getUpdatedAt(){return updatedAt;}
 public void setFirstName(String v){firstName=v;} public void setLastName(String v){lastName=v;} public void setEmail(String v){email=v;} public void setPassword(String v){password=v;} public void setRole(Role v){role=v;}
}
