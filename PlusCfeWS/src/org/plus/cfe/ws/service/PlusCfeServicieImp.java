package org.plus.cfe.ws.service;

import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.sql.Timestamp;
import java.util.Scanner;

import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpHeaders;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;

public class PlusCfeServicieImp {

	
	
	public String executeJsonPOST(String url,  JSONObject jsonObject, String usuario, String clave) throws Exception{

        String message = null;
        int timeout = 120;

        CloseableHttpClient httpClient = null;

        try{
            String credentials = usuario + ":" + clave;

            RequestConfig config = RequestConfig.custom()
                    .setConnectTimeout(timeout * 1000)
                    .setConnectionRequestTimeout(timeout * 1000)
                    .setSocketTimeout(timeout * 1000).build();

            httpClient = HttpClientBuilder.create().setDefaultRequestConfig(config).build();

            HttpPost request = new HttpPost(url);

            System.out.println(request.getURI());
            System.out.println(jsonObject.toString());

            StringEntity params = new StringEntity(jsonObject.toString(), "UTF-8");
            request.addHeader("Accept", "application/json");
            request.addHeader("content-type", "application/json");
            request.setEntity(params);

            byte[] encodedAuth = Base64.encodeBase64(credentials.getBytes(Charset.forName("ISO-8859-1")));
            String authHeader = "Basic " + new String(encodedAuth);
            request.addHeader(HttpHeaders.AUTHORIZATION, authHeader);

            CloseableHttpResponse response = httpClient.execute(request);

            
            System.out.println(response.getStatusLine());
            System.out.println(response.getStatusLine().getStatusCode());
            
            if (response.getStatusLine().getStatusCode() != 200) {
                InputStream inStream = response.getEntity().getContent();
                if (inStream != null){
                    message = new Scanner(inStream).useDelimiter("\\A").next();
                }
            }
            else {
            	String json = EntityUtils.toString(response.getEntity());
            	message = json;
            }
        }
        catch (Exception e){
           throw new Exception(e);
        }
        finally {
            if (httpClient != null){
                try{
                    httpClient.close();
                }
                catch (Exception e){
                }
            }
        }
        return message;

	}
	
}


