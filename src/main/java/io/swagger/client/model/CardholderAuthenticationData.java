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
 * CardholderAuthenticationData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class CardholderAuthenticationData {
  @SerializedName("electronic_commerce_indicator")
  private String electronicCommerceIndicator = null;

  @SerializedName("verification_result")
  private String verificationResult = null;

  @SerializedName("verification_value_created_by")
  private String verificationValueCreatedBy = null;

  public CardholderAuthenticationData electronicCommerceIndicator(String electronicCommerceIndicator) {
    this.electronicCommerceIndicator = electronicCommerceIndicator;
    return this;
  }

   /**
   * Get electronicCommerceIndicator
   * @return electronicCommerceIndicator
  **/
  @ApiModelProperty(value = "")
  public String getElectronicCommerceIndicator() {
    return electronicCommerceIndicator;
  }

  public void setElectronicCommerceIndicator(String electronicCommerceIndicator) {
    this.electronicCommerceIndicator = electronicCommerceIndicator;
  }

  public CardholderAuthenticationData verificationResult(String verificationResult) {
    this.verificationResult = verificationResult;
    return this;
  }

   /**
   * Get verificationResult
   * @return verificationResult
  **/
  @ApiModelProperty(value = "")
  public String getVerificationResult() {
    return verificationResult;
  }

  public void setVerificationResult(String verificationResult) {
    this.verificationResult = verificationResult;
  }

  public CardholderAuthenticationData verificationValueCreatedBy(String verificationValueCreatedBy) {
    this.verificationValueCreatedBy = verificationValueCreatedBy;
    return this;
  }

   /**
   * Get verificationValueCreatedBy
   * @return verificationValueCreatedBy
  **/
  @ApiModelProperty(value = "")
  public String getVerificationValueCreatedBy() {
    return verificationValueCreatedBy;
  }

  public void setVerificationValueCreatedBy(String verificationValueCreatedBy) {
    this.verificationValueCreatedBy = verificationValueCreatedBy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardholderAuthenticationData cardholderAuthenticationData = (CardholderAuthenticationData) o;
    return Objects.equals(this.electronicCommerceIndicator, cardholderAuthenticationData.electronicCommerceIndicator) &&
        Objects.equals(this.verificationResult, cardholderAuthenticationData.verificationResult) &&
        Objects.equals(this.verificationValueCreatedBy, cardholderAuthenticationData.verificationValueCreatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(electronicCommerceIndicator, verificationResult, verificationValueCreatedBy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardholderAuthenticationData {\n");
    
    sb.append("    electronicCommerceIndicator: ").append(toIndentedString(electronicCommerceIndicator)).append("\n");
    sb.append("    verificationResult: ").append(toIndentedString(verificationResult)).append("\n");
    sb.append("    verificationValueCreatedBy: ").append(toIndentedString(verificationValueCreatedBy)).append("\n");
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
