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
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * RealTimeFeeGroup
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class RealTimeFeeGroup {
  @SerializedName("token")
  private String token = null;

  @SerializedName("created_time")
  private OffsetDateTime createdTime = null;

  @SerializedName("last_modified_time")
  private OffsetDateTime lastModifiedTime = null;

  @SerializedName("active")
  private Boolean active = false;

  @SerializedName("name")
  private String name = null;

  @SerializedName("fee_tokens")
  private List<String> feeTokens = null;

  public RealTimeFeeGroup token(String token) {
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

  public RealTimeFeeGroup createdTime(OffsetDateTime createdTime) {
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

  public RealTimeFeeGroup lastModifiedTime(OffsetDateTime lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }

   /**
   * Get lastModifiedTime
   * @return lastModifiedTime
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getLastModifiedTime() {
    return lastModifiedTime;
  }

  public void setLastModifiedTime(OffsetDateTime lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }

  public RealTimeFeeGroup active(Boolean active) {
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

  public RealTimeFeeGroup name(String name) {
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

  public RealTimeFeeGroup feeTokens(List<String> feeTokens) {
    this.feeTokens = feeTokens;
    return this;
  }

  public RealTimeFeeGroup addFeeTokensItem(String feeTokensItem) {
    if (this.feeTokens == null) {
      this.feeTokens = new ArrayList<String>();
    }
    this.feeTokens.add(feeTokensItem);
    return this;
  }

   /**
   * Get feeTokens
   * @return feeTokens
  **/
  @ApiModelProperty(value = "")
  public List<String> getFeeTokens() {
    return feeTokens;
  }

  public void setFeeTokens(List<String> feeTokens) {
    this.feeTokens = feeTokens;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealTimeFeeGroup realTimeFeeGroup = (RealTimeFeeGroup) o;
    return Objects.equals(this.token, realTimeFeeGroup.token) &&
        Objects.equals(this.createdTime, realTimeFeeGroup.createdTime) &&
        Objects.equals(this.lastModifiedTime, realTimeFeeGroup.lastModifiedTime) &&
        Objects.equals(this.active, realTimeFeeGroup.active) &&
        Objects.equals(this.name, realTimeFeeGroup.name) &&
        Objects.equals(this.feeTokens, realTimeFeeGroup.feeTokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, createdTime, lastModifiedTime, active, name, feeTokens);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealTimeFeeGroup {\n");
    
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    feeTokens: ").append(toIndentedString(feeTokens)).append("\n");
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
