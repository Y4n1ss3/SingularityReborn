package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.af0;
import defpackage.bv;
import defpackage.j50;
import defpackage.k4;
import defpackage.kp0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class _30fpsSelectKt {
    private static ImageVector __30fpsSelect;

    public static final ImageVector get_30fpsSelect(Icons.Outlined outlined) {
        ImageVector imageVector = __30fpsSelect;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined._30fpsSelect", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = kp0.s(4.0f, 4.0f, 2.0f, 5.0f, 2.0f);
        uf.k(s, 5.0f, 2.0f, 4.0f, 2.0f);
        af0.u(s, 4.0f, 2.0f, 5.0f);
        s.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        s.verticalLineToRelative(-1.5f);
        s.curveTo(11.0f, 9.67f, 10.83f, 9.0f, 10.0f, 9.0f);
        s.curveToRelative(0.83f, 0.0f, 1.0f, -0.67f, 1.0f, -1.5f);
        s.verticalLineTo(6.0f);
        s.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.w(s, 4.0f, 18.0f, 4.0f);
        s.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        s.verticalLineToRelative(6.0f);
        s.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        s.horizontalLineToRelative(-3.0f);
        s.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        s.verticalLineTo(6.0f);
        s.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        kp0.r(s, 18.0f, 18.0f, 6.0f, -3.0f);
        k4.p(s, 6.0f, 3.0f, 6.0f);
        k4.A(s, 5.0f, 22.0f, 3.0f, -5.0f);
        uo.r(s, 2.0f, 22.0f, 9.0f, 22.0f);
        bv.h(s, 7.0f, -5.0f, 2.0f, 22.0f);
        k4.C(s, 13.0f, 22.0f, -2.0f, -5.0f);
        uo.r(s, 2.0f, 22.0f, 21.0f, 22.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.m(s, -6.0f, -5.0f, 6.0f, 22.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __30fpsSelect = build;
        build.getClass();
        return build;
    }
}
