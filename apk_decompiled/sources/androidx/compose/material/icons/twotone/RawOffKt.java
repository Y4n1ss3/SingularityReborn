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
public final class RawOffKt {
    private static ImageVector _rawOff;

    public static final ImageVector getRawOff(Icons.TwoTone twoTone) {
        ImageVector imageVector = _rawOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.RawOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(17.15f, 14.32f, 0.59f, -2.36f);
        e.lineToRelative(0.76f, 3.04f);
        e.lineToRelative(1.48f, 0.0f);
        e.lineToRelative(1.5f, -6.0f);
        e.lineToRelative(-1.5f, 0.0f);
        e.lineToRelative(-0.74f, 3.0f);
        e.lineToRelative(-0.74f, -3.0f);
        e.lineToRelative(-1.52f, 0.0f);
        e.lineToRelative(-0.74f, 3.0f);
        e.lineToRelative(-0.74f, -3.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, -1.5f, 0.0f, 0.72f, 2.9f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder p = gy.p(1.39f, 4.22f, 6.17f, 9.0f, 3.0f);
        r6.D(p, 6.0f, 1.5f, -2.0f, 1.1f);
        p.lineToRelative(0.9f, 2.0f);
        p.horizontalLineTo(8.0f);
        p.lineToRelative(-0.9f, -2.1f);
        p.curveTo(7.6f, 12.6f, 8.0f, 12.1f, 8.0f, 11.5f);
        p.verticalLineToRelative(-0.67f);
        p.lineToRelative(1.43f, 1.43f);
        p.lineTo(8.75f, 15.0f);
        kf0.B(p, 1.5f, 0.38f, -1.5f, 0.04f);
        p.lineToRelative(9.11f, 9.11f);
        p.lineToRelative(1.41f, -1.41f);
        r6.C(p, 2.81f, 2.81f, 1.39f, 4.22f);
        k4.C(p, 6.5f, 11.5f, -2.0f, -1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(p, 2.0f, 11.5f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rawOff = build;
        build.getClass();
        return build;
    }
}
