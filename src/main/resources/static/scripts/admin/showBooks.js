$(document).ready(function () {
    //检查能否再点击上一页，下一页
    var lab1=$("#lab1").html().trim();//获取当前页码
    var lab2=$("#lab2").html().trim();//获取总页码
    // alert(lab1+" *****"+lab2);
    $("#prePage").click(function () {
        if(lab1==1){
            alert("已经是第一页了!");
            return false;
        }
        return true;
    });
    $("#nextPage").click(function () {
        if(lab1==lab2){
            alert("已经是最后一页了!");
            return false;
        }
        return true;
    });
    $("input:button").click(function (){
        var tr = $(this).closest("tr");
        var bId= tr.find("td:eq(0)").text();
        window.location.href="to_add_photo/"+bId;
    });
    $("button").click(function (){
        var bId = $(this).val();
        window.location.href="to_look_book_message/"+bId;
    });
});

function lookBookMessage(bId) {
    $.ajax({
        async : false,
        type : "get",
        url : "/book/to_look_book_message",
        data: {bId:bId},
        success: function (data) {

        },
        error:function (data) {
            alert(data.result);
        }
    });
}
