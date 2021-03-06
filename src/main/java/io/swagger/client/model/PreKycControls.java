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
 * PreKycControls
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class PreKycControls {
  @SerializedName("cash_access_enabled")
  private Boolean cashAccessEnabled = false;

  @SerializedName("international_enabled")
  private Boolean internationalEnabled = false;

  @SerializedName("balance_max")
  private BigDecimal balanceMax = null;

  @SerializedName("enable_non_program_loads")
  private Boolean enableNonProgramLoads = false;

  @SerializedName("is_reloadable_pre_kyc")
  private Boolean isReloadablePreKyc = false;

  public PreKycControls cashAccessEnabled(Boolean cashAccessEnabled) {
    this.cashAccessEnabled = cashAccessEnabled;
    return this;
  }

   /**
   * Get cashAccessEnabled
   * @return cashAccessEnabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isCashAccessEnabled() {
    return cashAccessEnabled;
  }

  public void setCashAccessEnabled(Boolean cashAccessEnabled) {
    this.cashAccessEnabled = cashAccessEnabled;
  }

  public PreKycControls internationalEnabled(Boolean internationalEnabled) {
    this.internationalEnabled = internationalEnabled;
    return this;
  }

   /**
   * Get internationalEnabled
   * @return internationalEnabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isInternationalEnabled() {
    return internationalEnabled;
  }

  public void setInternationalEnabled(Boolean internationalEnabled) {
    this.internationalEnabled = internationalEnabled;
  }

  public PreKycControls balanceMax(BigDecimal balanceMax) {
    this.balanceMax = balanceMax;
    return this;
  }

   /**
   * Minimum is 0.01
   * minimum: 0.01
   * @return balanceMax
  **/
  @ApiModelProperty(value = "Minimum is 0.01")
  public BigDecimal getBalanceMax() {
    return balanceMax;
  }

  public void setBalanceMax(BigDecimal balanceMax) {
    this.balanceMax = balanceMax;
  }

  public PreKycControls enableNonProgramLoads(Boolean enableNonProgramLoads) {
    this.enableNonProgramLoads = enableNonProgramLoads;
    return this;
  }

   /**
   * Get enableNonProgramLoads
   * @return enableNonProgramLoads
  **/
  @ApiModelProperty(value = "")
  public Boolean isEnableNonProgramLoads() {
    return enableNonProgramLoads;
  }

  public void setEnableNonProgramLoads(Boolean enableNonProgramLoads) {
    this.enableNonProgramLoads = enableNonProgramLoads;
  }

  public PreKycControls isReloadablePreKyc(Boolean isReloadablePreKyc) {
    this.isReloadablePreKyc = isReloadablePreKyc;
    return this;
  }

   /**
   * Get isReloadablePreKyc
   * @return isReloadablePreKyc
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsReloadablePreKyc() {
    return isReloadablePreKyc;
  }

  public void setIsReloadablePreKyc(Boolean isReloadablePreKyc) {
    this.isReloadablePreKyc = isReloadablePreKyc;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PreKycControls preKycControls = (PreKycControls) o;
    return Objects.equals(this.cashAccessEnabled, preKycControls.cashAccessEnabled) &&
        Objects.equals(this.internationalEnabled, preKycControls.internationalEnabled) &&
        Objects.equals(this.balanceMax, preKycControls.balanceMax) &&
        Objects.equals(this.enableNonProgramLoads, preKycControls.enableNonProgramLoads) &&
        Objects.equals(this.isReloadablePreKyc, preKycControls.isReloadablePreKyc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cashAccessEnabled, internationalEnabled, balanceMax, enableNonProgramLoads, isReloadablePreKyc);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreKycControls {\n");
    
    sb.append("    cashAccessEnabled: ").append(toIndentedString(cashAccessEnabled)).append("\n");
    sb.append("    internationalEnabled: ").append(toIndentedString(internationalEnabled)).append("\n");
    sb.append("    balanceMax: ").append(toIndentedString(balanceMax)).append("\n");
    sb.append("    enableNonProgramLoads: ").append(toIndentedString(enableNonProgramLoads)).append("\n");
    sb.append("    isReloadablePreKyc: ").append(toIndentedString(isReloadablePreKyc)).append("\n");
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

