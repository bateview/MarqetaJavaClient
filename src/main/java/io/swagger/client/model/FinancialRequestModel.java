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
import io.swagger.client.model.TransactionOptions;
import io.swagger.client.model.Webhook;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * FinancialRequestModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class FinancialRequestModel {
  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("card_token")
  private String cardToken = null;

  @SerializedName("pin")
  private String pin = null;

  @SerializedName("mid")
  private String mid = null;

  @SerializedName("cash_back_amount")
  private BigDecimal cashBackAmount = null;

  @SerializedName("is_pre_auth")
  private Boolean isPreAuth = false;

  @SerializedName("card_acceptor")
  private CardAcceptorModel cardAcceptor = null;

  @SerializedName("transaction_options")
  private TransactionOptions transactionOptions = null;

  @SerializedName("webhook")
  private Webhook webhook = null;

  public FinancialRequestModel amount(BigDecimal amount) {
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

  public FinancialRequestModel cardToken(String cardToken) {
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

  public FinancialRequestModel pin(String pin) {
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

  public FinancialRequestModel mid(String mid) {
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

  public FinancialRequestModel cashBackAmount(BigDecimal cashBackAmount) {
    this.cashBackAmount = cashBackAmount;
    return this;
  }

   /**
   * Get cashBackAmount
   * @return cashBackAmount
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getCashBackAmount() {
    return cashBackAmount;
  }

  public void setCashBackAmount(BigDecimal cashBackAmount) {
    this.cashBackAmount = cashBackAmount;
  }

  public FinancialRequestModel isPreAuth(Boolean isPreAuth) {
    this.isPreAuth = isPreAuth;
    return this;
  }

   /**
   * Get isPreAuth
   * @return isPreAuth
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsPreAuth() {
    return isPreAuth;
  }

  public void setIsPreAuth(Boolean isPreAuth) {
    this.isPreAuth = isPreAuth;
  }

  public FinancialRequestModel cardAcceptor(CardAcceptorModel cardAcceptor) {
    this.cardAcceptor = cardAcceptor;
    return this;
  }

   /**
   * Get cardAcceptor
   * @return cardAcceptor
  **/
  @ApiModelProperty(required = true, value = "")
  public CardAcceptorModel getCardAcceptor() {
    return cardAcceptor;
  }

  public void setCardAcceptor(CardAcceptorModel cardAcceptor) {
    this.cardAcceptor = cardAcceptor;
  }

  public FinancialRequestModel transactionOptions(TransactionOptions transactionOptions) {
    this.transactionOptions = transactionOptions;
    return this;
  }

   /**
   * Get transactionOptions
   * @return transactionOptions
  **/
  @ApiModelProperty(value = "")
  public TransactionOptions getTransactionOptions() {
    return transactionOptions;
  }

  public void setTransactionOptions(TransactionOptions transactionOptions) {
    this.transactionOptions = transactionOptions;
  }

  public FinancialRequestModel webhook(Webhook webhook) {
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
    FinancialRequestModel financialRequestModel = (FinancialRequestModel) o;
    return Objects.equals(this.amount, financialRequestModel.amount) &&
        Objects.equals(this.cardToken, financialRequestModel.cardToken) &&
        Objects.equals(this.pin, financialRequestModel.pin) &&
        Objects.equals(this.mid, financialRequestModel.mid) &&
        Objects.equals(this.cashBackAmount, financialRequestModel.cashBackAmount) &&
        Objects.equals(this.isPreAuth, financialRequestModel.isPreAuth) &&
        Objects.equals(this.cardAcceptor, financialRequestModel.cardAcceptor) &&
        Objects.equals(this.transactionOptions, financialRequestModel.transactionOptions) &&
        Objects.equals(this.webhook, financialRequestModel.webhook);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, cardToken, pin, mid, cashBackAmount, isPreAuth, cardAcceptor, transactionOptions, webhook);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialRequestModel {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    cardToken: ").append(toIndentedString(cardToken)).append("\n");
    sb.append("    pin: ").append(toIndentedString(pin)).append("\n");
    sb.append("    mid: ").append(toIndentedString(mid)).append("\n");
    sb.append("    cashBackAmount: ").append(toIndentedString(cashBackAmount)).append("\n");
    sb.append("    isPreAuth: ").append(toIndentedString(isPreAuth)).append("\n");
    sb.append("    cardAcceptor: ").append(toIndentedString(cardAcceptor)).append("\n");
    sb.append("    transactionOptions: ").append(toIndentedString(transactionOptions)).append("\n");
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
