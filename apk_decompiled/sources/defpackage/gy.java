package defpackage;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.snapshots.SnapshotStateMapKt;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.layout.Measurable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract /* synthetic */ class gy {
    public static void A(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.horizontalLineTo(f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.horizontalLineTo(f4);
    }

    public static void B(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineToRelative(f, f2);
        pathBuilder.lineTo(f3, f4);
        pathBuilder.close();
    }

    public static void C(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.horizontalLineToRelative(f2);
        pathBuilder.lineToRelative(f3, f4);
    }

    public static void D(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineToRelative(f4);
        pathBuilder.close();
    }

    public static int a(Measurable measurable, long j, ArrayList arrayList, int i, int i2) {
        arrayList.add(measurable.mo6234measureBRTryo0(j));
        return i + i2;
    }

    public static tj b() {
        SnapshotStateMapKt.unsupported();
        return new tj();
    }

    public static PathBuilder c(float f, float f2, float f3, float f4) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.verticalLineTo(f4);
        return pathBuilder;
    }

    public static PathBuilder d(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineToRelative(f4);
        pathBuilder.horizontalLineTo(f5);
        return pathBuilder;
    }

    public static List e(PathBuilder pathBuilder, float f, float f2) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.horizontalLineTo(f2);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static List f(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.horizontalLineToRelative(f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static List g(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineTo(f, f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.verticalLineTo(f4);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void h(int i, String str) {
        ComposerKt.composeImmediateRuntimeError(str + i);
    }

    public static void i(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.horizontalLineTo(f2);
        pathBuilder.verticalLineTo(f3);
    }

    public static void j(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineToRelative(f, f2);
        pathBuilder.verticalLineToRelative(f3);
        pathBuilder.horizontalLineTo(f4);
    }

    public static PathBuilder k(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.lineTo(f3, f4);
        pathBuilder.horizontalLineToRelative(f5);
        return pathBuilder;
    }

    public static List l(PathBuilder pathBuilder, float f, float f2) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.horizontalLineToRelative(f2);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static List m(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.lineTo(f2, f3);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void n(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.lineTo(f2, f3);
        pathBuilder.close();
    }

    public static void o(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.verticalLineTo(f4);
    }

    public static PathBuilder p(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.lineTo(f3, f4);
        pathBuilder.horizontalLineTo(f5);
        return pathBuilder;
    }

    public static List q(PathBuilder pathBuilder, float f, float f2) {
        pathBuilder.lineTo(f, f2);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static List r(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.horizontalLineToRelative(f2);
        pathBuilder.verticalLineToRelative(f3);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void s(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.horizontalLineTo(f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.close();
    }

    public static void t(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.verticalLineTo(f4);
        pathBuilder.close();
    }

    public static PathBuilder u(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.lineToRelative(f3, f4);
        pathBuilder.horizontalLineTo(f5);
        return pathBuilder;
    }

    public static List v(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.lineTo(f, f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void w(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.lineToRelative(f, f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.close();
    }

    public static void x(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.verticalLineTo(f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.verticalLineToRelative(f4);
    }

    public static PathBuilder y(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.verticalLineToRelative(f3);
        pathBuilder.lineTo(f4, f5);
        return pathBuilder;
    }

    public static void z(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.horizontalLineToRelative(f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.horizontalLineToRelative(f4);
    }
}
