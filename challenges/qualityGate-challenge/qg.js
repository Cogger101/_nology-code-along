// Create a function that takes an array of numbers and returns the second largest number.
var array = [1, 2, 3, 4, 5];
var secondLargestNum = function () {
    var secondLargest = [];
    array.forEach(function (num) {
        if (num > num + 1) {
            secondLargest.push(num);
        }
        console.log(num);
    });
};
