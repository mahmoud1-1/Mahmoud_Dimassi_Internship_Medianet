package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.Data;


@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "orders")

public class Order {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "order_id_sequence")

    @SequenceGenerator(
            name = "order_id_sequence",
            sequenceName = "order_id_sequence")
    private Integer id;
    private String name;
    private String description;
    private String status;

//    @ManyToOne
//
//    @JoinColumn(name = "customer_id")
//   // @JsonBackReference
//    private Customer customer;







}
