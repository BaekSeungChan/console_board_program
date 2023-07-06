const express = require("express");
const router = express.Router();
const controller = require("../controller/commuCtrl");

//경로: /community
router.get("/", controller.getCommunity); // 커뮤니티 전체 조회
router.get("/detail", controller.getCommunitySeg); // 커뮤니티 상세 조회
router.post("/lounge", controller.postCommunity); //게시글 작성
router.patch("/lounge/:id", controller.patchCommunity); //게시글 수정
router.delete("/lounge/:id", controller.deleteCommunity); //게시글 삭제

module.exports = router;
