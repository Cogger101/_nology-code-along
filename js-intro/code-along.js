// ## Challenge: Sum of `n`

// ### MVP:

// Create a function with a for loop that will add all the numbers up to n

// 1. You should create a variable to set the upper limit of your loop
// 2. Your loop should increment by 1 on each iteration
// 3. Your loop should print the final result

// ```js
// sum(10) => 55
// ```

// ### Bonus:

// Try writing the function again with the same inputs and outputs **Without**
// using a loop. (You may need to google some formulas!)

const sum = (n) => {
    let start = 0;

    for (let i = 0; i <= n; i++) {
        start += i;
    }
    return start;
};
// console.log(sum(10));

// --------------------------------------------------------------------------------------------------------

const arr1 = [1, 3, 5, 7, 9];
const newArr1 = arr1.map((num) => num - 1);
console.log(newArr1);
