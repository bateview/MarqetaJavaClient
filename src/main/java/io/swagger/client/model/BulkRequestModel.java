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
import java.util.ArrayList;
import java.util.List;

/**
 * BulkRequestModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class BulkRequestModel {
  @SerializedName("user_tokens")
  private List<String> userTokens = null;

  @SerializedName("business_tokens")
  private List<String> businessTokens = null;

  @SerializedName("card_tokens")
  private List<String> cardTokens = null;

  @SerializedName("kyc_tokens")
  private List<String> kycTokens = null;

  @SerializedName("dda_tokens")
  private List<String> ddaTokens = null;

  @SerializedName("deposit_accounts")
  private List<String> depositAccounts = null;

  public BulkRequestModel userTokens(List<String> userTokens) {
    this.userTokens = userTokens;
    return this;
  }

  public BulkRequestModel addUserTokensItem(String userTokensItem) {
    if (this.userTokens == null) {
      this.userTokens = new ArrayList<String>();
    }
    this.userTokens.add(userTokensItem);
    return this;
  }

   /**
   * Get userTokens
   * @return userTokens
  **/
  @ApiModelProperty(value = "")
  public List<String> getUserTokens() {
    return userTokens;
  }

  public void setUserTokens(List<String> userTokens) {
    this.userTokens = userTokens;
  }

  public BulkRequestModel businessTokens(List<String> businessTokens) {
    this.businessTokens = businessTokens;
    return this;
  }

  public BulkRequestModel addBusinessTokensItem(String businessTokensItem) {
    if (this.businessTokens == null) {
      this.businessTokens = new ArrayList<String>();
    }
    this.businessTokens.add(businessTokensItem);
    return this;
  }

   /**
   * Get businessTokens
   * @return businessTokens
  **/
  @ApiModelProperty(value = "")
  public List<String> getBusinessTokens() {
    return businessTokens;
  }

  public void setBusinessTokens(List<String> businessTokens) {
    this.businessTokens = businessTokens;
  }

  public BulkRequestModel cardTokens(List<String> cardTokens) {
    this.cardTokens = cardTokens;
    return this;
  }

  public BulkRequestModel addCardTokensItem(String cardTokensItem) {
    if (this.cardTokens == null) {
      this.cardTokens = new ArrayList<String>();
    }
    this.cardTokens.add(cardTokensItem);
    return this;
  }

   /**
   * Get cardTokens
   * @return cardTokens
  **/
  @ApiModelProperty(value = "")
  public List<String> getCardTokens() {
    return cardTokens;
  }

  public void setCardTokens(List<String> cardTokens) {
    this.cardTokens = cardTokens;
  }

  public BulkRequestModel kycTokens(List<String> kycTokens) {
    this.kycTokens = kycTokens;
    return this;
  }

  public BulkRequestModel addKycTokensItem(String kycTokensItem) {
    if (this.kycTokens == null) {
      this.kycTokens = new ArrayList<String>();
    }
    this.kycTokens.add(kycTokensItem);
    return this;
  }

   /**
   * Get kycTokens
   * @return kycTokens
  **/
  @ApiModelProperty(value = "")
  public List<String> getKycTokens() {
    return kycTokens;
  }

  public void setKycTokens(List<String> kycTokens) {
    this.kycTokens = kycTokens;
  }

  public BulkRequestModel ddaTokens(List<String> ddaTokens) {
    this.ddaTokens = ddaTokens;
    return this;
  }

  public BulkRequestModel addDdaTokensItem(String ddaTokensItem) {
    if (this.ddaTokens == null) {
      this.ddaTokens = new ArrayList<String>();
    }
    this.ddaTokens.add(ddaTokensItem);
    return this;
  }

   /**
   * Get ddaTokens
   * @return ddaTokens
  **/
  @ApiModelProperty(value = "")
  public List<String> getDdaTokens() {
    return ddaTokens;
  }

  public void setDdaTokens(List<String> ddaTokens) {
    this.ddaTokens = ddaTokens;
  }

  public BulkRequestModel depositAccounts(List<String> depositAccounts) {
    this.depositAccounts = depositAccounts;
    return this;
  }

  public BulkRequestModel addDepositAccountsItem(String depositAccountsItem) {
    if (this.depositAccounts == null) {
      this.depositAccounts = new ArrayList<String>();
    }
    this.depositAccounts.add(depositAccountsItem);
    return this;
  }

   /**
   * Get depositAccounts
   * @return depositAccounts
  **/
  @ApiModelProperty(value = "")
  public List<String> getDepositAccounts() {
    return depositAccounts;
  }

  public void setDepositAccounts(List<String> depositAccounts) {
    this.depositAccounts = depositAccounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkRequestModel bulkRequestModel = (BulkRequestModel) o;
    return Objects.equals(this.userTokens, bulkRequestModel.userTokens) &&
        Objects.equals(this.businessTokens, bulkRequestModel.businessTokens) &&
        Objects.equals(this.cardTokens, bulkRequestModel.cardTokens) &&
        Objects.equals(this.kycTokens, bulkRequestModel.kycTokens) &&
        Objects.equals(this.ddaTokens, bulkRequestModel.ddaTokens) &&
        Objects.equals(this.depositAccounts, bulkRequestModel.depositAccounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userTokens, businessTokens, cardTokens, kycTokens, ddaTokens, depositAccounts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkRequestModel {\n");
    
    sb.append("    userTokens: ").append(toIndentedString(userTokens)).append("\n");
    sb.append("    businessTokens: ").append(toIndentedString(businessTokens)).append("\n");
    sb.append("    cardTokens: ").append(toIndentedString(cardTokens)).append("\n");
    sb.append("    kycTokens: ").append(toIndentedString(kycTokens)).append("\n");
    sb.append("    ddaTokens: ").append(toIndentedString(ddaTokens)).append("\n");
    sb.append("    depositAccounts: ").append(toIndentedString(depositAccounts)).append("\n");
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
