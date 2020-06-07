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
import io.swagger.client.model.AchModel;
import io.swagger.client.model.AchResponseModel;
import io.swagger.client.model.AchVerificationModel;
import io.swagger.client.model.BaseAchRequestModel;
import io.swagger.client.model.BaseAchResponseModel;
import io.swagger.client.model.CardHolderAddressModel;
import io.swagger.client.model.CardHolderAddressUpdateModel;
import io.swagger.client.model.CardholderAddressListResponse;
import io.swagger.client.model.CardholderAddressResponse;
import io.swagger.client.model.FundingAccountListResponse;
import io.swagger.client.model.GatewayProgramCustomHeaderUpdateRequest;
import io.swagger.client.model.GatewayProgramFundingSourceRequest;
import io.swagger.client.model.GatewayProgramFundingSourceResponse;
import io.swagger.client.model.GatewayProgramFundingSourceUpdateRequest;
import io.swagger.client.model.PaymentCardResponseModel;
import io.swagger.client.model.ProgramFundingSourceRequest;
import io.swagger.client.model.ProgramFundingSourceResponse;
import io.swagger.client.model.ProgramFundingSourceUpdateRequest;
import io.swagger.client.model.TokenRequest;
import io.swagger.client.model.TokenUpdateRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FundingSourcesApi
 */
@Ignore
public class FundingSourcesApiTest {

    private final FundingSourcesApi api = new FundingSourcesApi();

    
    /**
     * Returns a list of Program ACH funding sources
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllACHFundingSourcesTest() throws ApiException {
        Integer count = null;
        Integer startIndex = null;
        String fields = null;
        String sortBy = null;
        BaseAchResponseModel response = api.getAllACHFundingSources(count, startIndex, fields, sortBy);

        // TODO: test validations
    }
    
    /**
     * Returns a user ACH account
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFundingsourcesAchFundingsourcetokenTest() throws ApiException {
        String fundingSourceToken = null;
        AchResponseModel response = api.getFundingsourcesAchFundingsourcetoken(fundingSourceToken);

        // TODO: test validations
    }
    
    /**
     * Returns the dollar amounts used to verify the ACH account
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFundingsourcesAchFundingsourcetokenVerificationamountsTest() throws ApiException {
        String fundingSourceToken = null;
        AchVerificationModel response = api.getFundingsourcesAchFundingsourcetokenVerificationamounts(fundingSourceToken);

        // TODO: test validations
    }
    
    /**
     * Lists all addresses for a business
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFundingsourcesAddressesBusinessBusinesstokenTest() throws ApiException {
        String businessToken = null;
        String fields = null;
        CardholderAddressListResponse response = api.getFundingsourcesAddressesBusinessBusinesstoken(businessToken, fields);

        // TODO: test validations
    }
    
    /**
     * Returns a user address for a funding source
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFundingsourcesAddressesFundingsourceaddresstokenTest() throws ApiException {
        String fundingSourceAddressToken = null;
        CardholderAddressResponse response = api.getFundingsourcesAddressesFundingsourceaddresstoken(fundingSourceAddressToken);

        // TODO: test validations
    }
    
    /**
     * Lists all addresses for a user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFundingsourcesAddressesUserUsertokenTest() throws ApiException {
        String userToken = null;
        String fields = null;
        CardholderAddressListResponse response = api.getFundingsourcesAddressesUserUsertoken(userToken, fields);

        // TODO: test validations
    }
    
    /**
     * Lists all funding sources for a business
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFundingsourcesBusinessBusinesstokenTest() throws ApiException {
        String businessToken = null;
        String type = null;
        String fields = null;
        FundingAccountListResponse response = api.getFundingsourcesBusinessBusinesstoken(businessToken, type, fields);

        // TODO: test validations
    }
    
    /**
     * Returns a specific payment card
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFundingsourcesPaymentcardFundingsourcetokenTest() throws ApiException {
        String fundingSourceToken = null;
        PaymentCardResponseModel response = api.getFundingsourcesPaymentcardFundingsourcetoken(fundingSourceToken);

        // TODO: test validations
    }
    
    /**
     * Returns a specific program funding source
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFundingsourcesProgramTokenTest() throws ApiException {
        String token = null;
        ProgramFundingSourceResponse response = api.getFundingsourcesProgramToken(token);

        // TODO: test validations
    }
    
    /**
     * Returns a gateway program funding source
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFundingsourcesProgramgatewayTokenTest() throws ApiException {
        String token = null;
        GatewayProgramFundingSourceResponse response = api.getFundingsourcesProgramgatewayToken(token);

        // TODO: test validations
    }
    
    /**
     * Lists all funding sources for a user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFundingsourcesUserUsertokenTest() throws ApiException {
        String userToken = null;
        String type = null;
        String fields = null;
        FundingAccountListResponse response = api.getFundingsourcesUserUsertoken(userToken, type, fields);

        // TODO: test validations
    }
    
    /**
     * Registers an ACH funding source
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postFundingsourcesAchTest() throws ApiException {
        AchModel body = null;
        AchResponseModel response = api.postFundingsourcesAch(body);

        // TODO: test validations
    }
    
    /**
     * Creates an account holder address for a funding source
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postFundingsourcesAddressesTest() throws ApiException {
        CardHolderAddressModel body = null;
        CardholderAddressResponse response = api.postFundingsourcesAddresses(body);

        // TODO: test validations
    }
    
    /**
     * Registers a payment card funding source
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postFundingsourcesPaymentcardTest() throws ApiException {
        TokenRequest body = null;
        PaymentCardResponseModel response = api.postFundingsourcesPaymentcard(body);

        // TODO: test validations
    }
    
    /**
     * Creates a program funding source
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postFundingsourcesProgramTest() throws ApiException {
        ProgramFundingSourceRequest body = null;
        ProgramFundingSourceResponse response = api.postFundingsourcesProgram(body);

        // TODO: test validations
    }
    
    /**
     * Registers an ACH funding source for a program
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postFundingsourcesProgramAchTest() throws ApiException {
        BaseAchRequestModel body = null;
        BaseAchResponseModel response = api.postFundingsourcesProgramAch(body);

        // TODO: test validations
    }
    
    /**
     * Creates a gateway program funding source
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postFundingsourcesProgramgatewayTest() throws ApiException {
        GatewayProgramFundingSourceRequest body = null;
        GatewayProgramFundingSourceResponse response = api.postFundingsourcesProgramgateway(body);

        // TODO: test validations
    }
    
    /**
     * Verifies a bank account as a funding source
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putFundingsourcesAchFundingsourcetokenTest() throws ApiException {
        String fundingSourceToken = null;
        AchVerificationModel body = null;
        AchResponseModel response = api.putFundingsourcesAchFundingsourcetoken(fundingSourceToken, body);

        // TODO: test validations
    }
    
    /**
     * Updates the account holder address for a funding source
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putFundingsourcesAddressesFundingsourceaddresstokenTest() throws ApiException {
        String fundingSourceAddressToken = null;
        CardHolderAddressUpdateModel body = null;
        CardholderAddressResponse response = api.putFundingsourcesAddressesFundingsourceaddresstoken(fundingSourceAddressToken, body);

        // TODO: test validations
    }
    
    /**
     * Updates a specific payment card 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putFundingsourcesFundingsourcetokenTest() throws ApiException {
        String fundingSourceToken = null;
        TokenUpdateRequest body = null;
        PaymentCardResponseModel response = api.putFundingsourcesFundingsourcetoken(fundingSourceToken, body);

        // TODO: test validations
    }
    
    /**
     * Configures a default funding source
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putFundingsourcesFundingsourcetokenDefaultTest() throws ApiException {
        String fundingSourceToken = null;
        PaymentCardResponseModel response = api.putFundingsourcesFundingsourcetokenDefault(fundingSourceToken);

        // TODO: test validations
    }
    
    /**
     * Updates a specific program funding source
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putFundingsourcesProgramTokenTest() throws ApiException {
        String token = null;
        ProgramFundingSourceUpdateRequest body = null;
        ProgramFundingSourceResponse response = api.putFundingsourcesProgramToken(token, body);

        // TODO: test validations
    }
    
    /**
     * Updates a specific gateway program funding source Custom headers
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putFundingsourcesProgramgatewayCustomHeaderTokenTest() throws ApiException {
        String token = null;
        GatewayProgramCustomHeaderUpdateRequest body = null;
        GatewayProgramFundingSourceResponse response = api.putFundingsourcesProgramgatewayCustomHeaderToken(token, body);

        // TODO: test validations
    }
    
    /**
     * Updates a specific gateway program funding source
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putFundingsourcesProgramgatewayTokenTest() throws ApiException {
        String token = null;
        GatewayProgramFundingSourceUpdateRequest body = null;
        GatewayProgramFundingSourceResponse response = api.putFundingsourcesProgramgatewayToken(token, body);

        // TODO: test validations
    }
    
}