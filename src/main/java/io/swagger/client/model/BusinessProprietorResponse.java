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
import io.swagger.client.model.AddressResponseModel;
import io.swagger.client.model.IdentificationResponseModel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * BusinessProprietorResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class BusinessProprietorResponse {
  @SerializedName("first_name")
  private String firstName = null;

  @SerializedName("middle_name")
  private String middleName = null;

  @SerializedName("last_name")
  private String lastName = null;

  @SerializedName("alternative_names")
  private String alternativeNames = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("home")
  private AddressResponseModel home = null;

  @SerializedName("ssn")
  private String ssn = null;

  @SerializedName("dob")
  private OffsetDateTime dob = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("identifications")
  private List<IdentificationResponseModel> identifications = null;

  public BusinessProprietorResponse firstName(String firstName) {
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

  public BusinessProprietorResponse middleName(String middleName) {
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

  public BusinessProprietorResponse lastName(String lastName) {
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

  public BusinessProprietorResponse alternativeNames(String alternativeNames) {
    this.alternativeNames = alternativeNames;
    return this;
  }

   /**
   * Get alternativeNames
   * @return alternativeNames
  **/
  @ApiModelProperty(value = "")
  public String getAlternativeNames() {
    return alternativeNames;
  }

  public void setAlternativeNames(String alternativeNames) {
    this.alternativeNames = alternativeNames;
  }

  public BusinessProprietorResponse title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public BusinessProprietorResponse home(AddressResponseModel home) {
    this.home = home;
    return this;
  }

   /**
   * Get home
   * @return home
  **/
  @ApiModelProperty(value = "")
  public AddressResponseModel getHome() {
    return home;
  }

  public void setHome(AddressResponseModel home) {
    this.home = home;
  }

  public BusinessProprietorResponse ssn(String ssn) {
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

  public BusinessProprietorResponse dob(OffsetDateTime dob) {
    this.dob = dob;
    return this;
  }

   /**
   * Get dob
   * @return dob
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDob() {
    return dob;
  }

  public void setDob(OffsetDateTime dob) {
    this.dob = dob;
  }

  public BusinessProprietorResponse phone(String phone) {
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

  public BusinessProprietorResponse email(String email) {
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

  public BusinessProprietorResponse identifications(List<IdentificationResponseModel> identifications) {
    this.identifications = identifications;
    return this;
  }

  public BusinessProprietorResponse addIdentificationsItem(IdentificationResponseModel identificationsItem) {
    if (this.identifications == null) {
      this.identifications = new ArrayList<IdentificationResponseModel>();
    }
    this.identifications.add(identificationsItem);
    return this;
  }

   /**
   * Get identifications
   * @return identifications
  **/
  @ApiModelProperty(value = "")
  public List<IdentificationResponseModel> getIdentifications() {
    return identifications;
  }

  public void setIdentifications(List<IdentificationResponseModel> identifications) {
    this.identifications = identifications;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessProprietorResponse businessProprietorResponse = (BusinessProprietorResponse) o;
    return Objects.equals(this.firstName, businessProprietorResponse.firstName) &&
        Objects.equals(this.middleName, businessProprietorResponse.middleName) &&
        Objects.equals(this.lastName, businessProprietorResponse.lastName) &&
        Objects.equals(this.alternativeNames, businessProprietorResponse.alternativeNames) &&
        Objects.equals(this.title, businessProprietorResponse.title) &&
        Objects.equals(this.home, businessProprietorResponse.home) &&
        Objects.equals(this.ssn, businessProprietorResponse.ssn) &&
        Objects.equals(this.dob, businessProprietorResponse.dob) &&
        Objects.equals(this.phone, businessProprietorResponse.phone) &&
        Objects.equals(this.email, businessProprietorResponse.email) &&
        Objects.equals(this.identifications, businessProprietorResponse.identifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, middleName, lastName, alternativeNames, title, home, ssn, dob, phone, email, identifications);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessProprietorResponse {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    alternativeNames: ").append(toIndentedString(alternativeNames)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    home: ").append(toIndentedString(home)).append("\n");
    sb.append("    ssn: ").append(toIndentedString(ssn)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    identifications: ").append(toIndentedString(identifications)).append("\n");
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
