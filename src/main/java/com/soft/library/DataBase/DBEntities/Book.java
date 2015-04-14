package com.soft.library.DataBase.DBEntities;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Database entry.
 */
@Entity
public class Book {
    @Id @GeneratedValue
    private int id;
    private String name;
    @ManyToMany
    @JoinTable(name="BOOK_AUTHOR",  // name of the table to map author to a book
            joinColumns={@JoinColumn(name="book_id")},  // id for this table, book
            inverseJoinColumns={@JoinColumn(name="author_id")})  // id to map to
    private Set<Author> authors = new HashSet<>(0);

    public Book() {
    }

    public Book(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                //", authors=" + authors +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        return new EqualsBuilder()
                .append(getId(), book.getId())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(getId())
                .toHashCode();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }
}
