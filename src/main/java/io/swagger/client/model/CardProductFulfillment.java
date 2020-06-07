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
import io.swagger.client.model.CardPersonalization;
import io.swagger.client.model.Shipping;
import java.io.IOException;

/**
 * CardProductFulfillment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class CardProductFulfillment {
  @SerializedName("shipping")
  private Shipping shipping = null;

  @SerializedName("card_personalization")
  private CardPersonalization cardPersonalization = null;

  /**
   * Gets or Sets paymentInstrument
   */
  @JsonAdapter(PaymentInstrumentEnum.Adapter.class)
  public enum PaymentInstrumentEnum {
    PHYSICAL_MSR("PHYSICAL_MSR"),
    
    PHYSICAL_ICC("PHYSICAL_ICC"),
    
    PHYSICAL_CONTACTLESS("PHYSICAL_CONTACTLESS"),
    
    PHYSICAL_COMBO("PHYSICAL_COMBO"),
    
    VIRTUAL_PAN("VIRTUAL_PAN");

    private String value;

    PaymentInstrumentEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PaymentInstrumentEnum fromValue(String text) {
      for (PaymentInstrumentEnum b : PaymentInstrumentEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PaymentInstrumentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PaymentInstrumentEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PaymentInstrumentEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PaymentInstrumentEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("payment_instrument")
  private PaymentInstrumentEnum paymentInstrument = PaymentInstrumentEnum.PHYSICAL_MSR;

  @SerializedName("package_id")
  private String packageId = "0";

  @SerializedName("all_zero_card_security_code")
  private Boolean allZeroCardSecurityCode = false;

  @SerializedName("bin_prefix")
  private String binPrefix = null;

  @SerializedName("bulk_ship")
  private Boolean bulkShip = false;

  @SerializedName("pan_length")
  private String panLength = "16";

  /**
   * Gets or Sets fulfillmentProvider
   */
  @JsonAdapter(FulfillmentProviderEnum.Adapter.class)
  public enum FulfillmentProviderEnum {
    PERFECTPLASTIC("PERFECTPLASTIC"),
    
    ARROWEYE("ARROWEYE"),
    
    IDEMIA("IDEMIA"),
    
    IDEMIA_UK("IDEMIA_UK"),
    
    IDEMIA_FR("IDEMIA_FR"),
    
    IDEMIA_CZ("IDEMIA_CZ"),
    
    IDEMIA_APAC("IDEMIA_APAC"),
    
    IDEMIA_PL("IDEMIA_PL"),
    
    GEMALTO("GEMALTO"),
    
    NITECREST("NITECREST"),
    
    OBERTHUR("OBERTHUR");

    private String value;

    FulfillmentProviderEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FulfillmentProviderEnum fromValue(String text) {
      for (FulfillmentProviderEnum b : FulfillmentProviderEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FulfillmentProviderEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FulfillmentProviderEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FulfillmentProviderEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FulfillmentProviderEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("fulfillment_provider")
  private FulfillmentProviderEnum fulfillmentProvider = FulfillmentProviderEnum.PERFECTPLASTIC;

  @SerializedName("allow_card_creation")
  private Boolean allowCardCreation = true;

  @SerializedName("uppercase_name_lines")
  private Boolean uppercaseNameLines = true;

  @SerializedName("enable_offline_pin")
  private Boolean enableOfflinePin = false;

  public CardProductFulfillment shipping(Shipping shipping) {
    this.shipping = shipping;
    return this;
  }

   /**
   * Get shipping
   * @return shipping
  **/
  @ApiModelProperty(value = "")
  public Shipping getShipping() {
    return shipping;
  }

  public void setShipping(Shipping shipping) {
    this.shipping = shipping;
  }

  public CardProductFulfillment cardPersonalization(CardPersonalization cardPersonalization) {
    this.cardPersonalization = cardPersonalization;
    return this;
  }

   /**
   * Get cardPersonalization
   * @return cardPersonalization
  **/
  @ApiModelProperty(required = true, value = "")
  public CardPersonalization getCardPersonalization() {
    return cardPersonalization;
  }

  public void setCardPersonalization(CardPersonalization cardPersonalization) {
    this.cardPersonalization = cardPersonalization;
  }

  public CardProductFulfillment paymentInstrument(PaymentInstrumentEnum paymentInstrument) {
    this.paymentInstrument = paymentInstrument;
    return this;
  }

   /**
   * Get paymentInstrument
   * @return paymentInstrument
  **/
  @ApiModelProperty(value = "")
  public PaymentInstrumentEnum getPaymentInstrument() {
    return paymentInstrument;
  }

  public void setPaymentInstrument(PaymentInstrumentEnum paymentInstrument) {
    this.paymentInstrument = paymentInstrument;
  }

  public CardProductFulfillment packageId(String packageId) {
    this.packageId = packageId;
    return this;
  }

   /**
   * Get packageId
   * @return packageId
  **/
  @ApiModelProperty(value = "")
  public String getPackageId() {
    return packageId;
  }

  public void setPackageId(String packageId) {
    this.packageId = packageId;
  }

  public CardProductFulfillment allZeroCardSecurityCode(Boolean allZeroCardSecurityCode) {
    this.allZeroCardSecurityCode = allZeroCardSecurityCode;
    return this;
  }

   /**
   * Get allZeroCardSecurityCode
   * @return allZeroCardSecurityCode
  **/
  @ApiModelProperty(value = "")
  public Boolean isAllZeroCardSecurityCode() {
    return allZeroCardSecurityCode;
  }

  public void setAllZeroCardSecurityCode(Boolean allZeroCardSecurityCode) {
    this.allZeroCardSecurityCode = allZeroCardSecurityCode;
  }

  public CardProductFulfillment binPrefix(String binPrefix) {
    this.binPrefix = binPrefix;
    return this;
  }

   /**
   * Get binPrefix
   * @return binPrefix
  **/
  @ApiModelProperty(value = "")
  public String getBinPrefix() {
    return binPrefix;
  }

  public void setBinPrefix(String binPrefix) {
    this.binPrefix = binPrefix;
  }

  public CardProductFulfillment bulkShip(Boolean bulkShip) {
    this.bulkShip = bulkShip;
    return this;
  }

   /**
   * Get bulkShip
   * @return bulkShip
  **/
  @ApiModelProperty(value = "")
  public Boolean isBulkShip() {
    return bulkShip;
  }

  public void setBulkShip(Boolean bulkShip) {
    this.bulkShip = bulkShip;
  }

  public CardProductFulfillment panLength(String panLength) {
    this.panLength = panLength;
    return this;
  }

   /**
   * Get panLength
   * @return panLength
  **/
  @ApiModelProperty(value = "")
  public String getPanLength() {
    return panLength;
  }

  public void setPanLength(String panLength) {
    this.panLength = panLength;
  }

  public CardProductFulfillment fulfillmentProvider(FulfillmentProviderEnum fulfillmentProvider) {
    this.fulfillmentProvider = fulfillmentProvider;
    return this;
  }

   /**
   * Get fulfillmentProvider
   * @return fulfillmentProvider
  **/
  @ApiModelProperty(value = "")
  public FulfillmentProviderEnum getFulfillmentProvider() {
    return fulfillmentProvider;
  }

  public void setFulfillmentProvider(FulfillmentProviderEnum fulfillmentProvider) {
    this.fulfillmentProvider = fulfillmentProvider;
  }

  public CardProductFulfillment allowCardCreation(Boolean allowCardCreation) {
    this.allowCardCreation = allowCardCreation;
    return this;
  }

   /**
   * Get allowCardCreation
   * @return allowCardCreation
  **/
  @ApiModelProperty(value = "")
  public Boolean isAllowCardCreation() {
    return allowCardCreation;
  }

  public void setAllowCardCreation(Boolean allowCardCreation) {
    this.allowCardCreation = allowCardCreation;
  }

  public CardProductFulfillment uppercaseNameLines(Boolean uppercaseNameLines) {
    this.uppercaseNameLines = uppercaseNameLines;
    return this;
  }

   /**
   * Get uppercaseNameLines
   * @return uppercaseNameLines
  **/
  @ApiModelProperty(value = "")
  public Boolean isUppercaseNameLines() {
    return uppercaseNameLines;
  }

  public void setUppercaseNameLines(Boolean uppercaseNameLines) {
    this.uppercaseNameLines = uppercaseNameLines;
  }

  public CardProductFulfillment enableOfflinePin(Boolean enableOfflinePin) {
    this.enableOfflinePin = enableOfflinePin;
    return this;
  }

   /**
   * Get enableOfflinePin
   * @return enableOfflinePin
  **/
  @ApiModelProperty(value = "")
  public Boolean isEnableOfflinePin() {
    return enableOfflinePin;
  }

  public void setEnableOfflinePin(Boolean enableOfflinePin) {
    this.enableOfflinePin = enableOfflinePin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardProductFulfillment cardProductFulfillment = (CardProductFulfillment) o;
    return Objects.equals(this.shipping, cardProductFulfillment.shipping) &&
        Objects.equals(this.cardPersonalization, cardProductFulfillment.cardPersonalization) &&
        Objects.equals(this.paymentInstrument, cardProductFulfillment.paymentInstrument) &&
        Objects.equals(this.packageId, cardProductFulfillment.packageId) &&
        Objects.equals(this.allZeroCardSecurityCode, cardProductFulfillment.allZeroCardSecurityCode) &&
        Objects.equals(this.binPrefix, cardProductFulfillment.binPrefix) &&
        Objects.equals(this.bulkShip, cardProductFulfillment.bulkShip) &&
        Objects.equals(this.panLength, cardProductFulfillment.panLength) &&
        Objects.equals(this.fulfillmentProvider, cardProductFulfillment.fulfillmentProvider) &&
        Objects.equals(this.allowCardCreation, cardProductFulfillment.allowCardCreation) &&
        Objects.equals(this.uppercaseNameLines, cardProductFulfillment.uppercaseNameLines) &&
        Objects.equals(this.enableOfflinePin, cardProductFulfillment.enableOfflinePin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipping, cardPersonalization, paymentInstrument, packageId, allZeroCardSecurityCode, binPrefix, bulkShip, panLength, fulfillmentProvider, allowCardCreation, uppercaseNameLines, enableOfflinePin);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardProductFulfillment {\n");
    
    sb.append("    shipping: ").append(toIndentedString(shipping)).append("\n");
    sb.append("    cardPersonalization: ").append(toIndentedString(cardPersonalization)).append("\n");
    sb.append("    paymentInstrument: ").append(toIndentedString(paymentInstrument)).append("\n");
    sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
    sb.append("    allZeroCardSecurityCode: ").append(toIndentedString(allZeroCardSecurityCode)).append("\n");
    sb.append("    binPrefix: ").append(toIndentedString(binPrefix)).append("\n");
    sb.append("    bulkShip: ").append(toIndentedString(bulkShip)).append("\n");
    sb.append("    panLength: ").append(toIndentedString(panLength)).append("\n");
    sb.append("    fulfillmentProvider: ").append(toIndentedString(fulfillmentProvider)).append("\n");
    sb.append("    allowCardCreation: ").append(toIndentedString(allowCardCreation)).append("\n");
    sb.append("    uppercaseNameLines: ").append(toIndentedString(uppercaseNameLines)).append("\n");
    sb.append("    enableOfflinePin: ").append(toIndentedString(enableOfflinePin)).append("\n");
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
