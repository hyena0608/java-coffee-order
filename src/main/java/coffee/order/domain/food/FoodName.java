package coffee.order.domain.food;

public class FoodName {

    private String name;

    public FoodName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
