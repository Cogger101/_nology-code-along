import "./style.css";

// INFERED TYPES

const firstName = "Sean";
console.log(typeof firstName);

// EXPLICIT TYPING

const myFaveNum: number = 8000;

let isBoolean = true;

// isBoolean = 2;  ---- typescrpit will notify of error for incorrect data types

//declaring Explicit tpyes

const temps = [12, 32, 23];

const info = temps.map((num) => {
    return `It is ${num}c`;
}) as string[];

const info2 = (<string[]>temps.map((num) => {
    return `It is ${num}c`;
})) as string[];

const info3: string[] = temps.map((num) => {
    return `It is ${num}c`;
});

// Challenge 1
// Create a function that will generate an array of five random numbers between 1 and n.

const randomNums = (n: number) => {
    const numbers: number[] = [];
    for (let i = 0; i < 5; i++) {
        numbers.push(Math.floor(Math.random() * n));
    }
    return numbers;
};

console.log(randomNums(20));
