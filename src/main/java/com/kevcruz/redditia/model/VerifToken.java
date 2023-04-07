package com.kevcruz.redditia.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

import static jakarta.persistence.FetchType.LAZY;
import static jakarta.persistence.GenerationType.IDENTITY;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "token")
public class VerifToken {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    @Column(name = "token", nullable = false)
    private String token;

    @OneToOne(fetch = LAZY)
    private User user;

    @Column(name = "expiryDate", nullable = false)
    private Instant expiryDate;

}
