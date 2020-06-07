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
import io.swagger.client.model.RealTimeFeeAssessment;
import java.io.IOException;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;

/**
 * Fee
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class Fee {
  @SerializedName("token")
  private String token = null;

  @SerializedName("active")
  private Boolean active = false;

  @SerializedName("name")
  private String name = null;

  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("tags")
  private String tags = null;

  @SerializedName("created_time")
  private OffsetDateTime createdTime = null;

  @SerializedName("last_modified_time")
  private OffsetDateTime lastModifiedTime = null;

  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("real_time_assessment")
  private RealTimeFeeAssessment realTimeAssessment = null;

  public Fee token(String token) {
    this.token = token;
    return this;
  }

   /**
   * 36 char max
   * @return token
  **/
  @ApiModelProperty(required = true, value = "36 char max")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public Fee active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public Fee name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 50 char max
   * @return name
  **/
  @ApiModelProperty(required = true, value = "50 char max")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Fee amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public Fee tags(String tags) {
    this.tags = tags;
    return this;
  }

   /**
   * 255 char max
   * @return tags
  **/
  @ApiModelProperty(value = "255 char max")
  public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }

  public Fee createdTime(OffsetDateTime createdTime) {
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

  public Fee lastModifiedTime(OffsetDateTime lastModifiedTime) {
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

  public Fee currencyCode(String currencyCode) {
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

  public Fee realTimeAssessment(RealTimeFeeAssessment realTimeAssessment) {
    this.realTimeAssessment = realTimeAssessment;
    return this;
  }

   /**
   * Get realTimeAssessment
   * @return realTimeAssessment
  **/
  @ApiModelProperty(value = "")
  public RealTimeFeeAssessment getRealTimeAssessment() {
    return realTimeAssessment;
  }

  public void setRealTimeAssessment(RealTimeFeeAssessment realTimeAssessment) {
    this.realTimeAssessment = realTimeAssessment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Fee fee = (Fee) o;
    return Objects.equals(this.token, fee.token) &&
        Objects.equals(this.active, fee.active) &&
        Objects.equals(this.name, fee.name) &&
        Objects.equals(this.amount, fee.amount) &&
        Objects.equals(this.tags, fee.tags) &&
        Objects.equals(this.createdTime, fee.createdTime) &&
        Objects.equals(this.lastModifiedTime, fee.lastModifiedTime) &&
        Objects.equals(this.currencyCode, fee.currencyCode) &&
        Objects.equals(this.realTimeAssessment, fee.realTimeAssessment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, active, name, amount, tags, createdTime, lastModifiedTime, currencyCode, realTimeAssessment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Fee {\n");
    
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    realTimeAssessment: ").append(toIndentedString(realTimeAssessment)).append("\n");
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
