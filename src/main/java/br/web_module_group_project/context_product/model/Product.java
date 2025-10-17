package br.web_module_group_project.context_product.model;

import br.web_module_group_project.context_product.repository.productRepository;
import br.web_module_group_project.context_product.util.Availability;
import br.web_module_group_project.context_product.util.Category;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.ZonedDateTime;

@Data
@AllArgsConstructor
@EqualsAndHashCode
public class Product implements Serializable, productRepository {
    Serializable versionUID = 1L;

    private Long id;
    @JsonProperty("title") private String name;
    @JsonProperty("description") private String desc;
    private Category category;
    private Double price;
    @JsonProperty("discountPercentage") private Double discount;
    private Double rating;
    private Integer stock;
    private String[] tags;
    private String brand;
    @JsonProperty("sku") private String SKU;
    private Double weight;
    @JsonIgnore Double width;
    @JsonIgnore Double height;
    @JsonIgnore Double depth;
    private Double[] dimensions = {width , height , depth};
    private String warrantyInformation;
    private String shippingInformation;
    private Availability availabilityStatus;
    private Review[] reviews;
    private String returnPolicy;
    private Integer minimumOrderQuantity;
    private Meta meta;



    static class Review {
      private Integer rating;
      private String comment;
      private ZonedDateTime date;
      private String reviewerName;
      private String reviewerEmail;
    }

    static class Meta {
      private ZonedDateTime createdAt;
      private ZonedDateTime updatedAt;
      private String barcode;
      private String qrCode;
      private String[] images;
      private String thumbnail;
    }
}
