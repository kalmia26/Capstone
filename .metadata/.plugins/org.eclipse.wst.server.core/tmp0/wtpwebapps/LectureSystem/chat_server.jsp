<?xml version="1.0" encoding="utf-8"?>
 <%@page import="java.util.*"%>
 <%@page import="chat.*"%>
 <%@ page contentType="text/xml; charset=utf-8" pageEncoding="EUC-KR"%>
 <jsp:useBean id="chatMgr" class="chat.ChatMgr" scope="session">
  <jsp:setProperty name="chatMgr" property="servletContext" value="<%=application%>"/>
 </jsp:useBean>
 <jsp:setProperty name="chatMgr" property="request" value="<%=request%>"/>
 <%
  response.setHeader("Cache-Control", "no-cache");
  response.setHeader("Pragma", "no-cache");
 %> 
 <msgs>
  <![CDATA[${sessionScope.chatMgr.resMsg}]]>
 </msgs>