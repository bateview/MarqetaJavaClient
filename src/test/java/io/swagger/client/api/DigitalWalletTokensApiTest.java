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
import io.swagger.client.model.DigitalWalletToken;
import io.swagger.client.model.DigitalWalletTokenListResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DigitalWalletTokensApi
 */
@Ignore
public class DigitalWalletTokensApiTest {

    private final DigitalWalletTokensApi api = new DigitalWalletTokensApi();

    
    /**
     * Returns digital wallet tokens
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDigitalwallettokensTest() throws ApiException {
        Integer count = null;
        Integer startIndex = null;
        String fields = null;
        String sortBy = null;
        String startDate = null;
        String endDate = null;
        String panReferenceId = null;
        String tokenReferenceId = null;
        String correlationId = null;
        String tokenType = null;
        String tokenRequestorName = null;
        String state = null;
        String embed = null;
        DigitalWalletTokenListResponse response = api.getDigitalwallettokens(count, startIndex, fields, sortBy, startDate, endDate, panReferenceId, tokenReferenceId, correlationId, tokenType, tokenRequestorName, state, embed);

        // TODO: test validations
    }
    
    /**
     * Returns a list of digital wallet tokens for the specified card
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDigitalwallettokensCardCardtokenTest() throws ApiException {
        String cardToken = null;
        Integer count = null;
        Integer startIndex = null;
        String sortBy = null;
        DigitalWalletTokenListResponse response = api.getDigitalwallettokensCardCardtoken(cardToken, count, startIndex, sortBy);

        // TODO: test validations
    }
    
    /**
     * Returns a specific digital wallet token
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDigitalwallettokensTokenTest() throws ApiException {
        String token = null;
        DigitalWalletToken response = api.getDigitalwallettokensToken(token);

        // TODO: test validations
    }
    
    /**
     * Returns a specific digital wallet token PAN visible
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDigitalwallettokensTokenShowtokenpanTest() throws ApiException {
        String token = null;
        DigitalWalletToken response = api.getDigitalwallettokensTokenShowtokenpan(token);

        // TODO: test validations
    }
    
}