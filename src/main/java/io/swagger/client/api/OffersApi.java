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


import io.swagger.client.model.OfferListResponse;
import io.swagger.client.model.OfferModel;
import io.swagger.client.model.OfferResponseModel;
import io.swagger.client.model.OfferUpdateModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OffersApi {
    private ApiClient apiClient;

    public OffersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OffersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getOffers
     * @param count Number of items to retrieve (optional, default to 5)
     * @param startIndex Start index (optional, default to 0)
     * @param fields Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. (optional)
     * @param sortBy Sort order (optional, default to -lastModifiedTime)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getOffersCall(Integer count, Integer startIndex, String fields, String sortBy, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/offers";

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
    private com.squareup.okhttp.Call getOffersValidateBeforeCall(Integer count, Integer startIndex, String fields, String sortBy, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getOffersCall(count, startIndex, fields, sortBy, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Lists all offers
     * 
     * @param count Number of items to retrieve (optional, default to 5)
     * @param startIndex Start index (optional, default to 0)
     * @param fields Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. (optional)
     * @param sortBy Sort order (optional, default to -lastModifiedTime)
     * @return OfferListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OfferListResponse getOffers(Integer count, Integer startIndex, String fields, String sortBy) throws ApiException {
        ApiResponse<OfferListResponse> resp = getOffersWithHttpInfo(count, startIndex, fields, sortBy);
        return resp.getData();
    }

    /**
     * Lists all offers
     * 
     * @param count Number of items to retrieve (optional, default to 5)
     * @param startIndex Start index (optional, default to 0)
     * @param fields Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. (optional)
     * @param sortBy Sort order (optional, default to -lastModifiedTime)
     * @return ApiResponse&lt;OfferListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OfferListResponse> getOffersWithHttpInfo(Integer count, Integer startIndex, String fields, String sortBy) throws ApiException {
        com.squareup.okhttp.Call call = getOffersValidateBeforeCall(count, startIndex, fields, sortBy, null, null);
        Type localVarReturnType = new TypeToken<OfferListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Lists all offers (asynchronously)
     * 
     * @param count Number of items to retrieve (optional, default to 5)
     * @param startIndex Start index (optional, default to 0)
     * @param fields Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. (optional)
     * @param sortBy Sort order (optional, default to -lastModifiedTime)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getOffersAsync(Integer count, Integer startIndex, String fields, String sortBy, final ApiCallback<OfferListResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getOffersValidateBeforeCall(count, startIndex, fields, sortBy, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OfferListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getOffersToken
     * @param token Offer token (required)
     * @param fields Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getOffersTokenCall(String token, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/offers/{token}"
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
    private com.squareup.okhttp.Call getOffersTokenValidateBeforeCall(String token, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new ApiException("Missing the required parameter 'token' when calling getOffersToken(Async)");
        }
        

        com.squareup.okhttp.Call call = getOffersTokenCall(token, fields, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Returns a specific offer
     * 
     * @param token Offer token (required)
     * @param fields Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. (optional)
     * @return OfferResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OfferResponseModel getOffersToken(String token, String fields) throws ApiException {
        ApiResponse<OfferResponseModel> resp = getOffersTokenWithHttpInfo(token, fields);
        return resp.getData();
    }

    /**
     * Returns a specific offer
     * 
     * @param token Offer token (required)
     * @param fields Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. (optional)
     * @return ApiResponse&lt;OfferResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OfferResponseModel> getOffersTokenWithHttpInfo(String token, String fields) throws ApiException {
        com.squareup.okhttp.Call call = getOffersTokenValidateBeforeCall(token, fields, null, null);
        Type localVarReturnType = new TypeToken<OfferResponseModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns a specific offer (asynchronously)
     * 
     * @param token Offer token (required)
     * @param fields Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getOffersTokenAsync(String token, String fields, final ApiCallback<OfferResponseModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getOffersTokenValidateBeforeCall(token, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OfferResponseModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postOffers
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postOffersCall(OfferModel body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/offers";

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
    private com.squareup.okhttp.Call postOffersValidateBeforeCall(OfferModel body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = postOffersCall(body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Creates an offer
     * 
     * @param body  (optional)
     * @return OfferResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OfferResponseModel postOffers(OfferModel body) throws ApiException {
        ApiResponse<OfferResponseModel> resp = postOffersWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Creates an offer
     * 
     * @param body  (optional)
     * @return ApiResponse&lt;OfferResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OfferResponseModel> postOffersWithHttpInfo(OfferModel body) throws ApiException {
        com.squareup.okhttp.Call call = postOffersValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<OfferResponseModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates an offer (asynchronously)
     * 
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postOffersAsync(OfferModel body, final ApiCallback<OfferResponseModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postOffersValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OfferResponseModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putOffersToken
     * @param token Offer token (required)
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putOffersTokenCall(String token, OfferUpdateModel body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/offers/{token}"
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
    private com.squareup.okhttp.Call putOffersTokenValidateBeforeCall(String token, OfferUpdateModel body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new ApiException("Missing the required parameter 'token' when calling putOffersToken(Async)");
        }
        

        com.squareup.okhttp.Call call = putOffersTokenCall(token, body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Updates an offer
     * 
     * @param token Offer token (required)
     * @param body  (optional)
     * @return OfferResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OfferResponseModel putOffersToken(String token, OfferUpdateModel body) throws ApiException {
        ApiResponse<OfferResponseModel> resp = putOffersTokenWithHttpInfo(token, body);
        return resp.getData();
    }

    /**
     * Updates an offer
     * 
     * @param token Offer token (required)
     * @param body  (optional)
     * @return ApiResponse&lt;OfferResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OfferResponseModel> putOffersTokenWithHttpInfo(String token, OfferUpdateModel body) throws ApiException {
        com.squareup.okhttp.Call call = putOffersTokenValidateBeforeCall(token, body, null, null);
        Type localVarReturnType = new TypeToken<OfferResponseModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Updates an offer (asynchronously)
     * 
     * @param token Offer token (required)
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putOffersTokenAsync(String token, OfferUpdateModel body, final ApiCallback<OfferResponseModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = putOffersTokenValidateBeforeCall(token, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OfferResponseModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
