package app.orbitahealth.sdk;

import android.util.Base64;
import android.util.JsonReader;
import android.util.JsonWriter;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.SigningKeyResolver;
import io.jsonwebtoken.impl.crypto.MacProvider;

import java.io.ByteArrayInputStream;
import java.net.URI;
import java.security.Key;
import java.util.Iterator;
import java.util.Map;



public class Token {

    Key key = MacProvider.generateKey();
    String s = Jwts.builder().setSubject("Joe").signWith(SignatureAlgorithm.HS512, key).compact();

String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJfaWQiOiI1NmUyYzU2MzRlMTljODM0NDk3Mjc1ZGYiLCJyb2xlcyI6W10sImZpcnN0TmFtZSI6IkdhbmthIiwibGFzdE5hbWUiOiJDIiwiYXZhdGFyU3JjIjoidXBsb2Fkcy81NmUyYzU2MzRlMTljODM0NDk3Mjc1ZGYvYXZhdGFyL2F2YXRhclNtYWxsLmpwZyIsImF0dHJpYnV0ZXMiOnt9LCJ0b2tlbiI6IjRiZmI4MDYxLWEyNDMtNGYxNy1iNzE5LTAxYzBhNjY2ODJiMSIsImlhdCI6MTQ2MDA5ODA5MywiZXhwIjoxNDYwMTE2MDkzfQ.8U8pvONr4L-imV8hzOdzUGpJMP25iaJ0TC1-wjN-awI";
    String[] jwtParts = token.split("\\.");










    /*URI iss = workaroundForGoogle(jwtPayload.getString("sub"));
    String username = UriBuilder.fromUri(iss).userInfo(jwtPayload.getString("sub")).build().toASCIIString();*/






   /* byte[] secret = Base64.decode();
    Map<String,Object> decodedPayload =
            new JWTVerifier(secret, "audience").verify("my-token");

    // Get custom fields from decoded Payload
    System.out.println(decodedPayload.get("name"));*/

}
