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
import io.swagger.client.model.AutoReloadAssociation;
import io.swagger.client.model.OrderScope;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * AutoReloadResponseModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class AutoReloadResponseModel {
  @SerializedName("token")
  private String token = null;

  @SerializedName("active")
  private Boolean active = true;

  @SerializedName("funding_source_token")
  private String fundingSourceToken = null;

  @SerializedName("funding_source_address_token")
  private String fundingSourceAddressToken = null;

  @SerializedName("association")
  private AutoReloadAssociation association = null;

  @SerializedName("order_scope")
  private OrderScope orderScope = null;

  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("created_time")
  private OffsetDateTime createdTime = null;

  @SerializedName("last_modified_time")
  private OffsetDateTime lastModifiedTime = null;

  public AutoReloadResponseModel token(String token) {
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

  public AutoReloadResponseModel active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(value = "")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public AutoReloadResponseModel fundingSourceToken(String fundingSourceToken) {
    this.fundingSourceToken = fundingSourceToken;
    return this;
  }

   /**
   * Required when order scope is GPA
   * @return fundingSourceToken
  **/
  @ApiModelProperty(value = "Required when order scope is GPA")
  public String getFundingSourceToken() {
    return fundingSourceToken;
  }

  public void setFundingSourceToken(String fundingSourceToken) {
    this.fundingSourceToken = fundingSourceToken;
  }

  public AutoReloadResponseModel fundingSourceAddressToken(String fundingSourceAddressToken) {
    this.fundingSourceAddressToken = fundingSourceAddressToken;
    return this;
  }

   /**
   * Get fundingSourceAddressToken
   * @return fundingSourceAddressToken
  **/
  @ApiModelProperty(value = "")
  public String getFundingSourceAddressToken() {
    return fundingSourceAddressToken;
  }

  public void setFundingSourceAddressToken(String fundingSourceAddressToken) {
    this.fundingSourceAddressToken = fundingSourceAddressToken;
  }

  public AutoReloadResponseModel association(AutoReloadAssociation association) {
    this.association = association;
    return this;
  }

   /**
   * Get association
   * @return association
  **/
  @ApiModelProperty(value = "")
  public AutoReloadAssociation getAssociation() {
    return association;
  }

  public void setAssociation(AutoReloadAssociation association) {
    this.association = association;
  }

  public AutoReloadResponseModel orderScope(OrderScope orderScope) {
    this.orderScope = orderScope;
    return this;
  }

   /**
   * either GPA or MSA is required
   * @return orderScope
  **/
  @ApiModelProperty(required = true, value = "either GPA or MSA is required")
  public OrderScope getOrderScope() {
    return orderScope;
  }

  public void setOrderScope(OrderScope orderScope) {
    this.orderScope = orderScope;
  }

  public AutoReloadResponseModel currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public AutoReloadResponseModel createdTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
    return this;
  }

   /**
   * yyyy-MM-ddTHH:mm:ssZ
   * @return createdTime
  **/
  @ApiModelProperty(required = true, value = "yyyy-MM-ddTHH:mm:ssZ")
  public OffsetDateTime getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
  }

  public AutoReloadResponseModel lastModifiedTime(OffsetDateTime lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }

   /**
   * yyyy-MM-ddTHH:mm:ssZ
   * @return lastModifiedTime
  **/
  @ApiModelProperty(required = true, value = "yyyy-MM-ddTHH:mm:ssZ")
  public OffsetDateTime getLastModifiedTime() {
    return lastModifiedTime;
  }

  public void setLastModifiedTime(OffsetDateTime lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoReloadResponseModel autoReloadResponseModel = (AutoReloadResponseModel) o;
    return Objects.equals(this.token, autoReloadResponseModel.token) &&
        Objects.equals(this.active, autoReloadResponseModel.active) &&
        Objects.equals(this.fundingSourceToken, autoReloadResponseModel.fundingSourceToken) &&
        Objects.equals(this.fundingSourceAddressToken, autoReloadResponseModel.fundingSourceAddressToken) &&
        Objects.equals(this.association, autoReloadResponseModel.association) &&
        Objects.equals(this.orderScope, autoReloadResponseModel.orderScope) &&
        Objects.equals(this.currencyCode, autoReloadResponseModel.currencyCode) &&
        Objects.equals(this.createdTime, autoReloadResponseModel.createdTime) &&
        Objects.equals(this.lastModifiedTime, autoReloadResponseModel.lastModifiedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, active, fundingSourceToken, fundingSourceAddressToken, association, orderScope, currencyCode, createdTime, lastModifiedTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoReloadResponseModel {\n");
    
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    fundingSourceToken: ").append(toIndentedString(fundingSourceToken)).append("\n");
    sb.append("    fundingSourceAddressToken: ").append(toIndentedString(fundingSourceAddressToken)).append("\n");
    sb.append("    association: ").append(toIndentedString(association)).append("\n");
    sb.append("    orderScope: ").append(toIndentedString(orderScope)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
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

