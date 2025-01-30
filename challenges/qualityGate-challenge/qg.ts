// Create a function that takes an array of numbers and returns the second largest number.

let array = [1, 5, 4, 3, 2];

const secondLargestNum = (array) => {
    // if there are only 2 numbers in the array it will always be the lowest number
    // can return the second number using Math.min() if we needed to out of 2 numbers
    if (array.length < 2) {
        return null;
    }
    // sort the array in decending order if it was mixed
    let sortedArray = array.sort((a, b) => b - a);
    // return the 2nd highest number with index[1] with 5 being at index [0]
    console.log(sortedArray[1]);
    return sortedArray[1];
};
secondLargestNum(array);
