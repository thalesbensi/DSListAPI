package com.thalesbensi.DSList.entities;


import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

@Entity
@Table(name = "tb_belonging")
public class Belonging {

    @EmbeddedId

    private BelongingPK belongingPK = new BelongingPK();

    private Integer position;

}
