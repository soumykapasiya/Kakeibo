package com.kapasiya.account_book_service.entity.auth;

import com.kapasiya.account_book_service.entity.base.BaseEntity;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "im_user")
@EqualsAndHashCode(callSuper = true)
@CompoundIndex(def = "{'email': 1, 'isActive': 1}", name = "email_isActive_idx", unique = true)
public class User extends BaseEntity {

    private String name;

    @Indexed(unique = true)
    private String email;

    private String password;
    private String profileUrl;
    private String googleId;

    @Builder.Default boolean googleUser = false;
}
