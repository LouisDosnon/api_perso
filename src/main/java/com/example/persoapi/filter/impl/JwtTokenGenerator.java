package com.example.persoapi.filter.impl;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import java.util.Date;

public class JwtTokenGenerator {

    public static void main(String[] args) {
        // Date d'expiration du token
        Date expirationDate = new Date(System.currentTimeMillis() + 3600000); // 1 heure à partir de maintenant

        // Créez le token JWT
        String token = Jwts.builder()
                .setSubject("utilisateur123") // Sujet (nom d'utilisateur)
                .setExpiration(expirationDate)
                .signWith(Keys.hmacShaKeyFor(JwtAuthenticationFilter.JWT_KEY.getBytes()), SignatureAlgorithm.HS256)
                .compact();

        System.out.println("Token JWT généré : " + token);
    }
}
