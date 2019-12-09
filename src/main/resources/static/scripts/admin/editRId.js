$(document).ready(function () {

    $("#btn1").click(function () {
        if(confirm("确认挂失?")){
            var r_id=$(this).val();
            // alert(userId);
            closeVoucher(r_id);
            //$(this).parent().parent().remove();
        }
    });

    $("#btn3").click(function () {
        if(confirm("确认注销?")){
            var rId=$(this).val();
            // alert(userId);
            logout(rId);
            //$(this).parent().parent().remove();
        }
    });

    $("#btn2").click(function () {
        if(confirm("确认解除?")){
            var r_id=$(this).val();
            // alert(userId);
            relieveCloseVoucher(r_id);
            //$(this).parent().parent().remove();
        }
    });
});


function closeVoucher(r_id) {
    $.ajax({
        async: false,
        type: "post",
        url: "/admin/close_voucher",
        dataType : "json",
        data: {r_id:r_id},
        success: function (data) {
            var a = JSON.stringify(data)
            if(a==="false"){
                alert("挂失失败");
            }else {
                alert("挂失成功");
            }
            window.history.go(-1);
        },
        error: function (data) {
        }
    });
}

function logout(rId) {
    $.ajax({
        async: false,
        type: "post",
        url: "/admin/logout_rId",
        dataType : "json",
        data: {rId:rId},
        success: function (data) {
            var a = JSON.stringify(data)
            if(a==="false"){
                alert("注销失败");
            }else {
                alert("注销成功");
            }
            window.history.go(-1);
        },
        error: function (data) {
        }
    });
}

function relieveCloseVoucher(r_id) {
    $.ajax({
        async: false,
        type: "post",
        url: "/admin/relieve_close_voucher",
        dataType : "json",
        data: {r_id:r_id},
        success: function (data) {
            var a = JSON.stringify(data)
            if(a==="false"){
                alert("解除失败");
            }else {
                alert("解除成功");
            }
            window.history.go(-1);
        },
        error: function (data) {
        }
    });
}



