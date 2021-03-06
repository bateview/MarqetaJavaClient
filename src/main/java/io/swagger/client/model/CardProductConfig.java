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
import io.swagger.client.model.CardLifeCycle;
import io.swagger.client.model.CardProductFulfillment;
import io.swagger.client.model.ClearingAndSettlement;
import io.swagger.client.model.DigitalWalletTokenization;
import io.swagger.client.model.JitFunding;
import io.swagger.client.model.Poi;
import io.swagger.client.model.SelectiveAuth;
import io.swagger.client.model.Special;
import io.swagger.client.model.TransactionControls;
import java.io.IOException;

/**
 * CardProductConfig
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class CardProductConfig {
  @SerializedName("poi")
  private Poi poi = null;

  @SerializedName("transaction_controls")
  private TransactionControls transactionControls = null;

  @SerializedName("selective_auth")
  private SelectiveAuth selectiveAuth = null;

  @SerializedName("special")
  private Special special = null;

  @SerializedName("card_life_cycle")
  private CardLifeCycle cardLifeCycle = null;

  @SerializedName("clearing_and_settlement")
  private ClearingAndSettlement clearingAndSettlement = null;

  @SerializedName("jit_funding")
  private JitFunding jitFunding = null;

  @SerializedName("digital_wallet_tokenization")
  private DigitalWalletTokenization digitalWalletTokenization = null;

  @SerializedName("fulfillment")
  private CardProductFulfillment fulfillment = null;

  public CardProductConfig poi(Poi poi) {
    this.poi = poi;
    return this;
  }

   /**
   * Get poi
   * @return poi
  **/
  @ApiModelProperty(value = "")
  public Poi getPoi() {
    return poi;
  }

  public void setPoi(Poi poi) {
    this.poi = poi;
  }

  public CardProductConfig transactionControls(TransactionControls transactionControls) {
    this.transactionControls = transactionControls;
    return this;
  }

   /**
   * Get transactionControls
   * @return transactionControls
  **/
  @ApiModelProperty(value = "")
  public TransactionControls getTransactionControls() {
    return transactionControls;
  }

  public void setTransactionControls(TransactionControls transactionControls) {
    this.transactionControls = transactionControls;
  }

  public CardProductConfig selectiveAuth(SelectiveAuth selectiveAuth) {
    this.selectiveAuth = selectiveAuth;
    return this;
  }

   /**
   * Get selectiveAuth
   * @return selectiveAuth
  **/
  @ApiModelProperty(value = "")
  public SelectiveAuth getSelectiveAuth() {
    return selectiveAuth;
  }

  public void setSelectiveAuth(SelectiveAuth selectiveAuth) {
    this.selectiveAuth = selectiveAuth;
  }

  public CardProductConfig special(Special special) {
    this.special = special;
    return this;
  }

   /**
   * Get special
   * @return special
  **/
  @ApiModelProperty(value = "")
  public Special getSpecial() {
    return special;
  }

  public void setSpecial(Special special) {
    this.special = special;
  }

  public CardProductConfig cardLifeCycle(CardLifeCycle cardLifeCycle) {
    this.cardLifeCycle = cardLifeCycle;
    return this;
  }

   /**
   * Get cardLifeCycle
   * @return cardLifeCycle
  **/
  @ApiModelProperty(value = "")
  public CardLifeCycle getCardLifeCycle() {
    return cardLifeCycle;
  }

  public void setCardLifeCycle(CardLifeCycle cardLifeCycle) {
    this.cardLifeCycle = cardLifeCycle;
  }

  public CardProductConfig clearingAndSettlement(ClearingAndSettlement clearingAndSettlement) {
    this.clearingAndSettlement = clearingAndSettlement;
    return this;
  }

   /**
   * Get clearingAndSettlement
   * @return clearingAndSettlement
  **/
  @ApiModelProperty(value = "")
  public ClearingAndSettlement getClearingAndSettlement() {
    return clearingAndSettlement;
  }

  public void setClearingAndSettlement(ClearingAndSettlement clearingAndSettlement) {
    this.clearingAndSettlement = clearingAndSettlement;
  }

  public CardProductConfig jitFunding(JitFunding jitFunding) {
    this.jitFunding = jitFunding;
    return this;
  }

   /**
   * Get jitFunding
   * @return jitFunding
  **/
  @ApiModelProperty(value = "")
  public JitFunding getJitFunding() {
    return jitFunding;
  }

  public void setJitFunding(JitFunding jitFunding) {
    this.jitFunding = jitFunding;
  }

  public CardProductConfig digitalWalletTokenization(DigitalWalletTokenization digitalWalletTokenization) {
    this.digitalWalletTokenization = digitalWalletTokenization;
    return this;
  }

   /**
   * Get digitalWalletTokenization
   * @return digitalWalletTokenization
  **/
  @ApiModelProperty(value = "")
  public DigitalWalletTokenization getDigitalWalletTokenization() {
    return digitalWalletTokenization;
  }

  public void setDigitalWalletTokenization(DigitalWalletTokenization digitalWalletTokenization) {
    this.digitalWalletTokenization = digitalWalletTokenization;
  }

  public CardProductConfig fulfillment(CardProductFulfillment fulfillment) {
    this.fulfillment = fulfillment;
    return this;
  }

   /**
   * Get fulfillment
   * @return fulfillment
  **/
  @ApiModelProperty(value = "")
  public CardProductFulfillment getFulfillment() {
    return fulfillment;
  }

  public void setFulfillment(CardProductFulfillment fulfillment) {
    this.fulfillment = fulfillment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardProductConfig cardProductConfig = (CardProductConfig) o;
    return Objects.equals(this.poi, cardProductConfig.poi) &&
        Objects.equals(this.transactionControls, cardProductConfig.transactionControls) &&
        Objects.equals(this.selectiveAuth, cardProductConfig.selectiveAuth) &&
        Objects.equals(this.special, cardProductConfig.special) &&
        Objects.equals(this.cardLifeCycle, cardProductConfig.cardLifeCycle) &&
        Objects.equals(this.clearingAndSettlement, cardProductConfig.clearingAndSettlement) &&
        Objects.equals(this.jitFunding, cardProductConfig.jitFunding) &&
        Objects.equals(this.digitalWalletTokenization, cardProductConfig.digitalWalletTokenization) &&
        Objects.equals(this.fulfillment, cardProductConfig.fulfillment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(poi, transactionControls, selectiveAuth, special, cardLifeCycle, clearingAndSettlement, jitFunding, digitalWalletTokenization, fulfillment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardProductConfig {\n");
    
    sb.append("    poi: ").append(toIndentedString(poi)).append("\n");
    sb.append("    transactionControls: ").append(toIndentedString(transactionControls)).append("\n");
    sb.append("    selectiveAuth: ").append(toIndentedString(selectiveAuth)).append("\n");
    sb.append("    special: ").append(toIndentedString(special)).append("\n");
    sb.append("    cardLifeCycle: ").append(toIndentedString(cardLifeCycle)).append("\n");
    sb.append("    clearingAndSettlement: ").append(toIndentedString(clearingAndSettlement)).append("\n");
    sb.append("    jitFunding: ").append(toIndentedString(jitFunding)).append("\n");
    sb.append("    digitalWalletTokenization: ").append(toIndentedString(digitalWalletTokenization)).append("\n");
    sb.append("    fulfillment: ").append(toIndentedString(fulfillment)).append("\n");
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

