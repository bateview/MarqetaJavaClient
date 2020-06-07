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
import io.swagger.client.model.CardProductListResponse;
import io.swagger.client.model.CardProductRequest;
import io.swagger.client.model.CardProductResponse;
import io.swagger.client.model.CardProductUpdateModel;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CardProductsApi
 */
@Ignore
public class CardProductsApiTest {

    private final CardProductsApi api = new CardProductsApi();

    
    /**
     * Lists all card products
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCardproductsTest() throws ApiException {
        Integer count = null;
        Integer startIndex = null;
        CardProductListResponse response = api.getCardproducts(count, startIndex);

        // TODO: test validations
    }
    
    /**
     * Returns a specific card product
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCardproductsTokenTest() throws ApiException {
        String token = null;
        CardProductResponse response = api.getCardproductsToken(token);

        // TODO: test validations
    }
    
    /**
     * Creates a card product
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCardproductsTest() throws ApiException {
        CardProductRequest body = null;
        CardProductResponse response = api.postCardproducts(body);

        // TODO: test validations
    }
    
    /**
     * Updates a specific card product
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putCardproductsTokenTest() throws ApiException {
        String token = null;
        CardProductUpdateModel body = null;
        CardProductResponse response = api.putCardproductsToken(token, body);

        // TODO: test validations
    }
    
}