const arr = [1, 3, 8, 2, 11, 6, 10, 8, 39, 10, 11, 13];
let arrevensum = 0;
for (let i = 0; i < arr.length; i++) {
  if (i % 2 === 1) {
    arrevensum = arrevensum + arr[i];
    console.log(arr[i]);
  }
}
console.log(arrevensum);
