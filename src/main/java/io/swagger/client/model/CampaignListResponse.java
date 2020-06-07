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
import io.swagger.client.model.CampaignResponseModel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CampaignListResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class CampaignListResponse {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("start_index")
  private Integer startIndex = null;

  @SerializedName("end_index")
  private Integer endIndex = null;

  @SerializedName("is_more")
  private Boolean isMore = false;

  @SerializedName("data")
  private List<CampaignResponseModel> data = null;

  public CampaignListResponse count(Integer count) {
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

  public CampaignListResponse startIndex(Integer startIndex) {
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

  public CampaignListResponse endIndex(Integer endIndex) {
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

  public CampaignListResponse isMore(Boolean isMore) {
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

  public CampaignListResponse data(List<CampaignResponseModel> data) {
    this.data = data;
    return this;
  }

  public CampaignListResponse addDataItem(CampaignResponseModel dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<CampaignResponseModel>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public List<CampaignResponseModel> getData() {
    return data;
  }

  public void setData(List<CampaignResponseModel> data) {
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
    CampaignListResponse campaignListResponse = (CampaignListResponse) o;
    return Objects.equals(this.count, campaignListResponse.count) &&
        Objects.equals(this.startIndex, campaignListResponse.startIndex) &&
        Objects.equals(this.endIndex, campaignListResponse.endIndex) &&
        Objects.equals(this.isMore, campaignListResponse.isMore) &&
        Objects.equals(this.data, campaignListResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, startIndex, endIndex, isMore, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignListResponse {\n");
    
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
