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
import io.swagger.client.model.DepositAccount;
import io.swagger.client.model.DepositAccountUpdateRequest;
import io.swagger.client.model.DepositDepositResponse;
import io.swagger.client.model.DirectDepositListResponse;
import io.swagger.client.model.DirectDepositTransitionListResponse;
import io.swagger.client.model.DirectDepositTransitionRequest;
import io.swagger.client.model.DirectDepositTransitionResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DirectDepositsApi
 */
@Ignore
public class DirectDepositsApiTest {

    private final DirectDepositsApi api = new DirectDepositsApi();

    
    /**
     * Lists all direct deposits
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDirectdepositsTest() throws ApiException {
        Integer count = null;
        Integer startIndex = null;
        Boolean reversedAfterGracePeriod = null;
        String userToken = null;
        String businessToken = null;
        String directDepositState = null;
        String startSettlementDate = null;
        String endSettlementDate = null;
        String sortBy = null;
        DirectDepositListResponse response = api.getDirectdeposits(count, startIndex, reversedAfterGracePeriod, userToken, businessToken, directDepositState, startSettlementDate, endSettlementDate, sortBy);

        // TODO: test validations
    }
    
    /**
     * Returns an account and routing number which can be used for direct deposit
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDirectdepositsAccountsUserorbusinesstokenTest() throws ApiException {
        String userOrBusinessToken = null;
        DepositAccount response = api.getDirectdepositsAccountsUserorbusinesstoken(userOrBusinessToken);

        // TODO: test validations
    }
    
    /**
     * Returns a direct deposit entry
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDirectdepositsTokenTest() throws ApiException {
        String token = null;
        DepositDepositResponse response = api.getDirectdepositsToken(token);

        // TODO: test validations
    }
    
    /**
     * Returns a list of direct deposit transitions
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDirectdepositsTransitionsTest() throws ApiException {
        Integer count = null;
        String userToken = null;
        String businessToken = null;
        String directDepositToken = null;
        Integer startIndex = null;
        String sortBy = null;
        String states = null;
        DirectDepositTransitionListResponse response = api.getDirectdepositsTransitions(count, userToken, businessToken, directDepositToken, startIndex, sortBy, states);

        // TODO: test validations
    }
    
    /**
     * Returns a direct deposit transition
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDirectdepositsTransitionsTokenTest() throws ApiException {
        String token = null;
        DirectDepositTransitionResponse response = api.getDirectdepositsTransitionsToken(token);

        // TODO: test validations
    }
    
    /**
     * Creates a direct deposit transition
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postDirectdepositsTransitionsTest() throws ApiException {
        DirectDepositTransitionRequest body = null;
        DirectDepositTransitionResponse response = api.postDirectdepositsTransitions(body);

        // TODO: test validations
    }
    
    /**
     * Updates a specific direct deposit account
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putDirectdepositsAccountsUserorbusinesstokenTest() throws ApiException {
        String userOrBusinessToken = null;
        DepositAccountUpdateRequest body = null;
        DepositAccount response = api.putDirectdepositsAccountsUserorbusinesstoken(userOrBusinessToken, body);

        // TODO: test validations
    }
    
}
