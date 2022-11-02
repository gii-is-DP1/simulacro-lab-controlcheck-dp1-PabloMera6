package org.springframework.samples.petclinic.product;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "product_types")
public class ProductType implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)	
    private Integer id;
    @Size(min=3, max=50)
	@Column(unique=true, nullable=false)
    private String name;
}
