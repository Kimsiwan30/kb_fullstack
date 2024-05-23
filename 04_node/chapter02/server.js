const express = require('express');
const cors = require('cors');

const port = 4000;
const app = express();
app.use(cors());

app.get('/request', function (req, res) {
  res.status(200).json('안녕하세요. 여기는 백엔드 입니다!');
});

app.get('/error', (req, res) => {
  res.status(500).json('비상!!! 에러 발생');
});

app.listen(port, () => {
  console.log(`데이터 통신 서버거 ${port}번에서 작동중입니다`);
});
