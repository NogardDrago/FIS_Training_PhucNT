package com.fis.ordermanagement.model;

import com.fis.ordermanagement.model.enums.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="order")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",unique = true)
    private Long id;
    @Column(name="order_time")
    private LocalDateTime orderDateTime;
    @ManyToOne
    @JoinColumn(name="customer_id")
    private Customer customer;
    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItem;
    @NotNull
    @Column(name="total_amount")
    private Double totalAmount;
    @Column(name="status")
    @Enumerated(EnumType.STRING)
    private OrderStatus status;
}
