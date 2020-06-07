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
import io.swagger.client.model.KYCQuestion;
import io.swagger.client.model.Result;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * KycResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class KycResponse {
  @SerializedName("created_time")
  private OffsetDateTime createdTime = null;

  @SerializedName("last_modified_time")
  private OffsetDateTime lastModifiedTime = null;

  @SerializedName("token")
  private String token = null;

  @SerializedName("user_token")
  private String userToken = null;

  @SerializedName("business_token")
  private String businessToken = null;

  @SerializedName("result")
  private Result result = null;

  @SerializedName("manual_override")
  private Boolean manualOverride = false;

  @SerializedName("notes")
  private String notes = null;

  @SerializedName("questions")
  private List<KYCQuestion> questions = null;

  @SerializedName("reference_id")
  private String referenceId = null;

  public KycResponse createdTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
    return this;
  }

   /**
   * yyyy-MM-ddTHH:mm:ssZ
   * @return createdTime
  **/
  @ApiModelProperty(required = true, value = "yyyy-MM-ddTHH:mm:ssZ")
  public OffsetDateTime getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
  }

  public KycResponse lastModifiedTime(OffsetDateTime lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }

   /**
   * yyyy-MM-ddTHH:mm:ssZ
   * @return lastModifiedTime
  **/
  @ApiModelProperty(required = true, value = "yyyy-MM-ddTHH:mm:ssZ")
  public OffsetDateTime getLastModifiedTime() {
    return lastModifiedTime;
  }

  public void setLastModifiedTime(OffsetDateTime lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }

  public KycResponse token(String token) {
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

  public KycResponse userToken(String userToken) {
    this.userToken = userToken;
    return this;
  }

   /**
   * Get userToken
   * @return userToken
  **/
  @ApiModelProperty(value = "")
  public String getUserToken() {
    return userToken;
  }

  public void setUserToken(String userToken) {
    this.userToken = userToken;
  }

  public KycResponse businessToken(String businessToken) {
    this.businessToken = businessToken;
    return this;
  }

   /**
   * Get businessToken
   * @return businessToken
  **/
  @ApiModelProperty(value = "")
  public String getBusinessToken() {
    return businessToken;
  }

  public void setBusinessToken(String businessToken) {
    this.businessToken = businessToken;
  }

  public KycResponse result(Result result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(value = "")
  public Result getResult() {
    return result;
  }

  public void setResult(Result result) {
    this.result = result;
  }

  public KycResponse manualOverride(Boolean manualOverride) {
    this.manualOverride = manualOverride;
    return this;
  }

   /**
   * Get manualOverride
   * @return manualOverride
  **/
  @ApiModelProperty(value = "")
  public Boolean isManualOverride() {
    return manualOverride;
  }

  public void setManualOverride(Boolean manualOverride) {
    this.manualOverride = manualOverride;
  }

  public KycResponse notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/
  @ApiModelProperty(value = "")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public KycResponse questions(List<KYCQuestion> questions) {
    this.questions = questions;
    return this;
  }

  public KycResponse addQuestionsItem(KYCQuestion questionsItem) {
    if (this.questions == null) {
      this.questions = new ArrayList<KYCQuestion>();
    }
    this.questions.add(questionsItem);
    return this;
  }

   /**
   * Get questions
   * @return questions
  **/
  @ApiModelProperty(value = "")
  public List<KYCQuestion> getQuestions() {
    return questions;
  }

  public void setQuestions(List<KYCQuestion> questions) {
    this.questions = questions;
  }

  public KycResponse referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

   /**
   * Get referenceId
   * @return referenceId
  **/
  @ApiModelProperty(value = "")
  public String getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KycResponse kycResponse = (KycResponse) o;
    return Objects.equals(this.createdTime, kycResponse.createdTime) &&
        Objects.equals(this.lastModifiedTime, kycResponse.lastModifiedTime) &&
        Objects.equals(this.token, kycResponse.token) &&
        Objects.equals(this.userToken, kycResponse.userToken) &&
        Objects.equals(this.businessToken, kycResponse.businessToken) &&
        Objects.equals(this.result, kycResponse.result) &&
        Objects.equals(this.manualOverride, kycResponse.manualOverride) &&
        Objects.equals(this.notes, kycResponse.notes) &&
        Objects.equals(this.questions, kycResponse.questions) &&
        Objects.equals(this.referenceId, kycResponse.referenceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdTime, lastModifiedTime, token, userToken, businessToken, result, manualOverride, notes, questions, referenceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KycResponse {\n");
    
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    userToken: ").append(toIndentedString(userToken)).append("\n");
    sb.append("    businessToken: ").append(toIndentedString(businessToken)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    manualOverride: ").append(toIndentedString(manualOverride)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    questions: ").append(toIndentedString(questions)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
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

