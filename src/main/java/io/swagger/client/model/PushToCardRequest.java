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

/**
 * PushToCardRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class PushToCardRequest {
  @SerializedName("address_1")
  private String address1 = null;

  @SerializedName("address_2")
  private String address2 = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("zip")
  private String zip = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("token")
  private String token = null;

  @SerializedName("user_token")
  private String userToken = null;

  @SerializedName("name_on_card")
  private String nameOnCard = null;

  @SerializedName("pan")
  private String pan = null;

  @SerializedName("cvv")
  private String cvv = null;

  @SerializedName("exp_date")
  private String expDate = null;

  public PushToCardRequest address1(String address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * Get address1
   * @return address1
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public PushToCardRequest address2(String address2) {
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

  public PushToCardRequest city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public PushToCardRequest state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(required = true, value = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public PushToCardRequest zip(String zip) {
    this.zip = zip;
    return this;
  }

   /**
   * Get zip
   * @return zip
  **/
  @ApiModelProperty(required = true, value = "")
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public PushToCardRequest country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public PushToCardRequest token(String token) {
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

  public PushToCardRequest userToken(String userToken) {
    this.userToken = userToken;
    return this;
  }

   /**
   * Get userToken
   * @return userToken
  **/
  @ApiModelProperty(required = true, value = "")
  public String getUserToken() {
    return userToken;
  }

  public void setUserToken(String userToken) {
    this.userToken = userToken;
  }

  public PushToCardRequest nameOnCard(String nameOnCard) {
    this.nameOnCard = nameOnCard;
    return this;
  }

   /**
   * Get nameOnCard
   * @return nameOnCard
  **/
  @ApiModelProperty(value = "")
  public String getNameOnCard() {
    return nameOnCard;
  }

  public void setNameOnCard(String nameOnCard) {
    this.nameOnCard = nameOnCard;
  }

  public PushToCardRequest pan(String pan) {
    this.pan = pan;
    return this;
  }

   /**
   * Get pan
   * @return pan
  **/
  @ApiModelProperty(required = true, value = "")
  public String getPan() {
    return pan;
  }

  public void setPan(String pan) {
    this.pan = pan;
  }

  public PushToCardRequest cvv(String cvv) {
    this.cvv = cvv;
    return this;
  }

   /**
   * Get cvv
   * @return cvv
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCvv() {
    return cvv;
  }

  public void setCvv(String cvv) {
    this.cvv = cvv;
  }

  public PushToCardRequest expDate(String expDate) {
    this.expDate = expDate;
    return this;
  }

   /**
   * Get expDate
   * @return expDate
  **/
  @ApiModelProperty(required = true, value = "")
  public String getExpDate() {
    return expDate;
  }

  public void setExpDate(String expDate) {
    this.expDate = expDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PushToCardRequest pushToCardRequest = (PushToCardRequest) o;
    return Objects.equals(this.address1, pushToCardRequest.address1) &&
        Objects.equals(this.address2, pushToCardRequest.address2) &&
        Objects.equals(this.city, pushToCardRequest.city) &&
        Objects.equals(this.state, pushToCardRequest.state) &&
        Objects.equals(this.zip, pushToCardRequest.zip) &&
        Objects.equals(this.country, pushToCardRequest.country) &&
        Objects.equals(this.token, pushToCardRequest.token) &&
        Objects.equals(this.userToken, pushToCardRequest.userToken) &&
        Objects.equals(this.nameOnCard, pushToCardRequest.nameOnCard) &&
        Objects.equals(this.pan, pushToCardRequest.pan) &&
        Objects.equals(this.cvv, pushToCardRequest.cvv) &&
        Objects.equals(this.expDate, pushToCardRequest.expDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, address2, city, state, zip, country, token, userToken, nameOnCard, pan, cvv, expDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PushToCardRequest {\n");
    
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    userToken: ").append(toIndentedString(userToken)).append("\n");
    sb.append("    nameOnCard: ").append(toIndentedString(nameOnCard)).append("\n");
    sb.append("    pan: ").append(toIndentedString(pan)).append("\n");
    sb.append("    cvv: ").append(toIndentedString(cvv)).append("\n");
    sb.append("    expDate: ").append(toIndentedString(expDate)).append("\n");
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

