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
 * OfferUpdateModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class OfferUpdateModel {
  @SerializedName("active")
  private Boolean active = true;

  @SerializedName("name")
  private String name = null;

  @SerializedName("start_date")
  private String startDate = null;

  @SerializedName("end_date")
  private String endDate = null;

  public OfferUpdateModel active(Boolean active) {
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

  public OfferUpdateModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 255 char max
   * @return name
  **/
  @ApiModelProperty(value = "255 char max")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OfferUpdateModel startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * yyyy-MM-ddThh:mm:ssZ
   * @return startDate
  **/
  @ApiModelProperty(value = "yyyy-MM-ddThh:mm:ssZ")
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public OfferUpdateModel endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * yyyy-MM-ddThh:mm:ssZ
   * @return endDate
  **/
  @ApiModelProperty(value = "yyyy-MM-ddThh:mm:ssZ")
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferUpdateModel offerUpdateModel = (OfferUpdateModel) o;
    return Objects.equals(this.active, offerUpdateModel.active) &&
        Objects.equals(this.name, offerUpdateModel.name) &&
        Objects.equals(this.startDate, offerUpdateModel.startDate) &&
        Objects.equals(this.endDate, offerUpdateModel.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, name, startDate, endDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferUpdateModel {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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
