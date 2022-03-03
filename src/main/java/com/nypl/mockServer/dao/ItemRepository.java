package com.nypl.mockServer.dao;

import com.nypl.mockServer.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * Created by giris on 27/3/20.
 */
public interface ItemRepository extends JpaRepository<Item,Integer> {
    @Query(value="select * from item it where it.item_identifier= :itemIdentifier",nativeQuery = true)
    Item findByItemIdentifier(String itemIdentifier);
}
