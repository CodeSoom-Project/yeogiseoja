package com.yeogiseoja.domain.accommodation;

import com.yeogiseoja.domain.accommodation.address.City;
import com.yeogiseoja.domain.accommodation.address.State;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.assertj.core.util.Lists;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CategoryCityGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_city_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "city_id")
    private City city;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "categoryCityGroup", cascade = CascadeType.PERSIST)
    private List<CategoryCityStateGroup> itemOptionList = Lists.newArrayList();
}
