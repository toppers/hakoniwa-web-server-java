package com.baitando.openapi.samples.gen.springbootserver.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AssetListsDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-18T16:17:50.152839+09:00[Asia/Tokyo]")
public class AssetListsDto   {
  @JsonProperty("names")
  @Valid
  private List<String> names = new ArrayList<>();

  public AssetListsDto names(List<String> names) {
    this.names = names;
    return this;
  }

  public AssetListsDto addNamesItem(String namesItem) {
    this.names.add(namesItem);
    return this;
  }

  /**
   * Get names
   * @return names
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public List<String> getNames() {
    return names;
  }

  public void setNames(List<String> names) {
    this.names = names;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetListsDto assetLists = (AssetListsDto) o;
    return Objects.equals(this.names, assetLists.names);
  }

  @Override
  public int hashCode() {
    return Objects.hash(names);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetListsDto {\n");
    
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

