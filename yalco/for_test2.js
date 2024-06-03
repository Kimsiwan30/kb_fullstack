let answer = '';

for (let i = 0; i <= 100; i++) {
  if (i % 2 === 1) {
    answer += ' ${i}';
  }
}

console.log(answer);
// 일부터 백 홀수의 합 , 일부터 백 짝수의 합
