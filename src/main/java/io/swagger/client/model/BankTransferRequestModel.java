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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * BankTransferRequestModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class BankTransferRequestModel {
  @SerializedName("token")
  private String token = null;

  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("fees")
  private List<BigDecimal> fees = null;

  @SerializedName("memo")
  private String memo = null;

  @SerializedName("funding_source_token")
  private String fundingSourceToken = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    PUSH("PUSH"),
    
    PULL("PULL");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("currency_code")
  private String currencyCode = null;

  /**
   * default &#x3D; STANDARD
   */
  @JsonAdapter(TransferSpeedEnum.Adapter.class)
  public enum TransferSpeedEnum {
    STANDARD("STANDARD"),
    
    SAME_DAY("SAME_DAY");

    private String value;

    TransferSpeedEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TransferSpeedEnum fromValue(String text) {
      for (TransferSpeedEnum b : TransferSpeedEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TransferSpeedEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TransferSpeedEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TransferSpeedEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TransferSpeedEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("transfer_speed")
  private TransferSpeedEnum transferSpeed = null;

  /**
   * Gets or Sets standardEntryClassCode
   */
  @JsonAdapter(StandardEntryClassCodeEnum.Adapter.class)
  public enum StandardEntryClassCodeEnum {
    WEB("WEB"),
    
    PPD("PPD"),
    
    CCD("CCD");

    private String value;

    StandardEntryClassCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StandardEntryClassCodeEnum fromValue(String text) {
      for (StandardEntryClassCodeEnum b : StandardEntryClassCodeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StandardEntryClassCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StandardEntryClassCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StandardEntryClassCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StandardEntryClassCodeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("standard_entry_class_code")
  private StandardEntryClassCodeEnum standardEntryClassCode = null;

  public BankTransferRequestModel token(String token) {
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

  public BankTransferRequestModel amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * minimum: 0.01
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public BankTransferRequestModel fees(List<BigDecimal> fees) {
    this.fees = fees;
    return this;
  }

  public BankTransferRequestModel addFeesItem(BigDecimal feesItem) {
    if (this.fees == null) {
      this.fees = new ArrayList<BigDecimal>();
    }
    this.fees.add(feesItem);
    return this;
  }

   /**
   * Get fees
   * @return fees
  **/
  @ApiModelProperty(value = "")
  public List<BigDecimal> getFees() {
    return fees;
  }

  public void setFees(List<BigDecimal> fees) {
    this.fees = fees;
  }

  public BankTransferRequestModel memo(String memo) {
    this.memo = memo;
    return this;
  }

   /**
   * Get memo
   * @return memo
  **/
  @ApiModelProperty(value = "")
  public String getMemo() {
    return memo;
  }

  public void setMemo(String memo) {
    this.memo = memo;
  }

  public BankTransferRequestModel fundingSourceToken(String fundingSourceToken) {
    this.fundingSourceToken = fundingSourceToken;
    return this;
  }

   /**
   * Get fundingSourceToken
   * @return fundingSourceToken
  **/
  @ApiModelProperty(required = true, value = "")
  public String getFundingSourceToken() {
    return fundingSourceToken;
  }

  public void setFundingSourceToken(String fundingSourceToken) {
    this.fundingSourceToken = fundingSourceToken;
  }

  public BankTransferRequestModel type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public BankTransferRequestModel currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * default &#x3D; USD
   * @return currencyCode
  **/
  @ApiModelProperty(value = "default = USD")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public BankTransferRequestModel transferSpeed(TransferSpeedEnum transferSpeed) {
    this.transferSpeed = transferSpeed;
    return this;
  }

   /**
   * default &#x3D; STANDARD
   * @return transferSpeed
  **/
  @ApiModelProperty(value = "default = STANDARD")
  public TransferSpeedEnum getTransferSpeed() {
    return transferSpeed;
  }

  public void setTransferSpeed(TransferSpeedEnum transferSpeed) {
    this.transferSpeed = transferSpeed;
  }

  public BankTransferRequestModel standardEntryClassCode(StandardEntryClassCodeEnum standardEntryClassCode) {
    this.standardEntryClassCode = standardEntryClassCode;
    return this;
  }

   /**
   * Get standardEntryClassCode
   * @return standardEntryClassCode
  **/
  @ApiModelProperty(required = true, value = "")
  public StandardEntryClassCodeEnum getStandardEntryClassCode() {
    return standardEntryClassCode;
  }

  public void setStandardEntryClassCode(StandardEntryClassCodeEnum standardEntryClassCode) {
    this.standardEntryClassCode = standardEntryClassCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankTransferRequestModel bankTransferRequestModel = (BankTransferRequestModel) o;
    return Objects.equals(this.token, bankTransferRequestModel.token) &&
        Objects.equals(this.amount, bankTransferRequestModel.amount) &&
        Objects.equals(this.fees, bankTransferRequestModel.fees) &&
        Objects.equals(this.memo, bankTransferRequestModel.memo) &&
        Objects.equals(this.fundingSourceToken, bankTransferRequestModel.fundingSourceToken) &&
        Objects.equals(this.type, bankTransferRequestModel.type) &&
        Objects.equals(this.currencyCode, bankTransferRequestModel.currencyCode) &&
        Objects.equals(this.transferSpeed, bankTransferRequestModel.transferSpeed) &&
        Objects.equals(this.standardEntryClassCode, bankTransferRequestModel.standardEntryClassCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, amount, fees, memo, fundingSourceToken, type, currencyCode, transferSpeed, standardEntryClassCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankTransferRequestModel {\n");
    
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    fundingSourceToken: ").append(toIndentedString(fundingSourceToken)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    transferSpeed: ").append(toIndentedString(transferSpeed)).append("\n");
    sb.append("    standardEntryClassCode: ").append(toIndentedString(standardEntryClassCode)).append("\n");
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

