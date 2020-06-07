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
import io.swagger.client.model.CardAcceptorModel;
import io.swagger.client.model.Webhook;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * WithdrawalRequestModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class WithdrawalRequestModel {
  /**
   * Gets or Sets accountType
   */
  @JsonAdapter(AccountTypeEnum.Adapter.class)
  public enum AccountTypeEnum {
    CHECKING("checking"),
    
    SAVINGS("savings"),
    
    CREDIT("credit");

    private String value;

    AccountTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccountTypeEnum fromValue(String text) {
      for (AccountTypeEnum b : AccountTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AccountTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccountTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccountTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AccountTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("account_type")
  private AccountTypeEnum accountType = null;

  @SerializedName("card_token")
  private String cardToken = null;

  @SerializedName("pin")
  private String pin = null;

  @SerializedName("mid")
  private String mid = null;

  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("card_acceptor")
  private CardAcceptorModel cardAcceptor = null;

  @SerializedName("webhook")
  private Webhook webhook = null;

  public WithdrawalRequestModel accountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @ApiModelProperty(value = "")
  public AccountTypeEnum getAccountType() {
    return accountType;
  }

  public void setAccountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
  }

  public WithdrawalRequestModel cardToken(String cardToken) {
    this.cardToken = cardToken;
    return this;
  }

   /**
   * Get cardToken
   * @return cardToken
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCardToken() {
    return cardToken;
  }

  public void setCardToken(String cardToken) {
    this.cardToken = cardToken;
  }

  public WithdrawalRequestModel pin(String pin) {
    this.pin = pin;
    return this;
  }

   /**
   * Get pin
   * @return pin
  **/
  @ApiModelProperty(value = "")
  public String getPin() {
    return pin;
  }

  public void setPin(String pin) {
    this.pin = pin;
  }

  public WithdrawalRequestModel mid(String mid) {
    this.mid = mid;
    return this;
  }

   /**
   * Get mid
   * @return mid
  **/
  @ApiModelProperty(required = true, value = "")
  public String getMid() {
    return mid;
  }

  public void setMid(String mid) {
    this.mid = mid;
  }

  public WithdrawalRequestModel amount(BigDecimal amount) {
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

  public WithdrawalRequestModel cardAcceptor(CardAcceptorModel cardAcceptor) {
    this.cardAcceptor = cardAcceptor;
    return this;
  }

   /**
   * Get cardAcceptor
   * @return cardAcceptor
  **/
  @ApiModelProperty(value = "")
  public CardAcceptorModel getCardAcceptor() {
    return cardAcceptor;
  }

  public void setCardAcceptor(CardAcceptorModel cardAcceptor) {
    this.cardAcceptor = cardAcceptor;
  }

  public WithdrawalRequestModel webhook(Webhook webhook) {
    this.webhook = webhook;
    return this;
  }

   /**
   * Get webhook
   * @return webhook
  **/
  @ApiModelProperty(value = "")
  public Webhook getWebhook() {
    return webhook;
  }

  public void setWebhook(Webhook webhook) {
    this.webhook = webhook;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WithdrawalRequestModel withdrawalRequestModel = (WithdrawalRequestModel) o;
    return Objects.equals(this.accountType, withdrawalRequestModel.accountType) &&
        Objects.equals(this.cardToken, withdrawalRequestModel.cardToken) &&
        Objects.equals(this.pin, withdrawalRequestModel.pin) &&
        Objects.equals(this.mid, withdrawalRequestModel.mid) &&
        Objects.equals(this.amount, withdrawalRequestModel.amount) &&
        Objects.equals(this.cardAcceptor, withdrawalRequestModel.cardAcceptor) &&
        Objects.equals(this.webhook, withdrawalRequestModel.webhook);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountType, cardToken, pin, mid, amount, cardAcceptor, webhook);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WithdrawalRequestModel {\n");
    
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    cardToken: ").append(toIndentedString(cardToken)).append("\n");
    sb.append("    pin: ").append(toIndentedString(pin)).append("\n");
    sb.append("    mid: ").append(toIndentedString(mid)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    cardAcceptor: ").append(toIndentedString(cardAcceptor)).append("\n");
    sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
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
