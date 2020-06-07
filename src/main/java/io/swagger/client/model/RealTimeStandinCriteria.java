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
 * RealTimeStandinCriteria
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class RealTimeStandinCriteria {
  @SerializedName("enabled")
  private Boolean enabled = false;

  @SerializedName("include_connection_errors")
  private Boolean includeConnectionErrors = false;

  @SerializedName("include_response_timeouts")
  private Boolean includeResponseTimeouts = false;

  @SerializedName("include_application_errors")
  private Boolean includeApplicationErrors = false;

  public RealTimeStandinCriteria enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public RealTimeStandinCriteria includeConnectionErrors(Boolean includeConnectionErrors) {
    this.includeConnectionErrors = includeConnectionErrors;
    return this;
  }

   /**
   * Get includeConnectionErrors
   * @return includeConnectionErrors
  **/
  @ApiModelProperty(value = "")
  public Boolean isIncludeConnectionErrors() {
    return includeConnectionErrors;
  }

  public void setIncludeConnectionErrors(Boolean includeConnectionErrors) {
    this.includeConnectionErrors = includeConnectionErrors;
  }

  public RealTimeStandinCriteria includeResponseTimeouts(Boolean includeResponseTimeouts) {
    this.includeResponseTimeouts = includeResponseTimeouts;
    return this;
  }

   /**
   * Get includeResponseTimeouts
   * @return includeResponseTimeouts
  **/
  @ApiModelProperty(value = "")
  public Boolean isIncludeResponseTimeouts() {
    return includeResponseTimeouts;
  }

  public void setIncludeResponseTimeouts(Boolean includeResponseTimeouts) {
    this.includeResponseTimeouts = includeResponseTimeouts;
  }

  public RealTimeStandinCriteria includeApplicationErrors(Boolean includeApplicationErrors) {
    this.includeApplicationErrors = includeApplicationErrors;
    return this;
  }

   /**
   * Get includeApplicationErrors
   * @return includeApplicationErrors
  **/
  @ApiModelProperty(value = "")
  public Boolean isIncludeApplicationErrors() {
    return includeApplicationErrors;
  }

  public void setIncludeApplicationErrors(Boolean includeApplicationErrors) {
    this.includeApplicationErrors = includeApplicationErrors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealTimeStandinCriteria realTimeStandinCriteria = (RealTimeStandinCriteria) o;
    return Objects.equals(this.enabled, realTimeStandinCriteria.enabled) &&
        Objects.equals(this.includeConnectionErrors, realTimeStandinCriteria.includeConnectionErrors) &&
        Objects.equals(this.includeResponseTimeouts, realTimeStandinCriteria.includeResponseTimeouts) &&
        Objects.equals(this.includeApplicationErrors, realTimeStandinCriteria.includeApplicationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, includeConnectionErrors, includeResponseTimeouts, includeApplicationErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealTimeStandinCriteria {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    includeConnectionErrors: ").append(toIndentedString(includeConnectionErrors)).append("\n");
    sb.append("    includeResponseTimeouts: ").append(toIndentedString(includeResponseTimeouts)).append("\n");
    sb.append("    includeApplicationErrors: ").append(toIndentedString(includeApplicationErrors)).append("\n");
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

