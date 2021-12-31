package fs.mok.store.store.book.models.entity.common;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
public class CommonUserUpdated {
    @Column(name = "user_created")
    private String userCreated;

    @Column(name = "date_created")
    private Date dateCreated;
}
