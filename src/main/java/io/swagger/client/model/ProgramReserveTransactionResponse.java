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
import org.threeten.bp.OffsetDateTime;

/**
 * ProgramReserveTransactionResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class ProgramReserveTransactionResponse {
  @SerializedName("created_time")
  private OffsetDateTime createdTime = null;

  @SerializedName("last_modified_time")
  private OffsetDateTime lastModifiedTime = null;

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

  @SerializedName("transaction_token")
  private String transactionToken = null;

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

  /**
   * Gets or Sets state
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    PENDING("PENDING"),
    
    COMPLETE("COMPLETE");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("state")
  private StateEnum state = null;

  public ProgramReserveTransactionResponse createdTime(OffsetDateTime createdTime) {
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

  public ProgramReserveTransactionResponse lastModifiedTime(OffsetDateTime lastModifiedTime) {
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

  public ProgramReserveTransactionResponse token(String token) {
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

  public ProgramReserveTransactionResponse amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public ProgramReserveTransactionResponse currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @ApiModelProperty(value = "")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public ProgramReserveTransactionResponse memo(String memo) {
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

  public ProgramReserveTransactionResponse tags(String tags) {
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

  public ProgramReserveTransactionResponse transactionToken(String transactionToken) {
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

  public ProgramReserveTransactionResponse type(TypeEnum type) {
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

  public ProgramReserveTransactionResponse state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProgramReserveTransactionResponse programReserveTransactionResponse = (ProgramReserveTransactionResponse) o;
    return Objects.equals(this.createdTime, programReserveTransactionResponse.createdTime) &&
        Objects.equals(this.lastModifiedTime, programReserveTransactionResponse.lastModifiedTime) &&
        Objects.equals(this.token, programReserveTransactionResponse.token) &&
        Objects.equals(this.amount, programReserveTransactionResponse.amount) &&
        Objects.equals(this.currencyCode, programReserveTransactionResponse.currencyCode) &&
        Objects.equals(this.memo, programReserveTransactionResponse.memo) &&
        Objects.equals(this.tags, programReserveTransactionResponse.tags) &&
        Objects.equals(this.transactionToken, programReserveTransactionResponse.transactionToken) &&
        Objects.equals(this.type, programReserveTransactionResponse.type) &&
        Objects.equals(this.state, programReserveTransactionResponse.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdTime, lastModifiedTime, token, amount, currencyCode, memo, tags, transactionToken, type, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProgramReserveTransactionResponse {\n");
    
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    transactionToken: ").append(toIndentedString(transactionToken)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

