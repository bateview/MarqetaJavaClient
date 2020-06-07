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
 * Special
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class Special {
  @SerializedName("merchant_on_boarding")
  private Boolean merchantOnBoarding = false;

  public Special merchantOnBoarding(Boolean merchantOnBoarding) {
    this.merchantOnBoarding = merchantOnBoarding;
    return this;
  }

   /**
   * Get merchantOnBoarding
   * @return merchantOnBoarding
  **/
  @ApiModelProperty(value = "")
  public Boolean isMerchantOnBoarding() {
    return merchantOnBoarding;
  }

  public void setMerchantOnBoarding(Boolean merchantOnBoarding) {
    this.merchantOnBoarding = merchantOnBoarding;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Special special = (Special) o;
    return Objects.equals(this.merchantOnBoarding, special.merchantOnBoarding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantOnBoarding);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Special {\n");
    
    sb.append("    merchantOnBoarding: ").append(toIndentedString(merchantOnBoarding)).append("\n");
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

