// Challenge 1

function sumOfOddNumbers(n) {
    let sum = 0;
    let count = 0;
    let currentNumber = 1;

    while (count < n) {
        sum += currentNumber;
        currentNumber += 2;
        count++;
    }
    return sum;
}

console.log(sumOfOddNumbers(5)); // Output: 25 (1 + 3 + 5 + 7 + 9)

// Challenge 2

function reverseDigits(num) {
    // Your code here
    let numStr = num.toString();
    let reversedStr = "";
    for (let i = numStr.length - 1; i >= 0; i--) {
        reversedStr += numStr[i];
    }
    return reversedStr;
}

console.log(reverseDigits(12345)); // Output: 54321

// Challenge 3

function multiplicationTable(n, m) {
    // Your code here
    for (i = 1; i <= 5; i++) {
        const result = n * i;
        console.log(result);
    }
}

multiplicationTable(3, 5);
// Output:
// 3 x 1 = 3
// 3 x 2 = 6
// 3 x 3 = 9
// 3 x 4 = 12
// 3 x 5 = 15

// Challenge 4

function smallestDivisor(num) {
    // Your code here
    let smallestDiv = 0;
    for (let i = 2; i <= num; i++) {
        if (num % i === 0) {
            smallestDiv = i;
            break;
        }
    }
    return smallestDiv;
}

console.log(smallestDivisor(15)); // Output: 3
console.log(smallestDivisor(17)); // Output: 17 (Prime number)

// Challenge 5

function isPrime(num) {
    // Your code here

    if (num <= 1) {
        return false;
    }
    for (let i = 2; i < Math.sqrt(num); i++) {
        if (num % i === 0) {
            return false;
        }
    }
    return true;
}

console.log(isPrime(7)); // Output: true
console.log(isPrime(10)); // Output: false
console.log(isPrime(2)); // Output: true
console.log(isPrime(1)); // Output: false
