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
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class _3kPlusKt {
    private static ImageVector __3kPlus;

    public static final ImageVector get_3kPlus(Icons.Sharp sharp) {
        ImageVector imageVector = __3kPlus;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp._3kPlus", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = r6.i(21.0f, 3.0f, 3.0f, 18.0f, 18.0f);
        kf0.D(i, 3.0f, 10.0f, 9.0f, 6.0f);
        uf.k(i, 5.5f, -1.5f, 3.0f, -1.0f);
        af0.v(i, -2.0f, -1.0f, 2.0f, -1.0f);
        kf0.v(i, -3.0f, 9.0f, 10.0f);
        i.moveTo(16.0f, 15.0f);
        kp0.q(i, -1.75f, -1.75f, -2.25f, 15.0f);
        kf0.o(i, 11.0f, 9.0f, 1.5f, 2.25f);
        i.lineTo(14.25f, 9.0f);
        i.horizontalLineTo(16.0f);
        gy.B(i, -2.25f, 3.0f, 16.0f, 15.0f);
        j50.y(i, 19.0f, 12.5f, -1.5f, 14.0f);
        af0.z(i, -1.0f, -1.5f, 15.0f, -1.0f);
        af0.q(i, 1.5f, 10.0f, 1.0f, 1.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.o(i, 19.0f, 12.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __3kPlus = build;
        build.getClass();
        return build;
    }
}
