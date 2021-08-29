package net.zerotodev.api.item.controller;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import net.zerotodev.api.item.domain.Item;
import net.zerotodev.api.item.service.ItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowCredentials = "false")
@Api(tags = "items")
@RequiredArgsConstructor
@RestController
@RequestMapping("/items")
public class ItemController{
    private final ItemService itemService;

    @GetMapping("/connect")
    public String connect(){
        return "success";
    }

    public List<Item> findAll() {
        return itemService.findAll();
    }

    @GetMapping
    public Item findById(@RequestParam("itemBrand") String itemBrand,
                         @RequestParam("itemName") String itemName,
                         @RequestParam("itemColor") String itemColor) {
        return new Item(itemBrand, itemName, itemColor);
        //return itemService.findById(id);
    }

    public boolean existsById(long id) {
        return itemService.existsById(id);
    }

    public int count() {
        return itemService.count();
    }

    public void save(Item entity) {
        itemService.save(entity);
    }

    public void deleteById(long id) {
        itemService.deleteById(id);
    }
}
