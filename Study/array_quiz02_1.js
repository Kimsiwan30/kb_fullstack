const arr = [1, '가', 8, '다', 11, 'a', 'c', 39, '사과', 11, 13];
for (let i = 0; i < arr.length; i++) {
  if (typeof arr[i] === 'string') {
    console.log('#', arr[i]);
  } else {
    console.log('$', arr[i]);
  }
}
