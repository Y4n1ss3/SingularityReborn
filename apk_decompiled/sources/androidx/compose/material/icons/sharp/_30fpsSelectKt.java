package androidx.compose.material.icons.sharp;

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
import defpackage.k4;
import defpackage.kp0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class _30fpsSelectKt {
    private static ImageVector __30fpsSelect;

    public static final ImageVector get_30fpsSelect(Icons.Sharp sharp) {
        ImageVector imageVector = __30fpsSelect;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp._30fpsSelect", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = kp0.s(4.0f, 4.0f, 2.0f, 5.0f, 2.0f);
        uf.k(s, 5.0f, 2.0f, 4.0f, 2.0f);
        af0.g(s, 4.0f, 2.0f, 7.0f, 4.0f);
        kp0.r(s, 4.0f, 13.0f, 4.0f, 7.0f);
        k4.p(s, 10.0f, -7.0f, 4.0f);
        k4.C(s, 18.0f, 6.0f, -3.0f, 6.0f);
        uo.r(s, 3.0f, 6.0f, 5.0f, 22.0f);
        bv.h(s, 3.0f, -5.0f, 2.0f, 22.0f);
        k4.A(s, 9.0f, 22.0f, 7.0f, -5.0f);
        uo.r(s, 2.0f, 22.0f, 13.0f, 22.0f);
        bv.l(s, -2.0f, -5.0f, 2.0f, 22.0f);
        k4.C(s, 21.0f, 22.0f, -6.0f, -5.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(s, 6.0f, 22.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __30fpsSelect = build;
        build.getClass();
        return build;
    }
}
