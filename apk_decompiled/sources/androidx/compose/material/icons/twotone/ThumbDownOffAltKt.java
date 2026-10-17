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
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ThumbDownOffAltKt {
    private static ImageVector _thumbDownOffAlt;

    public static final ImageVector getThumbDownOffAlt(Icons.TwoTone twoTone) {
        ImageVector imageVector = _thumbDownOffAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.ThumbDownOffAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(3.0f, 12.0f, 0.0f, 2.0f);
        e.lineToRelative(9.0f, 0.0f);
        e.lineToRelative(-1.34f, 5.34f);
        e.lineToRelative(4.34f, -4.34f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, 0.0f, -10.0f, -9.0f, 0.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.c(19.0f, 3.0f, 4.0f, 12.0f, -4.0f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m4787getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, companion2.m5135getButtKaPHkGw(), companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(15.0f, 3.0f, 6.0f);
        d.curveTo(5.17f, 3.0f, 4.46f, 3.5f, 4.16f, 4.22f);
        d.lineToRelative(-3.02f, 7.05f);
        d.curveTo(1.05f, 11.5f, 1.0f, 11.74f, 1.0f, 12.0f);
        d.verticalLineToRelative(2.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(6.31f);
        d.lineToRelative(-0.95f, 4.57f);
        d.lineToRelative(-0.03f, 0.32f);
        d.curveToRelative(0.0f, 0.41f, 0.17f, 0.79f, 0.44f, 1.06f);
        d.lineTo(9.83f, 23.0f);
        d.lineToRelative(6.59f, -6.59f);
        d.curveTo(16.78f, 16.05f, 17.0f, 15.55f, 17.0f, 15.0f);
        d.verticalLineTo(5.0f);
        d.curveTo(17.0f, 3.9f, 16.1f, 3.0f, 15.0f, 3.0f);
        k4.x(d, 15.0f, 15.0f, -4.34f, 4.34f);
        r6.w(d, 12.0f, 14.0f, 3.0f, -2.0f);
        d.lineToRelative(3.0f, -7.0f);
        d.horizontalLineToRelative(9.0f);
        d.verticalLineTo(15.0f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _thumbDownOffAlt = build;
        build.getClass();
        return build;
    }
}
