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
 * OriginalDataElements
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class OriginalDataElements {
  /**
   * Gets or Sets mti
   */
  @JsonAdapter(MtiEnum.Adapter.class)
  public enum MtiEnum {
    _0100("0100"),
    
    _0120("0120"),
    
    _0200("0200");

    private String value;

    MtiEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MtiEnum fromValue(String text) {
      for (MtiEnum b : MtiEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MtiEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MtiEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MtiEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MtiEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("mti")
  private MtiEnum mti = null;

  @SerializedName("stan")
  private String stan = null;

  @SerializedName("transmission_time")
  private String transmissionTime = null;

  @SerializedName("acquiring_institution_id")
  private String acquiringInstitutionId = null;

  @SerializedName("network_reference_id")
  private String networkReferenceId = null;

  @SerializedName("forwarding_institution_id")
  private String forwardingInstitutionId = null;

  @SerializedName("transaction_token")
  private String transactionToken = null;

  public OriginalDataElements mti(MtiEnum mti) {
    this.mti = mti;
    return this;
  }

   /**
   * Get mti
   * @return mti
  **/
  @ApiModelProperty(value = "")
  public MtiEnum getMti() {
    return mti;
  }

  public void setMti(MtiEnum mti) {
    this.mti = mti;
  }

  public OriginalDataElements stan(String stan) {
    this.stan = stan;
    return this;
  }

   /**
   * Get stan
   * @return stan
  **/
  @ApiModelProperty(value = "")
  public String getStan() {
    return stan;
  }

  public void setStan(String stan) {
    this.stan = stan;
  }

  public OriginalDataElements transmissionTime(String transmissionTime) {
    this.transmissionTime = transmissionTime;
    return this;
  }

   /**
   * yyyyMMddHHmmss
   * @return transmissionTime
  **/
  @ApiModelProperty(value = "yyyyMMddHHmmss")
  public String getTransmissionTime() {
    return transmissionTime;
  }

  public void setTransmissionTime(String transmissionTime) {
    this.transmissionTime = transmissionTime;
  }

  public OriginalDataElements acquiringInstitutionId(String acquiringInstitutionId) {
    this.acquiringInstitutionId = acquiringInstitutionId;
    return this;
  }

   /**
   * Get acquiringInstitutionId
   * @return acquiringInstitutionId
  **/
  @ApiModelProperty(value = "")
  public String getAcquiringInstitutionId() {
    return acquiringInstitutionId;
  }

  public void setAcquiringInstitutionId(String acquiringInstitutionId) {
    this.acquiringInstitutionId = acquiringInstitutionId;
  }

  public OriginalDataElements networkReferenceId(String networkReferenceId) {
    this.networkReferenceId = networkReferenceId;
    return this;
  }

   /**
   * Get networkReferenceId
   * @return networkReferenceId
  **/
  @ApiModelProperty(value = "")
  public String getNetworkReferenceId() {
    return networkReferenceId;
  }

  public void setNetworkReferenceId(String networkReferenceId) {
    this.networkReferenceId = networkReferenceId;
  }

  public OriginalDataElements forwardingInstitutionId(String forwardingInstitutionId) {
    this.forwardingInstitutionId = forwardingInstitutionId;
    return this;
  }

   /**
   * Get forwardingInstitutionId
   * @return forwardingInstitutionId
  **/
  @ApiModelProperty(value = "")
  public String getForwardingInstitutionId() {
    return forwardingInstitutionId;
  }

  public void setForwardingInstitutionId(String forwardingInstitutionId) {
    this.forwardingInstitutionId = forwardingInstitutionId;
  }

  public OriginalDataElements transactionToken(String transactionToken) {
    this.transactionToken = transactionToken;
    return this;
  }

   /**
   * Get transactionToken
   * @return transactionToken
  **/
  @ApiModelProperty(value = "")
  public String getTransactionToken() {
    return transactionToken;
  }

  public void setTransactionToken(String transactionToken) {
    this.transactionToken = transactionToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OriginalDataElements originalDataElements = (OriginalDataElements) o;
    return Objects.equals(this.mti, originalDataElements.mti) &&
        Objects.equals(this.stan, originalDataElements.stan) &&
        Objects.equals(this.transmissionTime, originalDataElements.transmissionTime) &&
        Objects.equals(this.acquiringInstitutionId, originalDataElements.acquiringInstitutionId) &&
        Objects.equals(this.networkReferenceId, originalDataElements.networkReferenceId) &&
        Objects.equals(this.forwardingInstitutionId, originalDataElements.forwardingInstitutionId) &&
        Objects.equals(this.transactionToken, originalDataElements.transactionToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mti, stan, transmissionTime, acquiringInstitutionId, networkReferenceId, forwardingInstitutionId, transactionToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OriginalDataElements {\n");
    
    sb.append("    mti: ").append(toIndentedString(mti)).append("\n");
    sb.append("    stan: ").append(toIndentedString(stan)).append("\n");
    sb.append("    transmissionTime: ").append(toIndentedString(transmissionTime)).append("\n");
    sb.append("    acquiringInstitutionId: ").append(toIndentedString(acquiringInstitutionId)).append("\n");
    sb.append("    networkReferenceId: ").append(toIndentedString(networkReferenceId)).append("\n");
    sb.append("    forwardingInstitutionId: ").append(toIndentedString(forwardingInstitutionId)).append("\n");
    sb.append("    transactionToken: ").append(toIndentedString(transactionToken)).append("\n");
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

