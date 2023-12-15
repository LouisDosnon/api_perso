package com.example.persoapi.filter.impl;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import java.util.Date;
import java.util.Objects;

public class JwtTokenGenerator {

    public static String generate(String login, String password) {
        // Date d'expiration du token
        Date expirationDate = new Date(System.currentTimeMillis() + 3600000); // 1 heure à partir de maintenant

        if (Objects.equals(login, "louis3022") && Objects.equals(password, "29d55de952ef175aca7752b2e610a58b")) {

            // Créez le token JWT
            return Jwts.builder()
                    .setSubject(login) // Sujet (nom d'utilisateur)
                    .setExpiration(expirationDate)
                    .signWith(Keys.hmacShaKeyFor(JwtAuthenticationFilter.JWT_KEY.getBytes()), SignatureAlgorithm.HS256)
                    .compact();
        }
        return null;
    }
}
