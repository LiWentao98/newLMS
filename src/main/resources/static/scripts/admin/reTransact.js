$(document).ready(function () {

    $("#btn1").click(function () {
        if(confirm("确认补办?")){
            var oldRid=$(this).val();
            var newRid = document.getElementById('newRid').value;
            // alert(userId);
            reTransact(newRid,oldRid);
        }
    });
});


function reTransact(newRid,oldRid) {
    $.ajax({
        async: false,
        type: "post",
        url: "/admin/re_transact",
        dataType : "json",
        data: {newRid:newRid,oldRid:oldRid},
        success: function (data) {
            var a = JSON.stringify(data)
            if(a==="false"){
                alert("请输入新的借书证");
            }else {
                alert("补办成功");
            }
            //window.history.go(-1);
        },
        error: function (data) {
        }
    });

}



