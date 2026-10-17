package androidx.compose.material.icons.twotone;

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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PowerKt {
    private static ImageVector _power;

    public static final ImageVector getPower(Icons.TwoTone twoTone) {
        ImageVector imageVector = _power;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Power", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder j = kf0.j(8.0f, 13.65f, 3.5f, 3.52f, 19.0f);
        bv.p(j, 1.0f, -1.83f, 3.5f, -3.51f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.e(j, 9.0f, 8.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder k = gy.k(16.0f, 7.0f, 16.0f, 3.0f, -2.0f);
        uo.B(k, 4.0f, -4.0f, 10.0f, 3.0f);
        af0.m(k, 8.0f, 3.0f, 4.0f, -0.01f);
        k.curveTo(6.89f, 7.0f, 6.0f, 7.89f, 6.0f, 8.98f);
        bv.q(k, 5.52f, 9.5f, 18.0f, 3.0f);
        bv.p(k, 5.0f, -3.0f, 3.5f, -3.5f);
        k.lineTo(18.0f, 9.0f);
        k.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.x(k, 16.0f, 13.66f, -3.5f, 3.51f);
        fc.w(k, 12.5f, 19.0f, -1.0f, -1.83f);
        k.lineTo(8.0f, 13.65f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.x(k, 8.0f, 9.0f, 8.0f, 4.66f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _power = build;
        build.getClass();
        return build;
    }
}
