//  https://school.programmers.co.kr/learn/courses/30/lessons/120583

const arr = [];
function solution(arr, n) {
  let count = 0;
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] === n) {
      count = count + 1;
    }
  }
  return count;
}
