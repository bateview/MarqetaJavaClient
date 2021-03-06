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


import io.swagger.client.model.KYCListResponse;
import io.swagger.client.model.KYCSubmitAnswersRequestModel;
import io.swagger.client.model.KycRequest;
import io.swagger.client.model.KycResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KycApi {
    private ApiClient apiClient;

    public KycApi() {
        this(Configuration.getDefaultApiClient());
    }

    public KycApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getKycBusinessBusinesstoken
     * @param businessToken Business token (required)
     * @param count Number of items to retrieve (optional, default to 5)
     * @param startIndex Start index (optional, default to 0)
     * @param fields Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. (optional)
     * @param sortBy Sort order (optional, default to -createdTime)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getKycBusinessBusinesstokenCall(String businessToken, Integer count, Integer startIndex, String fields, String sortBy, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/kyc/business/{business_token}"
            .replaceAll("\\{" + "business_token" + "\\}", apiClient.escapeString(businessToken.toString()));

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
    private com.squareup.okhttp.Call getKycBusinessBusinesstokenValidateBeforeCall(String businessToken, Integer count, Integer startIndex, String fields, String sortBy, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'businessToken' is set
        if (businessToken == null) {
            throw new ApiException("Missing the required parameter 'businessToken' when calling getKycBusinessBusinesstoken(Async)");
        }
        

        com.squareup.okhttp.Call call = getKycBusinessBusinesstokenCall(businessToken, count, startIndex, fields, sortBy, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Lists all KYC results for a business
     * 
     * @param businessToken Business token (required)
     * @param count Number of items to retrieve (optional, default to 5)
     * @param startIndex Start index (optional, default to 0)
     * @param fields Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. (optional)
     * @param sortBy Sort order (optional, default to -createdTime)
     * @return KYCListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public KYCListResponse getKycBusinessBusinesstoken(String businessToken, Integer count, Integer startIndex, String fields, String sortBy) throws ApiException {
        ApiResponse<KYCListResponse> resp = getKycBusinessBusinesstokenWithHttpInfo(businessToken, count, startIndex, fields, sortBy);
        return resp.getData();
    }

    /**
     * Lists all KYC results for a business
     * 
     * @param businessToken Business token (required)
     * @param count Number of items to retrieve (optional, default to 5)
     * @param startIndex Start index (optional, default to 0)
     * @param fields Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. (optional)
     * @param sortBy Sort order (optional, default to -createdTime)
     * @return ApiResponse&lt;KYCListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<KYCListResponse> getKycBusinessBusinesstokenWithHttpInfo(String businessToken, Integer count, Integer startIndex, String fields, String sortBy) throws ApiException {
        com.squareup.okhttp.Call call = getKycBusinessBusinesstokenValidateBeforeCall(businessToken, count, startIndex, fields, sortBy, null, null);
        Type localVarReturnType = new TypeToken<KYCListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Lists all KYC results for a business (asynchronously)
     * 
     * @param businessToken Business token (required)
     * @param count Number of items to retrieve (optional, default to 5)
     * @param startIndex Start index (optional, default to 0)
     * @param fields Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. (optional)
     * @param sortBy Sort order (optional, default to -createdTime)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getKycBusinessBusinesstokenAsync(String businessToken, Integer count, Integer startIndex, String fields, String sortBy, final ApiCallback<KYCListResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getKycBusinessBusinesstokenValidateBeforeCall(businessToken, count, startIndex, fields, sortBy, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<KYCListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getKycToken
     * @param token KYC token (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getKycTokenCall(String token, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/kyc/{token}"
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
    private com.squareup.okhttp.Call getKycTokenValidateBeforeCall(String token, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new ApiException("Missing the required parameter 'token' when calling getKycToken(Async)");
        }
        

        com.squareup.okhttp.Call call = getKycTokenCall(token, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Returns a specific KYC result
     * 
     * @param token KYC token (required)
     * @return KycResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public KycResponse getKycToken(String token) throws ApiException {
        ApiResponse<KycResponse> resp = getKycTokenWithHttpInfo(token);
        return resp.getData();
    }

    /**
     * Returns a specific KYC result
     * 
     * @param token KYC token (required)
     * @return ApiResponse&lt;KycResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<KycResponse> getKycTokenWithHttpInfo(String token) throws ApiException {
        com.squareup.okhttp.Call call = getKycTokenValidateBeforeCall(token, null, null);
        Type localVarReturnType = new TypeToken<KycResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns a specific KYC result (asynchronously)
     * 
     * @param token KYC token (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getKycTokenAsync(String token, final ApiCallback<KycResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getKycTokenValidateBeforeCall(token, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<KycResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getKycUserUsertoken
     * @param userToken User token (required)
     * @param count Number of items to retrieve (optional, default to 5)
     * @param startIndex Start index (optional, default to 0)
     * @param fields Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. (optional)
     * @param sortBy Sort order (optional, default to -createdTime)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getKycUserUsertokenCall(String userToken, Integer count, Integer startIndex, String fields, String sortBy, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/kyc/user/{user_token}"
            .replaceAll("\\{" + "user_token" + "\\}", apiClient.escapeString(userToken.toString()));

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
    private com.squareup.okhttp.Call getKycUserUsertokenValidateBeforeCall(String userToken, Integer count, Integer startIndex, String fields, String sortBy, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'userToken' is set
        if (userToken == null) {
            throw new ApiException("Missing the required parameter 'userToken' when calling getKycUserUsertoken(Async)");
        }
        

        com.squareup.okhttp.Call call = getKycUserUsertokenCall(userToken, count, startIndex, fields, sortBy, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Lists all KYC results for a user
     * 
     * @param userToken User token (required)
     * @param count Number of items to retrieve (optional, default to 5)
     * @param startIndex Start index (optional, default to 0)
     * @param fields Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. (optional)
     * @param sortBy Sort order (optional, default to -createdTime)
     * @return KYCListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public KYCListResponse getKycUserUsertoken(String userToken, Integer count, Integer startIndex, String fields, String sortBy) throws ApiException {
        ApiResponse<KYCListResponse> resp = getKycUserUsertokenWithHttpInfo(userToken, count, startIndex, fields, sortBy);
        return resp.getData();
    }

    /**
     * Lists all KYC results for a user
     * 
     * @param userToken User token (required)
     * @param count Number of items to retrieve (optional, default to 5)
     * @param startIndex Start index (optional, default to 0)
     * @param fields Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. (optional)
     * @param sortBy Sort order (optional, default to -createdTime)
     * @return ApiResponse&lt;KYCListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<KYCListResponse> getKycUserUsertokenWithHttpInfo(String userToken, Integer count, Integer startIndex, String fields, String sortBy) throws ApiException {
        com.squareup.okhttp.Call call = getKycUserUsertokenValidateBeforeCall(userToken, count, startIndex, fields, sortBy, null, null);
        Type localVarReturnType = new TypeToken<KYCListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Lists all KYC results for a user (asynchronously)
     * 
     * @param userToken User token (required)
     * @param count Number of items to retrieve (optional, default to 5)
     * @param startIndex Start index (optional, default to 0)
     * @param fields Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. (optional)
     * @param sortBy Sort order (optional, default to -createdTime)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getKycUserUsertokenAsync(String userToken, Integer count, Integer startIndex, String fields, String sortBy, final ApiCallback<KYCListResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getKycUserUsertokenValidateBeforeCall(userToken, count, startIndex, fields, sortBy, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<KYCListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postKyc
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postKycCall(KycRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/kyc";

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
    private com.squareup.okhttp.Call postKycValidateBeforeCall(KycRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = postKycCall(body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Performs a KYC
     * 
     * @param body  (optional)
     * @return KycResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public KycResponse postKyc(KycRequest body) throws ApiException {
        ApiResponse<KycResponse> resp = postKycWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Performs a KYC
     * 
     * @param body  (optional)
     * @return ApiResponse&lt;KycResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<KycResponse> postKycWithHttpInfo(KycRequest body) throws ApiException {
        com.squareup.okhttp.Call call = postKycValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<KycResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Performs a KYC (asynchronously)
     * 
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postKycAsync(KycRequest body, final ApiCallback<KycResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postKycValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<KycResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putKycToken
     * @param token KYC token (required)
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putKycTokenCall(String token, KYCSubmitAnswersRequestModel body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/kyc/{token}"
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
    private com.squareup.okhttp.Call putKycTokenValidateBeforeCall(String token, KYCSubmitAnswersRequestModel body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new ApiException("Missing the required parameter 'token' when calling putKycToken(Async)");
        }
        

        com.squareup.okhttp.Call call = putKycTokenCall(token, body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Accepts KYC answers for questions from initial request
     * 
     * @param token KYC token (required)
     * @param body  (optional)
     * @return KycResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public KycResponse putKycToken(String token, KYCSubmitAnswersRequestModel body) throws ApiException {
        ApiResponse<KycResponse> resp = putKycTokenWithHttpInfo(token, body);
        return resp.getData();
    }

    /**
     * Accepts KYC answers for questions from initial request
     * 
     * @param token KYC token (required)
     * @param body  (optional)
     * @return ApiResponse&lt;KycResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<KycResponse> putKycTokenWithHttpInfo(String token, KYCSubmitAnswersRequestModel body) throws ApiException {
        com.squareup.okhttp.Call call = putKycTokenValidateBeforeCall(token, body, null, null);
        Type localVarReturnType = new TypeToken<KycResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Accepts KYC answers for questions from initial request (asynchronously)
     * 
     * @param token KYC token (required)
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putKycTokenAsync(String token, KYCSubmitAnswersRequestModel body, final ApiCallback<KycResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = putKycTokenValidateBeforeCall(token, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<KycResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
