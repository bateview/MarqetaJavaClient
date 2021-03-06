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

/**
 * DepositAccount
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class DepositAccount {
  @SerializedName("token")
  private String token = null;

  @SerializedName("user_token")
  private String userToken = null;

  @SerializedName("business_token")
  private String businessToken = null;

  @SerializedName("account_number")
  private String accountNumber = null;

  @SerializedName("routing_number")
  private String routingNumber = null;

  @SerializedName("allow_immediate_credit")
  private Boolean allowImmediateCredit = false;

  public DepositAccount token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @ApiModelProperty(required = true, value = "")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public DepositAccount userToken(String userToken) {
    this.userToken = userToken;
    return this;
  }

   /**
   * Get userToken
   * @return userToken
  **/
  @ApiModelProperty(value = "")
  public String getUserToken() {
    return userToken;
  }

  public void setUserToken(String userToken) {
    this.userToken = userToken;
  }

  public DepositAccount businessToken(String businessToken) {
    this.businessToken = businessToken;
    return this;
  }

   /**
   * Get businessToken
   * @return businessToken
  **/
  @ApiModelProperty(value = "")
  public String getBusinessToken() {
    return businessToken;
  }

  public void setBusinessToken(String businessToken) {
    this.businessToken = businessToken;
  }

  public DepositAccount accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Get accountNumber
   * @return accountNumber
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public DepositAccount routingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
    return this;
  }

   /**
   * Get routingNumber
   * @return routingNumber
  **/
  @ApiModelProperty(required = true, value = "")
  public String getRoutingNumber() {
    return routingNumber;
  }

  public void setRoutingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
  }

  public DepositAccount allowImmediateCredit(Boolean allowImmediateCredit) {
    this.allowImmediateCredit = allowImmediateCredit;
    return this;
  }

   /**
   * Get allowImmediateCredit
   * @return allowImmediateCredit
  **/
  @ApiModelProperty(value = "")
  public Boolean isAllowImmediateCredit() {
    return allowImmediateCredit;
  }

  public void setAllowImmediateCredit(Boolean allowImmediateCredit) {
    this.allowImmediateCredit = allowImmediateCredit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositAccount depositAccount = (DepositAccount) o;
    return Objects.equals(this.token, depositAccount.token) &&
        Objects.equals(this.userToken, depositAccount.userToken) &&
        Objects.equals(this.businessToken, depositAccount.businessToken) &&
        Objects.equals(this.accountNumber, depositAccount.accountNumber) &&
        Objects.equals(this.routingNumber, depositAccount.routingNumber) &&
        Objects.equals(this.allowImmediateCredit, depositAccount.allowImmediateCredit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, userToken, businessToken, accountNumber, routingNumber, allowImmediateCredit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositAccount {\n");
    
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    userToken: ").append(toIndentedString(userToken)).append("\n");
    sb.append("    businessToken: ").append(toIndentedString(businessToken)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    routingNumber: ").append(toIndentedString(routingNumber)).append("\n");
    sb.append("    allowImmediateCredit: ").append(toIndentedString(allowImmediateCredit)).append("\n");
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

