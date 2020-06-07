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
import java.util.ArrayList;
import java.util.List;

/**
 * DigitalWalletApplePayProvisionRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class DigitalWalletApplePayProvisionRequest {
  @SerializedName("card_token")
  private String cardToken = null;

  /**
   * Gets or Sets deviceType
   */
  @JsonAdapter(DeviceTypeEnum.Adapter.class)
  public enum DeviceTypeEnum {
    MOBILE_PHONE("MOBILE_PHONE"),
    
    WATCH("WATCH"),
    
    TABLET("TABLET");

    private String value;

    DeviceTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DeviceTypeEnum fromValue(String text) {
      for (DeviceTypeEnum b : DeviceTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DeviceTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DeviceTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DeviceTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DeviceTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("device_type")
  private DeviceTypeEnum deviceType = null;

  @SerializedName("provisioning_app_version")
  private String provisioningAppVersion = null;

  @SerializedName("certificates")
  private List<String> certificates = new ArrayList<String>();

  @SerializedName("nonce")
  private String nonce = null;

  @SerializedName("nonce_signature")
  private String nonceSignature = null;

  public DigitalWalletApplePayProvisionRequest cardToken(String cardToken) {
    this.cardToken = cardToken;
    return this;
  }

   /**
   * Get cardToken
   * @return cardToken
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCardToken() {
    return cardToken;
  }

  public void setCardToken(String cardToken) {
    this.cardToken = cardToken;
  }

  public DigitalWalletApplePayProvisionRequest deviceType(DeviceTypeEnum deviceType) {
    this.deviceType = deviceType;
    return this;
  }

   /**
   * Get deviceType
   * @return deviceType
  **/
  @ApiModelProperty(required = true, value = "")
  public DeviceTypeEnum getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(DeviceTypeEnum deviceType) {
    this.deviceType = deviceType;
  }

  public DigitalWalletApplePayProvisionRequest provisioningAppVersion(String provisioningAppVersion) {
    this.provisioningAppVersion = provisioningAppVersion;
    return this;
  }

   /**
   * Get provisioningAppVersion
   * @return provisioningAppVersion
  **/
  @ApiModelProperty(required = true, value = "")
  public String getProvisioningAppVersion() {
    return provisioningAppVersion;
  }

  public void setProvisioningAppVersion(String provisioningAppVersion) {
    this.provisioningAppVersion = provisioningAppVersion;
  }

  public DigitalWalletApplePayProvisionRequest certificates(List<String> certificates) {
    this.certificates = certificates;
    return this;
  }

  public DigitalWalletApplePayProvisionRequest addCertificatesItem(String certificatesItem) {
    this.certificates.add(certificatesItem);
    return this;
  }

   /**
   * Get certificates
   * @return certificates
  **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getCertificates() {
    return certificates;
  }

  public void setCertificates(List<String> certificates) {
    this.certificates = certificates;
  }

  public DigitalWalletApplePayProvisionRequest nonce(String nonce) {
    this.nonce = nonce;
    return this;
  }

   /**
   * Get nonce
   * @return nonce
  **/
  @ApiModelProperty(required = true, value = "")
  public String getNonce() {
    return nonce;
  }

  public void setNonce(String nonce) {
    this.nonce = nonce;
  }

  public DigitalWalletApplePayProvisionRequest nonceSignature(String nonceSignature) {
    this.nonceSignature = nonceSignature;
    return this;
  }

   /**
   * Get nonceSignature
   * @return nonceSignature
  **/
  @ApiModelProperty(required = true, value = "")
  public String getNonceSignature() {
    return nonceSignature;
  }

  public void setNonceSignature(String nonceSignature) {
    this.nonceSignature = nonceSignature;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DigitalWalletApplePayProvisionRequest digitalWalletApplePayProvisionRequest = (DigitalWalletApplePayProvisionRequest) o;
    return Objects.equals(this.cardToken, digitalWalletApplePayProvisionRequest.cardToken) &&
        Objects.equals(this.deviceType, digitalWalletApplePayProvisionRequest.deviceType) &&
        Objects.equals(this.provisioningAppVersion, digitalWalletApplePayProvisionRequest.provisioningAppVersion) &&
        Objects.equals(this.certificates, digitalWalletApplePayProvisionRequest.certificates) &&
        Objects.equals(this.nonce, digitalWalletApplePayProvisionRequest.nonce) &&
        Objects.equals(this.nonceSignature, digitalWalletApplePayProvisionRequest.nonceSignature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardToken, deviceType, provisioningAppVersion, certificates, nonce, nonceSignature);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DigitalWalletApplePayProvisionRequest {\n");
    
    sb.append("    cardToken: ").append(toIndentedString(cardToken)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    provisioningAppVersion: ").append(toIndentedString(provisioningAppVersion)).append("\n");
    sb.append("    certificates: ").append(toIndentedString(certificates)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("    nonceSignature: ").append(toIndentedString(nonceSignature)).append("\n");
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
