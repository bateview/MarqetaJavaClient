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
 * ProgramTransferTypeRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class ProgramTransferTypeRequest {
  @SerializedName("token")
  private String token = null;

  @SerializedName("program_funding_source_token")
  private String programFundingSourceToken = null;

  @SerializedName("tags")
  private String tags = null;

  @SerializedName("memo")
  private String memo = null;

  public ProgramTransferTypeRequest token(String token) {
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

  public ProgramTransferTypeRequest programFundingSourceToken(String programFundingSourceToken) {
    this.programFundingSourceToken = programFundingSourceToken;
    return this;
  }

   /**
   * Get programFundingSourceToken
   * @return programFundingSourceToken
  **/
  @ApiModelProperty(required = true, value = "")
  public String getProgramFundingSourceToken() {
    return programFundingSourceToken;
  }

  public void setProgramFundingSourceToken(String programFundingSourceToken) {
    this.programFundingSourceToken = programFundingSourceToken;
  }

  public ProgramTransferTypeRequest tags(String tags) {
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(value = "")
  public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }

  public ProgramTransferTypeRequest memo(String memo) {
    this.memo = memo;
    return this;
  }

   /**
   * Get memo
   * @return memo
  **/
  @ApiModelProperty(required = true, value = "")
  public String getMemo() {
    return memo;
  }

  public void setMemo(String memo) {
    this.memo = memo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProgramTransferTypeRequest programTransferTypeRequest = (ProgramTransferTypeRequest) o;
    return Objects.equals(this.token, programTransferTypeRequest.token) &&
        Objects.equals(this.programFundingSourceToken, programTransferTypeRequest.programFundingSourceToken) &&
        Objects.equals(this.tags, programTransferTypeRequest.tags) &&
        Objects.equals(this.memo, programTransferTypeRequest.memo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, programFundingSourceToken, tags, memo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProgramTransferTypeRequest {\n");
    
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    programFundingSourceToken: ").append(toIndentedString(programFundingSourceToken)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
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
