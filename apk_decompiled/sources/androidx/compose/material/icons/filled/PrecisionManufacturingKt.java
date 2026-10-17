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
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PrecisionManufacturingKt {
    private static ImageVector _precisionManufacturing;

    public static final ImageVector getPrecisionManufacturing(Icons.Filled filled) {
        ImageVector imageVector = _precisionManufacturing;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.PrecisionManufacturing", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(19.93f, 8.21f, -3.6f, 1.68f);
        e.lineTo(14.0f, 7.7f);
        e.verticalLineTo(6.3f);
        e.lineToRelative(2.33f, -2.19f);
        e.lineToRelative(3.6f, 1.68f);
        e.curveToRelative(0.38f, 0.18f, 0.82f, 0.01f, 1.0f, -0.36f);
        e.curveToRelative(0.18f, -0.38f, 0.01f, -0.82f, -0.36f, -1.0f);
        e.lineTo(16.65f, 2.6f);
        e.curveToRelative(-0.38f, -0.18f, -0.83f, -0.1f, -1.13f, 0.2f);
        e.lineToRelative(-1.74f, 1.6f);
        e.curveTo(13.6f, 4.16f, 13.32f, 4.0f, 13.0f, 4.0f);
        e.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        e.verticalLineToRelative(1.0f);
        e.horizontalLineTo(8.82f);
        e.curveTo(8.34f, 4.65f, 6.98f, 3.73f, 5.4f, 4.07f);
        e.curveTo(4.24f, 4.32f, 3.25f, 5.32f, 3.04f, 6.5f);
        e.curveTo(2.82f, 7.82f, 3.5f, 8.97f, 4.52f, 9.58f);
        r6.w(e, 7.08f, 18.0f, 4.0f, 3.0f);
        kf0.x(e, 13.0f, -3.0f, -3.62f);
        e.lineTo(8.41f, 8.77f);
        e.curveTo(8.58f, 8.53f, 8.72f, 8.28f, 8.82f, 8.0f);
        e.horizontalLineTo(12.0f);
        e.verticalLineToRelative(1.0f);
        e.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        e.curveToRelative(0.32f, 0.0f, 0.6f, -0.16f, 0.78f, -0.4f);
        e.lineToRelative(1.74f, 1.6f);
        e.curveToRelative(0.3f, 0.3f, 0.75f, 0.38f, 1.13f, 0.2f);
        e.lineToRelative(3.92f, -1.83f);
        e.curveToRelative(0.38f, -0.18f, 0.54f, -0.62f, 0.36f, -1.0f);
        e.curveTo(20.75f, 8.2f, 20.31f, 8.03f, 19.93f, 8.21f);
        e.close();
        e.moveTo(6.0f, 8.0f);
        e.curveTo(5.45f, 8.0f, 5.0f, 7.55f, 5.0f, 7.0f);
        e.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        e.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(e, 6.55f, 8.0f, 6.0f, 8.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _precisionManufacturing = build;
        build.getClass();
        return build;
    }
}
