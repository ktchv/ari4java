package ch.loway.oss.ari4java.generated.ari_0_0_1.actions;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import ch.loway.oss.ari4java.tools.BaseAriAction;
import ch.loway.oss.ari4java.tools.RestException;
import ch.loway.oss.ari4java.tools.AriCallback;
import com.fasterxml.jackson.core.type.TypeReference;
import ch.loway.oss.ari4java.generated.ari_0_0_1.models.*;

public class ActionEndpoints_impl_ari_0_0_1 extends BaseAriAction  implements ActionEndpoints {
/**********************************************************
 * Asterisk endpoints
 * 
 * List all endpoints.
 *********************************************************/
private void buildList() {
reset();
url = "/endpoints";
method = "GET";
}

@Override
public List<? extends Endpoint> list() throws RestException {
buildList();
String json = httpActionSync();
return deserializeJson( json, new TypeReference<List<Endpoint_impl_ari_0_0_1>>() {} ); 
}

@Override
public void list(AriCallback<List<? extends Endpoint>> callback) {
buildList();
httpActionAsync(callback, new TypeReference<List<Endpoint_impl_ari_0_0_1>>() {});
}

/**********************************************************
 * Asterisk endpoints
 * 
 * List available endoints for a given endpoint technology.
 *********************************************************/
private void buildListByTech(String tech) {
reset();
url = "/endpoints/" + tech + "";
method = "GET";
lE.add( BaseAriAction.HttpResponse.build( 404, "Endpoints not found") );
}

@Override
public List<? extends Endpoint> listByTech(String tech) throws RestException {
buildListByTech(tech);
String json = httpActionSync();
return deserializeJson( json, new TypeReference<List<Endpoint_impl_ari_0_0_1>>() {} ); 
}

@Override
public void listByTech(String tech, AriCallback<List<? extends Endpoint>> callback) {
buildListByTech(tech);
httpActionAsync(callback, new TypeReference<List<Endpoint_impl_ari_0_0_1>>() {});
}

/**********************************************************
 * Single endpoint
 * 
 * Details for an endpoint.
 *********************************************************/
private void buildGet(String tech, String resource) {
reset();
url = "/endpoints/" + tech + "/" + resource + "";
method = "GET";
lE.add( BaseAriAction.HttpResponse.build( 404, "Endpoints not found") );
}

@Override
public Endpoint get(String tech, String resource) throws RestException {
buildGet(tech, resource);
String json = httpActionSync();
return deserializeJson( json, Endpoint_impl_ari_0_0_1.class ); 
}

@Override
public void get(String tech, String resource, AriCallback<Endpoint> callback) {
buildGet(tech, resource);
httpActionAsync(callback, Endpoint_impl_ari_0_0_1.class);
}

/** No missing signatures from interface */
};
