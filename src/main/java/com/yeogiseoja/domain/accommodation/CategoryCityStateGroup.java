package com.yeogiseoja.domain.accommodation;

import com.yeogiseoja.domain.accommodation.address.State;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CategoryCityStateGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_state_city_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_city_id")
    private CategoryCityGroup categoryCityGroup;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "state_id")
    private State state;

    @Builder
    public CategoryCityStateGroup(
            CategoryCityGroup categoryCityGroup,
            State state
    ) {
        this.categoryCityGroup = categoryCityGroup;
        this.state = state;
    }

}
