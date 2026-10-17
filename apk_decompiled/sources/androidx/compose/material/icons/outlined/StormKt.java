package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class StormKt {
    private static ImageVector _storm;

    public static final ImageVector getStorm(Icons.Outlined outlined) {
        ImageVector imageVector = _storm;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Storm", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.93f, 8.0f);
        b.curveTo(16.72f, 4.18f, 11.82f, 2.87f, 8.0f, 5.07f);
        b.curveToRelative(-1.41f, 0.82f, -2.48f, 2.0f, -3.16f, 3.37f);
        b.curveTo(4.71f, 6.24f, 5.06f, 4.04f, 5.86f, 2.0f);
        b.horizontalLineTo(3.74f);
        b.curveTo(2.2f, 6.49f, 2.52f, 11.58f, 5.07f, 16.0f);
        b.curveToRelative(1.1f, 1.91f, 2.88f, 3.19f, 4.86f, 3.72f);
        b.curveToRelative(1.98f, 0.53f, 4.16f, 0.31f, 6.07f, -0.79f);
        b.curveToRelative(1.41f, -0.82f, 2.48f, -2.0f, 3.16f, -3.37f);
        b.curveToRelative(0.13f, 2.2f, -0.21f, 4.4f, -1.01f, 6.44f);
        b.horizontalLineToRelative(2.11f);
        b.curveTo(21.79f, 17.51f, 21.48f, 12.42f, 18.93f, 8.0f);
        b.close();
        b.moveTo(15.0f, 17.2f);
        b.curveToRelative(-2.87f, 1.65f, -6.54f, 0.67f, -8.2f, -2.2f);
        b.curveToRelative(-0.11f, -0.2f, -0.21f, -0.4f, -0.3f, -0.6f);
        b.curveTo(5.3f, 11.64f, 6.33f, 8.34f, 9.0f, 6.8f);
        b.curveToRelative(2.86f, -1.65f, 6.54f, -0.67f, 8.2f, 2.2f);
        b.curveToRelative(0.11f, 0.2f, 0.21f, 0.4f, 0.3f, 0.6f);
        b.curveTo(18.7f, 12.36f, 17.67f, 15.66f, 15.0f, 17.2f);
        b.close();
        b.moveTo(12.0f, 10.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        b.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        b.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        b.reflectiveCurveTo(10.9f, 10.0f, 12.0f, 10.0f);
        b.moveTo(12.0f, 8.0f);
        b.curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        b.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        b.reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 14.21f, 8.0f, 12.0f, 8.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _storm = build;
        build.getClass();
        return build;
    }
}
