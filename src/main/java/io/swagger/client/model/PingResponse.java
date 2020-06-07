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
import io.swagger.client.model.HealthCheckResult;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PingResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class PingResponse {
  @SerializedName("success")
  private Boolean success = false;

  @SerializedName("version")
  private String version = null;

  @SerializedName("revision")
  private String revision = null;

  @SerializedName("timestamp")
  private String timestamp = null;

  @SerializedName("env")
  private String env = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("system_components")
  private List<HealthCheckResult> systemComponents = null;

  public PingResponse success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @ApiModelProperty(value = "")
  public Boolean isSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public PingResponse version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(value = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public PingResponse revision(String revision) {
    this.revision = revision;
    return this;
  }

   /**
   * Get revision
   * @return revision
  **/
  @ApiModelProperty(value = "")
  public String getRevision() {
    return revision;
  }

  public void setRevision(String revision) {
    this.revision = revision;
  }

  public PingResponse timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(value = "")
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  public PingResponse env(String env) {
    this.env = env;
    return this;
  }

   /**
   * Get env
   * @return env
  **/
  @ApiModelProperty(value = "")
  public String getEnv() {
    return env;
  }

  public void setEnv(String env) {
    this.env = env;
  }

  public PingResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PingResponse systemComponents(List<HealthCheckResult> systemComponents) {
    this.systemComponents = systemComponents;
    return this;
  }

  public PingResponse addSystemComponentsItem(HealthCheckResult systemComponentsItem) {
    if (this.systemComponents == null) {
      this.systemComponents = new ArrayList<HealthCheckResult>();
    }
    this.systemComponents.add(systemComponentsItem);
    return this;
  }

   /**
   * Get systemComponents
   * @return systemComponents
  **/
  @ApiModelProperty(value = "")
  public List<HealthCheckResult> getSystemComponents() {
    return systemComponents;
  }

  public void setSystemComponents(List<HealthCheckResult> systemComponents) {
    this.systemComponents = systemComponents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PingResponse pingResponse = (PingResponse) o;
    return Objects.equals(this.success, pingResponse.success) &&
        Objects.equals(this.version, pingResponse.version) &&
        Objects.equals(this.revision, pingResponse.revision) &&
        Objects.equals(this.timestamp, pingResponse.timestamp) &&
        Objects.equals(this.env, pingResponse.env) &&
        Objects.equals(this.id, pingResponse.id) &&
        Objects.equals(this.systemComponents, pingResponse.systemComponents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, version, revision, timestamp, env, id, systemComponents);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PingResponse {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    systemComponents: ").append(toIndentedString(systemComponents)).append("\n");
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
