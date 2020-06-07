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
import io.swagger.client.model.BusinessTransitionResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * BusinessTransitionListResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class BusinessTransitionListResponse {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("start_index")
  private Integer startIndex = null;

  @SerializedName("end_index")
  private Integer endIndex = null;

  @SerializedName("is_more")
  private Boolean isMore = false;

  @SerializedName("data")
  private List<BusinessTransitionResponse> data = null;

  public BusinessTransitionListResponse count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @ApiModelProperty(value = "")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public BusinessTransitionListResponse startIndex(Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

   /**
   * Get startIndex
   * @return startIndex
  **/
  @ApiModelProperty(value = "")
  public Integer getStartIndex() {
    return startIndex;
  }

  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }

  public BusinessTransitionListResponse endIndex(Integer endIndex) {
    this.endIndex = endIndex;
    return this;
  }

   /**
   * Get endIndex
   * @return endIndex
  **/
  @ApiModelProperty(value = "")
  public Integer getEndIndex() {
    return endIndex;
  }

  public void setEndIndex(Integer endIndex) {
    this.endIndex = endIndex;
  }

  public BusinessTransitionListResponse isMore(Boolean isMore) {
    this.isMore = isMore;
    return this;
  }

   /**
   * Get isMore
   * @return isMore
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsMore() {
    return isMore;
  }

  public void setIsMore(Boolean isMore) {
    this.isMore = isMore;
  }

  public BusinessTransitionListResponse data(List<BusinessTransitionResponse> data) {
    this.data = data;
    return this;
  }

  public BusinessTransitionListResponse addDataItem(BusinessTransitionResponse dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<BusinessTransitionResponse>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public List<BusinessTransitionResponse> getData() {
    return data;
  }

  public void setData(List<BusinessTransitionResponse> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessTransitionListResponse businessTransitionListResponse = (BusinessTransitionListResponse) o;
    return Objects.equals(this.count, businessTransitionListResponse.count) &&
        Objects.equals(this.startIndex, businessTransitionListResponse.startIndex) &&
        Objects.equals(this.endIndex, businessTransitionListResponse.endIndex) &&
        Objects.equals(this.isMore, businessTransitionListResponse.isMore) &&
        Objects.equals(this.data, businessTransitionListResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, startIndex, endIndex, isMore, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessTransitionListResponse {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    endIndex: ").append(toIndentedString(endIndex)).append("\n");
    sb.append("    isMore: ").append(toIndentedString(isMore)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

