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
import io.swagger.client.model.ResultCodeInfo;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ResultCode
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class ResultCode {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("mnemonic")
  private String mnemonic = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("locales")
  private Map<String, ResultCodeInfo> locales = null;

  public ResultCode id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ResultCode mnemonic(String mnemonic) {
    this.mnemonic = mnemonic;
    return this;
  }

   /**
   * Get mnemonic
   * @return mnemonic
  **/
  @ApiModelProperty(value = "")
  public String getMnemonic() {
    return mnemonic;
  }

  public void setMnemonic(String mnemonic) {
    this.mnemonic = mnemonic;
  }

  public ResultCode description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ResultCode locales(Map<String, ResultCodeInfo> locales) {
    this.locales = locales;
    return this;
  }

  public ResultCode putLocalesItem(String key, ResultCodeInfo localesItem) {
    if (this.locales == null) {
      this.locales = new HashMap<String, ResultCodeInfo>();
    }
    this.locales.put(key, localesItem);
    return this;
  }

   /**
   * Get locales
   * @return locales
  **/
  @ApiModelProperty(value = "")
  public Map<String, ResultCodeInfo> getLocales() {
    return locales;
  }

  public void setLocales(Map<String, ResultCodeInfo> locales) {
    this.locales = locales;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultCode resultCode = (ResultCode) o;
    return Objects.equals(this.id, resultCode.id) &&
        Objects.equals(this.mnemonic, resultCode.mnemonic) &&
        Objects.equals(this.description, resultCode.description) &&
        Objects.equals(this.locales, resultCode.locales);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, mnemonic, description, locales);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultCode {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mnemonic: ").append(toIndentedString(mnemonic)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    locales: ").append(toIndentedString(locales)).append("\n");
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

