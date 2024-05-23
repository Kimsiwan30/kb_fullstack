const fs = require('fs').promises;

fs.readFile('./01_readme.txt')
  .then(function (data) {
    console.log(data.toString());
    return fs.readFile('./02_readme.txt');
  })
  .then((data) => {
    console.log(data.toString());
    return fs.readFile('./03_readme.txt');
  })
  .then((data) => {
    console.log(data.toString());
    return fs.readFile('./04_readme.txt');
  })
  .then((data) => {
    console.log(data.toString());
  })
  .catch(function (err) {
    console.log(err);
  });
