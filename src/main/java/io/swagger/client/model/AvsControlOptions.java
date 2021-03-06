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
 * AvsControlOptions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class AvsControlOptions {
  @SerializedName("validate")
  private Boolean validate = true;

  @SerializedName("decline_on_address_number_mismatch")
  private Boolean declineOnAddressNumberMismatch = false;

  @SerializedName("decline_on_postal_code_mismatch")
  private Boolean declineOnPostalCodeMismatch = true;

  public AvsControlOptions validate(Boolean validate) {
    this.validate = validate;
    return this;
  }

   /**
   * Get validate
   * @return validate
  **/
  @ApiModelProperty(value = "")
  public Boolean isValidate() {
    return validate;
  }

  public void setValidate(Boolean validate) {
    this.validate = validate;
  }

  public AvsControlOptions declineOnAddressNumberMismatch(Boolean declineOnAddressNumberMismatch) {
    this.declineOnAddressNumberMismatch = declineOnAddressNumberMismatch;
    return this;
  }

   /**
   * Get declineOnAddressNumberMismatch
   * @return declineOnAddressNumberMismatch
  **/
  @ApiModelProperty(value = "")
  public Boolean isDeclineOnAddressNumberMismatch() {
    return declineOnAddressNumberMismatch;
  }

  public void setDeclineOnAddressNumberMismatch(Boolean declineOnAddressNumberMismatch) {
    this.declineOnAddressNumberMismatch = declineOnAddressNumberMismatch;
  }

  public AvsControlOptions declineOnPostalCodeMismatch(Boolean declineOnPostalCodeMismatch) {
    this.declineOnPostalCodeMismatch = declineOnPostalCodeMismatch;
    return this;
  }

   /**
   * Get declineOnPostalCodeMismatch
   * @return declineOnPostalCodeMismatch
  **/
  @ApiModelProperty(value = "")
  public Boolean isDeclineOnPostalCodeMismatch() {
    return declineOnPostalCodeMismatch;
  }

  public void setDeclineOnPostalCodeMismatch(Boolean declineOnPostalCodeMismatch) {
    this.declineOnPostalCodeMismatch = declineOnPostalCodeMismatch;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvsControlOptions avsControlOptions = (AvsControlOptions) o;
    return Objects.equals(this.validate, avsControlOptions.validate) &&
        Objects.equals(this.declineOnAddressNumberMismatch, avsControlOptions.declineOnAddressNumberMismatch) &&
        Objects.equals(this.declineOnPostalCodeMismatch, avsControlOptions.declineOnPostalCodeMismatch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validate, declineOnAddressNumberMismatch, declineOnPostalCodeMismatch);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvsControlOptions {\n");
    
    sb.append("    validate: ").append(toIndentedString(validate)).append("\n");
    sb.append("    declineOnAddressNumberMismatch: ").append(toIndentedString(declineOnAddressNumberMismatch)).append("\n");
    sb.append("    declineOnPostalCodeMismatch: ").append(toIndentedString(declineOnPostalCodeMismatch)).append("\n");
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

