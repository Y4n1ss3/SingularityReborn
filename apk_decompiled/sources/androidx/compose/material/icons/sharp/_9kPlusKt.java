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
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class _9kPlusKt {
    private static ImageVector __9kPlus;

    public static final ImageVector get_9kPlus(Icons.Sharp sharp) {
        ImageVector imageVector = __9kPlus;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp._9kPlus", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(7.5f, 10.0f, 1.0f, 1.5f, -1.0f);
        k4.B(n, 10.0f, 21.0f, 3.0f, 3.0f);
        k4.p(n, 18.0f, 18.0f, 3.0f);
        uf.D(n, 10.0f, 9.0f, 6.0f, 6.0f);
        uf.s(n, -1.5f, 2.5f, -1.0f, 6.0f);
        bv.z(n, 9.0f, 10.0f, 16.0f, 15.0f);
        kp0.q(n, -1.75f, -1.75f, -2.25f, 15.0f);
        kf0.o(n, 11.0f, 9.0f, 1.5f, 2.25f);
        n.lineTo(14.25f, 9.0f);
        n.horizontalLineTo(16.0f);
        gy.B(n, -2.25f, 3.0f, 16.0f, 15.0f);
        j50.y(n, 19.0f, 12.5f, -1.5f, 14.0f);
        af0.z(n, -1.0f, -1.5f, 15.0f, -1.0f);
        af0.q(n, 1.5f, 10.0f, 1.0f, 1.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.o(n, 19.0f, 12.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __9kPlus = build;
        build.getClass();
        return build;
    }
}
