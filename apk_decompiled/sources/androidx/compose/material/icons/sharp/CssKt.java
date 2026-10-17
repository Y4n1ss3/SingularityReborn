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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CssKt {
    private static ImageVector _css;

    public static final ImageVector getCss(Icons.Sharp sharp) {
        ImageVector imageVector = _css;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Css", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = fc.d(9.5f, 15.0f, -2.0f, 11.0f, 0.5f);
        gy.o(d, 2.0f, -1.0f, 9.5f, 9.0f);
        af0.z(d, 5.0f, 2.0f, 13.0f, -0.5f);
        af0.w(d, -2.0f, 1.0f, 3.5f, 15.0f);
        kp0.r(d, 9.5f, 16.0f, 15.0f, 5.0f);
        r6.D(d, -3.5f, -3.5f, -1.0f, 2.0f);
        uo.m(d, 11.0f, 21.0f, 9.0f, -5.0f);
        r6.D(d, 3.5f, 3.5f, 1.0f, -2.0f);
        k4.t(d, 13.0f, 16.0f, 15.0f);
        kp0.C(d, 8.0f, 11.0f, 9.0f, 3.0f);
        uf.s(d, 6.0f, 5.0f, -2.0f, 6.5f);
        r6.D(d, 0.5f, -2.0f, -3.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.e(d, 11.0f, 8.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _css = build;
        build.getClass();
        return build;
    }
}
