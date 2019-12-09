
//当用户账号输入框失去焦点时调用该方法
function checkUser(obj){
    //获取输入框输入的值
    var user = obj.value;
    //isExist(user);
    //如果输入框中的值为空，那么弹窗提示，并且让该输入框获得焦点
    if(!user){
        alert("用户名不能为空！");
        obj.focus();
        //isExist(user);
        return;
    }
}


function isExist(user){
    $.ajax({
        async: false,
        type: "post",
        url: "/reader/is_exist",
        dataType: "json",
        data: {user:user},
        success: function (data) {
            var a = JSON.stringify(data)
            if(a==="false"){
                alert("用户名不存在");
                window.reload();
            }
        },
        error: function (data) {
        }
    });
}
