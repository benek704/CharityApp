<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="pl">
<jsp:include page="pages/header.jsp"/>
  <body>

    <section class="login-page">
      <h2>Zaloguj się</h2>
      <form method="post">
        <div class="form-group">
          <label>
            <input type="email" name="email" placeholder="Email" />
          </label>
        </div>
        <div class="form-group">
          <label>
            <input type="password" name="password" placeholder="Hasło" />
          </label>
          <a href="#" class="btn btn--small btn--without-border reset-password">Przypomnij hasło</a>
        </div>

        <div class="form-group form-group--buttons">
          <a href="#" class="btn btn--without-border">Załóż konto</a>      
          <button class="btn" type="submit">Zaloguj się</button>
          <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </div>
      </form>
    </section>

    <jsp:include page="pages/footer.jsp"/>
  </body>
</html>
