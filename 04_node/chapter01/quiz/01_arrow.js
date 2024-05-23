const getTriangle = function (base, height) {
  return (base * height) / 2;
};

const getTriangleArrow = (base, height) => (base * height) / 2;

// const testFunc = (a, b) => {
//   b = a;
// };

// const testFunc2 = (a, b) => (b = a);

// console.log('testFunc : ', testFunc(1, 2));
// console.log('testFunc2 : ', testFunc2(1, 2));

// //console.log('삼각형의 면적:' + getTriangle(5, 2));

// const nomalFunc = function () {
//   console.log('nomalFunc:', this);
// };
// const arrowFunc = () => {
//   console.log('arrowFunc:', this);
// };

// nomalFunc();
// arrowFunc();
