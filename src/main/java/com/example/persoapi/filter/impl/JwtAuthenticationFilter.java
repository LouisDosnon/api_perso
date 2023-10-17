package com.example.persoapi.filter.impl;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

public class JwtAuthenticationFilter extends OncePerRequestFilter {

    protected static final String JWT_KEY = "bca21f8abfee40bab254a86e7bdd0037abcde123456";
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
         try {   // Récupérez le JWT de l'en-tête (par exemple, "Authorization")
            String authorizationToken = request.getHeader("Authorization");

            // Vérifiez si le JWT est présent et valide
            if (authorizationToken != null && authorizationToken.startsWith("Bearer ")) {
                String jwtToken = authorizationToken.replace("Bearer " , "");
                Claims claims = Jwts.parser()
                        .setSigningKey(JWT_KEY.getBytes())
                        .parseClaimsJws(jwtToken)
                        .getBody();

                // Vérifier la date d'expiration (exp)
                Date expirationDate = claims.getExpiration();
                Date now = new Date(); // Obtenez la date actuelle

                if (expirationDate.before(now)) {
                    throw new MalformedJwtException("jwt experirée"); // Ou lancer une exception ou gérer l'erreur selon votre besoin
                }

                UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(
                        null, // nom d'utilisateur
                        null, // mot de passe (n'est pas utilisé ici)
                        null // autorités (peut être configuré en fonction du token)
                );
                SecurityContextHolder.getContext().setAuthentication(authentication);
            }
         } catch (MalformedJwtException e) {
             response.sendError(403, e.getMessage());
         }

        // Poursuivez la chaîne de filtres
        filterChain.doFilter(request, response);
    }
}
