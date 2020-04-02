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
import org.everit.atlassian.restclient.servicedeskcloud.v3.model.AdditionalCommentDTO;

/**
 * CustomerTransitionExecutionDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-02T14:33:08.600+02:00[Europe/Prague]")
public class CustomerTransitionExecutionDTO {
  @JsonProperty("id")
  private String id;

  @JsonProperty("additionalComment")
  private AdditionalCommentDTO additionalComment;

  public CustomerTransitionExecutionDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the transition to be performed.
   * @return id
  **/
  @ApiModelProperty(value = "ID of the transition to be performed.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CustomerTransitionExecutionDTO additionalComment(AdditionalCommentDTO additionalComment) {
    this.additionalComment = additionalComment;
    return this;
  }

   /**
   * Comment explaining the reason for the transition.
   * @return additionalComment
  **/
  @ApiModelProperty(value = "Comment explaining the reason for the transition.")
  public AdditionalCommentDTO getAdditionalComment() {
    return additionalComment;
  }

  public void setAdditionalComment(AdditionalCommentDTO additionalComment) {
    this.additionalComment = additionalComment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerTransitionExecutionDTO customerTransitionExecutionDTO = (CustomerTransitionExecutionDTO) o;
    return Objects.equals(this.id, customerTransitionExecutionDTO.id) &&
        Objects.equals(this.additionalComment, customerTransitionExecutionDTO.additionalComment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, additionalComment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerTransitionExecutionDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    additionalComment: ").append(toIndentedString(additionalComment)).append("\n");
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
