package com.yeogiseoja.domain.accommodation.address;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "state_id")
    private Long id;
    private String name;

    public State(Long id, String name) {
        this.name = name;
    }
}
