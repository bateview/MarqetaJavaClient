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
 * CardInventoryRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class CardInventoryRequest {
  @SerializedName("token")
  private String token = null;

  @SerializedName("package_id")
  private String packageId = null;

  @SerializedName("starting_inventory")
  private Integer startingInventory = null;

  public CardInventoryRequest token(String token) {
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

  public CardInventoryRequest packageId(String packageId) {
    this.packageId = packageId;
    return this;
  }

   /**
   * Package ID assigned by card fulfillment
   * @return packageId
  **/
  @ApiModelProperty(required = true, value = "Package ID assigned by card fulfillment")
  public String getPackageId() {
    return packageId;
  }

  public void setPackageId(String packageId) {
    this.packageId = packageId;
  }

  public CardInventoryRequest startingInventory(Integer startingInventory) {
    this.startingInventory = startingInventory;
    return this;
  }

   /**
   * Get startingInventory
   * minimum: 1
   * @return startingInventory
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getStartingInventory() {
    return startingInventory;
  }

  public void setStartingInventory(Integer startingInventory) {
    this.startingInventory = startingInventory;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardInventoryRequest cardInventoryRequest = (CardInventoryRequest) o;
    return Objects.equals(this.token, cardInventoryRequest.token) &&
        Objects.equals(this.packageId, cardInventoryRequest.packageId) &&
        Objects.equals(this.startingInventory, cardInventoryRequest.startingInventory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, packageId, startingInventory);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardInventoryRequest {\n");
    
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
    sb.append("    startingInventory: ").append(toIndentedString(startingInventory)).append("\n");
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
