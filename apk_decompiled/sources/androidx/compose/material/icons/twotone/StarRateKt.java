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
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class StarRateKt {
    private static ImageVector _starRate;

    public static final ImageVector getStarRate(Icons.TwoTone twoTone) {
        ImageVector imageVector = _starRate;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.StarRate", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(12.94f, 12.0f, -0.94f, -3.11f);
        e.lineToRelative(-0.94f, 3.11f);
        e.lineToRelative(-2.82f, 0.0f);
        e.lineToRelative(2.27f, 1.62f);
        e.lineToRelative(-0.93f, 3.01f);
        e.lineToRelative(2.42f, -1.84f);
        e.lineToRelative(2.42f, 1.84f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, -0.93f, -3.01f, 2.27f, -1.62f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(22.0f, 10.0f, -7.58f, 12.0f, 2.0f);
        p.lineToRelative(-2.42f, 8.0f);
        p.horizontalLineTo(2.0f);
        p.lineToRelative(6.17f, 4.41f);
        p.lineTo(5.83f, 22.0f);
        p.lineTo(12.0f, 17.31f);
        p.lineTo(18.17f, 22.0f);
        gy.B(p, -2.35f, -7.59f, 22.0f, 10.0f);
        p.moveTo(14.42f, 16.63f);
        p.lineTo(12.0f, 14.79f);
        p.lineToRelative(-2.42f, 1.84f);
        p.lineToRelative(0.93f, -3.01f);
        p.lineTo(8.24f, 12.0f);
        p.horizontalLineToRelative(2.82f);
        p.lineTo(12.0f, 8.89f);
        p.lineTo(12.94f, 12.0f);
        p.horizontalLineToRelative(2.82f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(p, -2.27f, 1.62f, 14.42f, 16.63f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _starRate = build;
        build.getClass();
        return build;
    }
}
