package com.caloriesdiary.MyCaloriesTrackingDiary.model.enums;

public enum FoodType {
    BREAD("White bread", 314, FoodCategory.COMMON_MEALS),
    SPAGHETTI("Spaghetti", 158, FoodCategory.COMMON_MEALS),
    RICE("Rice", 206, FoodCategory.COMMON_MEALS),
    PIZZA("Pizza", 285, FoodCategory.COMMON_MEALS),
    POTATO("Potato", 130, FoodCategory.COMMON_MEALS),

    BEEF("Beef (regular cooked)", 142, FoodCategory.PROTEINS),
    CHICKEN("Chicken cooked", 136, FoodCategory.PROTEINS),
    EGG("Egg", 78, FoodCategory.PROTEINS),
    FISH("Fish", 136, FoodCategory.PROTEINS),
    PORK("Pork", 137, FoodCategory.PROTEINS),

    ASPARAGUS("Asparagus", 27, FoodCategory.VEGETABLES),
    BROCCOLI("Broccoli", 45, FoodCategory.VEGETABLES),
    CARROTS("Carrots", 27, FoodCategory.VEGETABLES),
    CUCUMBER("Cucumber", 17, FoodCategory.VEGETABLES),
    TOMATO("Tomato", 22, FoodCategory.VEGETABLES),
    EGGPLANT("Eggplant", 35, FoodCategory.VEGETABLES),
    LETTUCE("Lettuce", 5, FoodCategory.VEGETABLES),

    APPLE("Apple", 59, FoodCategory.FRUIT),
    BANANA("Banana", 151, FoodCategory.FRUIT),
    GRAPES("Grapes", 100, FoodCategory.FRUIT),
    ORANGE("Orange", 53, FoodCategory.FRUIT),
    PEAR("Pear", 82, FoodCategory.FRUIT),
    PEACH("Peach", 67, FoodCategory.FRUIT),
    PINEAPPLE("Pineapple", 82, FoodCategory.FRUIT),
    STRAWBERRY("Strawberry", 53, FoodCategory.FRUIT),
    WATERMELON("Watermelon", 53, FoodCategory.FRUIT),

    COCA("Coca-Cola Classic", 150, FoodCategory.BEVERAGES),
    DIET_COKE("Diet Coke", 0, FoodCategory.BEVERAGES),
    JUICE("Juice", 47, FoodCategory.BEVERAGES),
    YOGURT("Yogurt", 54, FoodCategory.BEVERAGES),
    MILK("Milk", 70, FoodCategory.BEVERAGES),
    BEER("Beer", 43, FoodCategory.BEVERAGES),
    CIDER("Apple cider", 117, FoodCategory.BEVERAGES),
    RED_WINE("Red Wine", 76, FoodCategory.BEVERAGES),
    WHITE_WINE("White Wine", 70, FoodCategory.BEVERAGES);

    private final String name;
    private final int caloriesAmountIn100grammes;
    private final FoodCategory foodCategory;


    FoodType(String name, int caloriesAmountIn100grammes, FoodCategory foodCategory) {
        this.name = name;
        this.caloriesAmountIn100grammes = caloriesAmountIn100grammes;
        this.foodCategory = foodCategory;
    }

    private int getCaloriesAmountIn100grammes() {
        return caloriesAmountIn100grammes;
    }

}
