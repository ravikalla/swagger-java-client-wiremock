/*
 * WireMock
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.26.0
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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Criteria for extracting response bodies to a separate file instead of including it in the stub mapping
 */
@Schema(description = "Criteria for extracting response bodies to a separate file instead of including it in the stub mapping")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-02T03:16:43.324Z[GMT]")
public class Body10ExtractBodyCriteria {
  @SerializedName("binarySizeThreshold")
  private String binarySizeThreshold = "0";

  @SerializedName("textSizeThreshold")
  private String textSizeThreshold = "0";

  public Body10ExtractBodyCriteria binarySizeThreshold(String binarySizeThreshold) {
    this.binarySizeThreshold = binarySizeThreshold;
    return this;
  }

   /**
   * Size threshold for extracting binary response bodies. Supports humanized size strings, e.g. \&quot;56 Mb\&quot;. Default unit is bytes.
   * @return binarySizeThreshold
  **/
  @Schema(example = "18.2 GB", description = "Size threshold for extracting binary response bodies. Supports humanized size strings, e.g. \"56 Mb\". Default unit is bytes.")
  public String getBinarySizeThreshold() {
    return binarySizeThreshold;
  }

  public void setBinarySizeThreshold(String binarySizeThreshold) {
    this.binarySizeThreshold = binarySizeThreshold;
  }

  public Body10ExtractBodyCriteria textSizeThreshold(String textSizeThreshold) {
    this.textSizeThreshold = textSizeThreshold;
    return this;
  }

   /**
   * Size threshold for extracting binary response bodies. Supports humanized size strings, e.g. \&quot;56 Mb\&quot;. Default unit is bytes.
   * @return textSizeThreshold
  **/
  @Schema(example = "18.2 GB", description = "Size threshold for extracting binary response bodies. Supports humanized size strings, e.g. \"56 Mb\". Default unit is bytes.")
  public String getTextSizeThreshold() {
    return textSizeThreshold;
  }

  public void setTextSizeThreshold(String textSizeThreshold) {
    this.textSizeThreshold = textSizeThreshold;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body10ExtractBodyCriteria body10ExtractBodyCriteria = (Body10ExtractBodyCriteria) o;
    return Objects.equals(this.binarySizeThreshold, body10ExtractBodyCriteria.binarySizeThreshold) &&
        Objects.equals(this.textSizeThreshold, body10ExtractBodyCriteria.textSizeThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(binarySizeThreshold, textSizeThreshold);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body10ExtractBodyCriteria {\n");
    
    sb.append("    binarySizeThreshold: ").append(toIndentedString(binarySizeThreshold)).append("\n");
    sb.append("    textSizeThreshold: ").append(toIndentedString(textSizeThreshold)).append("\n");
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
