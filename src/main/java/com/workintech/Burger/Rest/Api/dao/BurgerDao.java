package com.workintech.Burger.Rest.Api.dao;

import com.workintech.Burger.Rest.Api.entity.BreadType;
import com.workintech.Burger.Rest.Api.entity.Burger;

import java.util.List;

public interface BurgerDao {
    Burger save(Burger burger);
    List<Burger> findAll();
    Burger findById(int id);
    List<Burger> findByPrice(double price);
    List<Burger> findByBreadType(BreadType breadType);
    List<Burger> findByContent(String content);
    Burger update(Burger burger);
    Burger remove(int id);
}
