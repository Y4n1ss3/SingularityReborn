package androidx.compose.material.icons.rounded;

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
public final class FontDownloadOffKt {
    private static ImageVector _fontDownloadOff;

    public static final ImageVector getFontDownloadOff(Icons.Rounded rounded) {
        ImageVector imageVector = _fontDownloadOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FontDownloadOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(12.58f, 9.75f, -0.87f, -0.87f);
        e.lineToRelative(0.23f, -0.66f);
        gy.n(e, 0.1f, 12.58f, 9.75f);
        e.moveTo(10.35f, 7.52f);
        e.lineTo(10.55f, 7.0f);
        e.curveToRelative(0.23f, -0.6f, 0.8f, -1.0f, 1.45f, -1.0f);
        e.reflectiveCurveToRelative(1.22f, 0.4f, 1.45f, 1.0f);
        e.lineToRelative(2.17f, 5.79f);
        e.lineTo(22.0f, 19.17f);
        e.verticalLineTo(4.0f);
        e.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        kf0.m(e, 4.83f, 10.35f, 7.52f);
        e.moveTo(21.19f, 22.61f);
        e.lineTo(21.19f, 22.61f);
        e.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        e.lineTo(19.17f, 22.0f);
        e.horizontalLineTo(4.0f);
        e.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        e.verticalLineTo(4.83f);
        e.lineTo(1.39f, 4.22f);
        e.curveTo(1.0f, 3.83f, 1.0f, 3.2f, 1.39f, 2.81f);
        e.lineToRelative(0.0f, 0.0f);
        e.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        e.lineToRelative(18.38f, 18.38f);
        e.curveTo(21.58f, 21.58f, 21.58f, 22.22f, 21.19f, 22.61f);
        k4.x(e, 12.1f, 14.93f, -3.3f, -3.3f);
        e.lineTo(6.9f, 16.7f);
        e.curveTo(6.67f, 17.33f, 7.13f, 18.0f, 7.8f, 18.0f);
        e.horizontalLineToRelative(0.01f);
        e.curveToRelative(0.41f, 0.0f, 0.77f, -0.26f, 0.9f, -0.64f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.d(e, 0.86f, -2.43f, 12.1f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fontDownloadOff = build;
        build.getClass();
        return build;
    }
}
