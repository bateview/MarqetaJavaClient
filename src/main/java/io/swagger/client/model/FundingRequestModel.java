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
import java.io.IOException;
import java.math.BigDecimal;

/**
 * FundingRequestModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class FundingRequestModel {
  @SerializedName("user_token")
  private String userToken = null;

  @SerializedName("order_number")
  private String orderNumber = null;

  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("funding_source")
  private String fundingSource = null;

  @SerializedName("funding_address")
  private String fundingAddress = null;

  @SerializedName("fundgpadetail")
  private String fundgpadetail = null;

  @SerializedName("order_token")
  private String orderToken = null;

  @SerializedName("currency_code")
  private String currencyCode = null;

  public FundingRequestModel userToken(String userToken) {
    this.userToken = userToken;
    return this;
  }

   /**
   * Get userToken
   * @return userToken
  **/
  @ApiModelProperty(required = true, value = "")
  public String getUserToken() {
    return userToken;
  }

  public void setUserToken(String userToken) {
    this.userToken = userToken;
  }

  public FundingRequestModel orderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
    return this;
  }

   /**
   * Get orderNumber
   * @return orderNumber
  **/
  @ApiModelProperty(required = true, value = "")
  public String getOrderNumber() {
    return orderNumber;
  }

  public void setOrderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
  }

  public FundingRequestModel amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * minimum: 0.1
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public FundingRequestModel fundingSource(String fundingSource) {
    this.fundingSource = fundingSource;
    return this;
  }

   /**
   * Payment card or ACH account number
   * @return fundingSource
  **/
  @ApiModelProperty(value = "Payment card or ACH account number")
  public String getFundingSource() {
    return fundingSource;
  }

  public void setFundingSource(String fundingSource) {
    this.fundingSource = fundingSource;
  }

  public FundingRequestModel fundingAddress(String fundingAddress) {
    this.fundingAddress = fundingAddress;
    return this;
  }

   /**
   * Get fundingAddress
   * @return fundingAddress
  **/
  @ApiModelProperty(value = "")
  public String getFundingAddress() {
    return fundingAddress;
  }

  public void setFundingAddress(String fundingAddress) {
    this.fundingAddress = fundingAddress;
  }

  public FundingRequestModel fundgpadetail(String fundgpadetail) {
    this.fundgpadetail = fundgpadetail;
    return this;
  }

   /**
   * Get fundgpadetail
   * @return fundgpadetail
  **/
  @ApiModelProperty(value = "")
  public String getFundgpadetail() {
    return fundgpadetail;
  }

  public void setFundgpadetail(String fundgpadetail) {
    this.fundgpadetail = fundgpadetail;
  }

  public FundingRequestModel orderToken(String orderToken) {
    this.orderToken = orderToken;
    return this;
  }

   /**
   * Get orderToken
   * @return orderToken
  **/
  @ApiModelProperty(value = "")
  public String getOrderToken() {
    return orderToken;
  }

  public void setOrderToken(String orderToken) {
    this.orderToken = orderToken;
  }

  public FundingRequestModel currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @ApiModelProperty(value = "")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundingRequestModel fundingRequestModel = (FundingRequestModel) o;
    return Objects.equals(this.userToken, fundingRequestModel.userToken) &&
        Objects.equals(this.orderNumber, fundingRequestModel.orderNumber) &&
        Objects.equals(this.amount, fundingRequestModel.amount) &&
        Objects.equals(this.fundingSource, fundingRequestModel.fundingSource) &&
        Objects.equals(this.fundingAddress, fundingRequestModel.fundingAddress) &&
        Objects.equals(this.fundgpadetail, fundingRequestModel.fundgpadetail) &&
        Objects.equals(this.orderToken, fundingRequestModel.orderToken) &&
        Objects.equals(this.currencyCode, fundingRequestModel.currencyCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userToken, orderNumber, amount, fundingSource, fundingAddress, fundgpadetail, orderToken, currencyCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundingRequestModel {\n");
    
    sb.append("    userToken: ").append(toIndentedString(userToken)).append("\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    fundingSource: ").append(toIndentedString(fundingSource)).append("\n");
    sb.append("    fundingAddress: ").append(toIndentedString(fundingAddress)).append("\n");
    sb.append("    fundgpadetail: ").append(toIndentedString(fundgpadetail)).append("\n");
    sb.append("    orderToken: ").append(toIndentedString(orderToken)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
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
