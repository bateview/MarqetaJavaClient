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
import io.swagger.client.model.ProgramFundingSourceResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ProgramFundingSourceListResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class ProgramFundingSourceListResponse {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("start_index")
  private Integer startIndex = null;

  @SerializedName("end_index")
  private Integer endIndex = null;

  @SerializedName("is_more")
  private Boolean isMore = false;

  @SerializedName("data")
  private List<ProgramFundingSourceResponse> data = null;

  public ProgramFundingSourceListResponse count(Integer count) {
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

  public ProgramFundingSourceListResponse startIndex(Integer startIndex) {
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

  public ProgramFundingSourceListResponse endIndex(Integer endIndex) {
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

  public ProgramFundingSourceListResponse isMore(Boolean isMore) {
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

  public ProgramFundingSourceListResponse data(List<ProgramFundingSourceResponse> data) {
    this.data = data;
    return this;
  }

  public ProgramFundingSourceListResponse addDataItem(ProgramFundingSourceResponse dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<ProgramFundingSourceResponse>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public List<ProgramFundingSourceResponse> getData() {
    return data;
  }

  public void setData(List<ProgramFundingSourceResponse> data) {
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
    ProgramFundingSourceListResponse programFundingSourceListResponse = (ProgramFundingSourceListResponse) o;
    return Objects.equals(this.count, programFundingSourceListResponse.count) &&
        Objects.equals(this.startIndex, programFundingSourceListResponse.startIndex) &&
        Objects.equals(this.endIndex, programFundingSourceListResponse.endIndex) &&
        Objects.equals(this.isMore, programFundingSourceListResponse.isMore) &&
        Objects.equals(this.data, programFundingSourceListResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, startIndex, endIndex, isMore, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProgramFundingSourceListResponse {\n");
    
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

