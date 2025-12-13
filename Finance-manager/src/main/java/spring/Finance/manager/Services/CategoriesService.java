package spring.Finance.manager.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.Finance.manager.Entity.Category;
import spring.Finance.manager.Repos.CategoryRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriesService {
    @Autowired
    private CategoryRepository categoryRepository;
                                                           // logic to save the details of the categories
    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }
                                                        // logic to get all the details of categories
    public List<Category> getCategories() {
        return categoryRepository.findAll();
    }
                                                        // logic to get the details of a particular categories by is
    public Category getCategoriesById(Integer id) {
        return categoryRepository.findById(id).get();
    }
    public Category updateCategories(Category category) {
        return categoryRepository.save(category);
    }
    public void deleteCategories(Integer id) {
        categoryRepository.deleteById(id);
    }
}
