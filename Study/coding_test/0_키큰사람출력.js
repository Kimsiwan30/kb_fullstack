const tc1 = [165, 170, 175, 180];
const tc2 = 175;

function solution(arr, height) {
  let tall = 0;
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] > height) {
      tall = tall + 1;
    }
  }
  return tall;
}
console.log(solution(tc1, tc2));
