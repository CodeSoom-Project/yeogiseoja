package com.yeogiseoja.domain.accommodation;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Long id;

    @Enumerated(EnumType.STRING)
    private Type type;

    public Category(Type type) {
        this.type = type;
    }

    @Getter
    public enum Type {
        HOTEL("호텔"),
        RENTAL_COTTAGE("팬션"),
        FULL_VILLA("풀빌라");
        private final String description;

        Type(String description) {
            this.description = description;
        }
    }
}
