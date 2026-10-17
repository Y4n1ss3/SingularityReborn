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
import defpackage.kp0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ScienceKt {
    private static ImageVector _science;

    public static final ImageVector getScience(Icons.TwoTone twoTone) {
        ImageVector imageVector = _science;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Science", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(13.0f, 6.0f, -2.0f, 0.0f);
        e.lineToRelative(0.0f, 5.33f);
        e.lineToRelative(-5.0f, 6.67f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, 12.0f, 0.0f, -5.0f, -6.67f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder u = kp0.u(20.8f, 18.4f, 15.0f, 10.67f, 6.5f);
        u.lineToRelative(1.35f, -1.69f);
        u.curveTo(16.61f, 4.48f, 16.38f, 4.0f, 15.96f, 4.0f);
        u.horizontalLineTo(8.04f);
        u.curveTo(7.62f, 4.0f, 7.39f, 4.48f, 7.65f, 4.81f);
        u.lineTo(9.0f, 6.5f);
        u.verticalLineToRelative(4.17f);
        u.lineTo(3.2f, 18.4f);
        u.curveTo(2.71f, 19.06f, 3.18f, 20.0f, 4.0f, 20.0f);
        u.horizontalLineToRelative(16.0f);
        u.curveTo(20.82f, 20.0f, 21.29f, 19.06f, 20.8f, 18.4f);
        k4.x(u, 6.0f, 18.0f, 5.0f, -6.67f);
        kf0.r(u, 6.0f, 2.0f, 5.33f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.v(u, 18.0f, 18.0f, 6.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _science = build;
        build.getClass();
        return build;
    }
}
