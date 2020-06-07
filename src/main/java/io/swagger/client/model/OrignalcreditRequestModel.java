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
import io.swagger.client.model.OriginalCreditSenderData;
import io.swagger.client.model.Webhook;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * OrignalcreditRequestModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class OrignalcreditRequestModel {
  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("card_token")
  private String cardToken = null;

  @SerializedName("mid")
  private String mid = null;

  @SerializedName("screening_score")
  private String screeningScore = null;

  @SerializedName("card_acceptor")
  private CardAcceptorModel cardAcceptor = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    ACCOUNT_TO_ACCOUNT("account_to_account"),
    
    PERSON_TO_PERSON("person_to_person"),
    
    PREPAID("prepaid"),
    
    WALLET_TRANSFER("wallet_transfer"),
    
    MONEY_TRANSFER_BY_BANK("money_transfer_by_bank"),
    
    BUSINESS_TO_BUSINESS("business_to_business"),
    
    DISBURSEMENT("disbursement"),
    
    GOVERNMENT_DISBURSEMENT("government_disbursement"),
    
    GAMBLING_PAYOUT("gambling_payout"),
    
    LOYALTY("loyalty"),
    
    MERCHANT_DISBURSEMENT("merchant_disbursement"),
    
    ONLINE_GAMBLING_PAYOUT("online_gambling_payout"),
    
    PENSION_DISBURSEMENT("pension_disbursement"),
    
    PREPAID_LOADS("prepaid_loads"),
    
    CARD_BILL_PAYMENT("card_bill_payment"),
    
    BILL_PAYMENT("bill_payment"),
    
    CASH_CLAIM("cash_claim"),
    
    CASH_IN("cash_in"),
    
    CASH_OUT("cash_out"),
    
    MOBILE_AIR_TIME_PAYMENT("mobile_air_time_payment"),
    
    MONEY_TRANSFER_BY_MERCHANT("money_transfer_by_merchant"),
    
    FACE_TO_FACE_MERCHANT_PAYMENT("face_to_face_merchant_payment"),
    
    GOVERNMENT_PAYMENT("government_payment"),
    
    PAYMENTS_GOODS_SERVICES("payments_goods_services");

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

  @SerializedName("sender_data")
  private OriginalCreditSenderData senderData = null;

  @SerializedName("webhook")
  private Webhook webhook = null;

  public OrignalcreditRequestModel amount(BigDecimal amount) {
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

  public OrignalcreditRequestModel cardToken(String cardToken) {
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

  public OrignalcreditRequestModel mid(String mid) {
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

  public OrignalcreditRequestModel screeningScore(String screeningScore) {
    this.screeningScore = screeningScore;
    return this;
  }

   /**
   * Get screeningScore
   * @return screeningScore
  **/
  @ApiModelProperty(value = "")
  public String getScreeningScore() {
    return screeningScore;
  }

  public void setScreeningScore(String screeningScore) {
    this.screeningScore = screeningScore;
  }

  public OrignalcreditRequestModel cardAcceptor(CardAcceptorModel cardAcceptor) {
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

  public OrignalcreditRequestModel type(TypeEnum type) {
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

  public OrignalcreditRequestModel senderData(OriginalCreditSenderData senderData) {
    this.senderData = senderData;
    return this;
  }

   /**
   * Get senderData
   * @return senderData
  **/
  @ApiModelProperty(value = "")
  public OriginalCreditSenderData getSenderData() {
    return senderData;
  }

  public void setSenderData(OriginalCreditSenderData senderData) {
    this.senderData = senderData;
  }

  public OrignalcreditRequestModel webhook(Webhook webhook) {
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
    OrignalcreditRequestModel orignalcreditRequestModel = (OrignalcreditRequestModel) o;
    return Objects.equals(this.amount, orignalcreditRequestModel.amount) &&
        Objects.equals(this.cardToken, orignalcreditRequestModel.cardToken) &&
        Objects.equals(this.mid, orignalcreditRequestModel.mid) &&
        Objects.equals(this.screeningScore, orignalcreditRequestModel.screeningScore) &&
        Objects.equals(this.cardAcceptor, orignalcreditRequestModel.cardAcceptor) &&
        Objects.equals(this.type, orignalcreditRequestModel.type) &&
        Objects.equals(this.senderData, orignalcreditRequestModel.senderData) &&
        Objects.equals(this.webhook, orignalcreditRequestModel.webhook);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, cardToken, mid, screeningScore, cardAcceptor, type, senderData, webhook);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrignalcreditRequestModel {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    cardToken: ").append(toIndentedString(cardToken)).append("\n");
    sb.append("    mid: ").append(toIndentedString(mid)).append("\n");
    sb.append("    screeningScore: ").append(toIndentedString(screeningScore)).append("\n");
    sb.append("    cardAcceptor: ").append(toIndentedString(cardAcceptor)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    senderData: ").append(toIndentedString(senderData)).append("\n");
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

