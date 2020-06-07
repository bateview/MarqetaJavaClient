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
import io.swagger.client.model.FeeModel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * FeeTransferRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class FeeTransferRequest {
  @SerializedName("tags")
  private String tags = null;

  @SerializedName("fees")
  private List<FeeModel> fees = null;

  @SerializedName("token")
  private String token = null;

  @SerializedName("user_token")
  private String userToken = null;

  @SerializedName("business_token")
  private String businessToken = null;

  public FeeTransferRequest tags(String tags) {
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(value = "")
  public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }

  public FeeTransferRequest fees(List<FeeModel> fees) {
    this.fees = fees;
    return this;
  }

  public FeeTransferRequest addFeesItem(FeeModel feesItem) {
    if (this.fees == null) {
      this.fees = new ArrayList<FeeModel>();
    }
    this.fees.add(feesItem);
    return this;
  }

   /**
   * Get fees
   * @return fees
  **/
  @ApiModelProperty(value = "")
  public List<FeeModel> getFees() {
    return fees;
  }

  public void setFees(List<FeeModel> fees) {
    this.fees = fees;
  }

  public FeeTransferRequest token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @ApiModelProperty(value = "")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public FeeTransferRequest userToken(String userToken) {
    this.userToken = userToken;
    return this;
  }

   /**
   * Required if &#39;business_token&#39; is null
   * @return userToken
  **/
  @ApiModelProperty(required = true, value = "Required if 'business_token' is null")
  public String getUserToken() {
    return userToken;
  }

  public void setUserToken(String userToken) {
    this.userToken = userToken;
  }

  public FeeTransferRequest businessToken(String businessToken) {
    this.businessToken = businessToken;
    return this;
  }

   /**
   * Required if &#39;user_token&#39; is null
   * @return businessToken
  **/
  @ApiModelProperty(required = true, value = "Required if 'user_token' is null")
  public String getBusinessToken() {
    return businessToken;
  }

  public void setBusinessToken(String businessToken) {
    this.businessToken = businessToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeeTransferRequest feeTransferRequest = (FeeTransferRequest) o;
    return Objects.equals(this.tags, feeTransferRequest.tags) &&
        Objects.equals(this.fees, feeTransferRequest.fees) &&
        Objects.equals(this.token, feeTransferRequest.token) &&
        Objects.equals(this.userToken, feeTransferRequest.userToken) &&
        Objects.equals(this.businessToken, feeTransferRequest.businessToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, fees, token, userToken, businessToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeeTransferRequest {\n");
    
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    userToken: ").append(toIndentedString(userToken)).append("\n");
    sb.append("    businessToken: ").append(toIndentedString(businessToken)).append("\n");
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
