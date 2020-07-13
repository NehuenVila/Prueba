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

/**
 * 
 */


public class InterfaceFE {

	public String endPointWS_DocFE = "https://ws.dsnube.co/dsrest/dsdatasnapfe.dll/datasnap/rest/TFactura/docfe";
	public String userWS = "uXLPkYduIUpzf5SktdnOLmyEKy6/prJM2TULdljLh/c=";
	public String pwdWS = "S+2wrSyDfuNe/c1ywwJC3Em9P8qRMk7IyTW4tnmr0U37SVlx5PLNZKqlLb/o4J9sLeqMOfsypNK1fhPwCnxW2w==";
	
	/**
	 * 
	 */
	public InterfaceFE() {
	}
	
	public JSONObject getJSonDocumento() throws Exception{
		
		JSONObject jsonModel = new JSONObject();
		
		try {
			
			// Obtengo objetos que serán los atributos del Documento
			JSONObject jsonEncabezado = this.getJSonEncabezado();
			JSONObject jsonSucursal = this.getJSonSucursal();
			JSONObject jsonTercero = this.getJSonTercero();
			
			JSONArray jsonArrayDetalles = this.getJSonDetalles();
			JSONArray jsonArrayImpuestos = this.getJSonImpuestos();
			JSONArray jsonArrayConceptos = this.getJSonConceptos();
			
			// Seteo atriubtos del documento
			jsonModel.put("detalle", jsonArrayDetalles);
			jsonModel.put("encabezado", jsonEncabezado);
			jsonModel.put("impuesto", jsonArrayImpuestos);
			jsonModel.put("concepto", jsonArrayConceptos);
			jsonModel.put("sucursal", jsonSucursal);
			jsonModel.put("tercero", jsonTercero);			
			
		} 
		catch (Exception e) {
			throw new Exception(e);
		}
		
		return jsonModel;
	}
	
	private JSONArray getJSonDetalles() throws Exception{
		
		JSONArray jsonArrayModels = new JSONArray();
		
		try {
			// Seteo atributos de un item de detalle
			JSONObject jsonModel = new JSONObject();
			
			jsonModel.put("cantidad", new BigDecimal(1));
			jsonModel.put("idproducto", "COD100");
			jsonModel.put("idunidad", "EA");
			jsonModel.put("iva", new BigDecimal(1900));
			jsonModel.put("nombreproducto", "PRODUCTO PRUEBA");
			jsonModel.put("nombreproducto", "PRODUCTO PRUEBA");
			jsonModel.put("porciva", new BigDecimal(19));
			jsonModel.put("pos", new BigDecimal(1));
			jsonModel.put("precio", new BigDecimal(10000));
			jsonModel.put("subtotal", new BigDecimal(10000));
			
			
			// Agrego item al array
			jsonArrayModels.put(jsonModel);
			
		} 
		catch (Exception e) {
			throw new Exception(e);
		}
		
		return jsonArrayModels;
	}
	
	
	private JSONObject getJSonEncabezado() throws Exception{
		
		JSONObject jsonModel = new JSONObject();
		
		try {
			// Seteo atributos del encabezado
			int emisor = 901260094;
			int idSuc = 1;
			int numeroDoc = 1015;
			BigInteger nitDoc = new BigInteger("999999999");
			String prefijo = "SET";
					
			Timestamp fechaDoc =  new Timestamp(System.currentTimeMillis());
			
			jsonModel.put("emisor", emisor);
			jsonModel.put("fecha", fechaDoc);
			jsonModel.put("fvence", fechaDoc);
			jsonModel.put("idsuc", idSuc);
			jsonModel.put("sucursal", idSuc);
			jsonModel.put("nit", nitDoc.intValue());
			jsonModel.put("numero", numeroDoc);
			jsonModel.put("otrosconceptos", new BigDecimal(0));
			jsonModel.put("baseimpuesto", new BigDecimal(10000));
			jsonModel.put("iva", new BigDecimal(1900));
			jsonModel.put("prefijo", prefijo);
			jsonModel.put("subtotal", new BigDecimal(10000));
			jsonModel.put("total", new BigDecimal(11900));
			jsonModel.put("totalDet", 1);
			jsonModel.put("totalImp", 1);
			jsonModel.put("totalCon", 0);
			jsonModel.put("mediopago", "ZZZ");
			jsonModel.put("metodopago", "2");
			jsonModel.put("mediopago", "ZZZ");
			jsonModel.put("metodopago", 2);
			
		} 
		catch (Exception e) {
			throw new Exception(e);
		}
		
		return jsonModel;		
	}
	
	
	private JSONArray getJSonImpuestos() throws Exception{
		
		JSONArray jsonArrayModels = new JSONArray();
		
		
		try {
			// Seteo atributos de impuesto
			JSONObject jsonModel = new JSONObject();
			
			jsonModel.put("Base_calculo", new BigDecimal(10000));
			jsonModel.put("porciva", new BigDecimal(19));
			jsonModel.put("valor", new BigDecimal(1900));
			
			// Agrego item al array
			jsonArrayModels.put(jsonModel);
		} 
		catch (Exception e) {
			throw new Exception(e);
		}
		
		return jsonArrayModels;		
	}
	
	private JSONArray getJSonConceptos() throws Exception{
		
		JSONArray jsonArrayModels = new JSONArray();
		
		
		try {
			// Seteo concepto
			//JSONObject jsonModel = new JSONObject();	

			// Agrego item al array
			//jsonArrayModels.put(jsonModel);			
		} 
		catch (Exception e) {
			throw new Exception(e);
		}
		
		return jsonArrayModels;		
	}
	
	
	private JSONObject getJSonSucursal() throws Exception{
		
		JSONObject jsonModel = new JSONObject();
		
		try {
			// Seteo atributos de sucursal
			int idSuc = 1;
			BigInteger nitDoc = new BigInteger("999999999");
			
			jsonModel.put("ciudad", "MEDELLÍN");
			jsonModel.put("codcliente", "CLI1000");
			jsonModel.put("departamento", "Antioquia");
			jsonModel.put("direccion1", "Calle 1 1010");
			jsonModel.put("dpto", "05");
			jsonModel.put("email", "gabrielvila13@gmail.com");
			jsonModel.put("emailfe", "gabrielvila13@gmail.com");
			jsonModel.put("idsuc", idSuc);
			jsonModel.put("mun", "001");
			jsonModel.put("mit", nitDoc.intValue());
			jsonModel.put("razonsocial", "CLIENTE S.A.");
			jsonModel.put("telefono1", "10321345");
			jsonModel.put("codigopostal", "000000");
			jsonModel.put("codigopostal", 000000);
			
		} 
		catch (Exception e) {
			throw new Exception(e);
		}
		
		return jsonModel;		
	}

	
	private JSONObject getJSonTercero() throws Exception{
		
		JSONObject jsonModel = new JSONObject();
		
		try {
			// Seteo atributos de tercero
			BigInteger nitDoc = new BigInteger("999999999");
			int tipoEmpresa = 1;
			int tipoDoc = 31;
			//String tipoPersona = "J";
			String tipoPersona = "";
			String regimenTrib = "48";
			Timestamp fechaDoc =  new Timestamp(System.currentTimeMillis());
			
			jsonModel.put("idtipoempresa", tipoEmpresa);
			jsonModel.put("nit", nitDoc.intValue());
			jsonModel.put("razonsocial", "CLIENTE S.A.");
			jsonModel.put("regimentributacion", regimenTrib);			
			jsonModel.put("tdoc", tipoDoc);
			jsonModel.put("tipopersona", tipoPersona);
			jsonModel.put("identificacion", nitDoc.intValue());
			jsonModel.put("identificacion", nitDoc.intValue());
			jsonModel.put("frevision", fechaDoc);
			jsonModel.put("obligacionfiscal", "O-99");
			jsonModel.put("tributoreceptor", "O1");
			jsonModel.put("obligacionfiscal", "o-99");
			jsonModel.put("regimentributacion", "9");
			jsonModel.put("tributoreceptor", 01);
			
		} 
		catch (Exception e) {
			throw new Exception(e);
		}
		
		return jsonModel;		
	}

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
