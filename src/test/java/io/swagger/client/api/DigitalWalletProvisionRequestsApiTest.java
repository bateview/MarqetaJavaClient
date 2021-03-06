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
import io.swagger.client.model.DigitalWalletAndroidPayProvisionRequest;
import io.swagger.client.model.DigitalWalletAndroidPayProvisionResponse;
import io.swagger.client.model.DigitalWalletApplePayProvisionRequest;
import io.swagger.client.model.DigitalWalletApplePayProvisionResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DigitalWalletProvisionRequestsApi
 */
@Ignore
public class DigitalWalletProvisionRequestsApiTest {

    private final DigitalWalletProvisionRequestsApi api = new DigitalWalletProvisionRequestsApi();

    
    /**
     * Validates and creates Android-specific provisioning request data
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postDigitalwalletprovisionrequestsAndroidpayTest() throws ApiException {
        DigitalWalletAndroidPayProvisionRequest body = null;
        DigitalWalletAndroidPayProvisionResponse response = api.postDigitalwalletprovisionrequestsAndroidpay(body);

        // TODO: test validations
    }
    
    /**
     * Validates Apple certificates and creates Apple-specific provisioning request data
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postDigitalwalletprovisionrequestsApplepayTest() throws ApiException {
        DigitalWalletApplePayProvisionRequest body = null;
        DigitalWalletApplePayProvisionResponse response = api.postDigitalwalletprovisionrequestsApplepay(body);

        // TODO: test validations
    }
    
}
