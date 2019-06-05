<%@ page import="br.edu.ifpb.InfoGeometria" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
    <head>
        <link rel="stylesheet" href="css/materialize.min.css" type="text/css">
    </head>
    <body class="darken-3">
        <div class="container">
            <div class="row">
                <div class="s12">
                    <h1>Gerador de Geometrias SVG</h1>
                </div>
                <div class="col s6">
                    <form method="post" action="svg">
                        <input class="validate" type="text" name="geom1" placeholder="Geometria 1">
                        <input class="validate" type="text" name="geom2" placeholder="Geometria 2">
                        <button class="btn" type="submit">Exibir</button>
                    </form>

                    <% if (null != request.getAttribute("info")) {
                        InfoGeometria info = (InfoGeometria) request.getAttribute("info"); %>
                        <p>Área Geometria 1: <%=info.getArea1()%></p>
                        <p>Área Geometria 2: <%=info.getArea2()%></p>
                        <p>Distancia entre as Centroid (km): <%=info.getDistance()%></p>
                        <p>Contains: <%=info.getContains()%></p>
                        <p>Covers: <%=info.getCovers()%></p>
                        <p>OverLaps: <%=info.getOverlaps()%></p>
                        <p>Thouches: <%=info.getThouches()%></p>
                        <p>Within: <%=info.getWithin()%></p>
                    <% } %>
                </div>
            </div>
        </div>

        <script src="js/materialize.min.js"></script>
    </body>
</html>
