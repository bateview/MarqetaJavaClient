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


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ClearingRecordRequestModel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ClearingFileRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class ClearingFileRequest {
  @SerializedName("transaction_tokens")
  private List<ClearingRecordRequestModel> transactionTokens = new ArrayList<ClearingRecordRequestModel>();

  @SerializedName("wait_timeout")
  private Long waitTimeout = null;

  @SerializedName("batch_id")
  private String batchId = null;

  @SerializedName("clearing_folder")
  private String clearingFolder = null;

  @SerializedName("encrypt_file")
  private Boolean encryptFile = false;

  @SerializedName("create_completion_file")
  private Boolean createCompletionFile = false;

  @SerializedName("settlement_date")
  private String settlementDate = null;

  @SerializedName("token_pan")
  private String tokenPan = null;

  public ClearingFileRequest transactionTokens(List<ClearingRecordRequestModel> transactionTokens) {
    this.transactionTokens = transactionTokens;
    return this;
  }

  public ClearingFileRequest addTransactionTokensItem(ClearingRecordRequestModel transactionTokensItem) {
    this.transactionTokens.add(transactionTokensItem);
    return this;
  }

   /**
   * A list of &#39;clearing_transaction_request&#39; items
   * @return transactionTokens
  **/
  @ApiModelProperty(required = true, value = "A list of 'clearing_transaction_request' items")
  public List<ClearingRecordRequestModel> getTransactionTokens() {
    return transactionTokens;
  }

  public void setTransactionTokens(List<ClearingRecordRequestModel> transactionTokens) {
    this.transactionTokens = transactionTokens;
  }

  public ClearingFileRequest waitTimeout(Long waitTimeout) {
    this.waitTimeout = waitTimeout;
    return this;
  }

   /**
   * Timeout in seconds
   * @return waitTimeout
  **/
  @ApiModelProperty(value = "Timeout in seconds")
  public Long getWaitTimeout() {
    return waitTimeout;
  }

  public void setWaitTimeout(Long waitTimeout) {
    this.waitTimeout = waitTimeout;
  }

  public ClearingFileRequest batchId(String batchId) {
    this.batchId = batchId;
    return this;
  }

   /**
   * A string representing batch ID
   * @return batchId
  **/
  @ApiModelProperty(value = "A string representing batch ID")
  public String getBatchId() {
    return batchId;
  }

  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }

  public ClearingFileRequest clearingFolder(String clearingFolder) {
    this.clearingFolder = clearingFolder;
    return this;
  }

   /**
   * Get clearingFolder
   * @return clearingFolder
  **/
  @ApiModelProperty(value = "")
  public String getClearingFolder() {
    return clearingFolder;
  }

  public void setClearingFolder(String clearingFolder) {
    this.clearingFolder = clearingFolder;
  }

  public ClearingFileRequest encryptFile(Boolean encryptFile) {
    this.encryptFile = encryptFile;
    return this;
  }

   /**
   * Get encryptFile
   * @return encryptFile
  **/
  @ApiModelProperty(value = "")
  public Boolean isEncryptFile() {
    return encryptFile;
  }

  public void setEncryptFile(Boolean encryptFile) {
    this.encryptFile = encryptFile;
  }

  public ClearingFileRequest createCompletionFile(Boolean createCompletionFile) {
    this.createCompletionFile = createCompletionFile;
    return this;
  }

   /**
   * Get createCompletionFile
   * @return createCompletionFile
  **/
  @ApiModelProperty(value = "")
  public Boolean isCreateCompletionFile() {
    return createCompletionFile;
  }

  public void setCreateCompletionFile(Boolean createCompletionFile) {
    this.createCompletionFile = createCompletionFile;
  }

  public ClearingFileRequest settlementDate(String settlementDate) {
    this.settlementDate = settlementDate;
    return this;
  }

   /**
   * Get settlementDate
   * @return settlementDate
  **/
  @ApiModelProperty(value = "")
  public String getSettlementDate() {
    return settlementDate;
  }

  public void setSettlementDate(String settlementDate) {
    this.settlementDate = settlementDate;
  }

  public ClearingFileRequest tokenPan(String tokenPan) {
    this.tokenPan = tokenPan;
    return this;
  }

   /**
   * Get tokenPan
   * @return tokenPan
  **/
  @ApiModelProperty(value = "")
  public String getTokenPan() {
    return tokenPan;
  }

  public void setTokenPan(String tokenPan) {
    this.tokenPan = tokenPan;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClearingFileRequest clearingFileRequest = (ClearingFileRequest) o;
    return Objects.equals(this.transactionTokens, clearingFileRequest.transactionTokens) &&
        Objects.equals(this.waitTimeout, clearingFileRequest.waitTimeout) &&
        Objects.equals(this.batchId, clearingFileRequest.batchId) &&
        Objects.equals(this.clearingFolder, clearingFileRequest.clearingFolder) &&
        Objects.equals(this.encryptFile, clearingFileRequest.encryptFile) &&
        Objects.equals(this.createCompletionFile, clearingFileRequest.createCompletionFile) &&
        Objects.equals(this.settlementDate, clearingFileRequest.settlementDate) &&
        Objects.equals(this.tokenPan, clearingFileRequest.tokenPan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionTokens, waitTimeout, batchId, clearingFolder, encryptFile, createCompletionFile, settlementDate, tokenPan);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClearingFileRequest {\n");
    
    sb.append("    transactionTokens: ").append(toIndentedString(transactionTokens)).append("\n");
    sb.append("    waitTimeout: ").append(toIndentedString(waitTimeout)).append("\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    clearingFolder: ").append(toIndentedString(clearingFolder)).append("\n");
    sb.append("    encryptFile: ").append(toIndentedString(encryptFile)).append("\n");
    sb.append("    createCompletionFile: ").append(toIndentedString(createCompletionFile)).append("\n");
    sb.append("    settlementDate: ").append(toIndentedString(settlementDate)).append("\n");
    sb.append("    tokenPan: ").append(toIndentedString(tokenPan)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

