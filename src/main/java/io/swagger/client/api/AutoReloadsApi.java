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


import io.swagger.client.model.AutoReloadListResponse;
import io.swagger.client.model.AutoReloadModel;
import io.swagger.client.model.AutoReloadResponseModel;
import io.swagger.client.model.AutoReloadUpdateModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AutoReloadsApi {
    private ApiClient apiClient;

    public AutoReloadsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AutoReloadsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getAutoreloads
     * @param cardProduct Card product token (optional)
     * @param userToken User token (optional)
     * @param businessToken Business token (optional)
     * @param count Number of items to retrieve. Count can be between 1 - 10 items. (optional, default to 10)
     * @param startIndex Indicates from what row to start returning data. (optional, default to 0)
     * @param fields Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. (optional)
     * @param sortBy Field by which to sort the returned items. Use any field in the model, or system fields lastModifiedTime or createdTime. (optional, default to -lastModifiedTime)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAutoreloadsCall(String cardProduct, String userToken, String businessToken, Integer count, Integer startIndex, String fields, String sortBy, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/autoreloads";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (cardProduct != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("card_product", cardProduct));
        if (userToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("user_token", userToken));
        if (businessToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("business_token", businessToken));
        if (count != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("count", count));
        if (startIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start_index", startIndex));
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fields", fields));
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
    private com.squareup.okhttp.Call getAutoreloadsValidateBeforeCall(String cardProduct, String userToken, String businessToken, Integer count, Integer startIndex, String fields, String sortBy, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getAutoreloadsCall(cardProduct, userToken, businessToken, count, startIndex, fields, sortBy, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Lists all auto reloads for the program
     * 
     * @param cardProduct Card product token (optional)
     * @param userToken User token (optional)
     * @param businessToken Business token (optional)
     * @param count Number of items to retrieve. Count can be between 1 - 10 items. (optional, default to 10)
     * @param startIndex Indicates from what row to start returning data. (optional, default to 0)
     * @param fields Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. (optional)
     * @param sortBy Field by which to sort the returned items. Use any field in the model, or system fields lastModifiedTime or createdTime. (optional, default to -lastModifiedTime)
     * @return AutoReloadListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AutoReloadListResponse getAutoreloads(String cardProduct, String userToken, String businessToken, Integer count, Integer startIndex, String fields, String sortBy) throws ApiException {
        ApiResponse<AutoReloadListResponse> resp = getAutoreloadsWithHttpInfo(cardProduct, userToken, businessToken, count, startIndex, fields, sortBy);
        return resp.getData();
    }

    /**
     * Lists all auto reloads for the program
     * 
     * @param cardProduct Card product token (optional)
     * @param userToken User token (optional)
     * @param businessToken Business token (optional)
     * @param count Number of items to retrieve. Count can be between 1 - 10 items. (optional, default to 10)
     * @param startIndex Indicates from what row to start returning data. (optional, default to 0)
     * @param fields Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. (optional)
     * @param sortBy Field by which to sort the returned items. Use any field in the model, or system fields lastModifiedTime or createdTime. (optional, default to -lastModifiedTime)
     * @return ApiResponse&lt;AutoReloadListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AutoReloadListResponse> getAutoreloadsWithHttpInfo(String cardProduct, String userToken, String businessToken, Integer count, Integer startIndex, String fields, String sortBy) throws ApiException {
        com.squareup.okhttp.Call call = getAutoreloadsValidateBeforeCall(cardProduct, userToken, businessToken, count, startIndex, fields, sortBy, null, null);
        Type localVarReturnType = new TypeToken<AutoReloadListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Lists all auto reloads for the program (asynchronously)
     * 
     * @param cardProduct Card product token (optional)
     * @param userToken User token (optional)
     * @param businessToken Business token (optional)
     * @param count Number of items to retrieve. Count can be between 1 - 10 items. (optional, default to 10)
     * @param startIndex Indicates from what row to start returning data. (optional, default to 0)
     * @param fields Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. (optional)
     * @param sortBy Field by which to sort the returned items. Use any field in the model, or system fields lastModifiedTime or createdTime. (optional, default to -lastModifiedTime)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAutoreloadsAsync(String cardProduct, String userToken, String businessToken, Integer count, Integer startIndex, String fields, String sortBy, final ApiCallback<AutoReloadListResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAutoreloadsValidateBeforeCall(cardProduct, userToken, businessToken, count, startIndex, fields, sortBy, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AutoReloadListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getAutoreloadsToken
     * @param token Auto reload token (required)
     * @param fields Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAutoreloadsTokenCall(String token, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/autoreloads/{token}"
            .replaceAll("\\{" + "token" + "\\}", apiClient.escapeString(token.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
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
    private com.squareup.okhttp.Call getAutoreloadsTokenValidateBeforeCall(String token, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new ApiException("Missing the required parameter 'token' when calling getAutoreloadsToken(Async)");
        }
        

        com.squareup.okhttp.Call call = getAutoreloadsTokenCall(token, fields, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Returns a specific auto reload object
     * 
     * @param token Auto reload token (required)
     * @param fields Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. (optional)
     * @return AutoReloadResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AutoReloadResponseModel getAutoreloadsToken(String token, String fields) throws ApiException {
        ApiResponse<AutoReloadResponseModel> resp = getAutoreloadsTokenWithHttpInfo(token, fields);
        return resp.getData();
    }

    /**
     * Returns a specific auto reload object
     * 
     * @param token Auto reload token (required)
     * @param fields Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. (optional)
     * @return ApiResponse&lt;AutoReloadResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AutoReloadResponseModel> getAutoreloadsTokenWithHttpInfo(String token, String fields) throws ApiException {
        com.squareup.okhttp.Call call = getAutoreloadsTokenValidateBeforeCall(token, fields, null, null);
        Type localVarReturnType = new TypeToken<AutoReloadResponseModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns a specific auto reload object (asynchronously)
     * 
     * @param token Auto reload token (required)
     * @param fields Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAutoreloadsTokenAsync(String token, String fields, final ApiCallback<AutoReloadResponseModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAutoreloadsTokenValidateBeforeCall(token, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AutoReloadResponseModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postAutoreloads
     * @param body Auto reload object (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postAutoreloadsCall(AutoReloadModel body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/autoreloads";

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
    private com.squareup.okhttp.Call postAutoreloadsValidateBeforeCall(AutoReloadModel body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postAutoreloads(Async)");
        }
        

        com.squareup.okhttp.Call call = postAutoreloadsCall(body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Creates an auto reload object
     * 
     * @param body Auto reload object (required)
     * @return AutoReloadResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AutoReloadResponseModel postAutoreloads(AutoReloadModel body) throws ApiException {
        ApiResponse<AutoReloadResponseModel> resp = postAutoreloadsWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Creates an auto reload object
     * 
     * @param body Auto reload object (required)
     * @return ApiResponse&lt;AutoReloadResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AutoReloadResponseModel> postAutoreloadsWithHttpInfo(AutoReloadModel body) throws ApiException {
        com.squareup.okhttp.Call call = postAutoreloadsValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<AutoReloadResponseModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates an auto reload object (asynchronously)
     * 
     * @param body Auto reload object (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postAutoreloadsAsync(AutoReloadModel body, final ApiCallback<AutoReloadResponseModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postAutoreloadsValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AutoReloadResponseModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putAutoreloadsToken
     * @param body Auto reload object (required)
     * @param token  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putAutoreloadsTokenCall(AutoReloadUpdateModel body, String token, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/autoreloads/{token}"
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
    private com.squareup.okhttp.Call putAutoreloadsTokenValidateBeforeCall(AutoReloadUpdateModel body, String token, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling putAutoreloadsToken(Async)");
        }
        
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new ApiException("Missing the required parameter 'token' when calling putAutoreloadsToken(Async)");
        }
        

        com.squareup.okhttp.Call call = putAutoreloadsTokenCall(body, token, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Updates a specific auto reload object
     * 
     * @param body Auto reload object (required)
     * @param token  (required)
     * @return AutoReloadResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AutoReloadResponseModel putAutoreloadsToken(AutoReloadUpdateModel body, String token) throws ApiException {
        ApiResponse<AutoReloadResponseModel> resp = putAutoreloadsTokenWithHttpInfo(body, token);
        return resp.getData();
    }

    /**
     * Updates a specific auto reload object
     * 
     * @param body Auto reload object (required)
     * @param token  (required)
     * @return ApiResponse&lt;AutoReloadResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AutoReloadResponseModel> putAutoreloadsTokenWithHttpInfo(AutoReloadUpdateModel body, String token) throws ApiException {
        com.squareup.okhttp.Call call = putAutoreloadsTokenValidateBeforeCall(body, token, null, null);
        Type localVarReturnType = new TypeToken<AutoReloadResponseModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Updates a specific auto reload object (asynchronously)
     * 
     * @param body Auto reload object (required)
     * @param token  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putAutoreloadsTokenAsync(AutoReloadUpdateModel body, String token, final ApiCallback<AutoReloadResponseModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = putAutoreloadsTokenValidateBeforeCall(body, token, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AutoReloadResponseModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
