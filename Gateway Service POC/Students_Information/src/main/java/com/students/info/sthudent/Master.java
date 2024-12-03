package com.students.info.sthudent;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="master")
@Data
public class Master {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Integer id ;
    @Column
    private String village;
    @Column
    private String district;
    @Column
    private String state;
}
