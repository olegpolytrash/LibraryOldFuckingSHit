/**
 * 
 */
package com.soft.library.DataBase.service;

import com.soft.library.DataBase.DBEntities.Publisher;

/**
 * @author rd
 *
 */
public class AdvPublisherService {

    public static void addPublisher(String title) {
        Publisher publisher = new Publisher();
        publisher.setName(title);
        PublisherService as = new PublisherService();
        as.addPublisher(publisher);
    }

    public static int updatePublishers(String oldName, String newName) {
        PublisherService as = new PublisherService();
        int count = 0;
        for (Publisher a : as.getAllPublishers()) {
            if (a.getName().equals(oldName)) {
                a.setName(newName);
                as.updatePublisher(a);
                count++;
            }
        }
        return count;
    }

    public static void printPublishers() {
        PublisherService as = new PublisherService();
        System.out.println("\nAll Publishers:");
        for (Publisher a : as.getAllPublishers()) {
            System.out.println("publisher: id=" + a.getId() + " Title="
                    + a.getName());
        }
    }

    public static Publisher getPublisherById(int publisherId) {
        PublisherService as = new PublisherService();
        return as.getPublisherById(publisherId);
    }

    public static void deletePublisher(String publisher) {
        PublisherService as = new PublisherService();
        for (Publisher a : as.getAllPublishers()) {
            if (a.getName().equalsIgnoreCase(publisher)) {
                as.deletePublisher(a);
                break;
            }
        }
    }
}
