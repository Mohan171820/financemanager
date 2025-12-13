package spring.Finance.manager.Control;

import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.Finance.manager.Entity.Category;
import spring.Finance.manager.Services.CategoriesService;

import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping("/fm")
public class CategoriesController {
    @Autowired
    private CategoriesService categoriesService;
                                                            // To Enter details of category entity
    @PostMapping("/api/categories")
    public Category createCategory(@RequestBody Category category) {
        return categoriesService.createCategory(category);
    }
                                                      // To get all the details of the categories
    @GetMapping("/api/getCategory")
    public List<Category>getAllCategories(){
        return categoriesService.getCategories();
    }
                                                   // To get the details of categories by the id
    @GetMapping("/api/categories/{id}")
    public Category getCategoriesById(@PathVariable Integer id){
        return categoriesService.getCategoriesById(id);
    }
                                                 // To update the categories details
    @PutMapping("/api/updateCategories")
    public Category updateCategory(@RequestBody Category category){
        return categoriesService.updateCategories(category);
    }

    @DeleteMapping("/api/deleteCategories")
    public void deleteCategory(@RequestBody Category category){

    }
}
