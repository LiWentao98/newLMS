// $(document).ready(function () {
//
//     $("button").click(function () {
//         updateUser();
//     });
// });
//
// function updateUser() {
//   $.ajax({
//       async : false,
//       type : 'post',
//       url : '/reader/update_user',
//       success : function(data) {
//           var a = JSON.stringify(data)
//           if(a==="false"){
//               alert("补办失败");
//           }else {
//               alert("补办成功");
//           }
//           alert("修改成功");
//       },
//       error : function(data) {
//           alert("修改失败");
//       }
//   })  ;
// }