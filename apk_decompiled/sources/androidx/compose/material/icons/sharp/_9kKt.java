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
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class _9kKt {
    private static ImageVector __9k;

    public static final ImageVector get_9k(Icons.Sharp sharp) {
        ImageVector imageVector = __9k;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp._9k", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = gy.d(8.0f, 10.0f, 1.5f, 1.5f, 8.0f);
        k4.B(d, 10.0f, 21.0f, 3.0f, 3.0f);
        k4.p(d, 18.0f, 18.0f, 3.0f);
        uf.D(d, 11.0f, 9.0f, 6.0f, 6.5f);
        r6.D(d, -1.5f, 3.0f, -1.0f, -3.0f);
        bv.z(d, 9.0f, 11.0f, 18.0f, 15.0f);
        kp0.q(d, -1.75f, -1.75f, -2.25f, 15.0f);
        kf0.o(d, 13.0f, 9.0f, 1.5f, 2.25f);
        d.lineTo(16.25f, 9.0f);
        d.horizontalLineTo(18.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(d, -2.25f, 3.0f, 18.0f, 15.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __9k = build;
        build.getClass();
        return build;
    }
}
