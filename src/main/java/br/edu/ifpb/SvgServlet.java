package br.edu.ifpb;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.io.ParseException;
import com.vividsolutions.jts.io.WKTReader;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/svg")
public class SvgServlet extends HttpServlet {

    protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        doPost(req, resp);

    }

    protected void  doPost ( HttpServletRequest req, HttpServletResponse resp ){

        WKTReader reader = new WKTReader();
        InfoGeometria info = new InfoGeometria();


        try {
            System.out.println(req.getParameter("geom2"));

            Geometry geom1 = reader.read(req.getParameter("geom1"));
            Geometry geom2 = reader.read(req.getParameter("geom2"));
            info.setGeometry1(geom1);
            info.setGeometry2(geom2);


            Point c1 = geom1.getCentroid();
            Point c2 = geom2.getCentroid();

            Double area1 = geom1.getArea();
            Double area2 = geom2.getArea();
            Double distance = c1.distance(c2);
            Boolean contains = geom1.contains(geom2);
            Boolean cover = geom1.covers(geom2);
            Boolean overlaps = geom1.overlaps(geom2);
            Boolean touches = geom1.touches(geom2);
            Boolean within = geom1.within(geom2);

            info.setArea1(area1);
            info.setArea2(area2);
            info.setDistance(distance);
            info.setContains(contains);
            info.setCovers(cover);
            info.setOverlaps(overlaps);
            info.setThouches(touches);
            info.setWithin(within);

            req.setAttribute("info", info);
            req.getRequestDispatcher("index.jsp").forward(req, resp);




        } catch (ParseException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
