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
import io.swagger.client.model.IdentificationRequestModel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * CardHolderModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class CardHolderModel {
  @SerializedName("token")
  private String token = null;

  @SerializedName("active")
  private Boolean active = true;

  @SerializedName("notes")
  private String notes = null;

  @SerializedName("ip_address")
  private String ipAddress = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("metadata")
  private Map<String, String> metadata = null;

  @SerializedName("account_holder_group_token")
  private String accountHolderGroupToken = null;

  @SerializedName("identifications")
  private List<IdentificationRequestModel> identifications = null;

  @SerializedName("honorific")
  private String honorific = null;

  /**
   * Gets or Sets gender
   */
  @JsonAdapter(GenderEnum.Adapter.class)
  public enum GenderEnum {
    F("F"),
    
    M("M");

    private String value;

    GenderEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static GenderEnum fromValue(String text) {
      for (GenderEnum b : GenderEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<GenderEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GenderEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public GenderEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return GenderEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("gender")
  private GenderEnum gender = null;

  @SerializedName("first_name")
  private String firstName = null;

  @SerializedName("middle_name")
  private String middleName = null;

  @SerializedName("last_name")
  private String lastName = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("address1")
  private String address1 = null;

  @SerializedName("address2")
  private String address2 = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("birth_date")
  private String birthDate = null;

  @SerializedName("corporate_card_holder")
  private Boolean corporateCardHolder = false;

  @SerializedName("ssn")
  private String ssn = null;

  @SerializedName("passport_number")
  private String passportNumber = null;

  @SerializedName("passport_expiration_date")
  private String passportExpirationDate = null;

  @SerializedName("id_card_number")
  private String idCardNumber = null;

  @SerializedName("id_card_expiration_date")
  private String idCardExpirationDate = null;

  @SerializedName("nationality")
  private String nationality = null;

  @SerializedName("company")
  private String company = null;

  @SerializedName("parent_token")
  private String parentToken = null;

  @SerializedName("uses_parent_account")
  private Boolean usesParentAccount = false;

  @SerializedName("postal_code")
  private String postalCode = null;

  public CardHolderModel token(String token) {
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

  public CardHolderModel active(Boolean active) {
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

  public CardHolderModel notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/
  @ApiModelProperty(value = "")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public CardHolderModel ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * Get ipAddress
   * @return ipAddress
  **/
  @ApiModelProperty(value = "")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public CardHolderModel password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(value = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public CardHolderModel phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(value = "")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public CardHolderModel metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public CardHolderModel putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<String, String>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }

  public CardHolderModel accountHolderGroupToken(String accountHolderGroupToken) {
    this.accountHolderGroupToken = accountHolderGroupToken;
    return this;
  }

   /**
   * Get accountHolderGroupToken
   * @return accountHolderGroupToken
  **/
  @ApiModelProperty(value = "")
  public String getAccountHolderGroupToken() {
    return accountHolderGroupToken;
  }

  public void setAccountHolderGroupToken(String accountHolderGroupToken) {
    this.accountHolderGroupToken = accountHolderGroupToken;
  }

  public CardHolderModel identifications(List<IdentificationRequestModel> identifications) {
    this.identifications = identifications;
    return this;
  }

  public CardHolderModel addIdentificationsItem(IdentificationRequestModel identificationsItem) {
    if (this.identifications == null) {
      this.identifications = new ArrayList<IdentificationRequestModel>();
    }
    this.identifications.add(identificationsItem);
    return this;
  }

   /**
   * Get identifications
   * @return identifications
  **/
  @ApiModelProperty(value = "")
  public List<IdentificationRequestModel> getIdentifications() {
    return identifications;
  }

  public void setIdentifications(List<IdentificationRequestModel> identifications) {
    this.identifications = identifications;
  }

  public CardHolderModel honorific(String honorific) {
    this.honorific = honorific;
    return this;
  }

   /**
   * Get honorific
   * @return honorific
  **/
  @ApiModelProperty(value = "")
  public String getHonorific() {
    return honorific;
  }

  public void setHonorific(String honorific) {
    this.honorific = honorific;
  }

  public CardHolderModel gender(GenderEnum gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @ApiModelProperty(value = "")
  public GenderEnum getGender() {
    return gender;
  }

  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }

  public CardHolderModel firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(value = "")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public CardHolderModel middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

   /**
   * Get middleName
   * @return middleName
  **/
  @ApiModelProperty(value = "")
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public CardHolderModel lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(value = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public CardHolderModel email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CardHolderModel address1(String address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * Get address1
   * @return address1
  **/
  @ApiModelProperty(value = "")
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public CardHolderModel address2(String address2) {
    this.address2 = address2;
    return this;
  }

   /**
   * Get address2
   * @return address2
  **/
  @ApiModelProperty(value = "")
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public CardHolderModel city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(value = "")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public CardHolderModel state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public CardHolderModel country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(value = "")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public CardHolderModel birthDate(String birthDate) {
    this.birthDate = birthDate;
    return this;
  }

   /**
   * Get birthDate
   * @return birthDate
  **/
  @ApiModelProperty(value = "")
  public String getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(String birthDate) {
    this.birthDate = birthDate;
  }

  public CardHolderModel corporateCardHolder(Boolean corporateCardHolder) {
    this.corporateCardHolder = corporateCardHolder;
    return this;
  }

   /**
   * Get corporateCardHolder
   * @return corporateCardHolder
  **/
  @ApiModelProperty(value = "")
  public Boolean isCorporateCardHolder() {
    return corporateCardHolder;
  }

  public void setCorporateCardHolder(Boolean corporateCardHolder) {
    this.corporateCardHolder = corporateCardHolder;
  }

  public CardHolderModel ssn(String ssn) {
    this.ssn = ssn;
    return this;
  }

   /**
   * Get ssn
   * @return ssn
  **/
  @ApiModelProperty(value = "")
  public String getSsn() {
    return ssn;
  }

  public void setSsn(String ssn) {
    this.ssn = ssn;
  }

  public CardHolderModel passportNumber(String passportNumber) {
    this.passportNumber = passportNumber;
    return this;
  }

   /**
   * Get passportNumber
   * @return passportNumber
  **/
  @ApiModelProperty(value = "")
  public String getPassportNumber() {
    return passportNumber;
  }

  public void setPassportNumber(String passportNumber) {
    this.passportNumber = passportNumber;
  }

  public CardHolderModel passportExpirationDate(String passportExpirationDate) {
    this.passportExpirationDate = passportExpirationDate;
    return this;
  }

   /**
   * Get passportExpirationDate
   * @return passportExpirationDate
  **/
  @ApiModelProperty(value = "")
  public String getPassportExpirationDate() {
    return passportExpirationDate;
  }

  public void setPassportExpirationDate(String passportExpirationDate) {
    this.passportExpirationDate = passportExpirationDate;
  }

  public CardHolderModel idCardNumber(String idCardNumber) {
    this.idCardNumber = idCardNumber;
    return this;
  }

   /**
   * Get idCardNumber
   * @return idCardNumber
  **/
  @ApiModelProperty(value = "")
  public String getIdCardNumber() {
    return idCardNumber;
  }

  public void setIdCardNumber(String idCardNumber) {
    this.idCardNumber = idCardNumber;
  }

  public CardHolderModel idCardExpirationDate(String idCardExpirationDate) {
    this.idCardExpirationDate = idCardExpirationDate;
    return this;
  }

   /**
   * Get idCardExpirationDate
   * @return idCardExpirationDate
  **/
  @ApiModelProperty(value = "")
  public String getIdCardExpirationDate() {
    return idCardExpirationDate;
  }

  public void setIdCardExpirationDate(String idCardExpirationDate) {
    this.idCardExpirationDate = idCardExpirationDate;
  }

  public CardHolderModel nationality(String nationality) {
    this.nationality = nationality;
    return this;
  }

   /**
   * Get nationality
   * @return nationality
  **/
  @ApiModelProperty(value = "")
  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public CardHolderModel company(String company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @ApiModelProperty(value = "")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public CardHolderModel parentToken(String parentToken) {
    this.parentToken = parentToken;
    return this;
  }

   /**
   * Get parentToken
   * @return parentToken
  **/
  @ApiModelProperty(value = "")
  public String getParentToken() {
    return parentToken;
  }

  public void setParentToken(String parentToken) {
    this.parentToken = parentToken;
  }

  public CardHolderModel usesParentAccount(Boolean usesParentAccount) {
    this.usesParentAccount = usesParentAccount;
    return this;
  }

   /**
   * Default is false
   * @return usesParentAccount
  **/
  @ApiModelProperty(value = "Default is false")
  public Boolean isUsesParentAccount() {
    return usesParentAccount;
  }

  public void setUsesParentAccount(Boolean usesParentAccount) {
    this.usesParentAccount = usesParentAccount;
  }

  public CardHolderModel postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
  @ApiModelProperty(value = "")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardHolderModel cardHolderModel = (CardHolderModel) o;
    return Objects.equals(this.token, cardHolderModel.token) &&
        Objects.equals(this.active, cardHolderModel.active) &&
        Objects.equals(this.notes, cardHolderModel.notes) &&
        Objects.equals(this.ipAddress, cardHolderModel.ipAddress) &&
        Objects.equals(this.password, cardHolderModel.password) &&
        Objects.equals(this.phone, cardHolderModel.phone) &&
        Objects.equals(this.metadata, cardHolderModel.metadata) &&
        Objects.equals(this.accountHolderGroupToken, cardHolderModel.accountHolderGroupToken) &&
        Objects.equals(this.identifications, cardHolderModel.identifications) &&
        Objects.equals(this.honorific, cardHolderModel.honorific) &&
        Objects.equals(this.gender, cardHolderModel.gender) &&
        Objects.equals(this.firstName, cardHolderModel.firstName) &&
        Objects.equals(this.middleName, cardHolderModel.middleName) &&
        Objects.equals(this.lastName, cardHolderModel.lastName) &&
        Objects.equals(this.email, cardHolderModel.email) &&
        Objects.equals(this.address1, cardHolderModel.address1) &&
        Objects.equals(this.address2, cardHolderModel.address2) &&
        Objects.equals(this.city, cardHolderModel.city) &&
        Objects.equals(this.state, cardHolderModel.state) &&
        Objects.equals(this.country, cardHolderModel.country) &&
        Objects.equals(this.birthDate, cardHolderModel.birthDate) &&
        Objects.equals(this.corporateCardHolder, cardHolderModel.corporateCardHolder) &&
        Objects.equals(this.ssn, cardHolderModel.ssn) &&
        Objects.equals(this.passportNumber, cardHolderModel.passportNumber) &&
        Objects.equals(this.passportExpirationDate, cardHolderModel.passportExpirationDate) &&
        Objects.equals(this.idCardNumber, cardHolderModel.idCardNumber) &&
        Objects.equals(this.idCardExpirationDate, cardHolderModel.idCardExpirationDate) &&
        Objects.equals(this.nationality, cardHolderModel.nationality) &&
        Objects.equals(this.company, cardHolderModel.company) &&
        Objects.equals(this.parentToken, cardHolderModel.parentToken) &&
        Objects.equals(this.usesParentAccount, cardHolderModel.usesParentAccount) &&
        Objects.equals(this.postalCode, cardHolderModel.postalCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, active, notes, ipAddress, password, phone, metadata, accountHolderGroupToken, identifications, honorific, gender, firstName, middleName, lastName, email, address1, address2, city, state, country, birthDate, corporateCardHolder, ssn, passportNumber, passportExpirationDate, idCardNumber, idCardExpirationDate, nationality, company, parentToken, usesParentAccount, postalCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardHolderModel {\n");
    
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    accountHolderGroupToken: ").append(toIndentedString(accountHolderGroupToken)).append("\n");
    sb.append("    identifications: ").append(toIndentedString(identifications)).append("\n");
    sb.append("    honorific: ").append(toIndentedString(honorific)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    corporateCardHolder: ").append(toIndentedString(corporateCardHolder)).append("\n");
    sb.append("    ssn: ").append(toIndentedString(ssn)).append("\n");
    sb.append("    passportNumber: ").append(toIndentedString(passportNumber)).append("\n");
    sb.append("    passportExpirationDate: ").append(toIndentedString(passportExpirationDate)).append("\n");
    sb.append("    idCardNumber: ").append(toIndentedString(idCardNumber)).append("\n");
    sb.append("    idCardExpirationDate: ").append(toIndentedString(idCardExpirationDate)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    parentToken: ").append(toIndentedString(parentToken)).append("\n");
    sb.append("    usesParentAccount: ").append(toIndentedString(usesParentAccount)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
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
