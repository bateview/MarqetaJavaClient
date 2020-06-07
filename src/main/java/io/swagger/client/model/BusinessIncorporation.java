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
import io.swagger.client.model.AddressRequestModel;
import java.io.IOException;

/**
 * BusinessIncorporation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class BusinessIncorporation {
  @SerializedName("is_public")
  private Boolean isPublic = false;

  @SerializedName("stock_symbol")
  private String stockSymbol = null;

  @SerializedName("state_of_incorporation")
  private String stateOfIncorporation = null;

  @SerializedName("name_registered_under")
  private String nameRegisteredUnder = null;

  @SerializedName("address_registered_under")
  private AddressRequestModel addressRegisteredUnder = null;

  /**
   * Gets or Sets incorporationType
   */
  @JsonAdapter(IncorporationTypeEnum.Adapter.class)
  public enum IncorporationTypeEnum {
    LLC("LLC"),
    
    CORPORATION("CORPORATION"),
    
    SOLE_PROPRIETORSHIP("SOLE_PROPRIETORSHIP"),
    
    PARTNERSHIP("PARTNERSHIP"),
    
    COOPERATIVE("COOPERATIVE"),
    
    OTHER("OTHER");

    private String value;

    IncorporationTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IncorporationTypeEnum fromValue(String text) {
      for (IncorporationTypeEnum b : IncorporationTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<IncorporationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IncorporationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IncorporationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return IncorporationTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("incorporation_type")
  private IncorporationTypeEnum incorporationType = null;

  public BusinessIncorporation isPublic(Boolean isPublic) {
    this.isPublic = isPublic;
    return this;
  }

   /**
   * Get isPublic
   * @return isPublic
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsPublic() {
    return isPublic;
  }

  public void setIsPublic(Boolean isPublic) {
    this.isPublic = isPublic;
  }

  public BusinessIncorporation stockSymbol(String stockSymbol) {
    this.stockSymbol = stockSymbol;
    return this;
  }

   /**
   * Get stockSymbol
   * @return stockSymbol
  **/
  @ApiModelProperty(value = "")
  public String getStockSymbol() {
    return stockSymbol;
  }

  public void setStockSymbol(String stockSymbol) {
    this.stockSymbol = stockSymbol;
  }

  public BusinessIncorporation stateOfIncorporation(String stateOfIncorporation) {
    this.stateOfIncorporation = stateOfIncorporation;
    return this;
  }

   /**
   * Get stateOfIncorporation
   * @return stateOfIncorporation
  **/
  @ApiModelProperty(value = "")
  public String getStateOfIncorporation() {
    return stateOfIncorporation;
  }

  public void setStateOfIncorporation(String stateOfIncorporation) {
    this.stateOfIncorporation = stateOfIncorporation;
  }

  public BusinessIncorporation nameRegisteredUnder(String nameRegisteredUnder) {
    this.nameRegisteredUnder = nameRegisteredUnder;
    return this;
  }

   /**
   * Get nameRegisteredUnder
   * @return nameRegisteredUnder
  **/
  @ApiModelProperty(value = "")
  public String getNameRegisteredUnder() {
    return nameRegisteredUnder;
  }

  public void setNameRegisteredUnder(String nameRegisteredUnder) {
    this.nameRegisteredUnder = nameRegisteredUnder;
  }

  public BusinessIncorporation addressRegisteredUnder(AddressRequestModel addressRegisteredUnder) {
    this.addressRegisteredUnder = addressRegisteredUnder;
    return this;
  }

   /**
   * Get addressRegisteredUnder
   * @return addressRegisteredUnder
  **/
  @ApiModelProperty(value = "")
  public AddressRequestModel getAddressRegisteredUnder() {
    return addressRegisteredUnder;
  }

  public void setAddressRegisteredUnder(AddressRequestModel addressRegisteredUnder) {
    this.addressRegisteredUnder = addressRegisteredUnder;
  }

  public BusinessIncorporation incorporationType(IncorporationTypeEnum incorporationType) {
    this.incorporationType = incorporationType;
    return this;
  }

   /**
   * Get incorporationType
   * @return incorporationType
  **/
  @ApiModelProperty(value = "")
  public IncorporationTypeEnum getIncorporationType() {
    return incorporationType;
  }

  public void setIncorporationType(IncorporationTypeEnum incorporationType) {
    this.incorporationType = incorporationType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessIncorporation businessIncorporation = (BusinessIncorporation) o;
    return Objects.equals(this.isPublic, businessIncorporation.isPublic) &&
        Objects.equals(this.stockSymbol, businessIncorporation.stockSymbol) &&
        Objects.equals(this.stateOfIncorporation, businessIncorporation.stateOfIncorporation) &&
        Objects.equals(this.nameRegisteredUnder, businessIncorporation.nameRegisteredUnder) &&
        Objects.equals(this.addressRegisteredUnder, businessIncorporation.addressRegisteredUnder) &&
        Objects.equals(this.incorporationType, businessIncorporation.incorporationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isPublic, stockSymbol, stateOfIncorporation, nameRegisteredUnder, addressRegisteredUnder, incorporationType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessIncorporation {\n");
    
    sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
    sb.append("    stockSymbol: ").append(toIndentedString(stockSymbol)).append("\n");
    sb.append("    stateOfIncorporation: ").append(toIndentedString(stateOfIncorporation)).append("\n");
    sb.append("    nameRegisteredUnder: ").append(toIndentedString(nameRegisteredUnder)).append("\n");
    sb.append("    addressRegisteredUnder: ").append(toIndentedString(addressRegisteredUnder)).append("\n");
    sb.append("    incorporationType: ").append(toIndentedString(incorporationType)).append("\n");
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

