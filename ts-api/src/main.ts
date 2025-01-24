import "./style.css";

// CRUD
// Create (CREATE, PUT)
// Read (GET)
// Update (PUT, PATCH)
// Delete (DELETE)

// API calls

// Set in an async way

// console.log("GET REQUEST");
// setTimeout(() => {
//     console.log("API responce");
// }, 3000);

// console.log("Doing extra processing while the server is sending its response");

const btn = document.querySelector<HTMLButtonElement>("button");
const container = document.querySelector<HTMLDivElement>("#imgContainer");

if (!container || !btn) {
    throw new Error("Issues with the HTML selectors");
}

const getRandomDogImg = async () => {
    // Promise
    // We need to await on the fetch/GET to resolve to a Promise. fetch() returns A promise that resolves to a Response object
    const response = await fetch("https://dog.ceo/api/breeds/image/random");
    // console.log(response);
    // Response
    const data = await response.json();
    console.log(data);

    // return
    return data;
};

const handleDogImgBtn = async () => {
    const dogImg = await getRandomDogImg();
    const img = document.createElement("img");
    img.src = dogImg.imgUrl;
    img.alt = "pic of a dog";
    container.innerHTML = "";
    container.appendChild(img);
};

btn.addEventListener("click", handleDogImgBtn);

console.log(await getRandomDogImg());
