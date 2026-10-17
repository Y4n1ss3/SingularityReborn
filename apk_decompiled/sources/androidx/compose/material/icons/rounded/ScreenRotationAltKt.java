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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ScreenRotationAltKt {
    private static ImageVector _screenRotationAlt;

    public static final ImageVector getScreenRotationAlt(Icons.Rounded rounded) {
        ImageVector imageVector = _screenRotationAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ScreenRotationAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.53f, 9.29f);
        b.curveTo(19.16f, 9.92f, 18.71f, 11.0f, 17.82f, 11.0f);
        b.curveToRelative(-0.27f, 0.0f, -0.52f, -0.11f, -0.71f, -0.29f);
        b.lineTo(10.4f, 4.0f);
        b.lineTo(5.41f, 9.0f);
        b.horizontalLineTo(7.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        b.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        b.horizontalLineTo(3.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        b.verticalLineTo(6.0f);
        b.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        b.verticalLineToRelative(1.59f);
        b.lineToRelative(5.0f, -5.0f);
        b.curveToRelative(0.78f, -0.78f, 2.05f, -0.78f, 2.83f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b, 18.53f, 9.29f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(5.47f, 14.71f);
        b2.curveTo(4.84f, 14.08f, 5.29f, 13.0f, 6.18f, 13.0f);
        b2.curveToRelative(0.27f, 0.0f, 0.52f, 0.11f, 0.71f, 0.29f);
        b2.lineTo(13.6f, 20.0f);
        b2.lineToRelative(4.99f, -5.0f);
        b2.horizontalLineTo(17.0f);
        b2.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        b2.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        b2.horizontalLineToRelative(4.0f);
        b2.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        b2.verticalLineToRelative(4.0f);
        b2.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        b2.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        b2.verticalLineToRelative(-1.59f);
        b2.lineToRelative(-5.0f, 5.0f);
        b2.curveToRelative(-0.78f, 0.78f, -2.05f, 0.78f, -2.83f, 0.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b2, 5.47f, 14.71f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _screenRotationAlt = build;
        build.getClass();
        return build;
    }
}
