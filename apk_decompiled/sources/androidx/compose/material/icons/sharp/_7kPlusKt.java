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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class _7kPlusKt {
    private static ImageVector __7kPlus;

    public static final ImageVector get_7kPlus(Icons.Sharp sharp) {
        ImageVector imageVector = __7kPlus;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp._7kPlus", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = r6.i(21.0f, 3.0f, 3.0f, 18.0f, 18.0f);
        k4.B(i, 3.0f, 8.5f, 15.0f, 6.75f);
        kp0.v(i, 1.38f, -4.5f, 5.5f, 9.0f);
        gy.n(i, 4.86f, 8.5f, 15.0f);
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
        __7kPlus = build;
        build.getClass();
        return build;
    }
}
