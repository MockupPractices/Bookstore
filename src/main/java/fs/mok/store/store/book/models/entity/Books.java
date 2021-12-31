package fs.mok.store.store.book.models.entity;

import fs.mok.store.store.book.models.entity.common.CommonUserUpdated;

import javax.persistence.*;

@Entity
@Table(catalog = "store_book")
public class Books extends CommonUserUpdated {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "book_name", nullable = false)
    private String bookName;

}
