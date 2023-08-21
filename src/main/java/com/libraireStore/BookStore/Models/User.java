package com.libraireStore.BookStore.Models;

import com.libraireStore.BookStore.Enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String  userName;
    private String password;
    private LocalDateTime creationDate;

    @Enumerated(EnumType.STRING)
    private Role role;

}
