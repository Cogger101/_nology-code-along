//TS OBJECTS
// What are objects?
// How can we create objects?
// How can we access and modify existing objects?
// How can using a type alias help keep objects consistent?

const myArray: any[] = ["Remi, 35, true"];

const person = {
    // [key]: [value]
    name: "Remi",
    age: 35,
    ukBased: true,
    citiesHasLived: ["London", "Paris", "Sydney"],
    citizenship: {
        aus: true,
        fr: true,
        uk: false,
    },
};

console.log("person objects:", person);
console.log("person name:", person.name);
console.log("person cities:", person.citiesHasLived);
console.log("person cities:", person.citiesHasLived.length);

// Updating the current object

person.name = "Sam";
console.log("person name:", person.name);
person.citiesHasLived.push("Brighton");
console.log(person.citiesHasLived);

// Objects are not iterable => you have to use dot notation to dive to an array within the object

console.log(
    "person citites:",
    person.citiesHasLived.map((cities) => {
        return `I have lived in ${cities}`;
    })
);

//Using the [] bracket notation

console.log("age, bracket notation:", person["age"]);
console.log("name, bracket notation", person["name"]);

// How we restrict types in our objects in TS?
// Using type to give a definition of an object

type Citizen = {
    name: string;
    age: number;
    isBritish: boolean;
    "my Key Name": string;
};

const john: Citizen = {
    name: "John",
    age: 99,
    isBritish: true,
    "my Key Name": "my Key Value",
};

console.log(john["my Key Name"]);
// console.log(john.'my Key Name') => will not work as the key is a string and will only be assessed with []

// How can we us type alias to have object consistency?
//  interfaces - a type for objects
// YOU CAN NOT EXTEND TYPES

interface Animal {
    species: string;
    age: number;
}

interface Cat extends Animal {
    isAnnoying: boolean;
}

const garfield: Cat = {
    species: "Cat",
    isAnnoying: true,
    age: 99,
};

console.log("Garfield =>", garfield);

// JSON = JavaScript Object Notation
