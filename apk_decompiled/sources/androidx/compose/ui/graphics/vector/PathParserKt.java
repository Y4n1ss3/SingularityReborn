package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.vector.PathNode;
import defpackage.o;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PathParserKt {
    private static final float[] EmptyArray = new float[0];

    private static final void arcToBezier(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        double d10 = d3;
        int ceil = (int) Math.ceil(Math.abs((d9 * 4.0d) / 3.141592653589793d));
        double cos = Math.cos(d7);
        double sin = Math.sin(d7);
        double cos2 = Math.cos(d8);
        double sin2 = Math.sin(d8);
        double d11 = -d10;
        double d12 = d11 * cos;
        double d13 = d4 * sin;
        double d14 = (d12 * sin2) - (d13 * cos2);
        double d15 = d11 * sin;
        double d16 = d4 * cos;
        double d17 = (cos2 * d16) + (sin2 * d15);
        double d18 = d9 / ceil;
        double d19 = d17;
        double d20 = d14;
        int i = 0;
        double d21 = d5;
        double d22 = d6;
        double d23 = d8;
        while (i < ceil) {
            double d24 = d23 + d18;
            double sin3 = Math.sin(d24);
            double cos3 = Math.cos(d24);
            double d25 = (((d10 * cos) * cos3) + d) - (d13 * sin3);
            int i2 = i;
            double d26 = (d16 * sin3) + (d3 * sin * cos3) + d2;
            double d27 = (d12 * sin3) - (d13 * cos3);
            double d28 = (cos3 * d16) + (sin3 * d15);
            double d29 = d24 - d23;
            double tan = Math.tan(d29 / 2.0d);
            double sqrt = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d29)) / 3.0d;
            path.cubicTo((float) ((d20 * sqrt) + d21), (float) ((d19 * sqrt) + d22), (float) (d25 - (sqrt * d27)), (float) (d26 - (sqrt * d28)), (float) d25, (float) d26);
            sin = sin;
            d18 = d18;
            d21 = d25;
            d22 = d26;
            i = i2 + 1;
            ceil = ceil;
            cos = cos;
            d23 = d24;
            d19 = d28;
            d20 = d27;
            d10 = d3;
        }
    }

    private static final void drawArc(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = (d7 / 180.0d) * 3.141592653589793d;
        double cos = Math.cos(d10);
        double sin = Math.sin(d10);
        double d11 = ((d2 * sin) + (d * cos)) / d5;
        double d12 = ((d2 * cos) + ((-d) * sin)) / d6;
        double d13 = ((d4 * sin) + (d3 * cos)) / d5;
        double d14 = ((d4 * cos) + ((-d3) * sin)) / d6;
        double d15 = d11 - d13;
        double d16 = d12 - d14;
        double d17 = (d11 + d13) / 2.0d;
        double d18 = (d12 + d14) / 2.0d;
        double d19 = (d16 * d16) + (d15 * d15);
        if (d19 == 0.0d) {
            return;
        }
        double d20 = (1.0d / d19) - 0.25d;
        if (d20 < 0.0d) {
            double sqrt = (float) (Math.sqrt(d19) / 1.99999d);
            drawArc(path, d, d2, d3, d4, d5 * sqrt, d6 * sqrt, d7, z, z2);
            return;
        }
        double sqrt2 = Math.sqrt(d20);
        double d21 = d15 * sqrt2;
        double d22 = sqrt2 * d16;
        if (z == z2) {
            d8 = d17 - d22;
            d9 = d18 + d21;
        } else {
            d8 = d17 + d22;
            d9 = d18 - d21;
        }
        double atan2 = Math.atan2(d12 - d9, d11 - d8);
        double atan22 = Math.atan2(d14 - d9, d13 - d8) - atan2;
        if (z2 != (atan22 >= 0.0d)) {
            atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d23 = d8 * d5;
        double d24 = d9 * d6;
        arcToBezier(path, (d23 * cos) - (d24 * sin), (d24 * cos) + (d23 * sin), d5, d6, d, d2, d10, atan2, atan22);
    }

    public static final float[] getEmptyArray() {
        return EmptyArray;
    }

    public static final Path toPath(List<? extends PathNode> list, Path path) {
        int i;
        float f;
        int i2;
        PathNode pathNode;
        float f2;
        float f3;
        float f4;
        float f5;
        float x2;
        float y2;
        float dy2;
        float f6;
        float f7;
        float dx1;
        float dy1;
        float dx2;
        float dy22;
        float y3;
        float y;
        float x;
        float x3;
        float y4;
        List<? extends PathNode> list2 = list;
        Path path2 = path;
        int mo4649getFillTypeRgk1Os = path2.mo4649getFillTypeRgk1Os();
        path2.rewind();
        path2.mo4651setFillTypeoQ8Xj4U(mo4649getFillTypeRgk1Os);
        PathNode pathNode2 = list2.isEmpty() ? PathNode.Close.INSTANCE : list2.get(0);
        int size = list2.size();
        float f8 = 0.0f;
        int i3 = 0;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        while (i3 < size) {
            PathNode pathNode3 = list2.get(i3);
            if (pathNode3 instanceof PathNode.Close) {
                path2.close();
                i = size;
                f = f8;
                i2 = i3;
                pathNode = pathNode3;
                f9 = f13;
                f11 = f9;
                f10 = f14;
            } else {
                if (pathNode3 instanceof PathNode.RelativeMoveTo) {
                    PathNode.RelativeMoveTo relativeMoveTo = (PathNode.RelativeMoveTo) pathNode3;
                    x3 = relativeMoveTo.getDx() + f11;
                    y4 = relativeMoveTo.getDy() + f12;
                    path2.relativeMoveTo(relativeMoveTo.getDx(), relativeMoveTo.getDy());
                } else if (pathNode3 instanceof PathNode.MoveTo) {
                    PathNode.MoveTo moveTo = (PathNode.MoveTo) pathNode3;
                    x3 = moveTo.getX();
                    y4 = moveTo.getY();
                    path2.moveTo(moveTo.getX(), moveTo.getY());
                } else {
                    if (pathNode3 instanceof PathNode.RelativeLineTo) {
                        PathNode.RelativeLineTo relativeLineTo = (PathNode.RelativeLineTo) pathNode3;
                        path2.relativeLineTo(relativeLineTo.getDx(), relativeLineTo.getDy());
                        x2 = relativeLineTo.getDx() + f11;
                        dy2 = relativeLineTo.getDy();
                    } else {
                        if (pathNode3 instanceof PathNode.LineTo) {
                            PathNode.LineTo lineTo = (PathNode.LineTo) pathNode3;
                            path2.lineTo(lineTo.getX(), lineTo.getY());
                            x2 = lineTo.getX();
                            y2 = lineTo.getY();
                        } else {
                            if (pathNode3 instanceof PathNode.RelativeHorizontalTo) {
                                PathNode.RelativeHorizontalTo relativeHorizontalTo = (PathNode.RelativeHorizontalTo) pathNode3;
                                path2.relativeLineTo(relativeHorizontalTo.getDx(), f8);
                                x = relativeHorizontalTo.getDx() + f11;
                            } else if (pathNode3 instanceof PathNode.HorizontalTo) {
                                PathNode.HorizontalTo horizontalTo = (PathNode.HorizontalTo) pathNode3;
                                path2.lineTo(horizontalTo.getX(), f12);
                                x = horizontalTo.getX();
                            } else {
                                if (pathNode3 instanceof PathNode.RelativeVerticalTo) {
                                    PathNode.RelativeVerticalTo relativeVerticalTo = (PathNode.RelativeVerticalTo) pathNode3;
                                    path2.relativeLineTo(f8, relativeVerticalTo.getDy());
                                    y = relativeVerticalTo.getDy() + f12;
                                } else if (pathNode3 instanceof PathNode.VerticalTo) {
                                    PathNode.VerticalTo verticalTo = (PathNode.VerticalTo) pathNode3;
                                    path2.lineTo(f11, verticalTo.getY());
                                    y = verticalTo.getY();
                                } else {
                                    if (pathNode3 instanceof PathNode.RelativeCurveTo) {
                                        PathNode.RelativeCurveTo relativeCurveTo = (PathNode.RelativeCurveTo) pathNode3;
                                        path2.relativeCubicTo(relativeCurveTo.getDx1(), relativeCurveTo.getDy1(), relativeCurveTo.getDx2(), relativeCurveTo.getDy2(), relativeCurveTo.getDx3(), relativeCurveTo.getDy3());
                                        dx1 = relativeCurveTo.getDx2() + f11;
                                        dy1 = relativeCurveTo.getDy2() + f12;
                                        dx2 = relativeCurveTo.getDx3() + f11;
                                        dy22 = relativeCurveTo.getDy3();
                                    } else if (pathNode3 instanceof PathNode.CurveTo) {
                                        PathNode.CurveTo curveTo = (PathNode.CurveTo) pathNode3;
                                        path.cubicTo(curveTo.getX1(), curveTo.getY1(), curveTo.getX2(), curveTo.getY2(), curveTo.getX3(), curveTo.getY3());
                                        dx1 = curveTo.getX2();
                                        dy1 = curveTo.getY2();
                                        dx2 = curveTo.getX3();
                                        y3 = curveTo.getY3();
                                        f11 = dx2;
                                        f12 = y3;
                                        i = size;
                                        f = f8;
                                        i2 = i3;
                                        pathNode = pathNode3;
                                        f9 = dx1;
                                        f10 = dy1;
                                        i3 = i2 + 1;
                                        path2 = path;
                                        pathNode2 = pathNode;
                                        size = i;
                                        f8 = f;
                                        list2 = list;
                                    } else if (pathNode3 instanceof PathNode.RelativeReflectiveCurveTo) {
                                        if (pathNode2.isCurve()) {
                                            float f15 = f11 - f9;
                                            f7 = f12 - f10;
                                            f6 = f15;
                                        } else {
                                            f6 = f8;
                                            f7 = f6;
                                        }
                                        PathNode.RelativeReflectiveCurveTo relativeReflectiveCurveTo = (PathNode.RelativeReflectiveCurveTo) pathNode3;
                                        path.relativeCubicTo(f6, f7, relativeReflectiveCurveTo.getDx1(), relativeReflectiveCurveTo.getDy1(), relativeReflectiveCurveTo.getDx2(), relativeReflectiveCurveTo.getDy2());
                                        dx1 = relativeReflectiveCurveTo.getDx1() + f11;
                                        dy1 = relativeReflectiveCurveTo.getDy1() + f12;
                                        dx2 = relativeReflectiveCurveTo.getDx2() + f11;
                                        dy22 = relativeReflectiveCurveTo.getDy2();
                                    } else {
                                        if (pathNode3 instanceof PathNode.ReflectiveCurveTo) {
                                            if (pathNode2.isCurve()) {
                                                f11 = (f11 * 2.0f) - f9;
                                                f12 = (2.0f * f12) - f10;
                                            }
                                            PathNode.ReflectiveCurveTo reflectiveCurveTo = (PathNode.ReflectiveCurveTo) pathNode3;
                                            path.cubicTo(f11, f12, reflectiveCurveTo.getX1(), reflectiveCurveTo.getY1(), reflectiveCurveTo.getX2(), reflectiveCurveTo.getY2());
                                            f4 = reflectiveCurveTo.getX1();
                                            f5 = reflectiveCurveTo.getY1();
                                            float x22 = reflectiveCurveTo.getX2();
                                            float y22 = reflectiveCurveTo.getY2();
                                            f11 = x22;
                                            f12 = y22;
                                        } else if (pathNode3 instanceof PathNode.RelativeQuadTo) {
                                            PathNode.RelativeQuadTo relativeQuadTo = (PathNode.RelativeQuadTo) pathNode3;
                                            path.relativeQuadraticTo(relativeQuadTo.getDx1(), relativeQuadTo.getDy1(), relativeQuadTo.getDx2(), relativeQuadTo.getDy2());
                                            f9 = relativeQuadTo.getDx1() + f11;
                                            f10 = relativeQuadTo.getDy1() + f12;
                                            x2 = relativeQuadTo.getDx2() + f11;
                                            dy2 = relativeQuadTo.getDy2();
                                        } else if (pathNode3 instanceof PathNode.QuadTo) {
                                            PathNode.QuadTo quadTo = (PathNode.QuadTo) pathNode3;
                                            path.quadraticTo(quadTo.getX1(), quadTo.getY1(), quadTo.getX2(), quadTo.getY2());
                                            f9 = quadTo.getX1();
                                            f10 = quadTo.getY1();
                                            x2 = quadTo.getX2();
                                            y2 = quadTo.getY2();
                                        } else if (pathNode3 instanceof PathNode.RelativeReflectiveQuadTo) {
                                            if (pathNode2.isQuad()) {
                                                f2 = f11 - f9;
                                                f3 = f12 - f10;
                                            } else {
                                                f2 = f8;
                                                f3 = f2;
                                            }
                                            PathNode.RelativeReflectiveQuadTo relativeReflectiveQuadTo = (PathNode.RelativeReflectiveQuadTo) pathNode3;
                                            path.relativeQuadraticTo(f2, f3, relativeReflectiveQuadTo.getDx(), relativeReflectiveQuadTo.getDy());
                                            f4 = f2 + f11;
                                            f5 = f3 + f12;
                                            float dx = relativeReflectiveQuadTo.getDx() + f11;
                                            f12 = relativeReflectiveQuadTo.getDy() + f12;
                                            f11 = dx;
                                        } else if (pathNode3 instanceof PathNode.ReflectiveQuadTo) {
                                            if (pathNode2.isQuad()) {
                                                f11 = (f11 * 2.0f) - f9;
                                                f12 = (2.0f * f12) - f10;
                                            }
                                            PathNode.ReflectiveQuadTo reflectiveQuadTo = (PathNode.ReflectiveQuadTo) pathNode3;
                                            path.quadraticTo(f11, f12, reflectiveQuadTo.getX(), reflectiveQuadTo.getY());
                                            float f16 = f11;
                                            f11 = reflectiveQuadTo.getX();
                                            f9 = f16;
                                            i = size;
                                            f = f8;
                                            i2 = i3;
                                            f10 = f12;
                                            pathNode = pathNode3;
                                            f12 = reflectiveQuadTo.getY();
                                            i3 = i2 + 1;
                                            path2 = path;
                                            pathNode2 = pathNode;
                                            size = i;
                                            f8 = f;
                                            list2 = list;
                                        } else if (pathNode3 instanceof PathNode.RelativeArcTo) {
                                            PathNode.RelativeArcTo relativeArcTo = (PathNode.RelativeArcTo) pathNode3;
                                            float arcStartDx = relativeArcTo.getArcStartDx() + f11;
                                            float arcStartDy = relativeArcTo.getArcStartDy() + f12;
                                            f = f8;
                                            pathNode = pathNode3;
                                            i = size;
                                            i2 = i3;
                                            drawArc(path, f11, f12, arcStartDx, arcStartDy, relativeArcTo.getHorizontalEllipseRadius(), relativeArcTo.getVerticalEllipseRadius(), relativeArcTo.getTheta(), relativeArcTo.isMoreThanHalf(), relativeArcTo.isPositiveArc());
                                            f9 = arcStartDx;
                                            f11 = f9;
                                            f10 = arcStartDy;
                                        } else {
                                            i = size;
                                            f = f8;
                                            i2 = i3;
                                            pathNode = pathNode3;
                                            if (!(pathNode instanceof PathNode.ArcTo)) {
                                                o.n();
                                                return null;
                                            }
                                            PathNode.ArcTo arcTo = (PathNode.ArcTo) pathNode;
                                            drawArc(path, f11, f12, arcTo.getArcStartX(), arcTo.getArcStartY(), arcTo.getHorizontalEllipseRadius(), arcTo.getVerticalEllipseRadius(), arcTo.getTheta(), arcTo.isMoreThanHalf(), arcTo.isPositiveArc());
                                            f9 = arcTo.getArcStartX();
                                            f11 = f9;
                                            f10 = arcTo.getArcStartY();
                                        }
                                        i = size;
                                        f = f8;
                                        i2 = i3;
                                        pathNode = pathNode3;
                                        f10 = f5;
                                        f9 = f4;
                                        i3 = i2 + 1;
                                        path2 = path;
                                        pathNode2 = pathNode;
                                        size = i;
                                        f8 = f;
                                        list2 = list;
                                    }
                                    y3 = dy22 + f12;
                                    f11 = dx2;
                                    f12 = y3;
                                    i = size;
                                    f = f8;
                                    i2 = i3;
                                    pathNode = pathNode3;
                                    f9 = dx1;
                                    f10 = dy1;
                                    i3 = i2 + 1;
                                    path2 = path;
                                    pathNode2 = pathNode;
                                    size = i;
                                    f8 = f;
                                    list2 = list;
                                }
                                f12 = y;
                                i = size;
                                f = f8;
                                i2 = i3;
                                pathNode = pathNode3;
                                i3 = i2 + 1;
                                path2 = path;
                                pathNode2 = pathNode;
                                size = i;
                                f8 = f;
                                list2 = list;
                            }
                            f11 = x;
                            i = size;
                            f = f8;
                            i2 = i3;
                            pathNode = pathNode3;
                            i3 = i2 + 1;
                            path2 = path;
                            pathNode2 = pathNode;
                            size = i;
                            f8 = f;
                            list2 = list;
                        }
                        f12 = y2;
                        f11 = x2;
                        i = size;
                        f = f8;
                        i2 = i3;
                        pathNode = pathNode3;
                        i3 = i2 + 1;
                        path2 = path;
                        pathNode2 = pathNode;
                        size = i;
                        f8 = f;
                        list2 = list;
                    }
                    y2 = dy2 + f12;
                    f12 = y2;
                    f11 = x2;
                    i = size;
                    f = f8;
                    i2 = i3;
                    pathNode = pathNode3;
                    i3 = i2 + 1;
                    path2 = path;
                    pathNode2 = pathNode;
                    size = i;
                    f8 = f;
                    list2 = list;
                }
                f11 = x3;
                f13 = f11;
                f12 = y4;
                f14 = f12;
                i = size;
                f = f8;
                i2 = i3;
                pathNode = pathNode3;
                i3 = i2 + 1;
                path2 = path;
                pathNode2 = pathNode;
                size = i;
                f8 = f;
                list2 = list;
            }
            f12 = f10;
            i3 = i2 + 1;
            path2 = path;
            pathNode2 = pathNode;
            size = i;
            f8 = f;
            list2 = list;
        }
        return path;
    }

    public static /* synthetic */ Path toPath$default(List list, Path path, int i, Object obj) {
        if ((i & 1) != 0) {
            path = AndroidPath_androidKt.Path();
        }
        return toPath(list, path);
    }

    private static final double toRadians(double d) {
        return (d / 180.0d) * 3.141592653589793d;
    }
}
