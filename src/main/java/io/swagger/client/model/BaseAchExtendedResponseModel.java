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
import org.threeten.bp.OffsetDateTime;

/**
 * BaseAchExtendedResponseModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class BaseAchExtendedResponseModel {
  @SerializedName("created_time")
  private OffsetDateTime createdTime = null;

  @SerializedName("last_modified_time")
  private OffsetDateTime lastModifiedTime = null;

  @SerializedName("token")
  private String token = null;

  @SerializedName("account_suffix")
  private String accountSuffix = null;

  @SerializedName("verification_status")
  private String verificationStatus = null;

  @SerializedName("account_type")
  private String accountType = null;

  @SerializedName("name_on_account")
  private String nameOnAccount = null;

  @SerializedName("bank_name")
  private String bankName = null;

  @SerializedName("active")
  private Boolean active = false;

  @SerializedName("date_sent_for_verification")
  private OffsetDateTime dateSentForVerification = null;

  @SerializedName("is_default_account")
  private Boolean isDefaultAccount = false;

  @SerializedName("date_verified")
  private OffsetDateTime dateVerified = null;

  @SerializedName("verification_override")
  private Boolean verificationOverride = false;

  @SerializedName("verification_notes")
  private String verificationNotes = null;

  @SerializedName("routing_number")
  private String routingNumber = null;

  @SerializedName("account_number")
  private String accountNumber = null;

  public BaseAchExtendedResponseModel createdTime(OffsetDateTime createdTime) {
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

  public BaseAchExtendedResponseModel lastModifiedTime(OffsetDateTime lastModifiedTime) {
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

  public BaseAchExtendedResponseModel token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @ApiModelProperty(required = true, value = "")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public BaseAchExtendedResponseModel accountSuffix(String accountSuffix) {
    this.accountSuffix = accountSuffix;
    return this;
  }

   /**
   * Get accountSuffix
   * @return accountSuffix
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAccountSuffix() {
    return accountSuffix;
  }

  public void setAccountSuffix(String accountSuffix) {
    this.accountSuffix = accountSuffix;
  }

  public BaseAchExtendedResponseModel verificationStatus(String verificationStatus) {
    this.verificationStatus = verificationStatus;
    return this;
  }

   /**
   * Get verificationStatus
   * @return verificationStatus
  **/
  @ApiModelProperty(value = "")
  public String getVerificationStatus() {
    return verificationStatus;
  }

  public void setVerificationStatus(String verificationStatus) {
    this.verificationStatus = verificationStatus;
  }

  public BaseAchExtendedResponseModel accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public BaseAchExtendedResponseModel nameOnAccount(String nameOnAccount) {
    this.nameOnAccount = nameOnAccount;
    return this;
  }

   /**
   * Get nameOnAccount
   * @return nameOnAccount
  **/
  @ApiModelProperty(required = true, value = "")
  public String getNameOnAccount() {
    return nameOnAccount;
  }

  public void setNameOnAccount(String nameOnAccount) {
    this.nameOnAccount = nameOnAccount;
  }

  public BaseAchExtendedResponseModel bankName(String bankName) {
    this.bankName = bankName;
    return this;
  }

   /**
   * Get bankName
   * @return bankName
  **/
  @ApiModelProperty(value = "")
  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  public BaseAchExtendedResponseModel active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public BaseAchExtendedResponseModel dateSentForVerification(OffsetDateTime dateSentForVerification) {
    this.dateSentForVerification = dateSentForVerification;
    return this;
  }

   /**
   * Get dateSentForVerification
   * @return dateSentForVerification
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDateSentForVerification() {
    return dateSentForVerification;
  }

  public void setDateSentForVerification(OffsetDateTime dateSentForVerification) {
    this.dateSentForVerification = dateSentForVerification;
  }

  public BaseAchExtendedResponseModel isDefaultAccount(Boolean isDefaultAccount) {
    this.isDefaultAccount = isDefaultAccount;
    return this;
  }

   /**
   * Get isDefaultAccount
   * @return isDefaultAccount
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsDefaultAccount() {
    return isDefaultAccount;
  }

  public void setIsDefaultAccount(Boolean isDefaultAccount) {
    this.isDefaultAccount = isDefaultAccount;
  }

  public BaseAchExtendedResponseModel dateVerified(OffsetDateTime dateVerified) {
    this.dateVerified = dateVerified;
    return this;
  }

   /**
   * Get dateVerified
   * @return dateVerified
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDateVerified() {
    return dateVerified;
  }

  public void setDateVerified(OffsetDateTime dateVerified) {
    this.dateVerified = dateVerified;
  }

  public BaseAchExtendedResponseModel verificationOverride(Boolean verificationOverride) {
    this.verificationOverride = verificationOverride;
    return this;
  }

   /**
   * Get verificationOverride
   * @return verificationOverride
  **/
  @ApiModelProperty(value = "")
  public Boolean isVerificationOverride() {
    return verificationOverride;
  }

  public void setVerificationOverride(Boolean verificationOverride) {
    this.verificationOverride = verificationOverride;
  }

  public BaseAchExtendedResponseModel verificationNotes(String verificationNotes) {
    this.verificationNotes = verificationNotes;
    return this;
  }

   /**
   * Get verificationNotes
   * @return verificationNotes
  **/
  @ApiModelProperty(value = "")
  public String getVerificationNotes() {
    return verificationNotes;
  }

  public void setVerificationNotes(String verificationNotes) {
    this.verificationNotes = verificationNotes;
  }

  public BaseAchExtendedResponseModel routingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
    return this;
  }

   /**
   * Get routingNumber
   * @return routingNumber
  **/
  @ApiModelProperty(value = "")
  public String getRoutingNumber() {
    return routingNumber;
  }

  public void setRoutingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
  }

  public BaseAchExtendedResponseModel accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Get accountNumber
   * @return accountNumber
  **/
  @ApiModelProperty(value = "")
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseAchExtendedResponseModel baseAchExtendedResponseModel = (BaseAchExtendedResponseModel) o;
    return Objects.equals(this.createdTime, baseAchExtendedResponseModel.createdTime) &&
        Objects.equals(this.lastModifiedTime, baseAchExtendedResponseModel.lastModifiedTime) &&
        Objects.equals(this.token, baseAchExtendedResponseModel.token) &&
        Objects.equals(this.accountSuffix, baseAchExtendedResponseModel.accountSuffix) &&
        Objects.equals(this.verificationStatus, baseAchExtendedResponseModel.verificationStatus) &&
        Objects.equals(this.accountType, baseAchExtendedResponseModel.accountType) &&
        Objects.equals(this.nameOnAccount, baseAchExtendedResponseModel.nameOnAccount) &&
        Objects.equals(this.bankName, baseAchExtendedResponseModel.bankName) &&
        Objects.equals(this.active, baseAchExtendedResponseModel.active) &&
        Objects.equals(this.dateSentForVerification, baseAchExtendedResponseModel.dateSentForVerification) &&
        Objects.equals(this.isDefaultAccount, baseAchExtendedResponseModel.isDefaultAccount) &&
        Objects.equals(this.dateVerified, baseAchExtendedResponseModel.dateVerified) &&
        Objects.equals(this.verificationOverride, baseAchExtendedResponseModel.verificationOverride) &&
        Objects.equals(this.verificationNotes, baseAchExtendedResponseModel.verificationNotes) &&
        Objects.equals(this.routingNumber, baseAchExtendedResponseModel.routingNumber) &&
        Objects.equals(this.accountNumber, baseAchExtendedResponseModel.accountNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdTime, lastModifiedTime, token, accountSuffix, verificationStatus, accountType, nameOnAccount, bankName, active, dateSentForVerification, isDefaultAccount, dateVerified, verificationOverride, verificationNotes, routingNumber, accountNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseAchExtendedResponseModel {\n");
    
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    accountSuffix: ").append(toIndentedString(accountSuffix)).append("\n");
    sb.append("    verificationStatus: ").append(toIndentedString(verificationStatus)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    nameOnAccount: ").append(toIndentedString(nameOnAccount)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    dateSentForVerification: ").append(toIndentedString(dateSentForVerification)).append("\n");
    sb.append("    isDefaultAccount: ").append(toIndentedString(isDefaultAccount)).append("\n");
    sb.append("    dateVerified: ").append(toIndentedString(dateVerified)).append("\n");
    sb.append("    verificationOverride: ").append(toIndentedString(verificationOverride)).append("\n");
    sb.append("    verificationNotes: ").append(toIndentedString(verificationNotes)).append("\n");
    sb.append("    routingNumber: ").append(toIndentedString(routingNumber)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
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

