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
import io.swagger.client.model.Config;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * MccGroupModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class MccGroupModel {
  @SerializedName("token")
  private String token = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("mccs")
  private List<Object> mccs = new ArrayList<Object>();

  @SerializedName("active")
  private Boolean active = false;

  @SerializedName("config")
  private Config config = null;

  public MccGroupModel token(String token) {
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

  public MccGroupModel name(String name) {
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

  public MccGroupModel mccs(List<Object> mccs) {
    this.mccs = mccs;
    return this;
  }

  public MccGroupModel addMccsItem(Object mccsItem) {
    this.mccs.add(mccsItem);
    return this;
  }

   /**
   * Get mccs
   * @return mccs
  **/
  @ApiModelProperty(required = true, value = "")
  public List<Object> getMccs() {
    return mccs;
  }

  public void setMccs(List<Object> mccs) {
    this.mccs = mccs;
  }

  public MccGroupModel active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(value = "")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public MccGroupModel config(Config config) {
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @ApiModelProperty(value = "")
  public Config getConfig() {
    return config;
  }

  public void setConfig(Config config) {
    this.config = config;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MccGroupModel mccGroupModel = (MccGroupModel) o;
    return Objects.equals(this.token, mccGroupModel.token) &&
        Objects.equals(this.name, mccGroupModel.name) &&
        Objects.equals(this.mccs, mccGroupModel.mccs) &&
        Objects.equals(this.active, mccGroupModel.active) &&
        Objects.equals(this.config, mccGroupModel.config);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, name, mccs, active, config);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MccGroupModel {\n");
    
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mccs: ").append(toIndentedString(mccs)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
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

