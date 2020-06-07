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
 * InternalAddressVerificationRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class InternalAddressVerificationRequest {
  @SerializedName("compressed")
  private Boolean compressed = false;

  @SerializedName("address")
  private String address = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("postalcode")
  private String postalcode = null;

  @SerializedName("is_compressed")
  private Boolean isCompressed = false;

  @SerializedName("cardholder_name")
  private String cardholderName = null;

  /**
   * Gets or Sets configProviderType
   */
  @JsonAdapter(ConfigProviderTypeEnum.Adapter.class)
  public enum ConfigProviderTypeEnum {
    AUTH("AUTH"),
    
    DWT("DWT"),
    
    AV("AV");

    private String value;

    ConfigProviderTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ConfigProviderTypeEnum fromValue(String text) {
      for (ConfigProviderTypeEnum b : ConfigProviderTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ConfigProviderTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ConfigProviderTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ConfigProviderTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ConfigProviderTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("config_provider_type")
  private ConfigProviderTypeEnum configProviderType = null;

  public InternalAddressVerificationRequest compressed(Boolean compressed) {
    this.compressed = compressed;
    return this;
  }

   /**
   * Get compressed
   * @return compressed
  **/
  @ApiModelProperty(value = "")
  public Boolean isCompressed() {
    return compressed;
  }

  public void setCompressed(Boolean compressed) {
    this.compressed = compressed;
  }

  public InternalAddressVerificationRequest address(String address) {
    this.address = address;
    return this;
  }

   /**
   * cardholder address
   * @return address
  **/
  @ApiModelProperty(value = "cardholder address")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public InternalAddressVerificationRequest city(String city) {
    this.city = city;
    return this;
  }

   /**
   * cardholder city
   * @return city
  **/
  @ApiModelProperty(value = "cardholder city")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public InternalAddressVerificationRequest state(String state) {
    this.state = state;
    return this;
  }

   /**
   * cardholder state
   * @return state
  **/
  @ApiModelProperty(value = "cardholder state")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public InternalAddressVerificationRequest country(String country) {
    this.country = country;
    return this;
  }

   /**
   * cardholder country
   * @return country
  **/
  @ApiModelProperty(value = "cardholder country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public InternalAddressVerificationRequest postalcode(String postalcode) {
    this.postalcode = postalcode;
    return this;
  }

   /**
   * cardholder postalcode
   * @return postalcode
  **/
  @ApiModelProperty(value = "cardholder postalcode")
  public String getPostalcode() {
    return postalcode;
  }

  public void setPostalcode(String postalcode) {
    this.postalcode = postalcode;
  }

  public InternalAddressVerificationRequest isCompressed(Boolean isCompressed) {
    this.isCompressed = isCompressed;
    return this;
  }

   /**
   * Get isCompressed
   * @return isCompressed
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsCompressed() {
    return isCompressed;
  }

  public void setIsCompressed(Boolean isCompressed) {
    this.isCompressed = isCompressed;
  }

  public InternalAddressVerificationRequest cardholderName(String cardholderName) {
    this.cardholderName = cardholderName;
    return this;
  }

   /**
   * Get cardholderName
   * @return cardholderName
  **/
  @ApiModelProperty(value = "")
  public String getCardholderName() {
    return cardholderName;
  }

  public void setCardholderName(String cardholderName) {
    this.cardholderName = cardholderName;
  }

  public InternalAddressVerificationRequest configProviderType(ConfigProviderTypeEnum configProviderType) {
    this.configProviderType = configProviderType;
    return this;
  }

   /**
   * Get configProviderType
   * @return configProviderType
  **/
  @ApiModelProperty(value = "")
  public ConfigProviderTypeEnum getConfigProviderType() {
    return configProviderType;
  }

  public void setConfigProviderType(ConfigProviderTypeEnum configProviderType) {
    this.configProviderType = configProviderType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InternalAddressVerificationRequest internalAddressVerificationRequest = (InternalAddressVerificationRequest) o;
    return Objects.equals(this.compressed, internalAddressVerificationRequest.compressed) &&
        Objects.equals(this.address, internalAddressVerificationRequest.address) &&
        Objects.equals(this.city, internalAddressVerificationRequest.city) &&
        Objects.equals(this.state, internalAddressVerificationRequest.state) &&
        Objects.equals(this.country, internalAddressVerificationRequest.country) &&
        Objects.equals(this.postalcode, internalAddressVerificationRequest.postalcode) &&
        Objects.equals(this.isCompressed, internalAddressVerificationRequest.isCompressed) &&
        Objects.equals(this.cardholderName, internalAddressVerificationRequest.cardholderName) &&
        Objects.equals(this.configProviderType, internalAddressVerificationRequest.configProviderType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compressed, address, city, state, country, postalcode, isCompressed, cardholderName, configProviderType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InternalAddressVerificationRequest {\n");
    
    sb.append("    compressed: ").append(toIndentedString(compressed)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    postalcode: ").append(toIndentedString(postalcode)).append("\n");
    sb.append("    isCompressed: ").append(toIndentedString(isCompressed)).append("\n");
    sb.append("    cardholderName: ").append(toIndentedString(cardholderName)).append("\n");
    sb.append("    configProviderType: ").append(toIndentedString(configProviderType)).append("\n");
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
