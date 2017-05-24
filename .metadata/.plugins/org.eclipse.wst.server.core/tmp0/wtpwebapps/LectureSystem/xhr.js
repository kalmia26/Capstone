/**
 * xhr.js
 * XMLHttpRequest ��ü�� �����ϴ� �Լ�
*/
function createRequest() {
 var request = null;
 try {
   // MS IE �̿��� �������� ����Ǵ� ���
   request = new XMLHttpRequest();
 } 
 catch (trymicrosoft) {
   try {
  // MS IE�� ���ο� ������ ����Ǵ� ���
     request = new ActiveXObject("Msxml2.XMLHTTP");
   } 
   catch (othermicrosoft) {
     try {
       // MS IE�� �������� ����Ǵ� ���
       request = new ActiveXObject("Microsoft.XMLHTTP");
     } 
     catch (failed) {
       request = null;
     }      // end of catch
   }     // end of catch
 }      // end of catch
 return request;
}

