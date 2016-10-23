package com.joybike.server.api.util;

import static java.lang.Math.PI;
import static java.lang.Math.cos;

/**
 * Created by lishaoyong on 16/10/23.
 */
public class UnixGps {

    /**
     * 距离转换成经度
     *
     * @param distance
     * @return
     */
    public static Double doLongitude(double distance) {
//        double lngDegree = 1 * Math.asin(Math.sin((double)distance/12742)/Math.cos(distance));
//        // 转换弧度
//        lngDegree = lngDegree * (180/Math.PI);
//        return lngDegree;
        double latDegrees = 180 / PI * 1 / 6372.797;
        double lngR = latDegrees / cos(distance * PI / 180);
        return lngR;
    }

    /**
     * 经度
     *
     * @param distance
     * @return
     */
    public static Double Longitude(double distance) {
        double lngDegree = 1 * Math.asin(Math.sin((double) distance / 12742) / Math.cos(distance));
        // 转换弧度
        lngDegree = lngDegree * (180 / Math.PI);
        return lngDegree;
    }

    /**
     * 维度
     *
     * @param distance
     * @return
     */
    public static Double Dimension(double distance) {
        double latDegrees = (double) distance / 6371;
        // 转换弧度
        latDegrees = latDegrees * (180 / Math.PI);
        return latDegrees;
    }

    public static void main(String args[]) {

        double b = Dimension(116.355149);
        System.out.println(b);

        double a = Longitude(40.0276731);
        System.out.println(a);
    }

    /**
     * 距离转换成纬度
     *
     * @param distance
     * @return
     */
    public static Double doDimension(double distance) {
//        double latDegrees = (double)distance/6371;
//        // 转换弧度
//        latDegrees = latDegrees * (180/Math.PI);
//        return latDegrees;

        double latDegrees = 180 / PI * 1 / 6372.797;
        return latDegrees;
    }

}
