package com.jopool.chargingStation.www.base.pay.wxpay.response;

import java.io.Serializable;

/**
 * Created by gexin on 16/4/13.
 */
public class TokenResp implements Serializable {
    private static final long serialVersionUID = -2337937881709830076L;
    private String access_token;//获取到的凭证
    private String expires_in;//凭证有效时间，单位：秒

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(String expires_in) {
        this.expires_in = expires_in;
    }
}
