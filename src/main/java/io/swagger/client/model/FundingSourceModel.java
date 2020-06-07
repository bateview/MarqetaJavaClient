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
import org.threeten.bp.OffsetDateTime;

/**
 * FundingSourceModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")

public class FundingSourceModel {
  @SerializedName("token")
  private String token = null;

  @SerializedName("active")
  private Boolean active = false;

  @SerializedName("is_default_account")
  private Boolean isDefaultAccount = false;

  @SerializedName("created_time")
  private OffsetDateTime createdTime = null;

  @SerializedName("last_modified_time")
  private OffsetDateTime lastModifiedTime = null;

  @SerializedName("type")
  private String type = null;

  public FundingSourceModel() {
    this.type = this.getClass().getSimpleName();
  }
  public FundingSourceModel token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @ApiModelProperty(required = true, value = "")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public FundingSourceModel active(Boolean active) {
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

  public FundingSourceModel isDefaultAccount(Boolean isDefaultAccount) {
    this.isDefaultAccount = isDefaultAccount;
    return this;
  }

   /**
   * Get isDefaultAccount
   * @return isDefaultAccount
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isIsDefaultAccount() {
    return isDefaultAccount;
  }

  public void setIsDefaultAccount(Boolean isDefaultAccount) {
    this.isDefaultAccount = isDefaultAccount;
  }

  public FundingSourceModel createdTime(OffsetDateTime createdTime) {
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

  public FundingSourceModel lastModifiedTime(OffsetDateTime lastModifiedTime) {
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

  public FundingSourceModel type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundingSourceModel fundingSourceModel = (FundingSourceModel) o;
    return Objects.equals(this.token, fundingSourceModel.token) &&
        Objects.equals(this.active, fundingSourceModel.active) &&
        Objects.equals(this.isDefaultAccount, fundingSourceModel.isDefaultAccount) &&
        Objects.equals(this.createdTime, fundingSourceModel.createdTime) &&
        Objects.equals(this.lastModifiedTime, fundingSourceModel.lastModifiedTime) &&
        Objects.equals(this.type, fundingSourceModel.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, active, isDefaultAccount, createdTime, lastModifiedTime, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundingSourceModel {\n");
    
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    isDefaultAccount: ").append(toIndentedString(isDefaultAccount)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
