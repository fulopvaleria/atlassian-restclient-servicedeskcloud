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
import org.everit.atlassian.restclient.servicedeskcloud.v3.model.DateDTO;
import org.everit.atlassian.restclient.servicedeskcloud.v3.model.DurationDTO;

/**
 * SlaInformationCompletedCycleDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-02T14:33:08.600+02:00[Europe/Prague]")
public class SlaInformationCompletedCycleDTO {
  @JsonProperty("startTime")
  private DateDTO startTime;

  @JsonProperty("stopTime")
  private DateDTO stopTime;

  @JsonProperty("breached")
  private Boolean breached;

  @JsonProperty("goalDuration")
  private DurationDTO goalDuration;

  @JsonProperty("elapsedTime")
  private DurationDTO elapsedTime;

  @JsonProperty("remainingTime")
  private DurationDTO remainingTime;

  public SlaInformationCompletedCycleDTO startTime(DateDTO startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Time and date at which the SLA cycle started.
   * @return startTime
  **/
  @ApiModelProperty(value = "Time and date at which the SLA cycle started.")
  public DateDTO getStartTime() {
    return startTime;
  }

  public void setStartTime(DateDTO startTime) {
    this.startTime = startTime;
  }

  public SlaInformationCompletedCycleDTO stopTime(DateDTO stopTime) {
    this.stopTime = stopTime;
    return this;
  }

   /**
   * Time and date at which the SLA cycle completed.
   * @return stopTime
  **/
  @ApiModelProperty(value = "Time and date at which the SLA cycle completed.")
  public DateDTO getStopTime() {
    return stopTime;
  }

  public void setStopTime(DateDTO stopTime) {
    this.stopTime = stopTime;
  }

  public SlaInformationCompletedCycleDTO breached(Boolean breached) {
    this.breached = breached;
    return this;
  }

   /**
   * Indicates if the SLA (duration) was exceeded (true) or not (false).
   * @return breached
  **/
  @ApiModelProperty(value = "Indicates if the SLA (duration) was exceeded (true) or not (false).")
  public Boolean getBreached() {
    return breached;
  }

  public void setBreached(Boolean breached) {
    this.breached = breached;
  }

  public SlaInformationCompletedCycleDTO goalDuration(DurationDTO goalDuration) {
    this.goalDuration = goalDuration;
    return this;
  }

   /**
   * Duration within which the service should have been completed.
   * @return goalDuration
  **/
  @ApiModelProperty(value = "Duration within which the service should have been completed.")
  public DurationDTO getGoalDuration() {
    return goalDuration;
  }

  public void setGoalDuration(DurationDTO goalDuration) {
    this.goalDuration = goalDuration;
  }

  public SlaInformationCompletedCycleDTO elapsedTime(DurationDTO elapsedTime) {
    this.elapsedTime = elapsedTime;
    return this;
  }

   /**
   * Duration in which the service was completed.
   * @return elapsedTime
  **/
  @ApiModelProperty(value = "Duration in which the service was completed.")
  public DurationDTO getElapsedTime() {
    return elapsedTime;
  }

  public void setElapsedTime(DurationDTO elapsedTime) {
    this.elapsedTime = elapsedTime;
  }

  public SlaInformationCompletedCycleDTO remainingTime(DurationDTO remainingTime) {
    this.remainingTime = remainingTime;
    return this;
  }

   /**
   * Duration remaining after the service was completed.
   * @return remainingTime
  **/
  @ApiModelProperty(value = "Duration remaining after the service was completed.")
  public DurationDTO getRemainingTime() {
    return remainingTime;
  }

  public void setRemainingTime(DurationDTO remainingTime) {
    this.remainingTime = remainingTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SlaInformationCompletedCycleDTO slaInformationCompletedCycleDTO = (SlaInformationCompletedCycleDTO) o;
    return Objects.equals(this.startTime, slaInformationCompletedCycleDTO.startTime) &&
        Objects.equals(this.stopTime, slaInformationCompletedCycleDTO.stopTime) &&
        Objects.equals(this.breached, slaInformationCompletedCycleDTO.breached) &&
        Objects.equals(this.goalDuration, slaInformationCompletedCycleDTO.goalDuration) &&
        Objects.equals(this.elapsedTime, slaInformationCompletedCycleDTO.elapsedTime) &&
        Objects.equals(this.remainingTime, slaInformationCompletedCycleDTO.remainingTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTime, stopTime, breached, goalDuration, elapsedTime, remainingTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SlaInformationCompletedCycleDTO {\n");
    
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    stopTime: ").append(toIndentedString(stopTime)).append("\n");
    sb.append("    breached: ").append(toIndentedString(breached)).append("\n");
    sb.append("    goalDuration: ").append(toIndentedString(goalDuration)).append("\n");
    sb.append("    elapsedTime: ").append(toIndentedString(elapsedTime)).append("\n");
    sb.append("    remainingTime: ").append(toIndentedString(remainingTime)).append("\n");
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

