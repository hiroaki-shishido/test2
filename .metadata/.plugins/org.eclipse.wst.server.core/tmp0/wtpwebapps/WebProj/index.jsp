<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta  charset="UTF-8">
<title>INDEX</title>
</head>
<body>
  <form action="HelloStrutsAction">
     <s:submit value="HelloStruts"/>
  </form>

  <s:form action="HelloStrutsAction">
     <s:submit value="Welcome"/>
  </s:form>
  <s:form action="InquiryAction">
     <s:submit value="問い合わせ"/>
  </s:form>

</body>
</html>