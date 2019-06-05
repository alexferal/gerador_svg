package br.edu.ifpb;

import com.vividsolutions.jts.geom.Geometry;

public class InfoGeometria {

    private Geometry geometry1;
    private Geometry geometry2;
    private Double area1;
    private Double area2;
    private Double distance;
    private Boolean contains;
    private Boolean covers;
    private Boolean overlaps;
    private Boolean thouches;
    private Boolean within;

    public InfoGeometria() {
    }

    public InfoGeometria(Geometry geometry1, Geometry geometry2, Double area1, Double area2, Double distance, Boolean contains, Boolean covers, Boolean overlaps, Boolean thouches, Boolean within) {
        this.geometry1 = geometry1;
        this.geometry2 = geometry2;
        this.area1 = area1;
        this.area2 = area2;
        this.distance = distance;
        this.contains = contains;
        this.covers = covers;
        this.overlaps = overlaps;
        this.thouches = thouches;
        this.within = within;
    }

    public Geometry getGeometry1() {
        return geometry1;
    }

    public void setGeometry1(Geometry geometry1) {
        this.geometry1 = geometry1;
    }

    public Geometry getGeometry2() {
        return geometry2;
    }

    public void setGeometry2(Geometry geometry2) {
        this.geometry2 = geometry2;
    }

    public Double getArea1() {
        return area1;
    }

    public void setArea1(Double area1) {
        this.area1 = area1;
    }

    public Double getArea2() {
        return area2;
    }

    public void setArea2(Double area2) {
        this.area2 = area2;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Boolean getContains() {
        return contains;
    }

    public void setContains(Boolean contains) {
        this.contains = contains;
    }

    public Boolean getCovers() {
        return covers;
    }

    public void setCovers(Boolean covers) {
        this.covers = covers;
    }

    public Boolean getOverlaps() {
        return overlaps;
    }

    public void setOverlaps(Boolean overlaps) {
        this.overlaps = overlaps;
    }

    public Boolean getThouches() {
        return thouches;
    }

    public void setThouches(Boolean thouches) {
        this.thouches = thouches;
    }

    public Boolean getWithin() {
        return within;
    }

    public void setWithin(Boolean within) {
        this.within = within;
    }

    @Override
    public String toString() {
        return "InfoGeometria{" +
                "geometry1=" + geometry1 +
                ", geometry2=" + geometry2 +
                ", area1=" + area1 +
                ", area2=" + area2 +
                ", distance=" + distance +
                ", contains=" + contains +
                ", covers=" + covers +
                ", overlaps=" + overlaps +
                ", thouches=" + thouches +
                ", within=" + within +
                '}';
    }
}
