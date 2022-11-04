package Product;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class BookRecipes {
    private final Set<Recipe> bookRecipes;

    public BookRecipes() {
        bookRecipes = new HashSet<>();
    }

    public void addRecipes(Recipe recipes) throws RuntimeException {
        if (this.bookRecipes.contains(recipes)) {
            throw new RuntimeException("Указаный рецепт уже существует.");
        } else {
            bookRecipes.add(recipes);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookRecipes that = (BookRecipes) o;
        return Objects.equals(bookRecipes, that.bookRecipes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookRecipes);
    }

    @Override
    public String toString() {
        return "Книга рецептов " + bookRecipes + "\n";
    }
}

