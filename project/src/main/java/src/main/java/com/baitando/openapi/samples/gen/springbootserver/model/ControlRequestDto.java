package com.baitando.openapi.samples.gen.springbootserver.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ControlRequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-18T16:17:50.152839+09:00[Asia/Tokyo]")
public class ControlRequestDto   {
  /**
   * Gets or Sets controlType
   */
  public enum ControlTypeEnum {
    START("start"),
    
    STOP("stop"),
    
    RESET("reset");

    private String value;

    ControlTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ControlTypeEnum fromValue(String value) {
      for (ControlTypeEnum b : ControlTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("control_type")
  private ControlTypeEnum controlType;

  public ControlRequestDto controlType(ControlTypeEnum controlType) {
    this.controlType = controlType;
    return this;
  }

  /**
   * Get controlType
   * @return controlType
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public ControlTypeEnum getControlType() {
    return controlType;
  }

  public void setControlType(ControlTypeEnum controlType) {
    this.controlType = controlType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ControlRequestDto controlRequest = (ControlRequestDto) o;
    return Objects.equals(this.controlType, controlRequest.controlType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controlType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControlRequestDto {\n");
    
    sb.append("    controlType: ").append(toIndentedString(controlType)).append("\n");
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

