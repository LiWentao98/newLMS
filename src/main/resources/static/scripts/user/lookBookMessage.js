// $(document).ready(function () {
//     var blob = document.getElementById('img').val();
//         reads(this.files[0], function (base64Data) {
//
//             blobToDataURI(blob, function (result) {    //blob格式再转换为base64格式
//                 document.getElementById('img2').src = result;
//             })
//         });
//     }
// });
//
// function blobToDataURI(blob, callback) {
//     var reader = new FileReader();
//     reader.readAsDataURL(blob);
//     reader.onload = function (e) {
//         callback(e.target.result);
//     }
// }