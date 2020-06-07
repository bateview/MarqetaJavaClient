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
import io.swagger.client.model.ExpirationOffset;
import io.swagger.client.model.FulfillmentResponse;
import io.swagger.client.model.UserAssociation;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * BulkIssuanceResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class BulkIssuanceResponse {
  @SerializedName("token")
  private String token = null;

  @SerializedName("fulfillment")
  private FulfillmentResponse fulfillment = null;

  @SerializedName("expedite")
  private Boolean expedite = false;

  @SerializedName("card_product_token")
  private String cardProductToken = null;

  @SerializedName("card_allocation")
  private Integer cardAllocation = null;

  @SerializedName("user_association")
  private UserAssociation userAssociation = null;

  @SerializedName("name_line_1_numeric_postfix")
  private Boolean nameLine1NumericPostfix = false;

  @SerializedName("name_line_1_random_postfix")
  private Boolean nameLine1RandomPostfix = false;

  @SerializedName("expiration_offset")
  private ExpirationOffset expirationOffset = null;

  @SerializedName("cards_processed")
  private Integer cardsProcessed = null;

  @SerializedName("created_time")
  private OffsetDateTime createdTime = null;

  @SerializedName("name_line1_start_index")
  private Integer nameLine1StartIndex = null;

  @SerializedName("name_line1_end_index")
  private Integer nameLine1EndIndex = null;

  @SerializedName("card_fulfillment_time")
  private OffsetDateTime cardFulfillmentTime = null;

  @SerializedName("provider_ship_date")
  private OffsetDateTime providerShipDate = null;

  @SerializedName("provider_shipping_method")
  private String providerShippingMethod = null;

  @SerializedName("provider_tracking_number")
  private String providerTrackingNumber = null;

  public BulkIssuanceResponse token(String token) {
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

  public BulkIssuanceResponse fulfillment(FulfillmentResponse fulfillment) {
    this.fulfillment = fulfillment;
    return this;
  }

   /**
   * Get fulfillment
   * @return fulfillment
  **/
  @ApiModelProperty(required = true, value = "")
  public FulfillmentResponse getFulfillment() {
    return fulfillment;
  }

  public void setFulfillment(FulfillmentResponse fulfillment) {
    this.fulfillment = fulfillment;
  }

  public BulkIssuanceResponse expedite(Boolean expedite) {
    this.expedite = expedite;
    return this;
  }

   /**
   * Get expedite
   * @return expedite
  **/
  @ApiModelProperty(value = "")
  public Boolean isExpedite() {
    return expedite;
  }

  public void setExpedite(Boolean expedite) {
    this.expedite = expedite;
  }

  public BulkIssuanceResponse cardProductToken(String cardProductToken) {
    this.cardProductToken = cardProductToken;
    return this;
  }

   /**
   * Get cardProductToken
   * @return cardProductToken
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCardProductToken() {
    return cardProductToken;
  }

  public void setCardProductToken(String cardProductToken) {
    this.cardProductToken = cardProductToken;
  }

  public BulkIssuanceResponse cardAllocation(Integer cardAllocation) {
    this.cardAllocation = cardAllocation;
    return this;
  }

   /**
   * Get cardAllocation
   * maximum: 50000
   * @return cardAllocation
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getCardAllocation() {
    return cardAllocation;
  }

  public void setCardAllocation(Integer cardAllocation) {
    this.cardAllocation = cardAllocation;
  }

  public BulkIssuanceResponse userAssociation(UserAssociation userAssociation) {
    this.userAssociation = userAssociation;
    return this;
  }

   /**
   * Get userAssociation
   * @return userAssociation
  **/
  @ApiModelProperty(value = "")
  public UserAssociation getUserAssociation() {
    return userAssociation;
  }

  public void setUserAssociation(UserAssociation userAssociation) {
    this.userAssociation = userAssociation;
  }

  public BulkIssuanceResponse nameLine1NumericPostfix(Boolean nameLine1NumericPostfix) {
    this.nameLine1NumericPostfix = nameLine1NumericPostfix;
    return this;
  }

   /**
   * Get nameLine1NumericPostfix
   * @return nameLine1NumericPostfix
  **/
  @ApiModelProperty(value = "")
  public Boolean isNameLine1NumericPostfix() {
    return nameLine1NumericPostfix;
  }

  public void setNameLine1NumericPostfix(Boolean nameLine1NumericPostfix) {
    this.nameLine1NumericPostfix = nameLine1NumericPostfix;
  }

  public BulkIssuanceResponse nameLine1RandomPostfix(Boolean nameLine1RandomPostfix) {
    this.nameLine1RandomPostfix = nameLine1RandomPostfix;
    return this;
  }

   /**
   * Get nameLine1RandomPostfix
   * @return nameLine1RandomPostfix
  **/
  @ApiModelProperty(value = "")
  public Boolean isNameLine1RandomPostfix() {
    return nameLine1RandomPostfix;
  }

  public void setNameLine1RandomPostfix(Boolean nameLine1RandomPostfix) {
    this.nameLine1RandomPostfix = nameLine1RandomPostfix;
  }

  public BulkIssuanceResponse expirationOffset(ExpirationOffset expirationOffset) {
    this.expirationOffset = expirationOffset;
    return this;
  }

   /**
   * Get expirationOffset
   * @return expirationOffset
  **/
  @ApiModelProperty(value = "")
  public ExpirationOffset getExpirationOffset() {
    return expirationOffset;
  }

  public void setExpirationOffset(ExpirationOffset expirationOffset) {
    this.expirationOffset = expirationOffset;
  }

  public BulkIssuanceResponse cardsProcessed(Integer cardsProcessed) {
    this.cardsProcessed = cardsProcessed;
    return this;
  }

   /**
   * Get cardsProcessed
   * @return cardsProcessed
  **/
  @ApiModelProperty(value = "")
  public Integer getCardsProcessed() {
    return cardsProcessed;
  }

  public void setCardsProcessed(Integer cardsProcessed) {
    this.cardsProcessed = cardsProcessed;
  }

  public BulkIssuanceResponse createdTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
    return this;
  }

   /**
   * Get createdTime
   * @return createdTime
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
  }

  public BulkIssuanceResponse nameLine1StartIndex(Integer nameLine1StartIndex) {
    this.nameLine1StartIndex = nameLine1StartIndex;
    return this;
  }

   /**
   * Get nameLine1StartIndex
   * @return nameLine1StartIndex
  **/
  @ApiModelProperty(value = "")
  public Integer getNameLine1StartIndex() {
    return nameLine1StartIndex;
  }

  public void setNameLine1StartIndex(Integer nameLine1StartIndex) {
    this.nameLine1StartIndex = nameLine1StartIndex;
  }

  public BulkIssuanceResponse nameLine1EndIndex(Integer nameLine1EndIndex) {
    this.nameLine1EndIndex = nameLine1EndIndex;
    return this;
  }

   /**
   * Get nameLine1EndIndex
   * @return nameLine1EndIndex
  **/
  @ApiModelProperty(value = "")
  public Integer getNameLine1EndIndex() {
    return nameLine1EndIndex;
  }

  public void setNameLine1EndIndex(Integer nameLine1EndIndex) {
    this.nameLine1EndIndex = nameLine1EndIndex;
  }

  public BulkIssuanceResponse cardFulfillmentTime(OffsetDateTime cardFulfillmentTime) {
    this.cardFulfillmentTime = cardFulfillmentTime;
    return this;
  }

   /**
   * Get cardFulfillmentTime
   * @return cardFulfillmentTime
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCardFulfillmentTime() {
    return cardFulfillmentTime;
  }

  public void setCardFulfillmentTime(OffsetDateTime cardFulfillmentTime) {
    this.cardFulfillmentTime = cardFulfillmentTime;
  }

  public BulkIssuanceResponse providerShipDate(OffsetDateTime providerShipDate) {
    this.providerShipDate = providerShipDate;
    return this;
  }

   /**
   * Get providerShipDate
   * @return providerShipDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getProviderShipDate() {
    return providerShipDate;
  }

  public void setProviderShipDate(OffsetDateTime providerShipDate) {
    this.providerShipDate = providerShipDate;
  }

  public BulkIssuanceResponse providerShippingMethod(String providerShippingMethod) {
    this.providerShippingMethod = providerShippingMethod;
    return this;
  }

   /**
   * Get providerShippingMethod
   * @return providerShippingMethod
  **/
  @ApiModelProperty(value = "")
  public String getProviderShippingMethod() {
    return providerShippingMethod;
  }

  public void setProviderShippingMethod(String providerShippingMethod) {
    this.providerShippingMethod = providerShippingMethod;
  }

  public BulkIssuanceResponse providerTrackingNumber(String providerTrackingNumber) {
    this.providerTrackingNumber = providerTrackingNumber;
    return this;
  }

   /**
   * Get providerTrackingNumber
   * @return providerTrackingNumber
  **/
  @ApiModelProperty(value = "")
  public String getProviderTrackingNumber() {
    return providerTrackingNumber;
  }

  public void setProviderTrackingNumber(String providerTrackingNumber) {
    this.providerTrackingNumber = providerTrackingNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkIssuanceResponse bulkIssuanceResponse = (BulkIssuanceResponse) o;
    return Objects.equals(this.token, bulkIssuanceResponse.token) &&
        Objects.equals(this.fulfillment, bulkIssuanceResponse.fulfillment) &&
        Objects.equals(this.expedite, bulkIssuanceResponse.expedite) &&
        Objects.equals(this.cardProductToken, bulkIssuanceResponse.cardProductToken) &&
        Objects.equals(this.cardAllocation, bulkIssuanceResponse.cardAllocation) &&
        Objects.equals(this.userAssociation, bulkIssuanceResponse.userAssociation) &&
        Objects.equals(this.nameLine1NumericPostfix, bulkIssuanceResponse.nameLine1NumericPostfix) &&
        Objects.equals(this.nameLine1RandomPostfix, bulkIssuanceResponse.nameLine1RandomPostfix) &&
        Objects.equals(this.expirationOffset, bulkIssuanceResponse.expirationOffset) &&
        Objects.equals(this.cardsProcessed, bulkIssuanceResponse.cardsProcessed) &&
        Objects.equals(this.createdTime, bulkIssuanceResponse.createdTime) &&
        Objects.equals(this.nameLine1StartIndex, bulkIssuanceResponse.nameLine1StartIndex) &&
        Objects.equals(this.nameLine1EndIndex, bulkIssuanceResponse.nameLine1EndIndex) &&
        Objects.equals(this.cardFulfillmentTime, bulkIssuanceResponse.cardFulfillmentTime) &&
        Objects.equals(this.providerShipDate, bulkIssuanceResponse.providerShipDate) &&
        Objects.equals(this.providerShippingMethod, bulkIssuanceResponse.providerShippingMethod) &&
        Objects.equals(this.providerTrackingNumber, bulkIssuanceResponse.providerTrackingNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, fulfillment, expedite, cardProductToken, cardAllocation, userAssociation, nameLine1NumericPostfix, nameLine1RandomPostfix, expirationOffset, cardsProcessed, createdTime, nameLine1StartIndex, nameLine1EndIndex, cardFulfillmentTime, providerShipDate, providerShippingMethod, providerTrackingNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkIssuanceResponse {\n");
    
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    fulfillment: ").append(toIndentedString(fulfillment)).append("\n");
    sb.append("    expedite: ").append(toIndentedString(expedite)).append("\n");
    sb.append("    cardProductToken: ").append(toIndentedString(cardProductToken)).append("\n");
    sb.append("    cardAllocation: ").append(toIndentedString(cardAllocation)).append("\n");
    sb.append("    userAssociation: ").append(toIndentedString(userAssociation)).append("\n");
    sb.append("    nameLine1NumericPostfix: ").append(toIndentedString(nameLine1NumericPostfix)).append("\n");
    sb.append("    nameLine1RandomPostfix: ").append(toIndentedString(nameLine1RandomPostfix)).append("\n");
    sb.append("    expirationOffset: ").append(toIndentedString(expirationOffset)).append("\n");
    sb.append("    cardsProcessed: ").append(toIndentedString(cardsProcessed)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    nameLine1StartIndex: ").append(toIndentedString(nameLine1StartIndex)).append("\n");
    sb.append("    nameLine1EndIndex: ").append(toIndentedString(nameLine1EndIndex)).append("\n");
    sb.append("    cardFulfillmentTime: ").append(toIndentedString(cardFulfillmentTime)).append("\n");
    sb.append("    providerShipDate: ").append(toIndentedString(providerShipDate)).append("\n");
    sb.append("    providerShippingMethod: ").append(toIndentedString(providerShippingMethod)).append("\n");
    sb.append("    providerTrackingNumber: ").append(toIndentedString(providerTrackingNumber)).append("\n");
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
