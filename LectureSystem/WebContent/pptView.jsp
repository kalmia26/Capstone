<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html> 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title> 다뷰 웹 샘플</title> 
</head> 
<style> 
.DaViewWeb{position:absolute;width:1280px;height:1024px;} 
</style> 
 <script> 
   var daviewWebURL = "http://davu.kr/FileUpload?filepath="; 
      function doOpen(openDocURL) { 
         var url = daviewWebURL + openDocURL; 
         //alert(url); 
         window.open(url); 
      } 
 </script> 
 <body> 
   <div> 
      <div class="DaViewWeb"> 
            <input type="button"  value="DaViewProposal.pptx" alt="다뷰제안서" onclick="doOpen
            ('http://hmtalk.com/download/DaViewProposal.pptx');") /> 
            <input type="button" value="ForeignWords.hwp" alt="외래어표기"  onclick="doOpen
            ('http://hmtalk.com/download/ForeignWords.hwp');") /> 
            <input type="button"  value="Colorwh.dwg" alt="오토캐드색상"  onclick="doOpen
            ('http://hmtalk.com/download/Colorwh.dwg');") /> 
      </div> 
   </div> 
 </body> 
</html>