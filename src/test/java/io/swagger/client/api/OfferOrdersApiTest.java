/*
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.OfferOrderRequest;
import io.swagger.client.model.OfferOrderResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OfferOrdersApi
 */
@Ignore
public class OfferOrdersApiTest {

    private final OfferOrdersApi api = new OfferOrdersApi();

    
    /**
     * Returns a purchase order for a specific offer
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOfferordersTokenTest() throws ApiException {
        String token = null;
        OfferOrderResponse response = api.getOfferordersToken(token);

        // TODO: test validations
    }
    
    /**
     * Creates an offer order
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postOfferordersTest() throws ApiException {
        OfferOrderRequest body = null;
        OfferOrderResponse response = api.postOfferorders(body);

        // TODO: test validations
    }
    
}
