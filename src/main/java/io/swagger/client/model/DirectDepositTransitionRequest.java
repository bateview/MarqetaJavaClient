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
 * DirectDepositTransitionRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class DirectDepositTransitionRequest {
  @SerializedName("token")
  private String token = null;

  /**
   * Gets or Sets channel
   */
  @JsonAdapter(ChannelEnum.Adapter.class)
  public enum ChannelEnum {
    API("API"),
    
    SYSTEM("SYSTEM"),
    
    PROD_SUPPORT("PROD_SUPPORT");

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

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("idempotentHash")
  private String idempotentHash = null;

  @SerializedName("direct_deposit_token")
  private String directDepositToken = null;

  /**
   * Gets or Sets state
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    PENDING("PENDING"),
    
    APPLIED("APPLIED"),
    
    REVERSED("REVERSED"),
    
    REJECTED("REJECTED");

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
   * Gets or Sets reasonCode
   */
  @JsonAdapter(ReasonCodeEnum.Adapter.class)
  public enum ReasonCodeEnum {
    R01("R01"),
    
    R02("R02"),
    
    R03("R03"),
    
    R04("R04"),
    
    R06("R06"),
    
    R08("R08"),
    
    R09("R09"),
    
    R10("R10"),
    
    R11("R11"),
    
    R14("R14"),
    
    R15("R15"),
    
    R16("R16"),
    
    R17("R17"),
    
    R18("R18"),
    
    R23("R23"),
    
    R24("R24"),
    
    R29("R29");

    private String value;

    ReasonCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReasonCodeEnum fromValue(String text) {
      for (ReasonCodeEnum b : ReasonCodeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ReasonCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReasonCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReasonCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ReasonCodeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("reason_code")
  private ReasonCodeEnum reasonCode = null;

  public DirectDepositTransitionRequest token(String token) {
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

  public DirectDepositTransitionRequest channel(ChannelEnum channel) {
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

  public DirectDepositTransitionRequest reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @ApiModelProperty(required = true, value = "")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public DirectDepositTransitionRequest idempotentHash(String idempotentHash) {
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

  public DirectDepositTransitionRequest directDepositToken(String directDepositToken) {
    this.directDepositToken = directDepositToken;
    return this;
  }

   /**
   * Get directDepositToken
   * @return directDepositToken
  **/
  @ApiModelProperty(required = true, value = "")
  public String getDirectDepositToken() {
    return directDepositToken;
  }

  public void setDirectDepositToken(String directDepositToken) {
    this.directDepositToken = directDepositToken;
  }

  public DirectDepositTransitionRequest state(StateEnum state) {
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

  public DirectDepositTransitionRequest reasonCode(ReasonCodeEnum reasonCode) {
    this.reasonCode = reasonCode;
    return this;
  }

   /**
   * Get reasonCode
   * @return reasonCode
  **/
  @ApiModelProperty(value = "")
  public ReasonCodeEnum getReasonCode() {
    return reasonCode;
  }

  public void setReasonCode(ReasonCodeEnum reasonCode) {
    this.reasonCode = reasonCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirectDepositTransitionRequest directDepositTransitionRequest = (DirectDepositTransitionRequest) o;
    return Objects.equals(this.token, directDepositTransitionRequest.token) &&
        Objects.equals(this.channel, directDepositTransitionRequest.channel) &&
        Objects.equals(this.reason, directDepositTransitionRequest.reason) &&
        Objects.equals(this.idempotentHash, directDepositTransitionRequest.idempotentHash) &&
        Objects.equals(this.directDepositToken, directDepositTransitionRequest.directDepositToken) &&
        Objects.equals(this.state, directDepositTransitionRequest.state) &&
        Objects.equals(this.reasonCode, directDepositTransitionRequest.reasonCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, channel, reason, idempotentHash, directDepositToken, state, reasonCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectDepositTransitionRequest {\n");
    
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    idempotentHash: ").append(toIndentedString(idempotentHash)).append("\n");
    sb.append("    directDepositToken: ").append(toIndentedString(directDepositToken)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
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

