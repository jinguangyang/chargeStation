package com.jopool.chargingStation.www.base.pay.wxpay.protocol.unifiedorder_protocol;

import com.jopool.chargingStation.www.base.pay.wxpay.protocol.BaseResData;

/**
 * User: rizenguo
 * Date: 2014/10/25
 * Time: 13:54
 */
public class UnifiedorderResData extends BaseResData {

    //协议返回的具体数据（以下字段在return_code 为SUCCESS 的时候有返回）
    private String appid        = "";
    private String mch_id       = "";
    private String device_info  = "";
    private String nonce_str    = "";
    private String sign         = "";
    private String result_code  = "";
    private String err_code     = "";
    private String err_code_des = "";

    //以下字段在return_code 和result_code 都为SUCCESS 的时候有返回
    private String trade_type = "";
    private String prepay_id  = "";
    private String code_url   = "";

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getMch_id() {
        return mch_id;
    }

    public void setMch_id(String mch_id) {
        this.mch_id = mch_id;
    }

    public String getDevice_info() {
        return device_info;
    }

    public void setDevice_info(String device_info) {
        this.device_info = device_info;
    }

    public String getNonce_str() {
        return nonce_str;
    }

    public void setNonce_str(String nonce_str) {
        this.nonce_str = nonce_str;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getResult_code() {
        return result_code;
    }

    public void setResult_code(String result_code) {
        this.result_code = result_code;
    }

    public String getErr_code() {
        return err_code;
    }

    public void setErr_code(String err_code) {
        this.err_code = err_code;
    }

    public String getErr_code_des() {
        return err_code_des;
    }

    public void setErr_code_des(String err_code_des) {
        this.err_code_des = err_code_des;
    }

    public String getTrade_type() {
        return trade_type;
    }

    public void setTrade_type(String trade_type) {
        this.trade_type = trade_type;
    }

    public String getPrepay_id() {
        return prepay_id;
    }

    public void setPrepay_id(String prepay_id) {
        this.prepay_id = prepay_id;
    }

    public String getCode_url() {
        return code_url;
    }

    public void setCode_url(String code_url) {
        this.code_url = code_url;
    }
}
