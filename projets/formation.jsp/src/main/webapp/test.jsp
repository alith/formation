<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ceci est un test</title>
</head>
<body>

  attributs de la requete (sessionScope):<c:forEach var="e" items="${sessionScope['pageContext.request.attributeNames']}"> ${e} ${sessionScope['pageContext.request.attibute'] } </c:forEach><br/>
  attributs de la requete (pageScope):<c:forEach var="e" items="${pageScope['pageContext.request.attributeNames']}"> ${e} </c:forEach><br/>
  attributs de la requete (applicationScope):<c:forEach var="e" items="${applicationScope['pageContext.request.attributeNames']}"> ${e} </c:forEach><br/>
  attributs de la requete (requestScope):<c:forEach var="e" items="${requestScope['pageContext.request.attributeNames']}"> ${e} </c:forEach><br/>
  attributs de la requete (no Scope):<c:forEach var="e" items="${pageContext.request.attributeNames}"> ${e}</c:forEach><br/>

  <h4>Les objets implicites sont en dehors de tout scope (ce sont les seuls...)</h4>
  header de la requete:<c:forEach var="e" items="${pageContext.request.headerNames}"> ${e} </c:forEach><br/>
  parametres de la requete:<c:forEach var="e" items="${pageContext.request.parameterNames}"> ${e} </c:forEach><br/>
  
  <% for (int i = 1; i< 7;i++) { %>
			<h<%=i%>> Il fait beau !!! </h<%=i%>>
 <% } %>
</body>
</html>