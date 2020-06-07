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
 * DirectDepositAccountRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class DirectDepositAccountRequest {
  @SerializedName("user_token")
  private String userToken = null;

  @SerializedName("business_token")
  private String businessToken = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    DEPOSIT_ACCOUNT("DEPOSIT_ACCOUNT"),
    
    CHECKING("CHECKING"),
    
    SAVINGS("SAVINGS");

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

  @SerializedName("allow_immediate_credit")
  private Boolean allowImmediateCredit = false;

  @SerializedName("token")
  private String token = null;

  public DirectDepositAccountRequest userToken(String userToken) {
    this.userToken = userToken;
    return this;
  }

   /**
   * Required if &#39;business_token&#39; is null
   * @return userToken
  **/
  @ApiModelProperty(value = "Required if 'business_token' is null")
  public String getUserToken() {
    return userToken;
  }

  public void setUserToken(String userToken) {
    this.userToken = userToken;
  }

  public DirectDepositAccountRequest businessToken(String businessToken) {
    this.businessToken = businessToken;
    return this;
  }

   /**
   * Required if &#39;user_token&#39; is null
   * @return businessToken
  **/
  @ApiModelProperty(value = "Required if 'user_token' is null")
  public String getBusinessToken() {
    return businessToken;
  }

  public void setBusinessToken(String businessToken) {
    this.businessToken = businessToken;
  }

  public DirectDepositAccountRequest type(TypeEnum type) {
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

  public DirectDepositAccountRequest allowImmediateCredit(Boolean allowImmediateCredit) {
    this.allowImmediateCredit = allowImmediateCredit;
    return this;
  }

   /**
   * Get allowImmediateCredit
   * @return allowImmediateCredit
  **/
  @ApiModelProperty(value = "")
  public Boolean isAllowImmediateCredit() {
    return allowImmediateCredit;
  }

  public void setAllowImmediateCredit(Boolean allowImmediateCredit) {
    this.allowImmediateCredit = allowImmediateCredit;
  }

  public DirectDepositAccountRequest token(String token) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirectDepositAccountRequest directDepositAccountRequest = (DirectDepositAccountRequest) o;
    return Objects.equals(this.userToken, directDepositAccountRequest.userToken) &&
        Objects.equals(this.businessToken, directDepositAccountRequest.businessToken) &&
        Objects.equals(this.type, directDepositAccountRequest.type) &&
        Objects.equals(this.allowImmediateCredit, directDepositAccountRequest.allowImmediateCredit) &&
        Objects.equals(this.token, directDepositAccountRequest.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userToken, businessToken, type, allowImmediateCredit, token);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectDepositAccountRequest {\n");
    
    sb.append("    userToken: ").append(toIndentedString(userToken)).append("\n");
    sb.append("    businessToken: ").append(toIndentedString(businessToken)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    allowImmediateCredit: ").append(toIndentedString(allowImmediateCredit)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

