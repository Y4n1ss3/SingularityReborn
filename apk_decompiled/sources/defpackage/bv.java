package defpackage;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract /* synthetic */ class bv {
    public static void A(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.horizontalLineTo(f2);
        pathBuilder.verticalLineToRelative(f3);
        pathBuilder.horizontalLineToRelative(f4);
    }

    public static void B(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.horizontalLineToRelative(f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.horizontalLineTo(f4);
    }

    public static void C(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.lineTo(f3, f4);
    }

    public static int a(float f, int i, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    public static PathBuilder b(float f, float f2, float f3, float f4) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineToRelative(f4);
        return pathBuilder;
    }

    public static PathBuilder c(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.verticalLineTo(f4);
        pathBuilder.horizontalLineTo(f5);
        return pathBuilder;
    }

    public static Object d(MutableVector mutableVector, int i) {
        return mutableVector.removeAt(mutableVector.getSize() - i);
    }

    public static List e(PathBuilder pathBuilder, float f, float f2) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.horizontalLineTo(f2);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static List f(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.lineTo(f, f2);
        pathBuilder.verticalLineToRelative(f3);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void g(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.close();
        pathBuilder.moveTo(f, f2);
        pathBuilder.verticalLineTo(f3);
    }

    public static void h(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineTo(f4);
        pathBuilder.close();
    }

    public static PathBuilder i(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.lineToRelative(f4, f5);
        return pathBuilder;
    }

    public static List j(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.lineTo(f2, f3);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void k(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.lineTo(f2, f3);
        pathBuilder.close();
    }

    public static void l(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineTo(f4);
        pathBuilder.close();
    }

    public static void m(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.close();
        pathBuilder.moveTo(f2, f3);
        pathBuilder.horizontalLineToRelative(f4);
    }

    public static void n(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.lineTo(f2, f3);
        pathBuilder.verticalLineToRelative(f4);
        pathBuilder.close();
    }

    public static void o(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineTo(f, f2);
        pathBuilder.lineToRelative(f3, f4);
        pathBuilder.close();
    }

    public static void p(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.lineToRelative(f3, f4);
    }

    public static void q(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.lineTo(f2, f3);
        pathBuilder.verticalLineToRelative(f4);
    }

    public static void r(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.lineTo(f, f2);
        pathBuilder.verticalLineToRelative(f3);
        pathBuilder.close();
    }

    public static void s(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.verticalLineTo(f2);
        pathBuilder.close();
        pathBuilder.moveTo(f3, f4);
    }

    public static void t(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.close();
        pathBuilder.moveTo(f2, f3);
    }

    public static void u(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.lineTo(f2, f3);
        pathBuilder.horizontalLineTo(f4);
    }

    public static void v(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.close();
        pathBuilder.moveTo(f, f2);
        pathBuilder.verticalLineToRelative(f3);
    }

    public static void w(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineTo(f2);
        pathBuilder.lineToRelative(f3, f4);
    }

    public static void x(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.horizontalLineToRelative(f2);
        pathBuilder.verticalLineTo(f3);
    }

    public static void y(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.moveTo(f, f2);
        pathBuilder.verticalLineToRelative(f3);
        pathBuilder.horizontalLineToRelative(f4);
    }

    public static void z(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.horizontalLineTo(f2);
        pathBuilder.close();
        pathBuilder.moveTo(f3, f4);
    }
}
