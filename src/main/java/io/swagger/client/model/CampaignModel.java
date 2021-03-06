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
 * CampaignModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class CampaignModel {
  @SerializedName("active")
  private Boolean active = true;

  @SerializedName("name")
  private String name = null;

  @SerializedName("start_date")
  private OffsetDateTime startDate = null;

  @SerializedName("end_date")
  private OffsetDateTime endDate = null;

  @SerializedName("token")
  private String token = null;

  @SerializedName("store_tokens")
  private List<String> storeTokens = null;

  public CampaignModel active(Boolean active) {
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

  public CampaignModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CampaignModel startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public CampaignModel endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public CampaignModel token(String token) {
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

  public CampaignModel storeTokens(List<String> storeTokens) {
    this.storeTokens = storeTokens;
    return this;
  }

  public CampaignModel addStoreTokensItem(String storeTokensItem) {
    if (this.storeTokens == null) {
      this.storeTokens = new ArrayList<String>();
    }
    this.storeTokens.add(storeTokensItem);
    return this;
  }

   /**
   * Enclose tokens in brackets
   * @return storeTokens
  **/
  @ApiModelProperty(value = "Enclose tokens in brackets")
  public List<String> getStoreTokens() {
    return storeTokens;
  }

  public void setStoreTokens(List<String> storeTokens) {
    this.storeTokens = storeTokens;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignModel campaignModel = (CampaignModel) o;
    return Objects.equals(this.active, campaignModel.active) &&
        Objects.equals(this.name, campaignModel.name) &&
        Objects.equals(this.startDate, campaignModel.startDate) &&
        Objects.equals(this.endDate, campaignModel.endDate) &&
        Objects.equals(this.token, campaignModel.token) &&
        Objects.equals(this.storeTokens, campaignModel.storeTokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, name, startDate, endDate, token, storeTokens);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignModel {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    storeTokens: ").append(toIndentedString(storeTokens)).append("\n");
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

