const express = require('express');
const router = express.Router()

// 고객 정보 조회를 위한 라우트
router.get('/', function(req,res){
    res.send('customer 라우트 루트');
})


//고객 정보 추가를 위한 라우트
router.post('/insert', function(req, res){
    res.send('/customer/insert 라우트');
})


// 고객 정보 삭제를 위한 라우트
router.put('/update', function(req, res){
    res.send('/customer/updaten 라우트')
})

// 고객 정보 삭제를 위한 라우트
router.delete('/delete', function(req,res){
    res.send('/customer/delete 라우트')
})

module.exports = router;