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
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PrecisionManufacturingKt {
    private static ImageVector _precisionManufacturing;

    public static final ImageVector getPrecisionManufacturing(Icons.Rounded rounded) {
        ImageVector imageVector = _precisionManufacturing;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PrecisionManufacturing", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(19.93f, 8.35f, -3.6f, 1.68f);
        e.lineTo(14.0f, 7.7f);
        e.verticalLineTo(6.3f);
        e.lineToRelative(2.33f, -2.33f);
        e.lineToRelative(3.6f, 1.68f);
        e.curveToRelative(0.38f, 0.18f, 0.82f, 0.01f, 1.0f, -0.36f);
        e.curveToRelative(0.18f, -0.38f, 0.01f, -0.82f, -0.36f, -1.0f);
        e.lineToRelative(-3.92f, -1.83f);
        e.curveToRelative(-0.38f, -0.18f, -0.83f, -0.1f, -1.13f, 0.2f);
        e.lineTo(13.78f, 4.4f);
        e.curveTo(13.6f, 4.16f, 13.32f, 4.0f, 13.0f, 4.0f);
        e.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        e.verticalLineToRelative(1.0f);
        e.horizontalLineTo(8.82f);
        e.curveTo(8.34f, 4.66f, 6.96f, 3.75f, 5.4f, 4.06f);
        e.curveTo(4.23f, 4.29f, 3.27f, 5.25f, 3.05f, 6.42f);
        e.curveTo(2.8f, 7.76f, 3.45f, 8.96f, 4.48f, 9.58f);
        e.lineTo(7.08f, 18.0f);
        e.horizontalLineTo(5.5f);
        e.curveTo(4.67f, 18.0f, 4.0f, 18.67f, 4.0f, 19.5f);
        e.verticalLineToRelative(0.0f);
        e.curveTo(4.0f, 20.33f, 4.67f, 21.0f, 5.5f, 21.0f);
        e.horizontalLineToRelative(10.0f);
        e.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        e.verticalLineToRelative(0.0f);
        e.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        e.horizontalLineToRelative(-2.12f);
        e.lineTo(8.41f, 8.77f);
        e.curveTo(8.58f, 8.53f, 8.72f, 8.28f, 8.82f, 8.0f);
        e.horizontalLineTo(12.0f);
        e.verticalLineToRelative(1.0f);
        e.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        e.curveToRelative(0.32f, 0.0f, 0.6f, -0.16f, 0.78f, -0.4f);
        e.lineToRelative(1.74f, 1.74f);
        e.curveToRelative(0.3f, 0.3f, 0.75f, 0.38f, 1.13f, 0.2f);
        e.lineToRelative(3.92f, -1.83f);
        e.curveToRelative(0.38f, -0.18f, 0.54f, -0.62f, 0.36f, -1.0f);
        e.curveTo(20.75f, 8.34f, 20.31f, 8.17f, 19.93f, 8.35f);
        e.close();
        e.moveTo(6.0f, 8.0f);
        e.curveTo(5.45f, 8.0f, 5.0f, 7.55f, 5.0f, 7.0f);
        e.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        e.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        e.curveTo(7.0f, 7.55f, 6.55f, 8.0f, 6.0f, 8.0f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _precisionManufacturing = build;
        build.getClass();
        return build;
    }
}
