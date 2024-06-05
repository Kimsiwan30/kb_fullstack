const arr = [1, 'a', 8, 'b', 11, 'c', 'd', 39, 'e', 11, 13];
let sen = '';
for (let i = 0; i < arr.length; i++) {
  if (typeof arr[i] === 'string') {
    sen = sen + arr[i];
  }
}
console.log(sen.toUpperCase());
