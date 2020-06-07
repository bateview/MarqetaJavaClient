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


import io.swagger.client.model.AccountHolderGroupListResponse;
import io.swagger.client.model.AccountHolderGroupRequest;
import io.swagger.client.model.AccountHolderGroupResponse;
import io.swagger.client.model.AccountHolderGroupUpdateRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountHolderGroupsApi {
    private ApiClient apiClient;

    public AccountHolderGroupsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AccountHolderGroupsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getAccountholdergroups
     * @param count Number of items to retrieve. Count can be between 1 - 10 items. (optional, default to 10)
     * @param startIndex Indicates from what row to start returning data. (optional, default to 0)
     * @param sortBy Field by which to sort the returned items. Use any field in the model, or system fields lastModifiedTime or createdTime. (optional, default to -lastModifiedTime)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAccountholdergroupsCall(Integer count, Integer startIndex, String sortBy, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/accountholdergroups";

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
    private com.squareup.okhttp.Call getAccountholdergroupsValidateBeforeCall(Integer count, Integer startIndex, String sortBy, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getAccountholdergroupsCall(count, startIndex, sortBy, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Lists account holder groups
     * 
     * @param count Number of items to retrieve. Count can be between 1 - 10 items. (optional, default to 10)
     * @param startIndex Indicates from what row to start returning data. (optional, default to 0)
     * @param sortBy Field by which to sort the returned items. Use any field in the model, or system fields lastModifiedTime or createdTime. (optional, default to -lastModifiedTime)
     * @return AccountHolderGroupListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AccountHolderGroupListResponse getAccountholdergroups(Integer count, Integer startIndex, String sortBy) throws ApiException {
        ApiResponse<AccountHolderGroupListResponse> resp = getAccountholdergroupsWithHttpInfo(count, startIndex, sortBy);
        return resp.getData();
    }

    /**
     * Lists account holder groups
     * 
     * @param count Number of items to retrieve. Count can be between 1 - 10 items. (optional, default to 10)
     * @param startIndex Indicates from what row to start returning data. (optional, default to 0)
     * @param sortBy Field by which to sort the returned items. Use any field in the model, or system fields lastModifiedTime or createdTime. (optional, default to -lastModifiedTime)
     * @return ApiResponse&lt;AccountHolderGroupListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AccountHolderGroupListResponse> getAccountholdergroupsWithHttpInfo(Integer count, Integer startIndex, String sortBy) throws ApiException {
        com.squareup.okhttp.Call call = getAccountholdergroupsValidateBeforeCall(count, startIndex, sortBy, null, null);
        Type localVarReturnType = new TypeToken<AccountHolderGroupListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Lists account holder groups (asynchronously)
     * 
     * @param count Number of items to retrieve. Count can be between 1 - 10 items. (optional, default to 10)
     * @param startIndex Indicates from what row to start returning data. (optional, default to 0)
     * @param sortBy Field by which to sort the returned items. Use any field in the model, or system fields lastModifiedTime or createdTime. (optional, default to -lastModifiedTime)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAccountholdergroupsAsync(Integer count, Integer startIndex, String sortBy, final ApiCallback<AccountHolderGroupListResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAccountholdergroupsValidateBeforeCall(count, startIndex, sortBy, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AccountHolderGroupListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getAccountholdergroupsToken
     * @param token Account holder group token (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAccountholdergroupsTokenCall(String token, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/accountholdergroups/{token}"
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
    private com.squareup.okhttp.Call getAccountholdergroupsTokenValidateBeforeCall(String token, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new ApiException("Missing the required parameter 'token' when calling getAccountholdergroupsToken(Async)");
        }
        

        com.squareup.okhttp.Call call = getAccountholdergroupsTokenCall(token, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Returns a specific account holder group object
     * 
     * @param token Account holder group token (required)
     * @return AccountHolderGroupResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AccountHolderGroupResponse getAccountholdergroupsToken(String token) throws ApiException {
        ApiResponse<AccountHolderGroupResponse> resp = getAccountholdergroupsTokenWithHttpInfo(token);
        return resp.getData();
    }

    /**
     * Returns a specific account holder group object
     * 
     * @param token Account holder group token (required)
     * @return ApiResponse&lt;AccountHolderGroupResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AccountHolderGroupResponse> getAccountholdergroupsTokenWithHttpInfo(String token) throws ApiException {
        com.squareup.okhttp.Call call = getAccountholdergroupsTokenValidateBeforeCall(token, null, null);
        Type localVarReturnType = new TypeToken<AccountHolderGroupResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns a specific account holder group object (asynchronously)
     * 
     * @param token Account holder group token (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAccountholdergroupsTokenAsync(String token, final ApiCallback<AccountHolderGroupResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAccountholdergroupsTokenValidateBeforeCall(token, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AccountHolderGroupResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postAccountholdergroups
     * @param body Account holder group object (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postAccountholdergroupsCall(AccountHolderGroupRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/accountholdergroups";

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
    private com.squareup.okhttp.Call postAccountholdergroupsValidateBeforeCall(AccountHolderGroupRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postAccountholdergroups(Async)");
        }
        

        com.squareup.okhttp.Call call = postAccountholdergroupsCall(body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Creates an account holder group object
     * 
     * @param body Account holder group object (required)
     * @return AccountHolderGroupResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AccountHolderGroupResponse postAccountholdergroups(AccountHolderGroupRequest body) throws ApiException {
        ApiResponse<AccountHolderGroupResponse> resp = postAccountholdergroupsWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Creates an account holder group object
     * 
     * @param body Account holder group object (required)
     * @return ApiResponse&lt;AccountHolderGroupResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AccountHolderGroupResponse> postAccountholdergroupsWithHttpInfo(AccountHolderGroupRequest body) throws ApiException {
        com.squareup.okhttp.Call call = postAccountholdergroupsValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<AccountHolderGroupResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates an account holder group object (asynchronously)
     * 
     * @param body Account holder group object (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postAccountholdergroupsAsync(AccountHolderGroupRequest body, final ApiCallback<AccountHolderGroupResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postAccountholdergroupsValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AccountHolderGroupResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putAccountholdergroupsToken
     * @param body Account holder group update object (required)
     * @param token  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putAccountholdergroupsTokenCall(AccountHolderGroupUpdateRequest body, String token, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/accountholdergroups/{token}"
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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putAccountholdergroupsTokenValidateBeforeCall(AccountHolderGroupUpdateRequest body, String token, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling putAccountholdergroupsToken(Async)");
        }
        
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new ApiException("Missing the required parameter 'token' when calling putAccountholdergroupsToken(Async)");
        }
        

        com.squareup.okhttp.Call call = putAccountholdergroupsTokenCall(body, token, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Updates an account holder group object
     * 
     * @param body Account holder group update object (required)
     * @param token  (required)
     * @return AccountHolderGroupResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AccountHolderGroupResponse putAccountholdergroupsToken(AccountHolderGroupUpdateRequest body, String token) throws ApiException {
        ApiResponse<AccountHolderGroupResponse> resp = putAccountholdergroupsTokenWithHttpInfo(body, token);
        return resp.getData();
    }

    /**
     * Updates an account holder group object
     * 
     * @param body Account holder group update object (required)
     * @param token  (required)
     * @return ApiResponse&lt;AccountHolderGroupResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AccountHolderGroupResponse> putAccountholdergroupsTokenWithHttpInfo(AccountHolderGroupUpdateRequest body, String token) throws ApiException {
        com.squareup.okhttp.Call call = putAccountholdergroupsTokenValidateBeforeCall(body, token, null, null);
        Type localVarReturnType = new TypeToken<AccountHolderGroupResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Updates an account holder group object (asynchronously)
     * 
     * @param body Account holder group update object (required)
     * @param token  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putAccountholdergroupsTokenAsync(AccountHolderGroupUpdateRequest body, String token, final ApiCallback<AccountHolderGroupResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = putAccountholdergroupsTokenValidateBeforeCall(body, token, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AccountHolderGroupResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
