package org.myhome.webscraper.model;

import jakarta.persistence.*;
import lombok.*;
import org.myhome.webscraper.enumeration.BillOfSale;
import org.myhome.webscraper.enumeration.Renovation;

import java.sql.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "property", schema = "public")
public class Property {
    @Id
    @Column(name = "property_id", nullable = false)
    private Integer propertyId;
    @Column(name = "advert_date")
    private Date advertDate;
    @Column(name = "area")
    private Double area;
    @Column(name = "bill_of_sale")
    @Enumerated(EnumType.STRING)
    private BillOfSale billOfSale;
    @Column(name = "building_floor")
    private Integer buildingFloor;
    @Column(name = "city")
    private String city;
    @Column(name = "description", columnDefinition = "text")
    private String description;
    @Column(name = "flat_floor")
    private Integer flatFloor;
    @Column(name = "metro")
    private String metro;
    @Column(name = "price")
    private Integer price;
    @Column(name = "property_category")
    private String propertyCategory;
    @Column(name = "renovation")
    @Enumerated(EnumType.STRING)
    private Renovation renovation;
    @Column(name = "rooms")
    private Integer rooms;
    @Column(name = "target")
    private String target;
    @Column(name = "updated_date")
    private Date updatedDate;
}
