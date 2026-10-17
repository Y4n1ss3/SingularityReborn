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
import defpackage.j50;
import defpackage.k4;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ChairAltKt {
    private static ImageVector _chairAlt;

    public static final ImageVector getChairAlt(Icons.Sharp sharp) {
        ImageVector imageVector = _chairAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ChairAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder v = uo.v(16.0f, 10.0f, 3.0f, 3.0f, 5.0f);
        uf.s(v, 7.0f, 3.0f, 2.0f, 5.0f);
        r6.D(v, 9.0f, 2.0f, -3.0f, 10.0f);
        r6.D(v, 3.0f, 2.0f, -9.0f, -3.0f);
        uo.y(v, 10.0f, 7.0f, 8.0f, 5.0f);
        kp0.j(v, 10.0f, 3.0f, 7.0f);
        k4.A(v, 17.0f, 16.0f, 7.0f, -2.0f);
        uo.r(v, 10.0f, 16.0f, 14.0f, 12.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.m(v, -4.0f, -2.0f, 4.0f, 12.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _chairAlt = build;
        build.getClass();
        return build;
    }
}
