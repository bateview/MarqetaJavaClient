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
import io.swagger.client.model.FulfillmentAddressRequest;
import java.io.IOException;

/**
 * Shipping
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class Shipping {
  /**
   * Gets or Sets method
   */
  @JsonAdapter(MethodEnum.Adapter.class)
  public enum MethodEnum {
    FEDEX_EXPEDITED("FEDEX_EXPEDITED"),
    
    FEDEX_REGULAR("FEDEX_REGULAR"),
    
    UPS_EXPEDITED("UPS_EXPEDITED"),
    
    UPS_REGULAR("UPS_REGULAR"),
    
    USPS_EXPEDITED("USPS_EXPEDITED"),
    
    USPS_REGULAR("USPS_REGULAR");

    private String value;

    MethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MethodEnum fromValue(String text) {
      for (MethodEnum b : MethodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MethodEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MethodEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("method")
  private MethodEnum method = null;

  @SerializedName("return_address")
  private FulfillmentAddressRequest returnAddress = null;

  @SerializedName("recipient_address")
  private FulfillmentAddressRequest recipientAddress = null;

  @SerializedName("care_of_line")
  private String careOfLine = null;

  public Shipping method(MethodEnum method) {
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @ApiModelProperty(value = "")
  public MethodEnum getMethod() {
    return method;
  }

  public void setMethod(MethodEnum method) {
    this.method = method;
  }

  public Shipping returnAddress(FulfillmentAddressRequest returnAddress) {
    this.returnAddress = returnAddress;
    return this;
  }

   /**
   * Get returnAddress
   * @return returnAddress
  **/
  @ApiModelProperty(value = "")
  public FulfillmentAddressRequest getReturnAddress() {
    return returnAddress;
  }

  public void setReturnAddress(FulfillmentAddressRequest returnAddress) {
    this.returnAddress = returnAddress;
  }

  public Shipping recipientAddress(FulfillmentAddressRequest recipientAddress) {
    this.recipientAddress = recipientAddress;
    return this;
  }

   /**
   * Get recipientAddress
   * @return recipientAddress
  **/
  @ApiModelProperty(value = "")
  public FulfillmentAddressRequest getRecipientAddress() {
    return recipientAddress;
  }

  public void setRecipientAddress(FulfillmentAddressRequest recipientAddress) {
    this.recipientAddress = recipientAddress;
  }

  public Shipping careOfLine(String careOfLine) {
    this.careOfLine = careOfLine;
    return this;
  }

   /**
   * 255 char max
   * @return careOfLine
  **/
  @ApiModelProperty(value = "255 char max")
  public String getCareOfLine() {
    return careOfLine;
  }

  public void setCareOfLine(String careOfLine) {
    this.careOfLine = careOfLine;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Shipping shipping = (Shipping) o;
    return Objects.equals(this.method, shipping.method) &&
        Objects.equals(this.returnAddress, shipping.returnAddress) &&
        Objects.equals(this.recipientAddress, shipping.recipientAddress) &&
        Objects.equals(this.careOfLine, shipping.careOfLine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(method, returnAddress, recipientAddress, careOfLine);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Shipping {\n");
    
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    returnAddress: ").append(toIndentedString(returnAddress)).append("\n");
    sb.append("    recipientAddress: ").append(toIndentedString(recipientAddress)).append("\n");
    sb.append("    careOfLine: ").append(toIndentedString(careOfLine)).append("\n");
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

