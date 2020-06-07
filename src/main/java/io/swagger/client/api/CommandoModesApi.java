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


import io.swagger.client.model.CommandoModeListResponse;
import io.swagger.client.model.CommandoModeResponse;
import io.swagger.client.model.CommandoModeTransitionListResponse;
import io.swagger.client.model.CommandoModeTransitionResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommandoModesApi {
    private ApiClient apiClient;

    public CommandoModesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CommandoModesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getCommandomodes
     * @param count Number of commando modes to retrieve (optional, default to 5)
     * @param startIndex Start index (optional, default to 0)
     * @param sortBy Sort order (optional, default to -lastModifiedTime)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCommandomodesCall(Integer count, Integer startIndex, String sortBy, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/commandomodes";

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
    private com.squareup.okhttp.Call getCommandomodesValidateBeforeCall(Integer count, Integer startIndex, String sortBy, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getCommandomodesCall(count, startIndex, sortBy, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Lists all commando mode control sets
     * 
     * @param count Number of commando modes to retrieve (optional, default to 5)
     * @param startIndex Start index (optional, default to 0)
     * @param sortBy Sort order (optional, default to -lastModifiedTime)
     * @return CommandoModeListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CommandoModeListResponse getCommandomodes(Integer count, Integer startIndex, String sortBy) throws ApiException {
        ApiResponse<CommandoModeListResponse> resp = getCommandomodesWithHttpInfo(count, startIndex, sortBy);
        return resp.getData();
    }

    /**
     * Lists all commando mode control sets
     * 
     * @param count Number of commando modes to retrieve (optional, default to 5)
     * @param startIndex Start index (optional, default to 0)
     * @param sortBy Sort order (optional, default to -lastModifiedTime)
     * @return ApiResponse&lt;CommandoModeListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CommandoModeListResponse> getCommandomodesWithHttpInfo(Integer count, Integer startIndex, String sortBy) throws ApiException {
        com.squareup.okhttp.Call call = getCommandomodesValidateBeforeCall(count, startIndex, sortBy, null, null);
        Type localVarReturnType = new TypeToken<CommandoModeListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Lists all commando mode control sets (asynchronously)
     * 
     * @param count Number of commando modes to retrieve (optional, default to 5)
     * @param startIndex Start index (optional, default to 0)
     * @param sortBy Sort order (optional, default to -lastModifiedTime)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCommandomodesAsync(Integer count, Integer startIndex, String sortBy, final ApiCallback<CommandoModeListResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCommandomodesValidateBeforeCall(count, startIndex, sortBy, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CommandoModeListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCommandomodesCommandomodetokenTransitions
     * @param commandomodeToken Commando mode token (required)
     * @param count Number of transitions to retrieve (optional, default to 5)
     * @param startIndex Start index (optional, default to 0)
     * @param sortBy Sort order (optional, default to -createdTime)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCommandomodesCommandomodetokenTransitionsCall(String commandomodeToken, Integer count, Integer startIndex, String sortBy, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/commandomodes/{commandomode_token}/transitions"
            .replaceAll("\\{" + "commandomode_token" + "\\}", apiClient.escapeString(commandomodeToken.toString()));

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
    private com.squareup.okhttp.Call getCommandomodesCommandomodetokenTransitionsValidateBeforeCall(String commandomodeToken, Integer count, Integer startIndex, String sortBy, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'commandomodeToken' is set
        if (commandomodeToken == null) {
            throw new ApiException("Missing the required parameter 'commandomodeToken' when calling getCommandomodesCommandomodetokenTransitions(Async)");
        }
        

        com.squareup.okhttp.Call call = getCommandomodesCommandomodetokenTransitionsCall(commandomodeToken, count, startIndex, sortBy, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Lists all commando mode transitions related to a commando mode control set
     * 
     * @param commandomodeToken Commando mode token (required)
     * @param count Number of transitions to retrieve (optional, default to 5)
     * @param startIndex Start index (optional, default to 0)
     * @param sortBy Sort order (optional, default to -createdTime)
     * @return CommandoModeTransitionListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CommandoModeTransitionListResponse getCommandomodesCommandomodetokenTransitions(String commandomodeToken, Integer count, Integer startIndex, String sortBy) throws ApiException {
        ApiResponse<CommandoModeTransitionListResponse> resp = getCommandomodesCommandomodetokenTransitionsWithHttpInfo(commandomodeToken, count, startIndex, sortBy);
        return resp.getData();
    }

    /**
     * Lists all commando mode transitions related to a commando mode control set
     * 
     * @param commandomodeToken Commando mode token (required)
     * @param count Number of transitions to retrieve (optional, default to 5)
     * @param startIndex Start index (optional, default to 0)
     * @param sortBy Sort order (optional, default to -createdTime)
     * @return ApiResponse&lt;CommandoModeTransitionListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CommandoModeTransitionListResponse> getCommandomodesCommandomodetokenTransitionsWithHttpInfo(String commandomodeToken, Integer count, Integer startIndex, String sortBy) throws ApiException {
        com.squareup.okhttp.Call call = getCommandomodesCommandomodetokenTransitionsValidateBeforeCall(commandomodeToken, count, startIndex, sortBy, null, null);
        Type localVarReturnType = new TypeToken<CommandoModeTransitionListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Lists all commando mode transitions related to a commando mode control set (asynchronously)
     * 
     * @param commandomodeToken Commando mode token (required)
     * @param count Number of transitions to retrieve (optional, default to 5)
     * @param startIndex Start index (optional, default to 0)
     * @param sortBy Sort order (optional, default to -createdTime)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCommandomodesCommandomodetokenTransitionsAsync(String commandomodeToken, Integer count, Integer startIndex, String sortBy, final ApiCallback<CommandoModeTransitionListResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCommandomodesCommandomodetokenTransitionsValidateBeforeCall(commandomodeToken, count, startIndex, sortBy, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CommandoModeTransitionListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCommandomodesToken
     * @param token  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCommandomodesTokenCall(String token, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/commandomodes/{token}"
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
    private com.squareup.okhttp.Call getCommandomodesTokenValidateBeforeCall(String token, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new ApiException("Missing the required parameter 'token' when calling getCommandomodesToken(Async)");
        }
        

        com.squareup.okhttp.Call call = getCommandomodesTokenCall(token, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Returns a specific commando mode control set
     * 
     * @param token  (required)
     * @return CommandoModeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CommandoModeResponse getCommandomodesToken(String token) throws ApiException {
        ApiResponse<CommandoModeResponse> resp = getCommandomodesTokenWithHttpInfo(token);
        return resp.getData();
    }

    /**
     * Returns a specific commando mode control set
     * 
     * @param token  (required)
     * @return ApiResponse&lt;CommandoModeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CommandoModeResponse> getCommandomodesTokenWithHttpInfo(String token) throws ApiException {
        com.squareup.okhttp.Call call = getCommandomodesTokenValidateBeforeCall(token, null, null);
        Type localVarReturnType = new TypeToken<CommandoModeResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns a specific commando mode control set (asynchronously)
     * 
     * @param token  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCommandomodesTokenAsync(String token, final ApiCallback<CommandoModeResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCommandomodesTokenValidateBeforeCall(token, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CommandoModeResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCommandomodesTransitionsToken
     * @param token Commando mode transition token (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCommandomodesTransitionsTokenCall(String token, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/commandomodes/transitions/{token}"
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
    private com.squareup.okhttp.Call getCommandomodesTransitionsTokenValidateBeforeCall(String token, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new ApiException("Missing the required parameter 'token' when calling getCommandomodesTransitionsToken(Async)");
        }
        

        com.squareup.okhttp.Call call = getCommandomodesTransitionsTokenCall(token, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Returns a specific commando mode transition
     * 
     * @param token Commando mode transition token (required)
     * @return CommandoModeTransitionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CommandoModeTransitionResponse getCommandomodesTransitionsToken(String token) throws ApiException {
        ApiResponse<CommandoModeTransitionResponse> resp = getCommandomodesTransitionsTokenWithHttpInfo(token);
        return resp.getData();
    }

    /**
     * Returns a specific commando mode transition
     * 
     * @param token Commando mode transition token (required)
     * @return ApiResponse&lt;CommandoModeTransitionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CommandoModeTransitionResponse> getCommandomodesTransitionsTokenWithHttpInfo(String token) throws ApiException {
        com.squareup.okhttp.Call call = getCommandomodesTransitionsTokenValidateBeforeCall(token, null, null);
        Type localVarReturnType = new TypeToken<CommandoModeTransitionResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns a specific commando mode transition (asynchronously)
     * 
     * @param token Commando mode transition token (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCommandomodesTransitionsTokenAsync(String token, final ApiCallback<CommandoModeTransitionResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCommandomodesTransitionsTokenValidateBeforeCall(token, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CommandoModeTransitionResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}