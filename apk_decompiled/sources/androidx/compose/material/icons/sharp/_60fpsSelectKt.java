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
import defpackage.bv;
import defpackage.j50;
import defpackage.k4;
import defpackage.kp0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class _60fpsSelectKt {
    private static ImageVector __60fpsSelect;

    public static final ImageVector get_60fpsSelect(Icons.Sharp sharp) {
        ImageVector imageVector = __60fpsSelect;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp._60fpsSelect", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder w = kp0.w(18.0f, 6.0f, 6.0f, -3.0f, 6.0f);
        kp0.r(w, 18.0f, 20.0f, 4.0f, -7.0f);
        k4.p(w, 10.0f, 7.0f, 4.0f);
        kp0.C(w, 11.0f, 6.0f, 4.0f, 4.0f);
        bv.B(w, 10.0f, 7.0f, 8.0f, 6.0f);
        bv.z(w, 6.0f, 11.0f, 9.0f, 10.0f);
        w.verticalLineToRelative(2.0f);
        w.horizontalLineTo(6.0f);
        w.verticalLineToRelative(-2.0f);
        w.horizontalLineTo(9.0f);
        w.close();
        k4.A(w, 5.0f, 22.0f, 3.0f, -5.0f);
        uo.r(w, 2.0f, 22.0f, 9.0f, 22.0f);
        bv.h(w, 7.0f, -5.0f, 2.0f, 22.0f);
        k4.C(w, 13.0f, 22.0f, -2.0f, -5.0f);
        uo.r(w, 2.0f, 22.0f, 21.0f, 22.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.m(w, -6.0f, -5.0f, 6.0f, 22.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __60fpsSelect = build;
        build.getClass();
        return build;
    }
}
