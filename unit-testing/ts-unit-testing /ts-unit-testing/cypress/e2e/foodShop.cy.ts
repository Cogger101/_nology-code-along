import { FoodType } from "../../src/ts/Food";

const filterFoodByType = (type: FoodType) => {
    const dropdown = cy.get("#sort-food");
    dropdown.select(type);

    const submit = cy.get("button");
    submit.click();
};

describe("Testing E2E of FoodShop", () => {
    beforeEach(() => {
        cy.visit("http://localhost:5173/");
    });
    it("Should have a heading with the correct text", () => {
        const heading = cy.get("h1");
        heading.should("contain", "Food Shop");
    });
    it("should filter junk food", () => {
        filterFoodByType(FoodType.JUNK);
        const foodContainer = cy.get("#foodContainer");
        foodContainer.children().should("have.length", 4);
        const salad = cy.contains("Salad");
        salad.should("not.exist");
        const pizza = cy.contains("Pizza");
        pizza.should("exist");
    });
});
