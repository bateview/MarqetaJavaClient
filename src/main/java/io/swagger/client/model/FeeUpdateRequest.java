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
import io.swagger.client.model.RealTimeFeeAssessmentRequest;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * FeeUpdateRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class FeeUpdateRequest {
  @SerializedName("name")
  private String name = null;

  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("tags")
  private String tags = null;

  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("active")
  private Boolean active = true;

  @SerializedName("real_time_assessment")
  private RealTimeFeeAssessmentRequest realTimeAssessment = null;

  public FeeUpdateRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FeeUpdateRequest amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public FeeUpdateRequest tags(String tags) {
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

  public FeeUpdateRequest currencyCode(String currencyCode) {
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

  public FeeUpdateRequest active(Boolean active) {
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

  public FeeUpdateRequest realTimeAssessment(RealTimeFeeAssessmentRequest realTimeAssessment) {
    this.realTimeAssessment = realTimeAssessment;
    return this;
  }

   /**
   * Get realTimeAssessment
   * @return realTimeAssessment
  **/
  @ApiModelProperty(value = "")
  public RealTimeFeeAssessmentRequest getRealTimeAssessment() {
    return realTimeAssessment;
  }

  public void setRealTimeAssessment(RealTimeFeeAssessmentRequest realTimeAssessment) {
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
    FeeUpdateRequest feeUpdateRequest = (FeeUpdateRequest) o;
    return Objects.equals(this.name, feeUpdateRequest.name) &&
        Objects.equals(this.amount, feeUpdateRequest.amount) &&
        Objects.equals(this.tags, feeUpdateRequest.tags) &&
        Objects.equals(this.currencyCode, feeUpdateRequest.currencyCode) &&
        Objects.equals(this.active, feeUpdateRequest.active) &&
        Objects.equals(this.realTimeAssessment, feeUpdateRequest.realTimeAssessment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, amount, tags, currencyCode, active, realTimeAssessment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeeUpdateRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

