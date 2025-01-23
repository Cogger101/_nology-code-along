import { addTwoNumbers } from "./calculator";
// Calculator

describe("Testing Calculator functions", () => {
    test("It should return 0 when given two 0s for addition ", () => {
        const result = addTwoNumbers(0, 0);
        expect(result).toBe(0);
    });
    test("it should return 10 when given 4 and 6", () => {
        const result = addTwoNumbers(4, 6);
        expect(result).toBe(10);
    });
    test("It should work with negative numbers", () => {
        expect(addTwoNumbers(-18, 6)).toBe(-12);
    });
    test("It should work with decimal numbers", () => {
        expect(addTwoNumbers(0.636486, 9.974681)).toBe(10.611167);
    });
});
