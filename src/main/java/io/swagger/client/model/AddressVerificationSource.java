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
import io.swagger.client.model.AvsInformation;
import io.swagger.client.model.Response;
import java.io.IOException;

/**
 * AddressVerificationSource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class AddressVerificationSource {
  @SerializedName("on_file")
  private AvsInformation onFile = null;

  @SerializedName("response")
  private Response response = null;

  public AddressVerificationSource onFile(AvsInformation onFile) {
    this.onFile = onFile;
    return this;
  }

   /**
   * Get onFile
   * @return onFile
  **/
  @ApiModelProperty(value = "")
  public AvsInformation getOnFile() {
    return onFile;
  }

  public void setOnFile(AvsInformation onFile) {
    this.onFile = onFile;
  }

  public AddressVerificationSource response(Response response) {
    this.response = response;
    return this;
  }

   /**
   * Get response
   * @return response
  **/
  @ApiModelProperty(value = "")
  public Response getResponse() {
    return response;
  }

  public void setResponse(Response response) {
    this.response = response;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressVerificationSource addressVerificationSource = (AddressVerificationSource) o;
    return Objects.equals(this.onFile, addressVerificationSource.onFile) &&
        Objects.equals(this.response, addressVerificationSource.response);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onFile, response);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressVerificationSource {\n");
    
    sb.append("    onFile: ").append(toIndentedString(onFile)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
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
