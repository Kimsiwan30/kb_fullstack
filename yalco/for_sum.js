// let sum = 0;

// for (let i = 1; i <= 100; i++) {
//   //i+2
//   // sum += i;
//   sum = sum + i;
//   console.log(sum);
// }

//일부터 백까지 짝수의합, 일부터 백까지 홀수의합
// let sum = 0;
// for (let i = 1; i <= 100; i++) {
//   if (i % 2 === 1) {
// sum = sum + i;
//   }
// }
// console.log(sum);

// let sum = 0;
// for (let i = 1; i <= 100; i++) {
//   if (i % 2 === 0) {
//     sum = sum + i;
//   }
// }
// console.log(sum);

// let oddSum = 0;
// let evenSum = 0;
// // oddsum 홀수합 even 짝수합
// for (let i = 1; i <= 100; i++) {
//   if (i % 2 === 1) {
//     oddSum = oddSum + i;
//   } else {
//     evenSum = evenSum + i;
//   }
// }
// else if (i % 2 === 0){ evenSum = evenSum + i; }

// console.log(oddSum);
// console.log(evenSum);

// 1부터 100까지 2의 배수 5의배수 7의배수 합산 (각각)
let twos = 0;
let fives = 0;
let sevens = 0;
for (let i = 1; i <= 100; i++) {
  if (i % 2 === 0) {
    twos = twos + i;
  }
  if (i % 5 === 0) {
    fives = fives + i;
    // fives += i;
  }
  if (i % 7 === 0) {
    sevens = sevens + i;
  }
}
console.log(twos);
console.log(fives);
console.log(sevens);
