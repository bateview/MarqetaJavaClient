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


import io.swagger.client.model.PeerTransferRequest;
import io.swagger.client.model.PeerTransferResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PeerTransfersApi {
    private ApiClient apiClient;

    public PeerTransfersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PeerTransfersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getPeertransfersToken
     * @param token  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPeertransfersTokenCall(String token, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/peertransfers/{token}"
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
    private com.squareup.okhttp.Call getPeertransfersTokenValidateBeforeCall(String token, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new ApiException("Missing the required parameter 'token' when calling getPeertransfersToken(Async)");
        }
        

        com.squareup.okhttp.Call call = getPeertransfersTokenCall(token, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Returns details of a previous transfer
     * 
     * @param token  (required)
     * @return PeerTransferResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PeerTransferResponse getPeertransfersToken(String token) throws ApiException {
        ApiResponse<PeerTransferResponse> resp = getPeertransfersTokenWithHttpInfo(token);
        return resp.getData();
    }

    /**
     * Returns details of a previous transfer
     * 
     * @param token  (required)
     * @return ApiResponse&lt;PeerTransferResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PeerTransferResponse> getPeertransfersTokenWithHttpInfo(String token) throws ApiException {
        com.squareup.okhttp.Call call = getPeertransfersTokenValidateBeforeCall(token, null, null);
        Type localVarReturnType = new TypeToken<PeerTransferResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns details of a previous transfer (asynchronously)
     * 
     * @param token  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPeertransfersTokenAsync(String token, final ApiCallback<PeerTransferResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getPeertransfersTokenValidateBeforeCall(token, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PeerTransferResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getPeertransfersUserUserorbusinesstoken
     * @param userOrBusinessToken User or business token (required)
     * @param count Number of transfers to retrieve (optional, default to 25)
     * @param startIndex Start index (optional, default to 0)
     * @param fields Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPeertransfersUserUserorbusinesstokenCall(String userOrBusinessToken, Integer count, Integer startIndex, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/peertransfers/user/{user_or_business_token}"
            .replaceAll("\\{" + "user_or_business_token" + "\\}", apiClient.escapeString(userOrBusinessToken.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (count != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("count", count));
        if (startIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start_index", startIndex));
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fields", fields));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
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
    private com.squareup.okhttp.Call getPeertransfersUserUserorbusinesstokenValidateBeforeCall(String userOrBusinessToken, Integer count, Integer startIndex, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'userOrBusinessToken' is set
        if (userOrBusinessToken == null) {
            throw new ApiException("Missing the required parameter 'userOrBusinessToken' when calling getPeertransfersUserUserorbusinesstoken(Async)");
        }
        

        com.squareup.okhttp.Call call = getPeertransfersUserUserorbusinesstokenCall(userOrBusinessToken, count, startIndex, fields, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Returns all peer transfers for a user
     * 
     * @param userOrBusinessToken User or business token (required)
     * @param count Number of transfers to retrieve (optional, default to 25)
     * @param startIndex Start index (optional, default to 0)
     * @param fields Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. (optional)
     * @return PeerTransferResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PeerTransferResponse getPeertransfersUserUserorbusinesstoken(String userOrBusinessToken, Integer count, Integer startIndex, String fields) throws ApiException {
        ApiResponse<PeerTransferResponse> resp = getPeertransfersUserUserorbusinesstokenWithHttpInfo(userOrBusinessToken, count, startIndex, fields);
        return resp.getData();
    }

    /**
     * Returns all peer transfers for a user
     * 
     * @param userOrBusinessToken User or business token (required)
     * @param count Number of transfers to retrieve (optional, default to 25)
     * @param startIndex Start index (optional, default to 0)
     * @param fields Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. (optional)
     * @return ApiResponse&lt;PeerTransferResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PeerTransferResponse> getPeertransfersUserUserorbusinesstokenWithHttpInfo(String userOrBusinessToken, Integer count, Integer startIndex, String fields) throws ApiException {
        com.squareup.okhttp.Call call = getPeertransfersUserUserorbusinesstokenValidateBeforeCall(userOrBusinessToken, count, startIndex, fields, null, null);
        Type localVarReturnType = new TypeToken<PeerTransferResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns all peer transfers for a user (asynchronously)
     * 
     * @param userOrBusinessToken User or business token (required)
     * @param count Number of transfers to retrieve (optional, default to 25)
     * @param startIndex Start index (optional, default to 0)
     * @param fields Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPeertransfersUserUserorbusinesstokenAsync(String userOrBusinessToken, Integer count, Integer startIndex, String fields, final ApiCallback<PeerTransferResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getPeertransfersUserUserorbusinesstokenValidateBeforeCall(userOrBusinessToken, count, startIndex, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PeerTransferResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getPeertransfersUserUserorbusinesstokenRecipient
     * @param userOrBusinessToken User or business token (required)
     * @param count Number of transfers to retrieve (optional, default to 25)
     * @param startIndex Start index (optional, default to 0)
     * @param fields Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPeertransfersUserUserorbusinesstokenRecipientCall(String userOrBusinessToken, Integer count, Integer startIndex, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/peertransfers/user/{user_or_business_token}/recipient"
            .replaceAll("\\{" + "user_or_business_token" + "\\}", apiClient.escapeString(userOrBusinessToken.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (count != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("count", count));
        if (startIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start_index", startIndex));
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fields", fields));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
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
    private com.squareup.okhttp.Call getPeertransfersUserUserorbusinesstokenRecipientValidateBeforeCall(String userOrBusinessToken, Integer count, Integer startIndex, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'userOrBusinessToken' is set
        if (userOrBusinessToken == null) {
            throw new ApiException("Missing the required parameter 'userOrBusinessToken' when calling getPeertransfersUserUserorbusinesstokenRecipient(Async)");
        }
        

        com.squareup.okhttp.Call call = getPeertransfersUserUserorbusinesstokenRecipientCall(userOrBusinessToken, count, startIndex, fields, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Returns received peer transfers for a user
     * 
     * @param userOrBusinessToken User or business token (required)
     * @param count Number of transfers to retrieve (optional, default to 25)
     * @param startIndex Start index (optional, default to 0)
     * @param fields Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. (optional)
     * @return PeerTransferResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PeerTransferResponse getPeertransfersUserUserorbusinesstokenRecipient(String userOrBusinessToken, Integer count, Integer startIndex, String fields) throws ApiException {
        ApiResponse<PeerTransferResponse> resp = getPeertransfersUserUserorbusinesstokenRecipientWithHttpInfo(userOrBusinessToken, count, startIndex, fields);
        return resp.getData();
    }

    /**
     * Returns received peer transfers for a user
     * 
     * @param userOrBusinessToken User or business token (required)
     * @param count Number of transfers to retrieve (optional, default to 25)
     * @param startIndex Start index (optional, default to 0)
     * @param fields Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. (optional)
     * @return ApiResponse&lt;PeerTransferResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PeerTransferResponse> getPeertransfersUserUserorbusinesstokenRecipientWithHttpInfo(String userOrBusinessToken, Integer count, Integer startIndex, String fields) throws ApiException {
        com.squareup.okhttp.Call call = getPeertransfersUserUserorbusinesstokenRecipientValidateBeforeCall(userOrBusinessToken, count, startIndex, fields, null, null);
        Type localVarReturnType = new TypeToken<PeerTransferResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns received peer transfers for a user (asynchronously)
     * 
     * @param userOrBusinessToken User or business token (required)
     * @param count Number of transfers to retrieve (optional, default to 25)
     * @param startIndex Start index (optional, default to 0)
     * @param fields Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPeertransfersUserUserorbusinesstokenRecipientAsync(String userOrBusinessToken, Integer count, Integer startIndex, String fields, final ApiCallback<PeerTransferResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getPeertransfersUserUserorbusinesstokenRecipientValidateBeforeCall(userOrBusinessToken, count, startIndex, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PeerTransferResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getPeertransfersUserUserorbusinesstokenSender
     * @param userOrBusinessToken User or business token (required)
     * @param count Number of transfers to retrieve (optional, default to 25)
     * @param startIndex Start index (optional, default to 0)
     * @param fields Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPeertransfersUserUserorbusinesstokenSenderCall(String userOrBusinessToken, Integer count, Integer startIndex, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/peertransfers/user/{user_or_business_token}/sender"
            .replaceAll("\\{" + "user_or_business_token" + "\\}", apiClient.escapeString(userOrBusinessToken.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (count != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("count", count));
        if (startIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start_index", startIndex));
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fields", fields));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
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
    private com.squareup.okhttp.Call getPeertransfersUserUserorbusinesstokenSenderValidateBeforeCall(String userOrBusinessToken, Integer count, Integer startIndex, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'userOrBusinessToken' is set
        if (userOrBusinessToken == null) {
            throw new ApiException("Missing the required parameter 'userOrBusinessToken' when calling getPeertransfersUserUserorbusinesstokenSender(Async)");
        }
        

        com.squareup.okhttp.Call call = getPeertransfersUserUserorbusinesstokenSenderCall(userOrBusinessToken, count, startIndex, fields, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Returns sent peer transfers for a user
     * 
     * @param userOrBusinessToken User or business token (required)
     * @param count Number of transfers to retrieve (optional, default to 25)
     * @param startIndex Start index (optional, default to 0)
     * @param fields Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. (optional)
     * @return PeerTransferResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PeerTransferResponse getPeertransfersUserUserorbusinesstokenSender(String userOrBusinessToken, Integer count, Integer startIndex, String fields) throws ApiException {
        ApiResponse<PeerTransferResponse> resp = getPeertransfersUserUserorbusinesstokenSenderWithHttpInfo(userOrBusinessToken, count, startIndex, fields);
        return resp.getData();
    }

    /**
     * Returns sent peer transfers for a user
     * 
     * @param userOrBusinessToken User or business token (required)
     * @param count Number of transfers to retrieve (optional, default to 25)
     * @param startIndex Start index (optional, default to 0)
     * @param fields Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. (optional)
     * @return ApiResponse&lt;PeerTransferResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PeerTransferResponse> getPeertransfersUserUserorbusinesstokenSenderWithHttpInfo(String userOrBusinessToken, Integer count, Integer startIndex, String fields) throws ApiException {
        com.squareup.okhttp.Call call = getPeertransfersUserUserorbusinesstokenSenderValidateBeforeCall(userOrBusinessToken, count, startIndex, fields, null, null);
        Type localVarReturnType = new TypeToken<PeerTransferResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns sent peer transfers for a user (asynchronously)
     * 
     * @param userOrBusinessToken User or business token (required)
     * @param count Number of transfers to retrieve (optional, default to 25)
     * @param startIndex Start index (optional, default to 0)
     * @param fields Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPeertransfersUserUserorbusinesstokenSenderAsync(String userOrBusinessToken, Integer count, Integer startIndex, String fields, final ApiCallback<PeerTransferResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getPeertransfersUserUserorbusinesstokenSenderValidateBeforeCall(userOrBusinessToken, count, startIndex, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PeerTransferResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postPeertransfers
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postPeertransfersCall(PeerTransferRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/peertransfers";

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postPeertransfersValidateBeforeCall(PeerTransferRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = postPeertransfersCall(body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Performs a peer transfer from one user to another
     * 
     * @param body  (optional)
     * @return PeerTransferResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PeerTransferResponse postPeertransfers(PeerTransferRequest body) throws ApiException {
        ApiResponse<PeerTransferResponse> resp = postPeertransfersWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Performs a peer transfer from one user to another
     * 
     * @param body  (optional)
     * @return ApiResponse&lt;PeerTransferResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PeerTransferResponse> postPeertransfersWithHttpInfo(PeerTransferRequest body) throws ApiException {
        com.squareup.okhttp.Call call = postPeertransfersValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<PeerTransferResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Performs a peer transfer from one user to another (asynchronously)
     * 
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postPeertransfersAsync(PeerTransferRequest body, final ApiCallback<PeerTransferResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postPeertransfersValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PeerTransferResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
