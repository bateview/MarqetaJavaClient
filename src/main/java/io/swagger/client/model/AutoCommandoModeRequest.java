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
import io.swagger.client.model.InternalFundingSource;
import io.swagger.client.model.InternalGatewayResponse;
import io.swagger.client.model.VelocityControlCheckRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AutoCommandoModeRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class AutoCommandoModeRequest {
  @SerializedName("program_gateway_funding_source")
  private InternalFundingSource programGatewayFundingSource = null;

  @SerializedName("gateway_response")
  private InternalGatewayResponse gatewayResponse = null;

  @SerializedName("velocity_control_request")
  private VelocityControlCheckRequest velocityControlRequest = null;

  @SerializedName("mcc_groups")
  private List<String> mccGroups = null;

  public AutoCommandoModeRequest programGatewayFundingSource(InternalFundingSource programGatewayFundingSource) {
    this.programGatewayFundingSource = programGatewayFundingSource;
    return this;
  }

   /**
   * Get programGatewayFundingSource
   * @return programGatewayFundingSource
  **/
  @ApiModelProperty(required = true, value = "")
  public InternalFundingSource getProgramGatewayFundingSource() {
    return programGatewayFundingSource;
  }

  public void setProgramGatewayFundingSource(InternalFundingSource programGatewayFundingSource) {
    this.programGatewayFundingSource = programGatewayFundingSource;
  }

  public AutoCommandoModeRequest gatewayResponse(InternalGatewayResponse gatewayResponse) {
    this.gatewayResponse = gatewayResponse;
    return this;
  }

   /**
   * Get gatewayResponse
   * @return gatewayResponse
  **/
  @ApiModelProperty(required = true, value = "")
  public InternalGatewayResponse getGatewayResponse() {
    return gatewayResponse;
  }

  public void setGatewayResponse(InternalGatewayResponse gatewayResponse) {
    this.gatewayResponse = gatewayResponse;
  }

  public AutoCommandoModeRequest velocityControlRequest(VelocityControlCheckRequest velocityControlRequest) {
    this.velocityControlRequest = velocityControlRequest;
    return this;
  }

   /**
   * Get velocityControlRequest
   * @return velocityControlRequest
  **/
  @ApiModelProperty(required = true, value = "")
  public VelocityControlCheckRequest getVelocityControlRequest() {
    return velocityControlRequest;
  }

  public void setVelocityControlRequest(VelocityControlCheckRequest velocityControlRequest) {
    this.velocityControlRequest = velocityControlRequest;
  }

  public AutoCommandoModeRequest mccGroups(List<String> mccGroups) {
    this.mccGroups = mccGroups;
    return this;
  }

  public AutoCommandoModeRequest addMccGroupsItem(String mccGroupsItem) {
    if (this.mccGroups == null) {
      this.mccGroups = new ArrayList<String>();
    }
    this.mccGroups.add(mccGroupsItem);
    return this;
  }

   /**
   * Get mccGroups
   * @return mccGroups
  **/
  @ApiModelProperty(value = "")
  public List<String> getMccGroups() {
    return mccGroups;
  }

  public void setMccGroups(List<String> mccGroups) {
    this.mccGroups = mccGroups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoCommandoModeRequest autoCommandoModeRequest = (AutoCommandoModeRequest) o;
    return Objects.equals(this.programGatewayFundingSource, autoCommandoModeRequest.programGatewayFundingSource) &&
        Objects.equals(this.gatewayResponse, autoCommandoModeRequest.gatewayResponse) &&
        Objects.equals(this.velocityControlRequest, autoCommandoModeRequest.velocityControlRequest) &&
        Objects.equals(this.mccGroups, autoCommandoModeRequest.mccGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(programGatewayFundingSource, gatewayResponse, velocityControlRequest, mccGroups);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoCommandoModeRequest {\n");
    
    sb.append("    programGatewayFundingSource: ").append(toIndentedString(programGatewayFundingSource)).append("\n");
    sb.append("    gatewayResponse: ").append(toIndentedString(gatewayResponse)).append("\n");
    sb.append("    velocityControlRequest: ").append(toIndentedString(velocityControlRequest)).append("\n");
    sb.append("    mccGroups: ").append(toIndentedString(mccGroups)).append("\n");
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
