package defpackage;

import androidx.compose.foundation.text.selection.BaseTextPreparedSelection;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Dp;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract /* synthetic */ class fc {
    public static void A(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.close();
        pathBuilder.moveTo(f, f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.horizontalLineToRelative(f4);
    }

    public static void B(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineToRelative(f, f2);
        pathBuilder.close();
        pathBuilder.moveTo(f3, f4);
    }

    public static void C(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineToRelative(f, f2);
        pathBuilder.lineToRelative(f3, f4);
        pathBuilder.close();
    }

    public static void D(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.lineToRelative(f2, f3);
        pathBuilder.verticalLineToRelative(f4);
    }

    public static int a(BaseTextPreparedSelection baseTextPreparedSelection) {
        baseTextPreparedSelection.getState().resetCachedX();
        return baseTextPreparedSelection.getText$foundation().length();
    }

    public static int b(LayoutNode layoutNode) {
        return layoutNode.getNodes$ui().getHead$ui().getAggregateChildKindSet$ui();
    }

    public static PathBuilder c(float f, float f2, float f3, float f4) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.horizontalLineToRelative(f4);
        return pathBuilder;
    }

    public static PathBuilder d(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.verticalLineToRelative(f3);
        pathBuilder.horizontalLineTo(f4);
        pathBuilder.verticalLineToRelative(f5);
        return pathBuilder;
    }

    public static String e(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static List f(PathBuilder pathBuilder, float f) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static List g(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.lineToRelative(f, f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static List h(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineTo(f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineTo(f4);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void i(float f, StringBuilder sb, String str) {
        sb.append((Object) Dp.m7622toStringimpl(f));
        sb.append(str);
    }

    public static void j(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.close();
    }

    public static void k(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.horizontalLineTo(f2);
        pathBuilder.lineToRelative(f3, f4);
    }

    public static boolean l(my myVar, Composer composer, int i) {
        myVar.invoke(composer, Integer.valueOf(i));
        composer.endNode();
        return ComposerKt.isTraceInProgress();
    }

    public static PathBuilder m(float f, float f2, float f3, float f4) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.verticalLineToRelative(f3);
        pathBuilder.horizontalLineToRelative(f4);
        return pathBuilder;
    }

    public static PathBuilder n(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineTo(f4);
        pathBuilder.horizontalLineToRelative(f5);
        return pathBuilder;
    }

    public static List o(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.lineToRelative(f2, f3);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static List p(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.horizontalLineToRelative(f2);
        pathBuilder.verticalLineToRelative(f3);
        pathBuilder.horizontalLineTo(f4);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void q(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.verticalLineTo(f2);
        pathBuilder.horizontalLineTo(f3);
    }

    public static void r(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineToRelative(f, f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineTo(f4);
    }

    public static void s(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.lineTo(f2, f3);
        pathBuilder.verticalLineTo(f4);
    }

    public static void t(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineTo(f, f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.horizontalLineToRelative(f4);
    }

    public static void u(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineToRelative(f, f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.horizontalLineToRelative(f4);
    }

    public static void v(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineTo(f, f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.verticalLineTo(f4);
    }

    public static void w(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineTo(f, f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineToRelative(f4);
    }

    public static void x(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.close();
        pathBuilder.moveTo(f3, f4);
    }

    public static void y(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.horizontalLineToRelative(f2);
        pathBuilder.verticalLineToRelative(f3);
        pathBuilder.horizontalLineTo(f4);
        pathBuilder.close();
    }

    public static void z(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.lineToRelative(f2, f3);
        pathBuilder.horizontalLineTo(f4);
    }
}
