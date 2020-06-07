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

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.DigitalWalletToken;
import io.swagger.client.model.DigitalWalletTokenListResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DigitalWalletTokensApi {
    private ApiClient apiClient;

    public DigitalWalletTokensApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DigitalWalletTokensApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getDigitalwallettokens
     * @param count Number of digital wallet tokens to retrieve (optional, default to 10)
     * @param startIndex Start index (optional, default to 0)
     * @param fields Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. (optional)
     * @param sortBy Sort order (optional, default to -createdTime)
     * @param startDate Start date (yyyy-MM-dd) (optional)
     * @param endDate End date (yyyy-MM-dd) (optional)
     * @param panReferenceId PAN reference ID (optional)
     * @param tokenReferenceId Token reference ID (optional)
     * @param correlationId Correlation ID (optional)
     * @param tokenType Comma-delimited list of digital wallet token types to display e.g. DEVICE_SECURE_ELEMENT | MERCHANT_CARD_ON_FILE | DEVICE_CLOUD_BASED | ECOMMERCE_DIGITAL_WALLET | PSEUDO_ACCOUNT (optional)
     * @param tokenRequestorName Comma-delimited list of digital wallet token wallet providers to display e.g. APPLE_PAY | ANDROID_PAY| SAMSUNG_PAY | MICROSOFT_PAY | VISA_CHECKOUT | FACEBOOK | NETFLIX | UNKNOWN (optional)
     * @param state Comma-delimited list of digital wallet token states to display e.g. REQUESTED | REQUEST_DECLINED | TERMINATED | SUSPENDED | ACTIVE (optional)
     * @param embed Embed (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDigitalwallettokensCall(Integer count, Integer startIndex, String fields, String sortBy, String startDate, String endDate, String panReferenceId, String tokenReferenceId, String correlationId, String tokenType, String tokenRequestorName, String state, String embed, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/digitalwallettokens";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (count != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("count", count));
        if (startIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start_index", startIndex));
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fields", fields));
        if (sortBy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sort_by", sortBy));
        if (startDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start_date", startDate));
        if (endDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end_date", endDate));
        if (panReferenceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pan_reference_id", panReferenceId));
        if (tokenReferenceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("token_reference_id", tokenReferenceId));
        if (correlationId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("correlation_id", correlationId));
        if (tokenType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("token_type", tokenType));
        if (tokenRequestorName != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("token_requestor_name", tokenRequestorName));
        if (state != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("state", state));
        if (embed != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("embed", embed));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDigitalwallettokensValidateBeforeCall(Integer count, Integer startIndex, String fields, String sortBy, String startDate, String endDate, String panReferenceId, String tokenReferenceId, String correlationId, String tokenType, String tokenRequestorName, String state, String embed, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getDigitalwallettokensCall(count, startIndex, fields, sortBy, startDate, endDate, panReferenceId, tokenReferenceId, correlationId, tokenType, tokenRequestorName, state, embed, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Returns digital wallet tokens
     * 
     * @param count Number of digital wallet tokens to retrieve (optional, default to 10)
     * @param startIndex Start index (optional, default to 0)
     * @param fields Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. (optional)
     * @param sortBy Sort order (optional, default to -createdTime)
     * @param startDate Start date (yyyy-MM-dd) (optional)
     * @param endDate End date (yyyy-MM-dd) (optional)
     * @param panReferenceId PAN reference ID (optional)
     * @param tokenReferenceId Token reference ID (optional)
     * @param correlationId Correlation ID (optional)
     * @param tokenType Comma-delimited list of digital wallet token types to display e.g. DEVICE_SECURE_ELEMENT | MERCHANT_CARD_ON_FILE | DEVICE_CLOUD_BASED | ECOMMERCE_DIGITAL_WALLET | PSEUDO_ACCOUNT (optional)
     * @param tokenRequestorName Comma-delimited list of digital wallet token wallet providers to display e.g. APPLE_PAY | ANDROID_PAY| SAMSUNG_PAY | MICROSOFT_PAY | VISA_CHECKOUT | FACEBOOK | NETFLIX | UNKNOWN (optional)
     * @param state Comma-delimited list of digital wallet token states to display e.g. REQUESTED | REQUEST_DECLINED | TERMINATED | SUSPENDED | ACTIVE (optional)
     * @param embed Embed (optional)
     * @return DigitalWalletTokenListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DigitalWalletTokenListResponse getDigitalwallettokens(Integer count, Integer startIndex, String fields, String sortBy, String startDate, String endDate, String panReferenceId, String tokenReferenceId, String correlationId, String tokenType, String tokenRequestorName, String state, String embed) throws ApiException {
        ApiResponse<DigitalWalletTokenListResponse> resp = getDigitalwallettokensWithHttpInfo(count, startIndex, fields, sortBy, startDate, endDate, panReferenceId, tokenReferenceId, correlationId, tokenType, tokenRequestorName, state, embed);
        return resp.getData();
    }

    /**
     * Returns digital wallet tokens
     * 
     * @param count Number of digital wallet tokens to retrieve (optional, default to 10)
     * @param startIndex Start index (optional, default to 0)
     * @param fields Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. (optional)
     * @param sortBy Sort order (optional, default to -createdTime)
     * @param startDate Start date (yyyy-MM-dd) (optional)
     * @param endDate End date (yyyy-MM-dd) (optional)
     * @param panReferenceId PAN reference ID (optional)
     * @param tokenReferenceId Token reference ID (optional)
     * @param correlationId Correlation ID (optional)
     * @param tokenType Comma-delimited list of digital wallet token types to display e.g. DEVICE_SECURE_ELEMENT | MERCHANT_CARD_ON_FILE | DEVICE_CLOUD_BASED | ECOMMERCE_DIGITAL_WALLET | PSEUDO_ACCOUNT (optional)
     * @param tokenRequestorName Comma-delimited list of digital wallet token wallet providers to display e.g. APPLE_PAY | ANDROID_PAY| SAMSUNG_PAY | MICROSOFT_PAY | VISA_CHECKOUT | FACEBOOK | NETFLIX | UNKNOWN (optional)
     * @param state Comma-delimited list of digital wallet token states to display e.g. REQUESTED | REQUEST_DECLINED | TERMINATED | SUSPENDED | ACTIVE (optional)
     * @param embed Embed (optional)
     * @return ApiResponse&lt;DigitalWalletTokenListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DigitalWalletTokenListResponse> getDigitalwallettokensWithHttpInfo(Integer count, Integer startIndex, String fields, String sortBy, String startDate, String endDate, String panReferenceId, String tokenReferenceId, String correlationId, String tokenType, String tokenRequestorName, String state, String embed) throws ApiException {
        com.squareup.okhttp.Call call = getDigitalwallettokensValidateBeforeCall(count, startIndex, fields, sortBy, startDate, endDate, panReferenceId, tokenReferenceId, correlationId, tokenType, tokenRequestorName, state, embed, null, null);
        Type localVarReturnType = new TypeToken<DigitalWalletTokenListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns digital wallet tokens (asynchronously)
     * 
     * @param count Number of digital wallet tokens to retrieve (optional, default to 10)
     * @param startIndex Start index (optional, default to 0)
     * @param fields Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. (optional)
     * @param sortBy Sort order (optional, default to -createdTime)
     * @param startDate Start date (yyyy-MM-dd) (optional)
     * @param endDate End date (yyyy-MM-dd) (optional)
     * @param panReferenceId PAN reference ID (optional)
     * @param tokenReferenceId Token reference ID (optional)
     * @param correlationId Correlation ID (optional)
     * @param tokenType Comma-delimited list of digital wallet token types to display e.g. DEVICE_SECURE_ELEMENT | MERCHANT_CARD_ON_FILE | DEVICE_CLOUD_BASED | ECOMMERCE_DIGITAL_WALLET | PSEUDO_ACCOUNT (optional)
     * @param tokenRequestorName Comma-delimited list of digital wallet token wallet providers to display e.g. APPLE_PAY | ANDROID_PAY| SAMSUNG_PAY | MICROSOFT_PAY | VISA_CHECKOUT | FACEBOOK | NETFLIX | UNKNOWN (optional)
     * @param state Comma-delimited list of digital wallet token states to display e.g. REQUESTED | REQUEST_DECLINED | TERMINATED | SUSPENDED | ACTIVE (optional)
     * @param embed Embed (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDigitalwallettokensAsync(Integer count, Integer startIndex, String fields, String sortBy, String startDate, String endDate, String panReferenceId, String tokenReferenceId, String correlationId, String tokenType, String tokenRequestorName, String state, String embed, final ApiCallback<DigitalWalletTokenListResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getDigitalwallettokensValidateBeforeCall(count, startIndex, fields, sortBy, startDate, endDate, panReferenceId, tokenReferenceId, correlationId, tokenType, tokenRequestorName, state, embed, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DigitalWalletTokenListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDigitalwallettokensCardCardtoken
     * @param cardToken Card token (required)
     * @param count Number of items to retrieve (optional, default to 5)
     * @param startIndex Start index (optional, default to 0)
     * @param sortBy Sort order (optional, default to -createdTime)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDigitalwallettokensCardCardtokenCall(String cardToken, Integer count, Integer startIndex, String sortBy, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/digitalwallettokens/card/{card_token}"
            .replaceAll("\\{" + "card_token" + "\\}", apiClient.escapeString(cardToken.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (count != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("count", count));
        if (startIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start_index", startIndex));
        if (sortBy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sort_by", sortBy));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDigitalwallettokensCardCardtokenValidateBeforeCall(String cardToken, Integer count, Integer startIndex, String sortBy, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'cardToken' is set
        if (cardToken == null) {
            throw new ApiException("Missing the required parameter 'cardToken' when calling getDigitalwallettokensCardCardtoken(Async)");
        }
        

        com.squareup.okhttp.Call call = getDigitalwallettokensCardCardtokenCall(cardToken, count, startIndex, sortBy, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Returns a list of digital wallet tokens for the specified card
     * 
     * @param cardToken Card token (required)
     * @param count Number of items to retrieve (optional, default to 5)
     * @param startIndex Start index (optional, default to 0)
     * @param sortBy Sort order (optional, default to -createdTime)
     * @return DigitalWalletTokenListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DigitalWalletTokenListResponse getDigitalwallettokensCardCardtoken(String cardToken, Integer count, Integer startIndex, String sortBy) throws ApiException {
        ApiResponse<DigitalWalletTokenListResponse> resp = getDigitalwallettokensCardCardtokenWithHttpInfo(cardToken, count, startIndex, sortBy);
        return resp.getData();
    }

    /**
     * Returns a list of digital wallet tokens for the specified card
     * 
     * @param cardToken Card token (required)
     * @param count Number of items to retrieve (optional, default to 5)
     * @param startIndex Start index (optional, default to 0)
     * @param sortBy Sort order (optional, default to -createdTime)
     * @return ApiResponse&lt;DigitalWalletTokenListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DigitalWalletTokenListResponse> getDigitalwallettokensCardCardtokenWithHttpInfo(String cardToken, Integer count, Integer startIndex, String sortBy) throws ApiException {
        com.squareup.okhttp.Call call = getDigitalwallettokensCardCardtokenValidateBeforeCall(cardToken, count, startIndex, sortBy, null, null);
        Type localVarReturnType = new TypeToken<DigitalWalletTokenListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns a list of digital wallet tokens for the specified card (asynchronously)
     * 
     * @param cardToken Card token (required)
     * @param count Number of items to retrieve (optional, default to 5)
     * @param startIndex Start index (optional, default to 0)
     * @param sortBy Sort order (optional, default to -createdTime)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDigitalwallettokensCardCardtokenAsync(String cardToken, Integer count, Integer startIndex, String sortBy, final ApiCallback<DigitalWalletTokenListResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getDigitalwallettokensCardCardtokenValidateBeforeCall(cardToken, count, startIndex, sortBy, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DigitalWalletTokenListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDigitalwallettokensToken
     * @param token Digital wallet token (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDigitalwallettokensTokenCall(String token, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/digitalwallettokens/{token}"
            .replaceAll("\\{" + "token" + "\\}", apiClient.escapeString(token.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDigitalwallettokensTokenValidateBeforeCall(String token, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new ApiException("Missing the required parameter 'token' when calling getDigitalwallettokensToken(Async)");
        }
        

        com.squareup.okhttp.Call call = getDigitalwallettokensTokenCall(token, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Returns a specific digital wallet token
     * 
     * @param token Digital wallet token (required)
     * @return DigitalWalletToken
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DigitalWalletToken getDigitalwallettokensToken(String token) throws ApiException {
        ApiResponse<DigitalWalletToken> resp = getDigitalwallettokensTokenWithHttpInfo(token);
        return resp.getData();
    }

    /**
     * Returns a specific digital wallet token
     * 
     * @param token Digital wallet token (required)
     * @return ApiResponse&lt;DigitalWalletToken&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DigitalWalletToken> getDigitalwallettokensTokenWithHttpInfo(String token) throws ApiException {
        com.squareup.okhttp.Call call = getDigitalwallettokensTokenValidateBeforeCall(token, null, null);
        Type localVarReturnType = new TypeToken<DigitalWalletToken>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns a specific digital wallet token (asynchronously)
     * 
     * @param token Digital wallet token (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDigitalwallettokensTokenAsync(String token, final ApiCallback<DigitalWalletToken> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getDigitalwallettokensTokenValidateBeforeCall(token, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DigitalWalletToken>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDigitalwallettokensTokenShowtokenpan
     * @param token Digital wallet token (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDigitalwallettokensTokenShowtokenpanCall(String token, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/digitalwallettokens/{token}/showtokenpan"
            .replaceAll("\\{" + "token" + "\\}", apiClient.escapeString(token.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDigitalwallettokensTokenShowtokenpanValidateBeforeCall(String token, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new ApiException("Missing the required parameter 'token' when calling getDigitalwallettokensTokenShowtokenpan(Async)");
        }
        

        com.squareup.okhttp.Call call = getDigitalwallettokensTokenShowtokenpanCall(token, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Returns a specific digital wallet token PAN visible
     * 
     * @param token Digital wallet token (required)
     * @return DigitalWalletToken
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DigitalWalletToken getDigitalwallettokensTokenShowtokenpan(String token) throws ApiException {
        ApiResponse<DigitalWalletToken> resp = getDigitalwallettokensTokenShowtokenpanWithHttpInfo(token);
        return resp.getData();
    }

    /**
     * Returns a specific digital wallet token PAN visible
     * 
     * @param token Digital wallet token (required)
     * @return ApiResponse&lt;DigitalWalletToken&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DigitalWalletToken> getDigitalwallettokensTokenShowtokenpanWithHttpInfo(String token) throws ApiException {
        com.squareup.okhttp.Call call = getDigitalwallettokensTokenShowtokenpanValidateBeforeCall(token, null, null);
        Type localVarReturnType = new TypeToken<DigitalWalletToken>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns a specific digital wallet token PAN visible (asynchronously)
     * 
     * @param token Digital wallet token (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDigitalwallettokensTokenShowtokenpanAsync(String token, final ApiCallback<DigitalWalletToken> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getDigitalwallettokensTokenShowtokenpanValidateBeforeCall(token, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DigitalWalletToken>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
