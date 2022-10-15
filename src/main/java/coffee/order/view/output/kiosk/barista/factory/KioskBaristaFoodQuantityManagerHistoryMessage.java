package coffee.order.view.output.kiosk.barista.factory;

import coffee.order.domain.food.FoodCategory;

import java.util.Arrays;

import static coffee.order.view.output.OutputView.print;
import static coffee.order.view.output.UnitMessage.ENTER;
import static coffee.order.view.output.kiosk.barista.factory.KioskBaristaFoodQuantityManagerMessage.ANNOUNCE_MENU_AND_FOOD_QUANTITY_FORM;
import static coffee.order.view.output.kiosk.barista.factory.KioskBaristaFoodQuantityManagerMessage.ANNOUNCE_UPDATE_FINISHED;

public class KioskBaristaFoodQuantityManagerHistoryMessage {

    public void askMenuAndFoodQuantity() {
        print(ANNOUNCE_MENU_AND_FOOD_QUANTITY_FORM.message);
    }

    public void printMenus() {
        print(createMenu());
    }

    public void printUpdateFinished() {
        print(ANNOUNCE_UPDATE_FINISHED.message);
    }

    private String createMenu() {
        StringBuilder menuBuilder = new StringBuilder();
        Arrays.stream(FoodCategory.values())
                .forEach(category -> menuBuilder.append(category.toFoodCategoryDto()).append(ENTER.unit).append(ENTER.unit));
        return menuBuilder.toString();
    }
}
