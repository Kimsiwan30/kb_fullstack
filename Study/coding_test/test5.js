// https://school.programmers.co.kr/learn/courses/30/lessons/120583

// const arr = [];
// function solution(arr, n) {
//   for (let i = 0; i < arr.length; i++) {

//   }
// }

function solution(array, n) {
  let count = 0;
  var answer = array.filter((item) => (item === n ? count++ : 0));
  return count;
}
