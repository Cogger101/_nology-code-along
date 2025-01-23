import {
    capitalizeString,
    filterFoodByType,
    generateFoodHTML,
    sortByRating,
} from "./foodUtilities";
import { Food, FoodType } from "./Food";

describe("Testing capitalizeString ", () => {
    test("Should capitalise the first letter of a word string", () => {
        const output = capitalizeString("croissant");
        expect(output).toBe("Croissant");
    });
    test("Should return the same string length as was passed", () => {
        const output = capitalizeString("pizza");
        expect(output.length).toBe(5);
    });
    test("should handle mutiple word string", () => {
        const output = capitalizeString("i am groot");
        expect(output).toBe("I Am Groot");
    });
});

describe("Testing filterFoodByType", () => {
    test("Returns and empty array if no food matched the FoodType parameter", () => {
        const mockData: Food[] = [
            { img: "🍕", name: "pizza", foodType: FoodType.JUNK, rating: 10 },
            { img: "🍔", name: "burger", foodType: FoodType.JUNK, rating: 7 },
            { img: "🍟", name: "fries", foodType: FoodType.JUNK, rating: 3 },
        ];
        const output = filterFoodByType(FoodType.HEALTHY, mockData);
        expect(output).toEqual([]);
    });
    test("Should not mutate the original array", () => {
        const mockData: Food[] = [
            { img: "🍕", name: "pizza", foodType: FoodType.JUNK, rating: 10 },
            { img: "🍔", name: "burger", foodType: FoodType.JUNK, rating: 7 },
            { img: "🍟", name: "fries", foodType: FoodType.JUNK, rating: 3 },
            { img: "🥙", name: "pita", foodType: FoodType.HEALTHY, rating: 6 },
        ];
        const healthyOnlyData: Food[] = [
            { img: "🥙", name: "pita", foodType: FoodType.HEALTHY, rating: 6 },
        ];
        const output = filterFoodByType(FoodType.HEALTHY, mockData);
        expect(output).not.toBe(mockData);
        expect(mockData).toEqual(mockData);
    });
    test("Should return a filtered array of healthy food", () => {
        const mockData: Food[] = [
            { img: "🍟", name: "fries", foodType: FoodType.JUNK, rating: 3 },
            { img: "🌭", name: "hot dog", foodType: FoodType.JUNK, rating: 3 },
            { img: "🥗", name: "salad", foodType: FoodType.HEALTHY, rating: 4 },
            { img: "🥙", name: "pita", foodType: FoodType.HEALTHY, rating: 6 },
        ];
        const healthyOnlyData: Food[] = [
            { img: "🥗", name: "salad", foodType: FoodType.HEALTHY, rating: 4 },
            { img: "🥙", name: "pita", foodType: FoodType.HEALTHY, rating: 6 },
        ];
        expect(filterFoodByType(FoodType.HEALTHY, mockData)).toEqual(
            healthyOnlyData
        );
    });
});
