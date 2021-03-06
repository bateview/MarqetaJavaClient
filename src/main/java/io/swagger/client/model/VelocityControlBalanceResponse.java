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
import io.swagger.client.model.Available;
import io.swagger.client.model.MerchantScope;
import io.swagger.client.model.SpendControlAssociation;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * VelocityControlBalanceResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class VelocityControlBalanceResponse {
  @SerializedName("token")
  private String token = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("association")
  private SpendControlAssociation association = null;

  @SerializedName("merchant_scope")
  private MerchantScope merchantScope = null;

  @SerializedName("usage_limit")
  private Integer usageLimit = null;

  @SerializedName("approvals_only")
  private Boolean approvalsOnly = false;

  @SerializedName("include_purchases")
  private Boolean includePurchases = false;

  @SerializedName("include_withdrawals")
  private Boolean includeWithdrawals = false;

  @SerializedName("include_transfers")
  private Boolean includeTransfers = false;

  @SerializedName("include_cashback")
  private Boolean includeCashback = false;

  @SerializedName("include_credits")
  private Boolean includeCredits = false;

  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("amount_limit")
  private BigDecimal amountLimit = null;

  /**
   * Gets or Sets velocityWindow
   */
  @JsonAdapter(VelocityWindowEnum.Adapter.class)
  public enum VelocityWindowEnum {
    DAY("DAY"),
    
    WEEK("WEEK"),
    
    MONTH("MONTH"),
    
    LIFETIME("LIFETIME"),
    
    TRANSACTION("TRANSACTION");

    private String value;

    VelocityWindowEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VelocityWindowEnum fromValue(String text) {
      for (VelocityWindowEnum b : VelocityWindowEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<VelocityWindowEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VelocityWindowEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VelocityWindowEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return VelocityWindowEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("velocity_window")
  private VelocityWindowEnum velocityWindow = null;

  @SerializedName("active")
  private Boolean active = false;

  @SerializedName("available")
  private Available available = null;

  public VelocityControlBalanceResponse token(String token) {
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

  public VelocityControlBalanceResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VelocityControlBalanceResponse association(SpendControlAssociation association) {
    this.association = association;
    return this;
  }

   /**
   * Get association
   * @return association
  **/
  @ApiModelProperty(value = "")
  public SpendControlAssociation getAssociation() {
    return association;
  }

  public void setAssociation(SpendControlAssociation association) {
    this.association = association;
  }

  public VelocityControlBalanceResponse merchantScope(MerchantScope merchantScope) {
    this.merchantScope = merchantScope;
    return this;
  }

   /**
   * Get merchantScope
   * @return merchantScope
  **/
  @ApiModelProperty(value = "")
  public MerchantScope getMerchantScope() {
    return merchantScope;
  }

  public void setMerchantScope(MerchantScope merchantScope) {
    this.merchantScope = merchantScope;
  }

  public VelocityControlBalanceResponse usageLimit(Integer usageLimit) {
    this.usageLimit = usageLimit;
    return this;
  }

   /**
   * Get usageLimit
   * minimum: -1
   * @return usageLimit
  **/
  @ApiModelProperty(value = "")
  public Integer getUsageLimit() {
    return usageLimit;
  }

  public void setUsageLimit(Integer usageLimit) {
    this.usageLimit = usageLimit;
  }

  public VelocityControlBalanceResponse approvalsOnly(Boolean approvalsOnly) {
    this.approvalsOnly = approvalsOnly;
    return this;
  }

   /**
   * Get approvalsOnly
   * @return approvalsOnly
  **/
  @ApiModelProperty(value = "")
  public Boolean isApprovalsOnly() {
    return approvalsOnly;
  }

  public void setApprovalsOnly(Boolean approvalsOnly) {
    this.approvalsOnly = approvalsOnly;
  }

  public VelocityControlBalanceResponse includePurchases(Boolean includePurchases) {
    this.includePurchases = includePurchases;
    return this;
  }

   /**
   * Get includePurchases
   * @return includePurchases
  **/
  @ApiModelProperty(value = "")
  public Boolean isIncludePurchases() {
    return includePurchases;
  }

  public void setIncludePurchases(Boolean includePurchases) {
    this.includePurchases = includePurchases;
  }

  public VelocityControlBalanceResponse includeWithdrawals(Boolean includeWithdrawals) {
    this.includeWithdrawals = includeWithdrawals;
    return this;
  }

   /**
   * Get includeWithdrawals
   * @return includeWithdrawals
  **/
  @ApiModelProperty(value = "")
  public Boolean isIncludeWithdrawals() {
    return includeWithdrawals;
  }

  public void setIncludeWithdrawals(Boolean includeWithdrawals) {
    this.includeWithdrawals = includeWithdrawals;
  }

  public VelocityControlBalanceResponse includeTransfers(Boolean includeTransfers) {
    this.includeTransfers = includeTransfers;
    return this;
  }

   /**
   * Get includeTransfers
   * @return includeTransfers
  **/
  @ApiModelProperty(value = "")
  public Boolean isIncludeTransfers() {
    return includeTransfers;
  }

  public void setIncludeTransfers(Boolean includeTransfers) {
    this.includeTransfers = includeTransfers;
  }

  public VelocityControlBalanceResponse includeCashback(Boolean includeCashback) {
    this.includeCashback = includeCashback;
    return this;
  }

   /**
   * Get includeCashback
   * @return includeCashback
  **/
  @ApiModelProperty(value = "")
  public Boolean isIncludeCashback() {
    return includeCashback;
  }

  public void setIncludeCashback(Boolean includeCashback) {
    this.includeCashback = includeCashback;
  }

  public VelocityControlBalanceResponse includeCredits(Boolean includeCredits) {
    this.includeCredits = includeCredits;
    return this;
  }

   /**
   * Get includeCredits
   * @return includeCredits
  **/
  @ApiModelProperty(value = "")
  public Boolean isIncludeCredits() {
    return includeCredits;
  }

  public void setIncludeCredits(Boolean includeCredits) {
    this.includeCredits = includeCredits;
  }

  public VelocityControlBalanceResponse currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public VelocityControlBalanceResponse amountLimit(BigDecimal amountLimit) {
    this.amountLimit = amountLimit;
    return this;
  }

   /**
   * Get amountLimit
   * minimum: 0
   * @return amountLimit
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getAmountLimit() {
    return amountLimit;
  }

  public void setAmountLimit(BigDecimal amountLimit) {
    this.amountLimit = amountLimit;
  }

  public VelocityControlBalanceResponse velocityWindow(VelocityWindowEnum velocityWindow) {
    this.velocityWindow = velocityWindow;
    return this;
  }

   /**
   * Get velocityWindow
   * @return velocityWindow
  **/
  @ApiModelProperty(required = true, value = "")
  public VelocityWindowEnum getVelocityWindow() {
    return velocityWindow;
  }

  public void setVelocityWindow(VelocityWindowEnum velocityWindow) {
    this.velocityWindow = velocityWindow;
  }

  public VelocityControlBalanceResponse active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(value = "")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public VelocityControlBalanceResponse available(Available available) {
    this.available = available;
    return this;
  }

   /**
   * Available balance
   * @return available
  **/
  @ApiModelProperty(required = true, value = "Available balance")
  public Available getAvailable() {
    return available;
  }

  public void setAvailable(Available available) {
    this.available = available;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VelocityControlBalanceResponse velocityControlBalanceResponse = (VelocityControlBalanceResponse) o;
    return Objects.equals(this.token, velocityControlBalanceResponse.token) &&
        Objects.equals(this.name, velocityControlBalanceResponse.name) &&
        Objects.equals(this.association, velocityControlBalanceResponse.association) &&
        Objects.equals(this.merchantScope, velocityControlBalanceResponse.merchantScope) &&
        Objects.equals(this.usageLimit, velocityControlBalanceResponse.usageLimit) &&
        Objects.equals(this.approvalsOnly, velocityControlBalanceResponse.approvalsOnly) &&
        Objects.equals(this.includePurchases, velocityControlBalanceResponse.includePurchases) &&
        Objects.equals(this.includeWithdrawals, velocityControlBalanceResponse.includeWithdrawals) &&
        Objects.equals(this.includeTransfers, velocityControlBalanceResponse.includeTransfers) &&
        Objects.equals(this.includeCashback, velocityControlBalanceResponse.includeCashback) &&
        Objects.equals(this.includeCredits, velocityControlBalanceResponse.includeCredits) &&
        Objects.equals(this.currencyCode, velocityControlBalanceResponse.currencyCode) &&
        Objects.equals(this.amountLimit, velocityControlBalanceResponse.amountLimit) &&
        Objects.equals(this.velocityWindow, velocityControlBalanceResponse.velocityWindow) &&
        Objects.equals(this.active, velocityControlBalanceResponse.active) &&
        Objects.equals(this.available, velocityControlBalanceResponse.available);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, name, association, merchantScope, usageLimit, approvalsOnly, includePurchases, includeWithdrawals, includeTransfers, includeCashback, includeCredits, currencyCode, amountLimit, velocityWindow, active, available);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VelocityControlBalanceResponse {\n");
    
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    association: ").append(toIndentedString(association)).append("\n");
    sb.append("    merchantScope: ").append(toIndentedString(merchantScope)).append("\n");
    sb.append("    usageLimit: ").append(toIndentedString(usageLimit)).append("\n");
    sb.append("    approvalsOnly: ").append(toIndentedString(approvalsOnly)).append("\n");
    sb.append("    includePurchases: ").append(toIndentedString(includePurchases)).append("\n");
    sb.append("    includeWithdrawals: ").append(toIndentedString(includeWithdrawals)).append("\n");
    sb.append("    includeTransfers: ").append(toIndentedString(includeTransfers)).append("\n");
    sb.append("    includeCashback: ").append(toIndentedString(includeCashback)).append("\n");
    sb.append("    includeCredits: ").append(toIndentedString(includeCredits)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    amountLimit: ").append(toIndentedString(amountLimit)).append("\n");
    sb.append("    velocityWindow: ").append(toIndentedString(velocityWindow)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
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

