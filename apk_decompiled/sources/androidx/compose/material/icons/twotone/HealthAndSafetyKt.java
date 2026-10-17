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
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HealthAndSafetyKt {
    private static ImageVector _healthAndSafety;

    public static final ImageVector getHealthAndSafety(Icons.TwoTone twoTone) {
        ImageVector imageVector = _healthAndSafety;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.HealthAndSafety", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(12.0f, 4.14f, 6.0f, 6.39f, 4.7f);
        s.curveToRelative(0.0f, 4.0f, 2.55f, 7.7f, 6.0f, 8.83f);
        s.curveToRelative(3.45f, -1.13f, 6.0f, -4.82f, 6.0f, -8.83f);
        kf0.t(s, -4.7f, 12.0f, 4.14f);
        k4.C(s, 16.0f, 13.0f, -2.5f, 2.5f);
        af0.p(s, -3.0f, 13.0f, 8.0f, -3.0f);
        af0.n(s, 2.5f, 7.5f, 3.0f, 10.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.o(s, 16.0f, 13.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = r6.i(10.5f, 13.0f, 8.0f, -3.0f, 2.5f);
        k4.u(i, 7.5f, 3.0f, 10.0f, 16.0f);
        r6.D(i, 3.0f, -2.5f, 2.5f, -3.0f);
        bv.t(i, 13.0f, 12.0f, 2.0f);
        i.lineTo(4.0f, 5.0f);
        i.verticalLineToRelative(6.09f);
        i.curveToRelative(0.0f, 5.05f, 3.41f, 9.76f, 8.0f, 10.91f);
        i.curveToRelative(4.59f, -1.15f, 8.0f, -5.86f, 8.0f, -10.91f);
        bv.k(i, 5.0f, 12.0f, 2.0f);
        i.moveTo(18.0f, 11.09f);
        i.curveToRelative(0.0f, 4.0f, -2.55f, 7.7f, -6.0f, 8.83f);
        i.curveToRelative(-3.45f, -1.13f, -6.0f, -4.82f, -6.0f, -8.83f);
        i.verticalLineToRelative(-4.7f);
        i.lineToRelative(6.0f, -2.25f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.j(i, 6.0f, 2.25f, 11.09f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _healthAndSafety = build;
        build.getClass();
        return build;
    }
}
