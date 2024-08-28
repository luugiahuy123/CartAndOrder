package org.example.ontap2.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String userName;
    private String phone;
    private String email;
    private String password;
    @ManyToMany (fetch = FetchType.EAGER)
    private Set<Role> roles;
}
