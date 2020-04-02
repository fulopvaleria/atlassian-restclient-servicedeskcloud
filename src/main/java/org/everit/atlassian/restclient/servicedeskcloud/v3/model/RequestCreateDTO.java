/*
 * Copyright © 2011 Everit Kft. (http://www.everit.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/*
 * Service Desk Public REST API
 * Public REST API for Jira Service Desk
 *
 * The version of the OpenAPI document: 1001.0.0-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.everit.atlassian.restclient.servicedeskcloud.v3.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * RequestCreateDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-02T14:33:08.600+02:00[Europe/Prague]")
public class RequestCreateDTO {
  @JsonProperty("serviceDeskId")
  private String serviceDeskId;

  @JsonProperty("requestTypeId")
  private String requestTypeId;

  @JsonProperty("requestFieldValues")
  private Map<String, Object> requestFieldValues = new HashMap<>();

  @JsonProperty("requestParticipants")
  private List<String> requestParticipants = new ArrayList<>();

  @JsonProperty("raiseOnBehalfOf")
  private String raiseOnBehalfOf;

  @JsonProperty("channel")
  private String channel;

  public RequestCreateDTO serviceDeskId(String serviceDeskId) {
    this.serviceDeskId = serviceDeskId;
    return this;
  }

   /**
   * ID of the service desk in which to create the request.
   * @return serviceDeskId
  **/
  @ApiModelProperty(value = "ID of the service desk in which to create the request.")
  public String getServiceDeskId() {
    return serviceDeskId;
  }

  public void setServiceDeskId(String serviceDeskId) {
    this.serviceDeskId = serviceDeskId;
  }

  public RequestCreateDTO requestTypeId(String requestTypeId) {
    this.requestTypeId = requestTypeId;
    return this;
  }

   /**
   * ID of the request type for the request.
   * @return requestTypeId
  **/
  @ApiModelProperty(value = "ID of the request type for the request.")
  public String getRequestTypeId() {
    return requestTypeId;
  }

  public void setRequestTypeId(String requestTypeId) {
    this.requestTypeId = requestTypeId;
  }

  public RequestCreateDTO requestFieldValues(Map<String, Object> requestFieldValues) {
    this.requestFieldValues = requestFieldValues;
    return this;
  }

  public RequestCreateDTO putRequestFieldValuesItem(String key, Object requestFieldValuesItem) {
    if (this.requestFieldValues == null) {
      this.requestFieldValues = new HashMap<>();
    }
    this.requestFieldValues.put(key, requestFieldValuesItem);
    return this;
  }

   /**
   * JSON map of Jira field IDs and their values representing the content of the request.
   * @return requestFieldValues
  **/
  @ApiModelProperty(value = "JSON map of Jira field IDs and their values representing the content of the request.")
  public Map<String, Object> getRequestFieldValues() {
    return requestFieldValues;
  }

  public void setRequestFieldValues(Map<String, Object> requestFieldValues) {
    this.requestFieldValues = requestFieldValues;
  }

  public RequestCreateDTO requestParticipants(List<String> requestParticipants) {
    this.requestParticipants = requestParticipants;
    return this;
  }

  public RequestCreateDTO addRequestParticipantsItem(String requestParticipantsItem) {
    if (this.requestParticipants == null) {
      this.requestParticipants = new ArrayList<>();
    }
    this.requestParticipants.add(requestParticipantsItem);
    return this;
  }

   /**
   * List of customers to participate in the request, as a list of &#x60;accountId&#x60; values.
   * @return requestParticipants
  **/
  @ApiModelProperty(value = "List of customers to participate in the request, as a list of `accountId` values.")
  public List<String> getRequestParticipants() {
    return requestParticipants;
  }

  public void setRequestParticipants(List<String> requestParticipants) {
    this.requestParticipants = requestParticipants;
  }

  public RequestCreateDTO raiseOnBehalfOf(String raiseOnBehalfOf) {
    this.raiseOnBehalfOf = raiseOnBehalfOf;
    return this;
  }

   /**
   * The &#x60;accountId&#x60; of the customer that the request is being raised on behalf of.
   * @return raiseOnBehalfOf
  **/
  @ApiModelProperty(value = "The `accountId` of the customer that the request is being raised on behalf of.")
  public String getRaiseOnBehalfOf() {
    return raiseOnBehalfOf;
  }

  public void setRaiseOnBehalfOf(String raiseOnBehalfOf) {
    this.raiseOnBehalfOf = raiseOnBehalfOf;
  }

  public RequestCreateDTO channel(String channel) {
    this.channel = channel;
    return this;
  }

   /**
   * (Experimental) Shows extra information for the request channel.
   * @return channel
  **/
  @ApiModelProperty(value = "(Experimental) Shows extra information for the request channel.")
  public String getChannel() {
    return channel;
  }

  public void setChannel(String channel) {
    this.channel = channel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestCreateDTO requestCreateDTO = (RequestCreateDTO) o;
    return Objects.equals(this.serviceDeskId, requestCreateDTO.serviceDeskId) &&
        Objects.equals(this.requestTypeId, requestCreateDTO.requestTypeId) &&
        Objects.equals(this.requestFieldValues, requestCreateDTO.requestFieldValues) &&
        Objects.equals(this.requestParticipants, requestCreateDTO.requestParticipants) &&
        Objects.equals(this.raiseOnBehalfOf, requestCreateDTO.raiseOnBehalfOf) &&
        Objects.equals(this.channel, requestCreateDTO.channel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceDeskId, requestTypeId, requestFieldValues, requestParticipants, raiseOnBehalfOf, channel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestCreateDTO {\n");
    
    sb.append("    serviceDeskId: ").append(toIndentedString(serviceDeskId)).append("\n");
    sb.append("    requestTypeId: ").append(toIndentedString(requestTypeId)).append("\n");
    sb.append("    requestFieldValues: ").append(toIndentedString(requestFieldValues)).append("\n");
    sb.append("    requestParticipants: ").append(toIndentedString(requestParticipants)).append("\n");
    sb.append("    raiseOnBehalfOf: ").append(toIndentedString(raiseOnBehalfOf)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
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

