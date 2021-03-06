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
import io.swagger.client.model.Fee;
import io.swagger.client.model.FeeRequest;
import io.swagger.client.model.FeeUpdateRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FeesApi
 */
@Ignore
public class FeesApiTest {

    private final FeesApi api = new FeesApi();

    
    /**
     * Lists all fees
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFeesTest() throws ApiException {
        Integer count = null;
        Integer startIndex = null;
        String fields = null;
        String sortBy = null;
        Fee response = api.getFees(count, startIndex, fields, sortBy);

        // TODO: test validations
    }
    
    /**
     * Returns a specific fee
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFeesTokenTest() throws ApiException {
        String token = null;
        Fee response = api.getFeesToken(token);

        // TODO: test validations
    }
    
    /**
     * Creates a fee
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postFeesTest() throws ApiException {
        FeeRequest body = null;
        Fee response = api.postFees(body);

        // TODO: test validations
    }
    
    /**
     * Updates a specific fee
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putFeesTokenTest() throws ApiException {
        String token = null;
        FeeUpdateRequest body = null;
        Fee response = api.putFeesToken(token, body);

        // TODO: test validations
    }
    
}
