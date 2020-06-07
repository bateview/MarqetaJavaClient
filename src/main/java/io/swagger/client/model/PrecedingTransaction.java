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
 * PrecedingTransaction
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class PrecedingTransaction {
  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("token")
  private String token = null;

  public PrecedingTransaction amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Amount of the preceding transaction
   * @return amount
  **/
  @ApiModelProperty(value = "Amount of the preceding transaction")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public PrecedingTransaction token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Token of the preceding transaction
   * @return token
  **/
  @ApiModelProperty(value = "Token of the preceding transaction")
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
    PrecedingTransaction precedingTransaction = (PrecedingTransaction) o;
    return Objects.equals(this.amount, precedingTransaction.amount) &&
        Objects.equals(this.token, precedingTransaction.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, token);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrecedingTransaction {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
