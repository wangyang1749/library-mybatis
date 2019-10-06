package cn.yiban.open;

import cn.yiban.util.HTTPSimple;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import java.util.ArrayList;
import java.util.List;

public class AppUtil {

    private static final String YIBAN_OPEN_URL	= "https://openapi.yiban.cn/";

    /**
     * 获取access_token
     * @param code
     * @return
     */
    public static String getAccessToken(String code) {
        List<NameValuePair> param = new ArrayList<NameValuePair>();
        param.add(new BasicNameValuePair("client_id", AppApi.APPID));
        param.add(new BasicNameValuePair("client_secret", AppApi.APPSECERT));
        param.add(new BasicNameValuePair("code", code));
        param.add(new BasicNameValuePair("redirect_uri", AppApi.REDIRECT_URL));
        return HTTPSimple.POST(YIBAN_OPEN_URL+"oauth/access_token", param);
    }

    /**
     *  校验用户是否授权，如已授权状态expire_in值为0，
     *  则该授权凭证已过期，需要重新授权。
     */
    public static String queryAucthorize(String accessToken){
        List<NameValuePair> param = new ArrayList<NameValuePair>();
        param.add(new BasicNameValuePair("client_id", AppApi.APPID));
        param.add(new BasicNameValuePair("access_token", accessToken));
        return HTTPSimple.POST(YIBAN_OPEN_URL+"oauth/token_info", param);
    }
    /**
     * 开发者主动取消指定用户的授权。
     */
    public static String removeToken(String accessToken){
        List<NameValuePair> param = new ArrayList<NameValuePair>();
        param.add(new BasicNameValuePair("client_id", AppApi.APPID));
        param.add(new BasicNameValuePair("access_token", accessToken));
        return HTTPSimple.POST(YIBAN_OPEN_URL+"oauth/revoke_token", param);
    }

    /**
     * 得到授权的url
     * @param state
     * @return
     */
    public static String authorize(String state) {
        Authorize au = new Authorize(AppApi.APPID, AppApi.APPSECERT);
        String url = au.forwardurl(AppApi.REDIRECT_URL, state, Authorize.DISPLAY_TAG_T.WEB);
        return url;
    }


    /**
     *   获取当前用户校方认证信息。
     * @param accessToken
     * @return
     */
    public static String verifyInfo(String accessToken){
        String query = YIBAN_OPEN_URL;
        query += "user/verify_me";
        query += "?access_token=";
        query += accessToken;
        return  HTTPSimple.GET(query);
    }

    public static String realInfo(String accessToken){
        String query = YIBAN_OPEN_URL;
        query += "user/real_me";
        query += "?access_token=";
        query += accessToken;
        return  HTTPSimple.GET(query);
    }

    /**
     *获取当前用户基本信息。
     * @param accessToken
     * @return
     */
    public static String basicInfo(String accessToken){
        String query = YIBAN_OPEN_URL;
        query += "user/me";
        query += "?access_token=";
        query += accessToken;
        return  HTTPSimple.GET(query);
    }
}
