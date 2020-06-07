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
import io.swagger.client.model.AuthControlExemptMidsListResponse;
import io.swagger.client.model.AuthControlExemptMidsRequest;
import io.swagger.client.model.AuthControlExemptMidsResponse;
import io.swagger.client.model.AuthControlExemptMidsUpdateRequest;
import io.swagger.client.model.AuthControlListResponse;
import io.swagger.client.model.AuthControlRequest;
import io.swagger.client.model.AuthControlResponse;
import io.swagger.client.model.AuthControlUpdateRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthControlsApi
 */
@Ignore
public class AuthControlsApiTest {

    private final AuthControlsApi api = new AuthControlsApi();

    
    /**
     * Lists all global auth control exceptions for the program
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAuthcontrolsTest() throws ApiException {
        String cardProduct = null;
        String user = null;
        Integer count = null;
        Integer startIndex = null;
        String fields = null;
        String sortBy = null;
        AuthControlListResponse response = api.getAuthcontrols(cardProduct, user, count, startIndex, fields, sortBy);

        // TODO: test validations
    }
    
    /**
     * Lists all auth control exempted MIDs for the program
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAuthcontrolsExemptmidsTest() throws ApiException {
        String cardProduct = null;
        String user = null;
        Integer count = null;
        Integer startIndex = null;
        String fields = null;
        String sortBy = null;
        AuthControlExemptMidsListResponse response = api.getAuthcontrolsExemptmids(cardProduct, user, count, startIndex, fields, sortBy);

        // TODO: test validations
    }
    
    /**
     * Returns a specific auth control exemptmids
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAuthcontrolsExemptmidsTokenTest() throws ApiException {
        String token = null;
        AuthControlExemptMidsResponse response = api.getAuthcontrolsExemptmidsToken(token);

        // TODO: test validations
    }
    
    /**
     * Returns a specific auth control exception
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAuthcontrolsTokenTest() throws ApiException {
        String token = null;
        String fields = null;
        AuthControlResponse response = api.getAuthcontrolsToken(token, fields);

        // TODO: test validations
    }
    
    /**
     * Creates an auth control exception
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAuthcontrolsTest() throws ApiException {
        AuthControlRequest body = null;
        AuthControlResponse response = api.postAuthcontrols(body);

        // TODO: test validations
    }
    
    /**
     * Creates an auth control for exempting MIDs
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAuthcontrolsExemptmidsTest() throws ApiException {
        AuthControlExemptMidsRequest body = null;
        AuthControlExemptMidsResponse response = api.postAuthcontrolsExemptmids(body);

        // TODO: test validations
    }
    
    /**
     * Updates the status an auth control exemptmids
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putAuthcontrolsExemptmidsTokenTest() throws ApiException {
        String token = null;
        AuthControlExemptMidsUpdateRequest body = null;
        api.putAuthcontrolsExemptmidsToken(token, body);

        // TODO: test validations
    }
    
    /**
     * Updates an auth control exception
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putAuthcontrolsTokenTest() throws ApiException {
        String token = null;
        AuthControlUpdateRequest body = null;
        AuthControlResponse response = api.putAuthcontrolsToken(token, body);

        // TODO: test validations
    }
    
}