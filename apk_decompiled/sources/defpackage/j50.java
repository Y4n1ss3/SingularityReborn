package defpackage;

import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ValueElementSequence;
import androidx.compose.ui.unit.Dp;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract /* synthetic */ class j50 {
    public static void A(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.lineToRelative(f2, f3);
        pathBuilder.verticalLineToRelative(f4);
    }

    public static void B(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.horizontalLineToRelative(f2);
        pathBuilder.verticalLineToRelative(f3);
        pathBuilder.horizontalLineTo(f4);
    }

    public static void C(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.horizontalLineToRelative(f2);
        pathBuilder.verticalLineToRelative(f3);
        pathBuilder.horizontalLineTo(f4);
        pathBuilder.close();
    }

    public static void D(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineTo(f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineTo(f4);
        pathBuilder.close();
    }

    public static int a(float f, int i, int i2) {
        return (Dp.m7617hashCodeimpl(f) + i) * i2;
    }

    public static int b(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    public static int c(int i, int i2, Placeable placeable) {
        return (i - placeable.getHeight()) / i2;
    }

    public static PathBuilder d(float f, float f2, float f3) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.verticalLineTo(f3);
        return pathBuilder;
    }

    public static PathBuilder e(float f, float f2, float f3, float f4) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineTo(f4);
        return pathBuilder;
    }

    public static PathBuilder f(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.horizontalLineTo(f4);
        pathBuilder.verticalLineToRelative(f5);
        return pathBuilder;
    }

    public static ValueElementSequence g(float f, ValueElementSequence valueElementSequence, String str, InspectorInfo inspectorInfo) {
        valueElementSequence.set(str, Dp.m7609boximpl(f));
        return inspectorInfo.getProperties();
    }

    public static String h(int i, String str) {
        return str + i;
    }

    public static String i(int i, String str, String str2) {
        return str + i + str2;
    }

    public static StringBuilder j(String str, int i, String str2, int i2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder k(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static List l(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.lineTo(f, f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static List m(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineTo(f4);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void n(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.close();
    }

    public static void o(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.lineTo(f3, f4);
        pathBuilder.close();
    }

    public static int p(int i, int i2, Placeable placeable) {
        return (i - placeable.getWidth()) / i2;
    }

    public static PathBuilder q(float f, float f2, float f3, float f4) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.verticalLineToRelative(f4);
        return pathBuilder;
    }

    public static List r(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.horizontalLineToRelative(f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static List s(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.verticalLineTo(f4);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void t(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.close();
        pathBuilder.moveTo(f2, f3);
    }

    public static void u(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.lineToRelative(f3, f4);
        pathBuilder.close();
    }

    public static List v(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static List w(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineTo(f, f2);
        pathBuilder.verticalLineToRelative(f3);
        pathBuilder.horizontalLineToRelative(f4);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void x(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineToRelative(f, f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.verticalLineToRelative(f4);
    }

    public static void y(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.moveTo(f, f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineTo(f4);
    }

    public static void z(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineTo(f, f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.horizontalLineTo(f4);
        pathBuilder.close();
    }
}
