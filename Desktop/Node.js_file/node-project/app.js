const express = require('express');
const customerRoute = require('./routes/customer');
const productRoute = require('./routes/product');
const app = express();
const bodyParser = require('body-parser');
const port = 3000;


app.get('/', (req,res)=> {
    res.send('Hello world!');
})

app.use(bodyParser.urlencoded({ extended: false}))
app.use(bodyParser.json());

// 포트 설정
// app.listen(port, () => {
//     console.log(`서버가 실행됩니다. http://localhost:${port}`);
// })

// app.get('/customer', (req,res)=>{
//     res.send('get 요청에 대한 응답')
// })

// app.post('/customers', (req, res)=>{
//     res.send('post 요청에 대한 응답')
// })

// app.all('/customer', (req,res)=>{
//     res.send('HTTP 요청 메소드 종류에 상관없이 응답')
// })

// // 클라이언트에서 HTTP 요청 메소드 GET 방식으로 'host:port/about;
// app.get('/about', (req,res) =>{
//     res.send('about')
// })


// 콜백 함수 배열로 라우트 처리

// const ex0 = function(req, res, next){
//     console.log('첫 번쨰 콜백 함수');
//     next(); // 다음 콜백 함수 호출
// }

// const ex1 = function(req, res, next){
//     console.log('두 번쨰 콜백 함수');
//     next() // 다음 콜백 함수 호출
// }

// const ex2 = function(req, res){
//     res.send('세 번째 콜백 함수') // 클라이언트로 응닫
// }

// app.get('/examples', [ex0, ex1, ex2]);

app.use(express.json({
    limit: '50mb'
}))

app.listen(port, ()=>{
    console.log('server ok');
})

app.get('/error', function(req, res, next){
    next(new Error('에러 발생'));
})

app.use('/customer', customerRoute)
app.use('/product', productRoute)