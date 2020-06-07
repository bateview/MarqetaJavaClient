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
import io.swagger.client.model.ProvisioningControls;
import java.io.IOException;

/**
 * DigitalWalletTokenization
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class DigitalWalletTokenization {
  @SerializedName("provisioning_controls")
  private ProvisioningControls provisioningControls = null;

  public DigitalWalletTokenization provisioningControls(ProvisioningControls provisioningControls) {
    this.provisioningControls = provisioningControls;
    return this;
  }

   /**
   * Get provisioningControls
   * @return provisioningControls
  **/
  @ApiModelProperty(value = "")
  public ProvisioningControls getProvisioningControls() {
    return provisioningControls;
  }

  public void setProvisioningControls(ProvisioningControls provisioningControls) {
    this.provisioningControls = provisioningControls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DigitalWalletTokenization digitalWalletTokenization = (DigitalWalletTokenization) o;
    return Objects.equals(this.provisioningControls, digitalWalletTokenization.provisioningControls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(provisioningControls);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DigitalWalletTokenization {\n");
    
    sb.append("    provisioningControls: ").append(toIndentedString(provisioningControls)).append("\n");
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
