package in.ac.sharda.pizzaapplication.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ac.sharda.pizzaapplication.domain.Cart;

@RestController
public class CartController {

	@GetMapping("/cart/list")
	public List<Cart> items(){
		List<Cart> items = new ArrayList<>();
		for(int i = 1; i < 20; i++){
			items.add(
					new Cart(i, i*10,"Name "+i,
							"Desc "+i));
		}
		return items;
    }
    
    @GetMapping("/cart/list")
    public List<Cart> remove(Cart item)
    {
        List<Cart> items=items();
        items.remove(item);
        return items;
    }

    @GetMapping("/cart/list")
    public List<Cart> size()
    {
        List<Cart> items=items();
        return items.size();
    }
}