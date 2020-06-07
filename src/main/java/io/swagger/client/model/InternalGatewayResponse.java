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
import io.swagger.client.model.InternalGatewayLog;
import java.io.IOException;

/**
 * InternalGatewayResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class InternalGatewayResponse {
  @SerializedName("exception")
  private InternalGatewayLog exception = null;

  @SerializedName("successful_gateway_call")
  private Boolean successfulGatewayCall = false;

  @SerializedName("approved")
  private Boolean approved = false;

  public InternalGatewayResponse exception(InternalGatewayLog exception) {
    this.exception = exception;
    return this;
  }

   /**
   * Get exception
   * @return exception
  **/
  @ApiModelProperty(required = true, value = "")
  public InternalGatewayLog getException() {
    return exception;
  }

  public void setException(InternalGatewayLog exception) {
    this.exception = exception;
  }

  public InternalGatewayResponse successfulGatewayCall(Boolean successfulGatewayCall) {
    this.successfulGatewayCall = successfulGatewayCall;
    return this;
  }

   /**
   * Get successfulGatewayCall
   * @return successfulGatewayCall
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isSuccessfulGatewayCall() {
    return successfulGatewayCall;
  }

  public void setSuccessfulGatewayCall(Boolean successfulGatewayCall) {
    this.successfulGatewayCall = successfulGatewayCall;
  }

  public InternalGatewayResponse approved(Boolean approved) {
    this.approved = approved;
    return this;
  }

   /**
   * Get approved
   * @return approved
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isApproved() {
    return approved;
  }

  public void setApproved(Boolean approved) {
    this.approved = approved;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InternalGatewayResponse internalGatewayResponse = (InternalGatewayResponse) o;
    return Objects.equals(this.exception, internalGatewayResponse.exception) &&
        Objects.equals(this.successfulGatewayCall, internalGatewayResponse.successfulGatewayCall) &&
        Objects.equals(this.approved, internalGatewayResponse.approved);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exception, successfulGatewayCall, approved);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InternalGatewayResponse {\n");
    
    sb.append("    exception: ").append(toIndentedString(exception)).append("\n");
    sb.append("    successfulGatewayCall: ").append(toIndentedString(successfulGatewayCall)).append("\n");
    sb.append("    approved: ").append(toIndentedString(approved)).append("\n");
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
