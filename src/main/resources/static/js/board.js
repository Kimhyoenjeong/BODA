$(document).on('click', '#modifiy_btn', function(e){
    if(confirm("수정하시겠습니까?") == true){
        //데이터 담는 부분
        const boardSubject = $("#board_")
    }
})




//$(function () {
//    $('#writeBtn').on('click', function () {
//
//      let subject = $('#subject').val();
//      if (subject.trim() == "") {
//        $('#subject').focus();
//        return;
//      }
//
//      let content = $('#content').val();
//      if (content.trim() == "") {
//        $('#content').focus();
//        return;
//      }
//
//
//      $('#frm').submit();
//    })
//  })
// $(function () {
//    //form을 변수에 저장
//    var formObj $("form[role='form']");
//    //수정 버튼 선택
//    $("$modify_btn").click(function(){
//        formObj.attr("action","modify");
//        fromObj.attr("method","get");
//        formObj.submit();
//    });
//    //삭제 버튼 클릭
//    $("$delete_btn").click(function(){
//        formObj.attr("action","delete");
//        fromObj.attr("method","get");
//        formObj.submit();
//    });
// })
// $(document).ready(function(){
//
//    function goBoardList(){
//    location.href="/resources/static/Community.html";
//    }
//
//    function insertBoard(){
//    var boardSubject = $("#subject").val();
//    var boardContent = $("#board_content").val();
//
//    if(boardSubject ==""){
//    alert("제목을 입력해주세요.");
//     $("#board_title").focus();
//     return;
//     }
//     if(boardContent =-""){
//     alert("내용을 입력해주세요");
//     $("#board_content").focus();
//     return;
//     }
//
//     var yn =confirm("게시글을 등록하시겠습니까?");
//     if(yn){
//
//     $("#frm").ajaxForm({
//     url    :/board/
//     })
//     }
//     }
//
//
//});
//
