package com.ctgu.contributionsystem.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.shiro.authc.AuthenticationToken;

/**
 * @Description TODO
 * @Author wh_lan
 * @create 2019-12-18 16:50
 * @ClassName JwtToken
 * @Version 1.0.0
 */
@Getter
@Setter
@ToString
public class JwtToken implements AuthenticationToken {

    private String loginType = "MyRealm";

    private String token;

    public JwtToken(String token) {
        this.token = token;
    }

    public JwtToken(String token, String loginType) {
        this.token = token;
        this.loginType = loginType;
    }

    public String getLoginType() {
        return loginType;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }

}
