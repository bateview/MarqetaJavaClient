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
 * ChargebackTransitionResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class ChargebackTransitionResponse {
  @SerializedName("token")
  private String token = null;

  /**
   * Gets or Sets state
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    INITIATED("INITIATED"),
    
    REPRESENTMENT("REPRESENTMENT"),
    
    PREARBITRATION("PREARBITRATION"),
    
    ARBITRATION("ARBITRATION"),
    
    CASE_WON("CASE_WON"),
    
    CASE_LOST("CASE_LOST"),
    
    NETWORK_REJECTED("NETWORK_REJECTED"),
    
    WITHDRAWN("WITHDRAWN"),
    
    WRITTEN_OFF_ISSUER("WRITTEN_OFF_ISSUER"),
    
    WRITTEN_OFF_PROGRAM("WRITTEN_OFF_PROGRAM");

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

  /**
   * Gets or Sets previousState
   */
  @JsonAdapter(PreviousStateEnum.Adapter.class)
  public enum PreviousStateEnum {
    INITIATED("INITIATED"),
    
    REPRESENTMENT("REPRESENTMENT"),
    
    PREARBITRATION("PREARBITRATION"),
    
    ARBITRATION("ARBITRATION"),
    
    CASE_WON("CASE_WON"),
    
    CASE_LOST("CASE_LOST"),
    
    NETWORK_REJECTED("NETWORK_REJECTED"),
    
    WITHDRAWN("WITHDRAWN");

    private String value;

    PreviousStateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PreviousStateEnum fromValue(String text) {
      for (PreviousStateEnum b : PreviousStateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PreviousStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PreviousStateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PreviousStateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PreviousStateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("previous_state")
  private PreviousStateEnum previousState = null;

  /**
   * Gets or Sets channel
   */
  @JsonAdapter(ChannelEnum.Adapter.class)
  public enum ChannelEnum {
    GATEWAY("GATEWAY"),
    
    GATEWAY_AUTOMATED("GATEWAY_AUTOMATED"),
    
    ISSUER("ISSUER"),
    
    ISSUER_AUTOMATED("ISSUER_AUTOMATED");

    private String value;

    ChannelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ChannelEnum fromValue(String text) {
      for (ChannelEnum b : ChannelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ChannelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChannelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ChannelEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ChannelEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("channel")
  private ChannelEnum channel = null;

  @SerializedName("chargeback_token")
  private String chargebackToken = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("transaction_token")
  private String transactionToken = null;

  @SerializedName("created_time")
  private OffsetDateTime createdTime = null;

  @SerializedName("last_modified_time")
  private OffsetDateTime lastModifiedTime = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    INITIATED("initiated"),
    
    REPRESENTMENT("representment"),
    
    PREARBITRATION("prearbitration"),
    
    ARBITRATION("arbitration"),
    
    CASE_WON("case.won"),
    
    CASE_LOST("case.lost"),
    
    NETWORK_REJECTED("network.rejected"),
    
    WRITTEN_OFF_ISSUER("written.off.issuer"),
    
    WRITTEN_OFF_PROGRAM("written.off.program");

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

  @SerializedName("amount")
  private BigDecimal amount = null;

  public ChargebackTransitionResponse token(String token) {
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

  public ChargebackTransitionResponse state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(required = true, value = "")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public ChargebackTransitionResponse previousState(PreviousStateEnum previousState) {
    this.previousState = previousState;
    return this;
  }

   /**
   * Get previousState
   * @return previousState
  **/
  @ApiModelProperty(required = true, value = "")
  public PreviousStateEnum getPreviousState() {
    return previousState;
  }

  public void setPreviousState(PreviousStateEnum previousState) {
    this.previousState = previousState;
  }

  public ChargebackTransitionResponse channel(ChannelEnum channel) {
    this.channel = channel;
    return this;
  }

   /**
   * Get channel
   * @return channel
  **/
  @ApiModelProperty(required = true, value = "")
  public ChannelEnum getChannel() {
    return channel;
  }

  public void setChannel(ChannelEnum channel) {
    this.channel = channel;
  }

  public ChargebackTransitionResponse chargebackToken(String chargebackToken) {
    this.chargebackToken = chargebackToken;
    return this;
  }

   /**
   * Get chargebackToken
   * @return chargebackToken
  **/
  @ApiModelProperty(required = true, value = "")
  public String getChargebackToken() {
    return chargebackToken;
  }

  public void setChargebackToken(String chargebackToken) {
    this.chargebackToken = chargebackToken;
  }

  public ChargebackTransitionResponse reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @ApiModelProperty(value = "")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public ChargebackTransitionResponse transactionToken(String transactionToken) {
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

  public ChargebackTransitionResponse createdTime(OffsetDateTime createdTime) {
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

  public ChargebackTransitionResponse lastModifiedTime(OffsetDateTime lastModifiedTime) {
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

  public ChargebackTransitionResponse type(TypeEnum type) {
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

  public ChargebackTransitionResponse amount(BigDecimal amount) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargebackTransitionResponse chargebackTransitionResponse = (ChargebackTransitionResponse) o;
    return Objects.equals(this.token, chargebackTransitionResponse.token) &&
        Objects.equals(this.state, chargebackTransitionResponse.state) &&
        Objects.equals(this.previousState, chargebackTransitionResponse.previousState) &&
        Objects.equals(this.channel, chargebackTransitionResponse.channel) &&
        Objects.equals(this.chargebackToken, chargebackTransitionResponse.chargebackToken) &&
        Objects.equals(this.reason, chargebackTransitionResponse.reason) &&
        Objects.equals(this.transactionToken, chargebackTransitionResponse.transactionToken) &&
        Objects.equals(this.createdTime, chargebackTransitionResponse.createdTime) &&
        Objects.equals(this.lastModifiedTime, chargebackTransitionResponse.lastModifiedTime) &&
        Objects.equals(this.type, chargebackTransitionResponse.type) &&
        Objects.equals(this.amount, chargebackTransitionResponse.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, state, previousState, channel, chargebackToken, reason, transactionToken, createdTime, lastModifiedTime, type, amount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargebackTransitionResponse {\n");
    
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    previousState: ").append(toIndentedString(previousState)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    chargebackToken: ").append(toIndentedString(chargebackToken)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    transactionToken: ").append(toIndentedString(transactionToken)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
