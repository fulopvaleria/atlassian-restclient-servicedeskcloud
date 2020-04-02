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
import java.util.List;
import org.everit.atlassian.restclient.servicedeskcloud.v3.model.SimpleLink;

/**
 * Details a link group, which defines issue operations.
 */
@ApiModel(description = "Details a link group, which defines issue operations.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-02T14:33:08.600+02:00[Europe/Prague]")
public class LinkGroup {
  @JsonProperty("id")
  private String id;

  @JsonProperty("styleClass")
  private String styleClass;

  @JsonProperty("header")
  private SimpleLink header;

  @JsonProperty("weight")
  private Integer weight;

  @JsonProperty("links")
  private List<SimpleLink> links = new ArrayList<>();

  @JsonProperty("groups")
  private List<LinkGroup> groups = new ArrayList<>();

  public LinkGroup id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LinkGroup styleClass(String styleClass) {
    this.styleClass = styleClass;
    return this;
  }

   /**
   * Get styleClass
   * @return styleClass
  **/
  @ApiModelProperty(value = "")
  public String getStyleClass() {
    return styleClass;
  }

  public void setStyleClass(String styleClass) {
    this.styleClass = styleClass;
  }

  public LinkGroup header(SimpleLink header) {
    this.header = header;
    return this;
  }

   /**
   * Get header
   * @return header
  **/
  @ApiModelProperty(value = "")
  public SimpleLink getHeader() {
    return header;
  }

  public void setHeader(SimpleLink header) {
    this.header = header;
  }

  public LinkGroup weight(Integer weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @ApiModelProperty(value = "")
  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  public LinkGroup links(List<SimpleLink> links) {
    this.links = links;
    return this;
  }

  public LinkGroup addLinksItem(SimpleLink linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public List<SimpleLink> getLinks() {
    return links;
  }

  public void setLinks(List<SimpleLink> links) {
    this.links = links;
  }

  public LinkGroup groups(List<LinkGroup> groups) {
    this.groups = groups;
    return this;
  }

  public LinkGroup addGroupsItem(LinkGroup groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @ApiModelProperty(value = "")
  public List<LinkGroup> getGroups() {
    return groups;
  }

  public void setGroups(List<LinkGroup> groups) {
    this.groups = groups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkGroup linkGroup = (LinkGroup) o;
    return Objects.equals(this.id, linkGroup.id) &&
        Objects.equals(this.styleClass, linkGroup.styleClass) &&
        Objects.equals(this.header, linkGroup.header) &&
        Objects.equals(this.weight, linkGroup.weight) &&
        Objects.equals(this.links, linkGroup.links) &&
        Objects.equals(this.groups, linkGroup.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, styleClass, header, weight, links, groups);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkGroup {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    styleClass: ").append(toIndentedString(styleClass)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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
