package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract /* synthetic */ class kf0 {
    public static void A(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.lineTo(f2, f3);
        pathBuilder.horizontalLineTo(f4);
    }

    public static void B(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.lineToRelative(f2, f3);
        pathBuilder.horizontalLineToRelative(f4);
    }

    public static void C(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.horizontalLineToRelative(f2);
        pathBuilder.close();
        pathBuilder.moveTo(f3, f4);
    }

    public static void D(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.close();
        pathBuilder.moveTo(f2, f3);
        pathBuilder.verticalLineToRelative(f4);
    }

    public static long a(Placeable.PlacementScope placementScope, Placeable placeable, Placeable placeable2, long j) {
        long j2;
        placementScope.handleMotionFrameOfReferencePlacement(placeable);
        j2 = placeable2.apparentToRealOffset;
        return IntOffset.m7743plusqkQi6aY(j, j2);
    }

    public static PathBuilder b(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.lineToRelative(f3, f4);
        pathBuilder.horizontalLineToRelative(f5);
        return pathBuilder;
    }

    public static List c(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineToRelative(f4);
        pathBuilder.horizontalLineToRelative(f5);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static List d(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.lineTo(f2, f3);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static List e(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.reflectiveCurveTo(f, f2, f3, f4);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void f(my myVar, Composer composer, int i) {
        myVar.invoke(composer, Integer.valueOf(i));
        composer.endNode();
        composer.endReplaceGroup();
    }

    public static void g(DrawContext drawContext, long j) {
        drawContext.getCanvas().restore();
        drawContext.mo5257setSizeuvyYCjk(j);
    }

    public static void h(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.lineTo(f, f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.close();
    }

    public static void i(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineTo(f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.verticalLineTo(f4);
        pathBuilder.close();
    }

    public static PathBuilder j(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.lineToRelative(f3, f4);
        pathBuilder.verticalLineTo(f5);
        return pathBuilder;
    }

    public static List k(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.lineTo(f2, f3);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static List l(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineTo(f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.verticalLineTo(f4);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void m(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.lineTo(f2, f3);
        pathBuilder.close();
    }

    public static void n(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.horizontalLineTo(f2);
        pathBuilder.close();
        pathBuilder.moveTo(f3, f4);
    }

    public static void o(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.verticalLineTo(f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineToRelative(f4);
    }

    public static PathBuilder p(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.lineTo(f4, f5);
        return pathBuilder;
    }

    public static List q(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.horizontalLineTo(f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void r(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.horizontalLineToRelative(f2);
        pathBuilder.verticalLineToRelative(f3);
    }

    public static void s(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.lineTo(f2, f3);
        pathBuilder.horizontalLineTo(f4);
    }

    public static void t(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.lineTo(f2, f3);
        pathBuilder.close();
    }

    public static void u(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineTo(f, f2);
        pathBuilder.verticalLineToRelative(f3);
        pathBuilder.horizontalLineTo(f4);
    }

    public static void v(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineTo(f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.close();
    }

    public static void w(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.horizontalLineTo(f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.horizontalLineToRelative(f4);
    }

    public static void x(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.horizontalLineToRelative(f3);
    }

    public static void y(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineTo(f, f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineTo(f4);
    }

    public static void z(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.horizontalLineToRelative(f2);
        pathBuilder.verticalLineToRelative(f3);
    }
}
