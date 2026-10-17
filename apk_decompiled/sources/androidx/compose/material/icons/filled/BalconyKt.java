package androidx.compose.material.icons.filled;

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
import defpackage.fc;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BalconyKt {
    private static ImageVector _balcony;

    public static final ImageVector getBalcony(Icons.Filled filled) {
        ImageVector imageVector = _balcony;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Balcony", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = fc.d(10.0f, 10.0f, 2.0f, 8.0f, -2.0f);
        kp0.D(d, 10.0f, 16.0f, 12.0f, -2.0f);
        kp0.j(d, -2.0f, 2.0f, 16.0f);
        uf.D(d, 21.0f, 14.0f, 8.0f, 3.0f);
        kf0.z(d, -8.0f, 1.0f, -4.0f);
        d.curveToRelative(0.0f, -4.42f, 3.58f, -8.0f, 8.0f, -8.0f);
        d.reflectiveCurveToRelative(8.0f, 3.58f, 8.0f, 8.0f);
        kf0.n(d, 4.0f, 21.0f, 7.0f, 16.0f);
        bv.h(d, 5.0f, 4.0f, 2.0f, 16.0f);
        k4.A(d, 11.0f, 16.0f, 9.0f, 4.0f);
        uo.r(d, 2.0f, 16.0f, 11.0f, 4.08f);
        d.curveTo(8.16f, 4.56f, 6.0f, 7.03f, 6.0f, 10.0f);
        k4.p(d, 4.0f, 5.0f, 4.08f);
        k4.C(d, 13.0f, 14.0f, 5.0f, -4.0f);
        d.curveToRelative(0.0f, -2.97f, -2.16f, -5.44f, -5.0f, -5.92f);
        k4.D(d, 14.0f, 15.0f, 16.0f, -2.0f);
        k4.p(d, 4.0f, 2.0f, 16.0f);
        k4.C(d, 19.0f, 16.0f, -2.0f, 4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(d, 2.0f, 16.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _balcony = build;
        build.getClass();
        return build;
    }
}
