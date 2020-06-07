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
import io.swagger.client.model.Application;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * AccessTokenResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class AccessTokenResponse {
  @SerializedName("token")
  private String token = null;

  @SerializedName("expires")
  private OffsetDateTime expires = null;

  @SerializedName("application")
  private Application application = null;

  @SerializedName("user_token")
  private String userToken = null;

  @SerializedName("master_roles")
  private List<String> masterRoles = null;

  @SerializedName("token_type")
  private String tokenType = null;

  @SerializedName("one_time")
  private Boolean oneTime = false;

  public AccessTokenResponse token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @ApiModelProperty(value = "")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public AccessTokenResponse expires(OffsetDateTime expires) {
    this.expires = expires;
    return this;
  }

   /**
   * yyyy-MM-ddTHH:mm:ssZ
   * @return expires
  **/
  @ApiModelProperty(required = true, value = "yyyy-MM-ddTHH:mm:ssZ")
  public OffsetDateTime getExpires() {
    return expires;
  }

  public void setExpires(OffsetDateTime expires) {
    this.expires = expires;
  }

  public AccessTokenResponse application(Application application) {
    this.application = application;
    return this;
  }

   /**
   * Get application
   * @return application
  **/
  @ApiModelProperty(value = "")
  public Application getApplication() {
    return application;
  }

  public void setApplication(Application application) {
    this.application = application;
  }

  public AccessTokenResponse userToken(String userToken) {
    this.userToken = userToken;
    return this;
  }

   /**
   * Get userToken
   * @return userToken
  **/
  @ApiModelProperty(value = "")
  public String getUserToken() {
    return userToken;
  }

  public void setUserToken(String userToken) {
    this.userToken = userToken;
  }

  public AccessTokenResponse masterRoles(List<String> masterRoles) {
    this.masterRoles = masterRoles;
    return this;
  }

  public AccessTokenResponse addMasterRolesItem(String masterRolesItem) {
    if (this.masterRoles == null) {
      this.masterRoles = new ArrayList<String>();
    }
    this.masterRoles.add(masterRolesItem);
    return this;
  }

   /**
   * Get masterRoles
   * @return masterRoles
  **/
  @ApiModelProperty(value = "")
  public List<String> getMasterRoles() {
    return masterRoles;
  }

  public void setMasterRoles(List<String> masterRoles) {
    this.masterRoles = masterRoles;
  }

  public AccessTokenResponse tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

   /**
   * Get tokenType
   * @return tokenType
  **/
  @ApiModelProperty(value = "")
  public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

  public AccessTokenResponse oneTime(Boolean oneTime) {
    this.oneTime = oneTime;
    return this;
  }

   /**
   * Get oneTime
   * @return oneTime
  **/
  @ApiModelProperty(value = "")
  public Boolean isOneTime() {
    return oneTime;
  }

  public void setOneTime(Boolean oneTime) {
    this.oneTime = oneTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessTokenResponse accessTokenResponse = (AccessTokenResponse) o;
    return Objects.equals(this.token, accessTokenResponse.token) &&
        Objects.equals(this.expires, accessTokenResponse.expires) &&
        Objects.equals(this.application, accessTokenResponse.application) &&
        Objects.equals(this.userToken, accessTokenResponse.userToken) &&
        Objects.equals(this.masterRoles, accessTokenResponse.masterRoles) &&
        Objects.equals(this.tokenType, accessTokenResponse.tokenType) &&
        Objects.equals(this.oneTime, accessTokenResponse.oneTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, expires, application, userToken, masterRoles, tokenType, oneTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessTokenResponse {\n");
    
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    userToken: ").append(toIndentedString(userToken)).append("\n");
    sb.append("    masterRoles: ").append(toIndentedString(masterRoles)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    oneTime: ").append(toIndentedString(oneTime)).append("\n");
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

