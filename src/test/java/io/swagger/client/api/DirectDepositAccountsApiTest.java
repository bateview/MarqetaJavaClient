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
import io.swagger.client.model.DepositAccountUpdateRequest;
import io.swagger.client.model.DirectDepositAccountListResponse;
import io.swagger.client.model.DirectDepositAccountRequest;
import io.swagger.client.model.DirectDepositAccountResponse;
import io.swagger.client.model.DirectDepositAccountTransitionRequest;
import io.swagger.client.model.DirectDepositAccountTransitionResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DirectDepositAccountsApi
 */
@Ignore
public class DirectDepositAccountsApiTest {

    private final DirectDepositAccountsApi api = new DirectDepositAccountsApi();

    
    /**
     * Creates new direct deposit account for cardholder.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAccountTest() throws ApiException {
        DirectDepositAccountRequest body = null;
        DirectDepositAccountResponse response = api.createAccount(body);

        // TODO: test validations
    }
    
    /**
     * Creates new transition for a direct deposit account.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTransitionTest() throws ApiException {
        DirectDepositAccountTransitionRequest body = null;
        DirectDepositAccountTransitionResponse response = api.createTransition(body);

        // TODO: test validations
    }
    
    /**
     * Get direct deposit account.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDirectDepositAccountTest() throws ApiException {
        String token = null;
        DirectDepositAccountResponse response = api.getDirectDepositAccount(token);

        // TODO: test validations
    }
    
    /**
     * Get direct deposit account transition.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDirectDepositAccountTransitionTest() throws ApiException {
        String token = null;
        DirectDepositAccountTransitionResponse response = api.getDirectDepositAccountTransition(token);

        // TODO: test validations
    }
    
    /**
     * Get direct deposit account transition list for card holder.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTransitionListTest() throws ApiException {
        String userToken = null;
        Integer count = null;
        Integer startIndex = null;
        String sortBy = null;
        DirectDepositAccountTransitionResponse response = api.getTransitionList(userToken, count, startIndex, sortBy);

        // TODO: test validations
    }
    
    /**
     * List all specific direct deposit accounts.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserDirectDepositAccountsTest() throws ApiException {
        String token = null;
        Integer count = null;
        Integer startIndex = null;
        String sortBy = null;
        String state = null;
        DirectDepositAccountListResponse response = api.getUserDirectDepositAccounts(token, count, startIndex, sortBy, state);

        // TODO: test validations
    }
    
    /**
     * Get User for Plain Text Account Number
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserForDirectDepositAccountTest() throws ApiException {
        String accountNumber = null;
        DirectDepositAccountResponse response = api.getUserForDirectDepositAccount(accountNumber);

        // TODO: test validations
    }
    
    /**
     * Update direct deposit account.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTest() throws ApiException {
        DepositAccountUpdateRequest body = null;
        String token = null;
        DirectDepositAccountResponse response = api.update(body, token);

        // TODO: test validations
    }
    
}
