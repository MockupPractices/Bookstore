package fs.mok.store.store.book.models.entity;


import fs.mok.store.store.book.models.entity.common.CommonUserUpdated;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "authors", catalog = "store_clothes")
@Getter @Setter
public class Authors extends CommonUserUpdated {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "first_name", length = 30, nullable = false)
    private String firstName;

    @Column(name = "middle_name", length = 30, nullable = false)
    private String middleName;

    @Column(name = "last_name", length = 30, nullable = false)
    private String lastName;

    @Transient
    private Integer age;

    @Temporal(TemporalType.DATE)
    private Date date;

    @Enumerated(EnumType.STRING)
    private Constants.Gender gender;
}
