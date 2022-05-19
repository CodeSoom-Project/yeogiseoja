package com.yeogiseoja.domain.accommodation;

import com.yeogiseoja.domain.accommodation.address.City;
import com.yeogiseoja.domain.accommodation.address.State;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Accommodation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "accommodation_id")
    private Long id;
    private String name;
    private String contact;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "state_id")
    private State state;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "city_id")
    private City city;

    private String detailAddress;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    @Builder
    public Accommodation(
            String name,
            String contact,
            State state,
            City city,
            Category category,
            String detailAddress
    ) {

        this.name = name;
        this.contact = contact;
        this.state = state;
        this.city = city;
        this.category = category;
        this.detailAddress = detailAddress;
    }


}
