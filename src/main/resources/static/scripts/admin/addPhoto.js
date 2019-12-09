
function upload(){
    var formData = new FormData($("#uploadForm")[0]); //创建一个forData
    formData.append('bId',$("#bId").val());
    formData.append('img', $('#pic_img')[0].files[0]);//把file添加进去  name命名为img
    $.ajax({
        url: "/book/add_photo",
        data: formData,
        type: "POST",
        async: false,
        cache: false,
        contentType: false,
        processData: false,
        success: function(data) {
            var a = JSON.stringify(data)
            if(a==="false"){
                alert("上传失败");
            }else {
                alert("上传成功");
            }
    }, error: function() {

    }
})
}
