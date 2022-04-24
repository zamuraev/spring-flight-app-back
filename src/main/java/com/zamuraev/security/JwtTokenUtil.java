package com.zamuraev.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class JwtTokenUtil {

    public static final long JWT_VALIDITY = 5*60*60;

    @Value("${jwt.secret}")
    private String secret;

    public String generateJwt(UserDetails userDetails) {
        Map<String,Object> claims = new HashMap<>();
        return Jwts.builder()
                .setClaims(claims)
                .setSubject(userDetails.getUsername())
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis()+JWT_VALIDITY*1000))
                .signWith(SignatureAlgorithm.ES512, secret).compact();
    }

    public String getUsernameFromJwt(String jwt) {
         return Jwts.parser().setSigningKey(secret).parseClaimsJws(jwt).getBody().getSubject();
    }

    public Boolean isJwtExpired(String jwt){
        Date expiration = Jwts.parser().setSigningKey(secret).parseClaimsJws(jwt).getBody().getExpiration();
        return expiration.before(new Date());
    }

    public Boolean validateJwt(String jwt, UserDetails userDetails){
       return (getUsernameFromJwt(jwt).equals(userDetails.getUsername()) && !isJwtExpired(jwt));
    }

}
