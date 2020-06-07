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
import org.threeten.bp.OffsetDateTime;

/**
 * DirectDepositRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class DirectDepositRequest {
  @SerializedName("token")
  private String token = null;

  @SerializedName("amount")
  private BigDecimal amount = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    CREDIT("CREDIT"),
    
    DEBIT("DEBIT");

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

  @SerializedName("account_number")
  private String accountNumber = null;

  @SerializedName("settlement_date")
  private OffsetDateTime settlementDate = null;

  @SerializedName("standard_entry_class_code")
  private String standardEntryClassCode = null;

  @SerializedName("company_name")
  private String companyName = null;

  @SerializedName("company_discretionary_data")
  private String companyDiscretionaryData = null;

  @SerializedName("company_identification")
  private String companyIdentification = null;

  @SerializedName("company_entry_description")
  private String companyEntryDescription = null;

  @SerializedName("individual_identification_number")
  private String individualIdentificationNumber = null;

  @SerializedName("individual_name")
  private String individualName = null;

  public DirectDepositRequest token(String token) {
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

  public DirectDepositRequest amount(BigDecimal amount) {
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

  public DirectDepositRequest type(TypeEnum type) {
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

  public DirectDepositRequest accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Get accountNumber
   * @return accountNumber
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public DirectDepositRequest settlementDate(OffsetDateTime settlementDate) {
    this.settlementDate = settlementDate;
    return this;
  }

   /**
   * Get settlementDate
   * @return settlementDate
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getSettlementDate() {
    return settlementDate;
  }

  public void setSettlementDate(OffsetDateTime settlementDate) {
    this.settlementDate = settlementDate;
  }

  public DirectDepositRequest standardEntryClassCode(String standardEntryClassCode) {
    this.standardEntryClassCode = standardEntryClassCode;
    return this;
  }

   /**
   * Get standardEntryClassCode
   * @return standardEntryClassCode
  **/
  @ApiModelProperty(value = "")
  public String getStandardEntryClassCode() {
    return standardEntryClassCode;
  }

  public void setStandardEntryClassCode(String standardEntryClassCode) {
    this.standardEntryClassCode = standardEntryClassCode;
  }

  public DirectDepositRequest companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * Get companyName
   * @return companyName
  **/
  @ApiModelProperty(value = "")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public DirectDepositRequest companyDiscretionaryData(String companyDiscretionaryData) {
    this.companyDiscretionaryData = companyDiscretionaryData;
    return this;
  }

   /**
   * Get companyDiscretionaryData
   * @return companyDiscretionaryData
  **/
  @ApiModelProperty(value = "")
  public String getCompanyDiscretionaryData() {
    return companyDiscretionaryData;
  }

  public void setCompanyDiscretionaryData(String companyDiscretionaryData) {
    this.companyDiscretionaryData = companyDiscretionaryData;
  }

  public DirectDepositRequest companyIdentification(String companyIdentification) {
    this.companyIdentification = companyIdentification;
    return this;
  }

   /**
   * Get companyIdentification
   * @return companyIdentification
  **/
  @ApiModelProperty(value = "")
  public String getCompanyIdentification() {
    return companyIdentification;
  }

  public void setCompanyIdentification(String companyIdentification) {
    this.companyIdentification = companyIdentification;
  }

  public DirectDepositRequest companyEntryDescription(String companyEntryDescription) {
    this.companyEntryDescription = companyEntryDescription;
    return this;
  }

   /**
   * Get companyEntryDescription
   * @return companyEntryDescription
  **/
  @ApiModelProperty(value = "")
  public String getCompanyEntryDescription() {
    return companyEntryDescription;
  }

  public void setCompanyEntryDescription(String companyEntryDescription) {
    this.companyEntryDescription = companyEntryDescription;
  }

  public DirectDepositRequest individualIdentificationNumber(String individualIdentificationNumber) {
    this.individualIdentificationNumber = individualIdentificationNumber;
    return this;
  }

   /**
   * Get individualIdentificationNumber
   * @return individualIdentificationNumber
  **/
  @ApiModelProperty(value = "")
  public String getIndividualIdentificationNumber() {
    return individualIdentificationNumber;
  }

  public void setIndividualIdentificationNumber(String individualIdentificationNumber) {
    this.individualIdentificationNumber = individualIdentificationNumber;
  }

  public DirectDepositRequest individualName(String individualName) {
    this.individualName = individualName;
    return this;
  }

   /**
   * Get individualName
   * @return individualName
  **/
  @ApiModelProperty(value = "")
  public String getIndividualName() {
    return individualName;
  }

  public void setIndividualName(String individualName) {
    this.individualName = individualName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirectDepositRequest directDepositRequest = (DirectDepositRequest) o;
    return Objects.equals(this.token, directDepositRequest.token) &&
        Objects.equals(this.amount, directDepositRequest.amount) &&
        Objects.equals(this.type, directDepositRequest.type) &&
        Objects.equals(this.accountNumber, directDepositRequest.accountNumber) &&
        Objects.equals(this.settlementDate, directDepositRequest.settlementDate) &&
        Objects.equals(this.standardEntryClassCode, directDepositRequest.standardEntryClassCode) &&
        Objects.equals(this.companyName, directDepositRequest.companyName) &&
        Objects.equals(this.companyDiscretionaryData, directDepositRequest.companyDiscretionaryData) &&
        Objects.equals(this.companyIdentification, directDepositRequest.companyIdentification) &&
        Objects.equals(this.companyEntryDescription, directDepositRequest.companyEntryDescription) &&
        Objects.equals(this.individualIdentificationNumber, directDepositRequest.individualIdentificationNumber) &&
        Objects.equals(this.individualName, directDepositRequest.individualName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, amount, type, accountNumber, settlementDate, standardEntryClassCode, companyName, companyDiscretionaryData, companyIdentification, companyEntryDescription, individualIdentificationNumber, individualName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectDepositRequest {\n");
    
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    settlementDate: ").append(toIndentedString(settlementDate)).append("\n");
    sb.append("    standardEntryClassCode: ").append(toIndentedString(standardEntryClassCode)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    companyDiscretionaryData: ").append(toIndentedString(companyDiscretionaryData)).append("\n");
    sb.append("    companyIdentification: ").append(toIndentedString(companyIdentification)).append("\n");
    sb.append("    companyEntryDescription: ").append(toIndentedString(companyEntryDescription)).append("\n");
    sb.append("    individualIdentificationNumber: ").append(toIndentedString(individualIdentificationNumber)).append("\n");
    sb.append("    individualName: ").append(toIndentedString(individualName)).append("\n");
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

