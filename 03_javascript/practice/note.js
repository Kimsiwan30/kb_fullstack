const date = new Date();
const month = date.getMonth() + 1;

if (4 <= month < 6) {
  console.log('봄입니다');
} else if (6 <= month < 10) {
  console.log('여름입니다');
} else if (10 <= month < 12) {
  console.log('가을입니다');
} else {
  console.log('겨울입니다');
}
