

import java.io.InputStream;

import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpHeaders;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONObject;
import org.plus.cfe.ws.model.Detalle;
import org.plus.cfe.ws.model.Documento;
import org.plus.cfe.ws.model.Encabezado;
import org.plus.cfe.ws.model.Impuesto;
import org.plus.cfe.ws.model.Sucursal;
import org.plus.cfe.ws.model.Tercero;
//import org.xpande.retail.ws.model.Serializable;

import com.google.gson.Gson;
import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;


public class Main implements Serializable {

	public static void main(String[] args) {
		
		Timestamp fecha = new Timestamp(System.currentTimeMillis());
		Timestamp fechaVence = new Timestamp(System.currentTimeMillis());
		java.math.BigDecimal precio = java.math.BigDecimal.valueOf(100);
		java.math.BigDecimal total = java.math.BigDecimal.valueOf(100);
		java.math.BigDecimal cero = java.math.BigDecimal.valueOf(0);
		java.math.BigDecimal uno = java.math.BigDecimal.valueOf(1);
		
		//valores detalle
		Detalle detalleEj = new Detalle();
		detalleEj.setPrecio(precio);
		detalleEj.setCantidad(uno);
		detalleEj.setIdproducto("cod24");
		detalleEj.setIdunidad("EA");
		detalleEj.setIva(cero);
		detalleEj.setNombreproducto("producto prueba");
		detalleEj.setPorciva(cero);
		detalleEj.setPos(uno);
		detalleEj.setSubtotal(precio);
		
		
//		List<Detalle> detalles = new ArrayList<Detalle>();
//		detalles.add(detalleEj);
		
		//valores encabezado
		Encabezado encabezado = new Encabezado();
		encabezado.setEmisor(901260094);
		encabezado.setIdsuc(1);
		encabezado.setPrefijo("SET");
		encabezado.setNumero(1002);
		encabezado.setSubtotal(precio);
		encabezado.setTotal(total);
		encabezado.setTotalImp(1);
		encabezado.setTotalDet(1);
		
		//valores impuesto
		Impuesto impuestoEj = new Impuesto();
		impuestoEj.setBase_calculo(cero);
		impuestoEj.setPorciva(cero);
		impuestoEj.setValor(uno);
		
		List<Impuesto> impuestos = new ArrayList<Impuesto>();
		impuestos.add(impuestoEj);
		
		//valores sucursal
		Sucursal sucursal = new Sucursal();
		
		//valores tercero
		Tercero tercero = new Tercero();
		
		//valores documento
		Documento docEj = new Documento();
//		docEj.setDetalles(detalles);
		docEj.getDetalles().add(detalleEj);
		docEj.setEncabezado(encabezado);
		docEj.setImpuesto(impuestos);
		docEj.setSucursal(sucursal);
		docEj.setTercero(tercero);
		
		Gson gson = new Gson();
		String JSON = gson.toJson(docEj);
		System.out.println(JSON);
		//url: https://ws.dsnube.co/dsrest/dsdatasnapfe.dll/datasnap/rest/TFactura/pdffe
		
		executeJsonPOST("https://ws.dsnube.co/dsrest/dsdatasnapfe.dll/datasnap/rest/TFactura/docfe", JSON, "uXLPkYduIUpzf5SktdnOLmyEKy6/prJM2TULdljLh/c=", "S+2wrSyDfuNe/c1ywwJC3Em9P8qRMk7IyTW4tnmr0U37SVlx5PLNZKqlLb/o4J9sLeqMOfsypNK1fhPwCnxW2w==" );

	}

	
	
	private static String executeJsonPOST(String url,  String jsonObject, String usuario, String clave){

        String message = null;
        int timeout = 120;

        CloseableHttpClient httpClient = null;

        try{

            //String url = this.scanntechConfig.getURL() + "/" + this.scanntechConfig.getMetodoPos() + "/" + configOrg.getCodigoEmpPos().trim() + "/" + serviceName;

           

            String credentials = usuario + ":" + clave;

            RequestConfig config = RequestConfig.custom()
                    .setConnectTimeout(timeout * 1000)
                    .setConnectionRequestTimeout(timeout * 1000)
                    .setSocketTimeout(timeout * 1000).build();

            httpClient = HttpClientBuilder.create().setDefaultRequestConfig(config).build();

            HttpPost request = new HttpPost(url);

            /*
            System.out.println("----------------------------------------");
            System.out.println(request.getURI());
            System.out.println(json.toString());
            */

            StringEntity params = new StringEntity(jsonObject, "UTF-8");
            request.addHeader("Accept", "application/json");
            request.addHeader("content-type", "application/json");
            request.setEntity(params);

            byte[] encodedAuth = Base64.encodeBase64(credentials.getBytes(Charset.forName("ISO-8859-1")));
            String authHeader = "Basic " + new String(encodedAuth);
            request.addHeader(HttpHeaders.AUTHORIZATION, authHeader);

            CloseableHttpResponse response = httpClient.execute(request);

            /*
            System.out.println(response.getStatusLine());
            System.out.println(response.getStatusLine().getStatusCode());
            */

            if (response.getStatusLine().getStatusCode() != 200) {
                InputStream inStream = response.getEntity().getContent();
                if (inStream != null){
                    message = new Scanner(inStream).useDelimiter("\\A").next();
                }
            }
        }
        catch (Exception e){
            //throw new Exception(e);
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

