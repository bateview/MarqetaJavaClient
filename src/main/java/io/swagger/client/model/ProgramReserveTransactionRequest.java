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

/**
 * ProgramReserveTransactionRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class ProgramReserveTransactionRequest {
  @SerializedName("idempotentHash")
  private String idempotentHash = null;

  @SerializedName("token")
  private String token = null;

  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("memo")
  private String memo = null;

  @SerializedName("tags")
  private String tags = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    CREDIT("CREDIT"),
    
    DEBIT("DEBIT"),
    
    PENDING_CREDIT("PENDING_CREDIT"),
    
    PENDING_DEBIT("PENDING_DEBIT");

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

  public ProgramReserveTransactionRequest idempotentHash(String idempotentHash) {
    this.idempotentHash = idempotentHash;
    return this;
  }

   /**
   * Get idempotentHash
   * @return idempotentHash
  **/
  @ApiModelProperty(value = "")
  public String getIdempotentHash() {
    return idempotentHash;
  }

  public void setIdempotentHash(String idempotentHash) {
    this.idempotentHash = idempotentHash;
  }

  public ProgramReserveTransactionRequest token(String token) {
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

  public ProgramReserveTransactionRequest amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public ProgramReserveTransactionRequest currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public ProgramReserveTransactionRequest memo(String memo) {
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

  public ProgramReserveTransactionRequest tags(String tags) {
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

  public ProgramReserveTransactionRequest type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProgramReserveTransactionRequest programReserveTransactionRequest = (ProgramReserveTransactionRequest) o;
    return Objects.equals(this.idempotentHash, programReserveTransactionRequest.idempotentHash) &&
        Objects.equals(this.token, programReserveTransactionRequest.token) &&
        Objects.equals(this.amount, programReserveTransactionRequest.amount) &&
        Objects.equals(this.currencyCode, programReserveTransactionRequest.currencyCode) &&
        Objects.equals(this.memo, programReserveTransactionRequest.memo) &&
        Objects.equals(this.tags, programReserveTransactionRequest.tags) &&
        Objects.equals(this.type, programReserveTransactionRequest.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idempotentHash, token, amount, currencyCode, memo, tags, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProgramReserveTransactionRequest {\n");
    
    sb.append("    idempotentHash: ").append(toIndentedString(idempotentHash)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

