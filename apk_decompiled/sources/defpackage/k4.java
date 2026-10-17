package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.util.ListUtilsKt;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract /* synthetic */ class k4 {
    public static void A(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.moveTo(f, f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.verticalLineToRelative(f4);
    }

    public static void B(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.close();
        pathBuilder.moveTo(f2, f3);
        pathBuilder.horizontalLineTo(f4);
    }

    public static void C(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.moveTo(f, f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineToRelative(f4);
    }

    public static void D(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.close();
        pathBuilder.moveTo(f2, f3);
        pathBuilder.horizontalLineToRelative(f4);
    }

    public static tj a(String str) {
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck(str);
        return new tj();
    }

    public static my b(ComposeUiNode.Companion companion, Composer composer, MeasurePolicy measurePolicy, Composer composer2, CompositionLocalMap compositionLocalMap) {
        Updater.m3886setimpl(composer, measurePolicy, companion.getSetMeasurePolicy());
        Updater.m3886setimpl(composer2, compositionLocalMap, companion.getSetResolvedCompositionLocals());
        return companion.getSetCompositeKeyHash();
    }

    public static my c(ComposeUiNode.Companion companion, Composer composer, Integer num, Composer composer2) {
        Updater.m3882initimpl(composer, num, companion.getSetCompositeKeyHash());
        Updater.m3884reconcileimpl(composer2, companion.getApplyOnDeactivatedNodeAssertion());
        return companion.getSetModifier();
    }

    public static PathBuilder d(float f, float f2, float f3) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.horizontalLineTo(f3);
        return pathBuilder;
    }

    public static PathBuilder e(float f, float f2, float f3, float f4) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.lineToRelative(f3, f4);
        return pathBuilder;
    }

    public static PathBuilder f(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.verticalLineTo(f4);
        pathBuilder.horizontalLineToRelative(f5);
        return pathBuilder;
    }

    public static String g(StringBuilder sb, float f, char c) {
        sb.append(f);
        sb.append(c);
        return sb.toString();
    }

    public static List h(PathBuilder pathBuilder, float f) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static List i(PathBuilder pathBuilder, float f, float f2) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineTo(f2);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void j(my myVar, int i, Composer composer, int i2) {
        composer.updateRememberedValue(Integer.valueOf(i));
        composer.apply(Integer.valueOf(i2), myVar);
    }

    public static void k(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.horizontalLineTo(f3);
    }

    public static void l(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.horizontalLineToRelative(f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.horizontalLineToRelative(f4);
    }

    public static tj m(String str) {
        ListUtilsKt.throwNoSuchElementException(str);
        return new tj();
    }

    public static PathBuilder n(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineToRelative(f4);
        pathBuilder.horizontalLineToRelative(f5);
        return pathBuilder;
    }

    public static List o(PathBuilder pathBuilder, float f, float f2) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.verticalLineTo(f2);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void p(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.horizontalLineToRelative(f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.close();
    }

    public static void q(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.lineToRelative(f3, f4);
    }

    public static void r(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.close();
        pathBuilder.moveTo(f, f2);
        pathBuilder.lineTo(f3, f4);
    }

    public static List s(PathBuilder pathBuilder, float f, float f2) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.horizontalLineToRelative(f2);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void t(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.horizontalLineTo(f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.close();
    }

    public static void u(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.horizontalLineToRelative(f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.horizontalLineTo(f4);
    }

    public static List v(PathBuilder pathBuilder, float f, float f2) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void w(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.close();
        pathBuilder.moveTo(f2, f3);
    }

    public static void x(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.close();
        pathBuilder.moveTo(f, f2);
        pathBuilder.lineToRelative(f3, f4);
    }

    public static void y(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.lineToRelative(f2, f3);
        pathBuilder.verticalLineToRelative(f4);
    }

    public static void z(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.lineToRelative(f2, f3);
        pathBuilder.verticalLineTo(f4);
    }
}
