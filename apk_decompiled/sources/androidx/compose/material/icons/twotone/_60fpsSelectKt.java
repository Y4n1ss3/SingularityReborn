package androidx.compose.material.icons.twotone;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.bv;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class _60fpsSelectKt {
    private static ImageVector __60fpsSelect;

    public static final ImageVector get_60fpsSelect(Icons.TwoTone twoTone) {
        ImageVector imageVector = __60fpsSelect;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone._60fpsSelect", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder w = kp0.w(18.0f, 6.0f, 6.0f, -3.0f, 6.0f);
        kp0.r(w, 18.0f, 18.0f, 4.0f, -3.0f);
        w.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        w.verticalLineToRelative(6.0f);
        w.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        w.horizontalLineToRelative(3.0f);
        w.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        w.verticalLineTo(6.0f);
        w.curveTo(20.0f, 4.9f, 19.1f, 4.0f, 18.0f, 4.0f);
        uo.A(w, 11.0f, 6.0f, 4.0f, 6.0f);
        w.curveTo(4.9f, 4.0f, 4.0f, 4.9f, 4.0f, 6.0f);
        w.verticalLineToRelative(6.0f);
        w.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        w.horizontalLineToRelative(3.0f);
        w.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        w.verticalLineToRelative(-2.0f);
        w.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        kp0.p(w, 6.0f, 6.0f, 11.0f);
        uf.D(w, 9.0f, 10.0f, 2.0f, 6.0f);
        kf0.n(w, -2.0f, 9.0f, 5.0f, 22.0f);
        bv.h(w, 3.0f, -5.0f, 2.0f, 22.0f);
        k4.A(w, 9.0f, 22.0f, 7.0f, -5.0f);
        uo.r(w, 2.0f, 22.0f, 13.0f, 22.0f);
        bv.l(w, -2.0f, -5.0f, 2.0f, 22.0f);
        k4.C(w, 21.0f, 22.0f, -6.0f, -5.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(w, 6.0f, 22.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __60fpsSelect = build;
        build.getClass();
        return build;
    }
}
