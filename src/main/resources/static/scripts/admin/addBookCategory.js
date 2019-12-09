$(document).ready(function () {

    //表单验证后，添加种类
   $("#btn_addBookCategory").click(function () {
       addBookCategory();
   });

});

//ajax添加种类
function addBookCategory() {
    $.ajax({
        async : false,
        type : "post",
        url : "/book/add_book_category",
        dataType : "json",
        data: $("#addBookCategoryForm").serialize(),
        success: function (data) {
            var a = JSON.stringify(data)
            if(a==="false"){
                alert("添加失败");
            }else {
                alert("添加成功");
            }
        },
        error: function (data) {
        }
    });
}


