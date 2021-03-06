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
import org.threeten.bp.OffsetDateTime;

/**
 * OfferModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class OfferModel {
  @SerializedName("token")
  private String token = null;

  @SerializedName("active")
  private Boolean active = true;

  @SerializedName("name")
  private String name = null;

  @SerializedName("start_date")
  private OffsetDateTime startDate = null;

  @SerializedName("end_date")
  private OffsetDateTime endDate = null;

  @SerializedName("purchase_amount")
  private BigDecimal purchaseAmount = null;

  @SerializedName("reward_amount")
  private BigDecimal rewardAmount = null;

  @SerializedName("reward_trigger_amount")
  private BigDecimal rewardTriggerAmount = null;

  @SerializedName("campaign_token")
  private String campaignToken = null;

  @SerializedName("currency_code")
  private String currencyCode = null;

  public OfferModel token(String token) {
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

  public OfferModel active(Boolean active) {
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

  public OfferModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OfferModel startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public OfferModel endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public OfferModel purchaseAmount(BigDecimal purchaseAmount) {
    this.purchaseAmount = purchaseAmount;
    return this;
  }

   /**
   * Get purchaseAmount
   * @return purchaseAmount
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getPurchaseAmount() {
    return purchaseAmount;
  }

  public void setPurchaseAmount(BigDecimal purchaseAmount) {
    this.purchaseAmount = purchaseAmount;
  }

  public OfferModel rewardAmount(BigDecimal rewardAmount) {
    this.rewardAmount = rewardAmount;
    return this;
  }

   /**
   * Get rewardAmount
   * @return rewardAmount
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getRewardAmount() {
    return rewardAmount;
  }

  public void setRewardAmount(BigDecimal rewardAmount) {
    this.rewardAmount = rewardAmount;
  }

  public OfferModel rewardTriggerAmount(BigDecimal rewardTriggerAmount) {
    this.rewardTriggerAmount = rewardTriggerAmount;
    return this;
  }

   /**
   * Get rewardTriggerAmount
   * @return rewardTriggerAmount
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getRewardTriggerAmount() {
    return rewardTriggerAmount;
  }

  public void setRewardTriggerAmount(BigDecimal rewardTriggerAmount) {
    this.rewardTriggerAmount = rewardTriggerAmount;
  }

  public OfferModel campaignToken(String campaignToken) {
    this.campaignToken = campaignToken;
    return this;
  }

   /**
   * Get campaignToken
   * @return campaignToken
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCampaignToken() {
    return campaignToken;
  }

  public void setCampaignToken(String campaignToken) {
    this.campaignToken = campaignToken;
  }

  public OfferModel currencyCode(String currencyCode) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferModel offerModel = (OfferModel) o;
    return Objects.equals(this.token, offerModel.token) &&
        Objects.equals(this.active, offerModel.active) &&
        Objects.equals(this.name, offerModel.name) &&
        Objects.equals(this.startDate, offerModel.startDate) &&
        Objects.equals(this.endDate, offerModel.endDate) &&
        Objects.equals(this.purchaseAmount, offerModel.purchaseAmount) &&
        Objects.equals(this.rewardAmount, offerModel.rewardAmount) &&
        Objects.equals(this.rewardTriggerAmount, offerModel.rewardTriggerAmount) &&
        Objects.equals(this.campaignToken, offerModel.campaignToken) &&
        Objects.equals(this.currencyCode, offerModel.currencyCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, active, name, startDate, endDate, purchaseAmount, rewardAmount, rewardTriggerAmount, campaignToken, currencyCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferModel {\n");
    
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    purchaseAmount: ").append(toIndentedString(purchaseAmount)).append("\n");
    sb.append("    rewardAmount: ").append(toIndentedString(rewardAmount)).append("\n");
    sb.append("    rewardTriggerAmount: ").append(toIndentedString(rewardTriggerAmount)).append("\n");
    sb.append("    campaignToken: ").append(toIndentedString(campaignToken)).append("\n");
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

