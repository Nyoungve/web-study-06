<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>자바 빈 프로퍼티 값 얻고 변경(getProperty, setProperty 액션 태그)</title>
</head>
<body>
<jsp:useBean id="member" class="com.seayan.javabeans.MemberBean"/>

◎ 자바 빈 객체 생성 후 저장 된 정보 출력하기 <br><br>
이름 : <jsp:getProperty name="member" property="name" /><br>
아이디: <jsp:getProperty name="member" property="userid" /><br>

<hr><!-- 선긋기 태그 hr -->
◎ 정보 변경한 후 변경된 정보 출력하기 <br><br>
<jsp:setProperty name="member" property="name" value="한가인"/> <br>
<jsp:setProperty name="member" property="userid" value="hanga"/> <br>
이름 : <jsp:getProperty name="member" property="name" /><br>
아이디: <jsp:getProperty name="member" property="userid" /><br>
</body>
</html>