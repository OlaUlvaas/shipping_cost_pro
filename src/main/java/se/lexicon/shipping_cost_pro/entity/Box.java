package se.lexicon.shipping_cost_pro.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.*;
import java.time.LocalDateTime;

@ToString
@EqualsAndHashCode
@Data //Same as @Getter, @Setter, @NoArgsConstructor and @AllArgsConstructor together
@Entity
public class Box {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(nullable = false, updatable = false)
    private String id;

    @Column(nullable = false, length = 20)
    private String name;

    @Column(nullable = false, length = 20)
    private String country;

    @Column(nullable = false, length = 10)
    private String type;

    @Column(nullable = false)
    private double cost;

    @Column(nullable = false)
    private double weight;

    @Column(nullable = false, length = 10)
    private String weightType; // KG,G

    @CreationTimestamp
    @Column(nullable = false, columnDefinition = "TIMESTAMP default CURRENT_TIMESTAMP")
    private LocalDateTime createDate;

    @Column(nullable = false, columnDefinition = "tinyint(1) default 1")
    private boolean status;


}
