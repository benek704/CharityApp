<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="pl">
  <jsp:include page="pages/header.jsp"/>
<body>
    <section class="login-page">
      <h2>Załóż konto</h2>
      <form:form modelAttribute="user">
        <div class="form-group">
          <form:input path="email" type="email" name="email" placeholder="Email" />
        </div>
        <div class="form-group">
          <form:input path="password"  type="password" name="password" placeholder="Hasło" />
        </div>
        <div class="form-group form-group--buttons">
          <a href="<c:url value="/Login"/>" class="btn btn--without-border">Zaloguj się</a>
          <button class="btn" type="submit">Załóż konto</button>
        </div>
      </form:form>
    </section>

    <jsp:include page="pages/footer.jsp"/>
  </body>
</html>
