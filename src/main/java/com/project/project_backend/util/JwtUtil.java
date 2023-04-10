package com.project.project_backend.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.util.Date;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Data
public class JwtUtil {
    private static final String CLAIM_KEY_USERNAME = "sub";
    private static final String CLAIM_KEY_CREATED = "created";

    private SecretKey secret = Keys.hmacShaKeyFor(Decoders.BASE64.decode("bahqD5Xl1BKuUVyxr7vNN2veVdSXImZwDnKW9zqWoan3II3VsUw0JmMQpbpyLusi"));
    @Value("${jwt.expiration}")
    private  Long expiration;



    public String generateToken(String username) {
        return Jwts.builder().signWith(secret)
                .setSubject(username).setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + expiration*1000))
                .compact();
    }

    public Claims parseTokenBody(String token){
        return Jwts.parserBuilder().setSigningKey(secret).build().parseClaimsJws(token).getBody();
    }

    public String getUserName(String token){
        return parseTokenBody(token).getSubject();
    }

    public boolean isExpiration(String token){
        return parseTokenBody(token).getExpiration().before(new Date());
    }
}
