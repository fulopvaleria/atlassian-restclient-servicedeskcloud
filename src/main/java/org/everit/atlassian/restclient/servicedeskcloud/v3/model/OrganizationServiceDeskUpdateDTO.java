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

/**
 * OrganizationServiceDeskUpdateDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-02T14:33:08.600+02:00[Europe/Prague]")
public class OrganizationServiceDeskUpdateDTO {
  @JsonProperty("organizationId")
  private Integer organizationId;

  public OrganizationServiceDeskUpdateDTO organizationId(Integer organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * List of organizations, specified by &#39;ID&#39; field values, to add to or remove from the service desk.
   * @return organizationId
  **/
  @ApiModelProperty(value = "List of organizations, specified by 'ID' field values, to add to or remove from the service desk.")
  public Integer getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(Integer organizationId) {
    this.organizationId = organizationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationServiceDeskUpdateDTO organizationServiceDeskUpdateDTO = (OrganizationServiceDeskUpdateDTO) o;
    return Objects.equals(this.organizationId, organizationServiceDeskUpdateDTO.organizationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationServiceDeskUpdateDTO {\n");
    
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
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

