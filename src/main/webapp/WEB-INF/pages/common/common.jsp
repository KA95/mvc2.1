<%
  String withoutTopMenu = request.getParameter("without-top-menu");
  String worksheet = request.getParameter("worksheet");
%>
<html>
  <jsp:include page="head.jsp"/>
  <body>
  <%
    if (!"on".equals(withoutTopMenu)) {
  %>
    <jsp:include page="top_menu.jsp"/>
  <%}%>
  <jsp:include page="<%=worksheet%>"/>
  <jsp:include page="footer.jsp"/>
  </body>
</html>