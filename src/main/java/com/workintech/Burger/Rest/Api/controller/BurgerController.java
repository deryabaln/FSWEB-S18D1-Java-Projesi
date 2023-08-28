package com.workintech.Burger.Rest.Api.controller;

import com.workintech.Burger.Rest.Api.dao.BurgerDao;
import com.workintech.Burger.Rest.Api.entity.BreadType;
import com.workintech.Burger.Rest.Api.entity.Burger;
import jakarta.validation.constraints.Positive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class BurgerController {
    private BurgerDao burgerDao;

    @Autowired
    public BurgerController(BurgerDao burgerDao) {
        this.burgerDao = burgerDao;
    }

    @GetMapping("/")
    public List<Burger> find() {
        return burgerDao.findAll();
    }

    @GetMapping("/findByPrice/{price}")
    public List<Burger> findByPrice(@PathVariable double price) {
        return burgerDao.findByPrice(price);
    }
    @GetMapping("/findByBreadType/{breadType}")
    public List<Burger> findByBreadType(@PathVariable BreadType breadType) {
        return burgerDao.findByBreadType(breadType);
    }
    @GetMapping("/findByContent/{content}")
    public List<Burger> findByContent(@PathVariable String content) {
        return burgerDao.findByContent(content);
    }
    @GetMapping("/{id}")
    public Burger findById(@Positive @PathVariable int id) {
        return burgerDao.findById(id);
    }

    @PostMapping("/")
    public Burger save( @Validated @RequestBody Burger burger) {
        return burgerDao.save(burger);
    }

    @PutMapping("/")
    public Burger update( @RequestBody Burger burger){
        return burgerDao.update(burger);
    }

    @DeleteMapping("/{id}")
    public Burger remove (@PathVariable int id){
        return burgerDao.remove(id);
    }
}
