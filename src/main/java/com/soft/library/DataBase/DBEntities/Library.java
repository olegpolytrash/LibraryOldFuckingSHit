package com.soft.library.DataBase.DBEntities;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

/**
 * Database entry.
 */
@Entity
public class Library {
    @Id @GeneratedValue
    private int id;
    private int pages;
    private int year;
    private int quantity;
    @OneToMany
    private Set<Book> books = new HashSet<>(0);
    @OneToMany
    private Set<Publisher> publishers = new HashSet<>(0);

    public Library() {
    }

    public Library(int pages, int year, int quantity) {
        this.pages = pages;
        this.year = year;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Library{" +
                "id=" + id +
                ", pages=" + pages +
                ", year=" + year +
                ", quantity=" + quantity +
                ", books=" + books +
                ", publishers=" + publishers +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Library library = (Library) o;

        return new EqualsBuilder()
                .append(getId(), library.getId())
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

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public Set<Publisher> getPublishers() {
        return publishers;
    }

    public void setPublishers(Set<Publisher> publishers) {
        this.publishers = publishers;
    }
}
