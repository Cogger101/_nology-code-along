import { FoodType } from "../../src/ts/Food";

const filterFoodByType = (type: FoodType) => {
    const dropdown = cy.get("#sort-food");
    dropdown.select(type);

    const submit = cy.get("button");
    submit.click();
};

describe("Testing E2E of FoodShop", () => {
    beforeEach(() => {});
});
