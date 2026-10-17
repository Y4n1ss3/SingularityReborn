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
import defpackage.gy;
import defpackage.k4;
import defpackage.kp0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EdgesensorHighKt {
    private static ImageVector _edgesensorHigh;

    public static final ImageVector getEdgesensorHigh(Icons.Sharp sharp) {
        ImageVector imageVector = _edgesensorHigh;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.EdgesensorHigh", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = gy.d(3.0f, 7.0f, 2.0f, 7.0f, 3.0f);
        k4.D(d, 7.0f, 0.0f, 10.0f, 2.0f);
        gy.s(d, 7.0f, 0.0f, 10.0f);
        k4.C(d, 22.0f, 7.0f, 2.0f, 7.0f);
        uo.r(d, -2.0f, 7.0f, 19.0f, 10.0f);
        bv.l(d, 2.0f, 7.0f, -2.0f, 10.0f);
        k4.A(d, 18.0f, 2.0f, 6.0f, 20.0f);
        uo.r(d, 12.0f, 2.0f, 16.0f, 17.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kp0.o(d, 8.0f, 7.0f, 8.0f, 17.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _edgesensorHigh = build;
        build.getClass();
        return build;
    }
}
