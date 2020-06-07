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
 * UserAssociation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class UserAssociation {
  @SerializedName("single_inventory_user")
  private Boolean singleInventoryUser = false;

  @SerializedName("single_inventory_user_token")
  private String singleInventoryUserToken = "false";

  public UserAssociation singleInventoryUser(Boolean singleInventoryUser) {
    this.singleInventoryUser = singleInventoryUser;
    return this;
  }

   /**
   * Get singleInventoryUser
   * @return singleInventoryUser
  **/
  @ApiModelProperty(value = "")
  public Boolean isSingleInventoryUser() {
    return singleInventoryUser;
  }

  public void setSingleInventoryUser(Boolean singleInventoryUser) {
    this.singleInventoryUser = singleInventoryUser;
  }

  public UserAssociation singleInventoryUserToken(String singleInventoryUserToken) {
    this.singleInventoryUserToken = singleInventoryUserToken;
    return this;
  }

   /**
   * Get singleInventoryUserToken
   * @return singleInventoryUserToken
  **/
  @ApiModelProperty(value = "")
  public String getSingleInventoryUserToken() {
    return singleInventoryUserToken;
  }

  public void setSingleInventoryUserToken(String singleInventoryUserToken) {
    this.singleInventoryUserToken = singleInventoryUserToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAssociation userAssociation = (UserAssociation) o;
    return Objects.equals(this.singleInventoryUser, userAssociation.singleInventoryUser) &&
        Objects.equals(this.singleInventoryUserToken, userAssociation.singleInventoryUserToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(singleInventoryUser, singleInventoryUserToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAssociation {\n");
    
    sb.append("    singleInventoryUser: ").append(toIndentedString(singleInventoryUser)).append("\n");
    sb.append("    singleInventoryUserToken: ").append(toIndentedString(singleInventoryUserToken)).append("\n");
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
