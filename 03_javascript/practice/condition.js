let date = new Date();
console.log(date);
let hours = date.getHours();
console.log(hours);
if (hours > 12) {
  console.log('오후입니다');
}
let month = date.getMonth() + 1;
console.log(month);
if (month > 6) {
  console.log('곧 여름입니다');
} else {
  console.log('여름이 아닙니다');
}
