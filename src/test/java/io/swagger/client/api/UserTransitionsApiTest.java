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
import io.swagger.client.model.UserTransitionListResponse;
import io.swagger.client.model.UserTransitionRequest;
import io.swagger.client.model.UserTransitionResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserTransitionsApi
 */
@Ignore
public class UserTransitionsApiTest {

    private final UserTransitionsApi api = new UserTransitionsApi();

    
    /**
     * Returns a user transition
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUsertransitionsTokenTest() throws ApiException {
        String token = null;
        String fields = null;
        UserTransitionResponse response = api.getUsertransitionsToken(token, fields);

        // TODO: test validations
    }
    
    /**
     * Returns transitions for a specific user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUsertransitionsUserUsertokenTest() throws ApiException {
        String userToken = null;
        Integer count = null;
        Integer startIndex = null;
        String fields = null;
        String sortBy = null;
        UserTransitionListResponse response = api.getUsertransitionsUserUsertoken(userToken, count, startIndex, fields, sortBy);

        // TODO: test validations
    }
    
    /**
     * Creates a user transition
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postUsertransitionsTest() throws ApiException {
        UserTransitionRequest body = null;
        UserTransitionResponse response = api.postUsertransitions(body);

        // TODO: test validations
    }
    
}