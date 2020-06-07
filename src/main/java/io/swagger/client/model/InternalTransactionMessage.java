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
import io.swagger.client.model.FundingTranlog;
import io.swagger.client.model.InternalAuthorizationTransaction;
import io.swagger.client.model.VelocityCache;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * InternalTransactionMessage
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class InternalTransactionMessage {
  @SerializedName("processing_start_time_millis")
  private Long processingStartTimeMillis = null;

  @SerializedName("authorization_tranlog")
  private InternalAuthorizationTransaction authorizationTranlog = null;

  @SerializedName("funding_tranlog")
  private FundingTranlog fundingTranlog = null;

  @SerializedName("velocity_caches")
  private List<VelocityCache> velocityCaches = null;

  @SerializedName("context")
  private Map<String, Object> context = null;

  /**
   * Gets or Sets creditDebitIndicator
   */
  @JsonAdapter(CreditDebitIndicatorEnum.Adapter.class)
  public enum CreditDebitIndicatorEnum {
    CREDIT("CREDIT"),
    
    DEBIT("DEBIT"),
    
    NONE("NONE");

    private String value;

    CreditDebitIndicatorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CreditDebitIndicatorEnum fromValue(String text) {
      for (CreditDebitIndicatorEnum b : CreditDebitIndicatorEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CreditDebitIndicatorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CreditDebitIndicatorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CreditDebitIndicatorEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CreditDebitIndicatorEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("credit_debit_indicator")
  private CreditDebitIndicatorEnum creditDebitIndicator = null;

  public InternalTransactionMessage processingStartTimeMillis(Long processingStartTimeMillis) {
    this.processingStartTimeMillis = processingStartTimeMillis;
    return this;
  }

   /**
   * Get processingStartTimeMillis
   * @return processingStartTimeMillis
  **/
  @ApiModelProperty(value = "")
  public Long getProcessingStartTimeMillis() {
    return processingStartTimeMillis;
  }

  public void setProcessingStartTimeMillis(Long processingStartTimeMillis) {
    this.processingStartTimeMillis = processingStartTimeMillis;
  }

  public InternalTransactionMessage authorizationTranlog(InternalAuthorizationTransaction authorizationTranlog) {
    this.authorizationTranlog = authorizationTranlog;
    return this;
  }

   /**
   * Get authorizationTranlog
   * @return authorizationTranlog
  **/
  @ApiModelProperty(required = true, value = "")
  public InternalAuthorizationTransaction getAuthorizationTranlog() {
    return authorizationTranlog;
  }

  public void setAuthorizationTranlog(InternalAuthorizationTransaction authorizationTranlog) {
    this.authorizationTranlog = authorizationTranlog;
  }

  public InternalTransactionMessage fundingTranlog(FundingTranlog fundingTranlog) {
    this.fundingTranlog = fundingTranlog;
    return this;
  }

   /**
   * Get fundingTranlog
   * @return fundingTranlog
  **/
  @ApiModelProperty(value = "")
  public FundingTranlog getFundingTranlog() {
    return fundingTranlog;
  }

  public void setFundingTranlog(FundingTranlog fundingTranlog) {
    this.fundingTranlog = fundingTranlog;
  }

  public InternalTransactionMessage velocityCaches(List<VelocityCache> velocityCaches) {
    this.velocityCaches = velocityCaches;
    return this;
  }

  public InternalTransactionMessage addVelocityCachesItem(VelocityCache velocityCachesItem) {
    if (this.velocityCaches == null) {
      this.velocityCaches = new ArrayList<VelocityCache>();
    }
    this.velocityCaches.add(velocityCachesItem);
    return this;
  }

   /**
   * Get velocityCaches
   * @return velocityCaches
  **/
  @ApiModelProperty(value = "")
  public List<VelocityCache> getVelocityCaches() {
    return velocityCaches;
  }

  public void setVelocityCaches(List<VelocityCache> velocityCaches) {
    this.velocityCaches = velocityCaches;
  }

  public InternalTransactionMessage context(Map<String, Object> context) {
    this.context = context;
    return this;
  }

  public InternalTransactionMessage putContextItem(String key, Object contextItem) {
    if (this.context == null) {
      this.context = new HashMap<String, Object>();
    }
    this.context.put(key, contextItem);
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @ApiModelProperty(value = "")
  public Map<String, Object> getContext() {
    return context;
  }

  public void setContext(Map<String, Object> context) {
    this.context = context;
  }

  public InternalTransactionMessage creditDebitIndicator(CreditDebitIndicatorEnum creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
    return this;
  }

   /**
   * Get creditDebitIndicator
   * @return creditDebitIndicator
  **/
  @ApiModelProperty(value = "")
  public CreditDebitIndicatorEnum getCreditDebitIndicator() {
    return creditDebitIndicator;
  }

  public void setCreditDebitIndicator(CreditDebitIndicatorEnum creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InternalTransactionMessage internalTransactionMessage = (InternalTransactionMessage) o;
    return Objects.equals(this.processingStartTimeMillis, internalTransactionMessage.processingStartTimeMillis) &&
        Objects.equals(this.authorizationTranlog, internalTransactionMessage.authorizationTranlog) &&
        Objects.equals(this.fundingTranlog, internalTransactionMessage.fundingTranlog) &&
        Objects.equals(this.velocityCaches, internalTransactionMessage.velocityCaches) &&
        Objects.equals(this.context, internalTransactionMessage.context) &&
        Objects.equals(this.creditDebitIndicator, internalTransactionMessage.creditDebitIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processingStartTimeMillis, authorizationTranlog, fundingTranlog, velocityCaches, context, creditDebitIndicator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InternalTransactionMessage {\n");
    
    sb.append("    processingStartTimeMillis: ").append(toIndentedString(processingStartTimeMillis)).append("\n");
    sb.append("    authorizationTranlog: ").append(toIndentedString(authorizationTranlog)).append("\n");
    sb.append("    fundingTranlog: ").append(toIndentedString(fundingTranlog)).append("\n");
    sb.append("    velocityCaches: ").append(toIndentedString(velocityCaches)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    creditDebitIndicator: ").append(toIndentedString(creditDebitIndicator)).append("\n");
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

