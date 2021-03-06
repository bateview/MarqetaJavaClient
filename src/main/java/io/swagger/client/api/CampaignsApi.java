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


import io.swagger.client.model.CampaignListResponse;
import io.swagger.client.model.CampaignModel;
import io.swagger.client.model.CampaignResponseModel;
import io.swagger.client.model.CampaignUpdateModel;
import io.swagger.client.model.StoreListResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CampaignsApi {
    private ApiClient apiClient;

    public CampaignsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CampaignsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getCampaigns
     * @param count Number of items to retrieve. Recommended max is 10. (optional, default to 5)
     * @param startIndex Indicates from what row to start returning data. Used in conjunction with count. (optional, default to 0)
     * @param fields Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. (optional)
     * @param sortBy Field on which to sort the returned items. Use any field in the model, or system fields lastModifiedTime or CreatedTime. (optional, default to -lastModifiedTime)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCampaignsCall(Integer count, Integer startIndex, String fields, String sortBy, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/campaigns";

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
    private com.squareup.okhttp.Call getCampaignsValidateBeforeCall(Integer count, Integer startIndex, String fields, String sortBy, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getCampaignsCall(count, startIndex, fields, sortBy, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Lists all campaigns
     * 
     * @param count Number of items to retrieve. Recommended max is 10. (optional, default to 5)
     * @param startIndex Indicates from what row to start returning data. Used in conjunction with count. (optional, default to 0)
     * @param fields Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. (optional)
     * @param sortBy Field on which to sort the returned items. Use any field in the model, or system fields lastModifiedTime or CreatedTime. (optional, default to -lastModifiedTime)
     * @return CampaignListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CampaignListResponse getCampaigns(Integer count, Integer startIndex, String fields, String sortBy) throws ApiException {
        ApiResponse<CampaignListResponse> resp = getCampaignsWithHttpInfo(count, startIndex, fields, sortBy);
        return resp.getData();
    }

    /**
     * Lists all campaigns
     * 
     * @param count Number of items to retrieve. Recommended max is 10. (optional, default to 5)
     * @param startIndex Indicates from what row to start returning data. Used in conjunction with count. (optional, default to 0)
     * @param fields Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. (optional)
     * @param sortBy Field on which to sort the returned items. Use any field in the model, or system fields lastModifiedTime or CreatedTime. (optional, default to -lastModifiedTime)
     * @return ApiResponse&lt;CampaignListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CampaignListResponse> getCampaignsWithHttpInfo(Integer count, Integer startIndex, String fields, String sortBy) throws ApiException {
        com.squareup.okhttp.Call call = getCampaignsValidateBeforeCall(count, startIndex, fields, sortBy, null, null);
        Type localVarReturnType = new TypeToken<CampaignListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Lists all campaigns (asynchronously)
     * 
     * @param count Number of items to retrieve. Recommended max is 10. (optional, default to 5)
     * @param startIndex Indicates from what row to start returning data. Used in conjunction with count. (optional, default to 0)
     * @param fields Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. (optional)
     * @param sortBy Field on which to sort the returned items. Use any field in the model, or system fields lastModifiedTime or CreatedTime. (optional, default to -lastModifiedTime)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCampaignsAsync(Integer count, Integer startIndex, String fields, String sortBy, final ApiCallback<CampaignListResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCampaignsValidateBeforeCall(count, startIndex, fields, sortBy, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CampaignListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCampaignsToken
     * @param token Campaign token (required)
     * @param fields Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCampaignsTokenCall(String token, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/campaigns/{token}"
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
    private com.squareup.okhttp.Call getCampaignsTokenValidateBeforeCall(String token, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new ApiException("Missing the required parameter 'token' when calling getCampaignsToken(Async)");
        }
        

        com.squareup.okhttp.Call call = getCampaignsTokenCall(token, fields, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Returns a specific campaign
     * 
     * @param token Campaign token (required)
     * @param fields Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. (optional)
     * @return CampaignResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CampaignResponseModel getCampaignsToken(String token, String fields) throws ApiException {
        ApiResponse<CampaignResponseModel> resp = getCampaignsTokenWithHttpInfo(token, fields);
        return resp.getData();
    }

    /**
     * Returns a specific campaign
     * 
     * @param token Campaign token (required)
     * @param fields Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. (optional)
     * @return ApiResponse&lt;CampaignResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CampaignResponseModel> getCampaignsTokenWithHttpInfo(String token, String fields) throws ApiException {
        com.squareup.okhttp.Call call = getCampaignsTokenValidateBeforeCall(token, fields, null, null);
        Type localVarReturnType = new TypeToken<CampaignResponseModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns a specific campaign (asynchronously)
     * 
     * @param token Campaign token (required)
     * @param fields Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCampaignsTokenAsync(String token, String fields, final ApiCallback<CampaignResponseModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCampaignsTokenValidateBeforeCall(token, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CampaignResponseModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCampaignsTokenStores
     * @param token Campaign token (required)
     * @param count Number of items to retrieve. Recommended max is 10. (optional, default to 5)
     * @param startIndex Indicates from what row to start returning data. Used in conjunction with count. (optional, default to 0)
     * @param fields Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. (optional)
     * @param sortBy Field on which to sort the returned items. Use any field in the model, or system fields lastModifiedTime or CreatedTime. (optional, default to -lastModifiedTime)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCampaignsTokenStoresCall(String token, Integer count, Integer startIndex, String fields, String sortBy, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/campaigns/{token}/stores"
            .replaceAll("\\{" + "token" + "\\}", apiClient.escapeString(token.toString()));

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
    private com.squareup.okhttp.Call getCampaignsTokenStoresValidateBeforeCall(String token, Integer count, Integer startIndex, String fields, String sortBy, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new ApiException("Missing the required parameter 'token' when calling getCampaignsTokenStores(Async)");
        }
        

        com.squareup.okhttp.Call call = getCampaignsTokenStoresCall(token, count, startIndex, fields, sortBy, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Lists all stores associated with a campaign
     * 
     * @param token Campaign token (required)
     * @param count Number of items to retrieve. Recommended max is 10. (optional, default to 5)
     * @param startIndex Indicates from what row to start returning data. Used in conjunction with count. (optional, default to 0)
     * @param fields Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. (optional)
     * @param sortBy Field on which to sort the returned items. Use any field in the model, or system fields lastModifiedTime or CreatedTime. (optional, default to -lastModifiedTime)
     * @return StoreListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public StoreListResponse getCampaignsTokenStores(String token, Integer count, Integer startIndex, String fields, String sortBy) throws ApiException {
        ApiResponse<StoreListResponse> resp = getCampaignsTokenStoresWithHttpInfo(token, count, startIndex, fields, sortBy);
        return resp.getData();
    }

    /**
     * Lists all stores associated with a campaign
     * 
     * @param token Campaign token (required)
     * @param count Number of items to retrieve. Recommended max is 10. (optional, default to 5)
     * @param startIndex Indicates from what row to start returning data. Used in conjunction with count. (optional, default to 0)
     * @param fields Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. (optional)
     * @param sortBy Field on which to sort the returned items. Use any field in the model, or system fields lastModifiedTime or CreatedTime. (optional, default to -lastModifiedTime)
     * @return ApiResponse&lt;StoreListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<StoreListResponse> getCampaignsTokenStoresWithHttpInfo(String token, Integer count, Integer startIndex, String fields, String sortBy) throws ApiException {
        com.squareup.okhttp.Call call = getCampaignsTokenStoresValidateBeforeCall(token, count, startIndex, fields, sortBy, null, null);
        Type localVarReturnType = new TypeToken<StoreListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Lists all stores associated with a campaign (asynchronously)
     * 
     * @param token Campaign token (required)
     * @param count Number of items to retrieve. Recommended max is 10. (optional, default to 5)
     * @param startIndex Indicates from what row to start returning data. Used in conjunction with count. (optional, default to 0)
     * @param fields Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. (optional)
     * @param sortBy Field on which to sort the returned items. Use any field in the model, or system fields lastModifiedTime or CreatedTime. (optional, default to -lastModifiedTime)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCampaignsTokenStoresAsync(String token, Integer count, Integer startIndex, String fields, String sortBy, final ApiCallback<StoreListResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCampaignsTokenStoresValidateBeforeCall(token, count, startIndex, fields, sortBy, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<StoreListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postCampaigns
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postCampaignsCall(CampaignModel body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/campaigns";

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
    private com.squareup.okhttp.Call postCampaignsValidateBeforeCall(CampaignModel body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = postCampaignsCall(body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Creates a campaign
     * 
     * @param body  (optional)
     * @return CampaignResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CampaignResponseModel postCampaigns(CampaignModel body) throws ApiException {
        ApiResponse<CampaignResponseModel> resp = postCampaignsWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Creates a campaign
     * 
     * @param body  (optional)
     * @return ApiResponse&lt;CampaignResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CampaignResponseModel> postCampaignsWithHttpInfo(CampaignModel body) throws ApiException {
        com.squareup.okhttp.Call call = postCampaignsValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<CampaignResponseModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates a campaign (asynchronously)
     * 
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postCampaignsAsync(CampaignModel body, final ApiCallback<CampaignResponseModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postCampaignsValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CampaignResponseModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putCampaignsToken
     * @param token Campaign token (required)
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putCampaignsTokenCall(String token, CampaignUpdateModel body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/campaigns/{token}"
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
    private com.squareup.okhttp.Call putCampaignsTokenValidateBeforeCall(String token, CampaignUpdateModel body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new ApiException("Missing the required parameter 'token' when calling putCampaignsToken(Async)");
        }
        

        com.squareup.okhttp.Call call = putCampaignsTokenCall(token, body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Updates a specific campaign
     * 
     * @param token Campaign token (required)
     * @param body  (optional)
     * @return CampaignResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CampaignResponseModel putCampaignsToken(String token, CampaignUpdateModel body) throws ApiException {
        ApiResponse<CampaignResponseModel> resp = putCampaignsTokenWithHttpInfo(token, body);
        return resp.getData();
    }

    /**
     * Updates a specific campaign
     * 
     * @param token Campaign token (required)
     * @param body  (optional)
     * @return ApiResponse&lt;CampaignResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CampaignResponseModel> putCampaignsTokenWithHttpInfo(String token, CampaignUpdateModel body) throws ApiException {
        com.squareup.okhttp.Call call = putCampaignsTokenValidateBeforeCall(token, body, null, null);
        Type localVarReturnType = new TypeToken<CampaignResponseModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Updates a specific campaign (asynchronously)
     * 
     * @param token Campaign token (required)
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putCampaignsTokenAsync(String token, CampaignUpdateModel body, final ApiCallback<CampaignResponseModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = putCampaignsTokenValidateBeforeCall(token, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CampaignResponseModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
