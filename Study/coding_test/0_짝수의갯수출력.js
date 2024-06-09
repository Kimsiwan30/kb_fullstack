const array = [1, 4, 7, 3, 8, 10, 17, 32, 46, 45];

function abc(array, n) {
  let count = 0;
  for (let i = 0; i < array.length; i++) {
    if (array[i] % n === 0) {
      count = count + 1;
    }
  }
  return count;
}
console.log(abc(array));
