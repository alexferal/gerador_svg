<%@ page import="br.edu.ifpb.modelo.InfoGeometria" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
    <head>
        <link rel="stylesheet" href="css/materialize.min.css" type="text/css">
        <link rel="stylesheet" href="css/style.css" type="text/css">
    </head>
    <body class="blue lighten-4">
        <div id="divCorpo" class="container white">
            <div class="row">
                <div class="s12">
                    <h1>Gerador de Geometrias SVG</h1>
                </div>
                <div class="col s6">
                    <form method="post" action="svg">
                        <input class="validate" type="text" name="geom1" placeholder="Geometria 1">
                        <input class="validate" type="text" name="geom2" placeholder="Geometria 2">
                        <button class="btn col s12" type="submit">Exibir</button>
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
                <div class="col s6 row">
                    <% if (null != request.getAttribute("info")) {%>
                        <svg  viewBox="<%=request.getAttribute("viewBox")%>" class="col s12">
                            <path d="<%=request.getAttribute("geom1")%>" fill="orange"/>
                            <path d="<%=request.getAttribute("geom2")%>" fill="blue"/>
                        </svg>

                    <%}%>
                </div>
            </div>
        </div>

        <script src="js/materialize.min.js"></script>
    </body>
</html>
