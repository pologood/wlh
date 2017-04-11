package com.jd.common.utils;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class HttpUtil {

    private static final Log logger = LogFactory.getLog(HttpUtil.class);

    private static HttpClient httpClient = new DefaultHttpClient();
    /**
     * 发送Get请求
     *
     * @param url
     * @param param
     * @return
     */
    public static String setGet(String url, Map<String, String> param) {
        String body = null;
        try {
            // Get请求
            HttpGet httpget = new HttpGet(url);
            httpClient = new DefaultHttpClient();

            // 设置参数
            List<NameValuePair> data = new ArrayList<NameValuePair>();
            //封装参数
            Set<String> keys = param.keySet();

            for (String key : keys) {
                String value = param.get(key);
                NameValuePair item = new BasicNameValuePair(key, value);
                data.add(item);
            }

            String str = EntityUtils.toString(new UrlEncodedFormEntity(data));
            httpget.setURI(new URI(httpget.getURI().toString() + "?" + str));

            // 发送请求
            HttpResponse httpresponse = httpClient.execute(httpget);

            if (httpresponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
//                logger.debug("请求成功！");
                HttpEntity entity = httpresponse.getEntity();
                body = EntityUtils.toString(entity, "utf-8");

            } else {
                logger.error("请求错误代码：" + httpresponse.getStatusLine().getStatusCode());
                logger.info("请求错误信息：" + EntityUtils.toString(httpresponse.getEntity(), "utf-8"));
            }

        } catch (Exception e) {
            logger.error("发送请求失败!", e);
        }
        return body;
    }

    /**
     * 发送 Post请求
     *
     * @param url
     * @param param
     * @return
     */
    public static String sendPost(String url, Map<String, String> param) {
        try {
            HttpPost httpPost = new HttpPost(url);
//            if (httpClient == null) {
                httpClient = new DefaultHttpClient();
//            }

            //封装参数
            List<NameValuePair> valuePairs = new ArrayList<NameValuePair>(param.size());
            for (Map.Entry<String, String> entry : param.entrySet()) {
                NameValuePair nameValuePair = new BasicNameValuePair(entry.getKey(), String.valueOf(entry.getValue()));
                valuePairs.add(nameValuePair);
            }

            UrlEncodedFormEntity formEntity = new UrlEncodedFormEntity(valuePairs, "UTF-8");
            httpPost.setEntity(formEntity);

//            httpPost.setHeader("Content-Type","text/html");

            HttpResponse resp = httpClient.execute(httpPost);
            //处理返回结果
            if (resp.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
//                logger.debug("请求成功！");
                HttpEntity entity = resp.getEntity();
                String respContent = EntityUtils.toString(entity, "UTF-8").trim();
                if (respContent != null) {
                    EntityUtils.consume(entity);
                }
                return respContent;
            } else {
                logger.error("请求错误代码：" + resp.getStatusLine().getStatusCode());
                logger.info("请求错误信息：" + EntityUtils.toString(resp.getEntity(), "utf-8"));
            }
            httpPost.abort();
            httpClient.getConnectionManager().shutdown();
        } catch (Exception e) {
            logger.error("发送请求失败!", e);
        }
        return null;
    }


    /**
     * 发送post请求
     *
     * @param url     请求URL
     * @param param   参数
     * @param timeout 超时时间
     * @return
     */
    public static String sendPost(String url, Map<String, String> param, Integer timeout) {
        return sendPost(url, param, timeout);
    }
    
    
    
}


