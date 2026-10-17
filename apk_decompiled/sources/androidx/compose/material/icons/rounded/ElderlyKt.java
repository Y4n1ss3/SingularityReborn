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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ElderlyKt {
    private static ImageVector _elderly;

    public static final ImageVector getElderly(Icons.Rounded rounded) {
        ImageVector imageVector = _elderly;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Elderly", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(11.5f, 3.5f);
        b.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        b.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        b.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        b.reflectiveCurveTo(11.5f, 4.6f, 11.5f, 3.5f);
        b.close();
        b.moveTo(18.53f, 11.0f);
        b.curveToRelative(-1.57f, 0.01f, -2.94f, -0.9f, -3.6f, -2.21f);
        b.lineToRelative(-0.79f, -1.67f);
        b.lineToRelative(0.0f, 0.0f);
        b.curveToRelative(-0.17f, -0.35f, -0.44f, -0.65f, -0.8f, -0.85f);
        b.curveToRelative(-0.62f, -0.36f, -1.35f, -0.34f, -1.94f, -0.03f);
        b.lineToRelative(0.0f, -0.01f);
        b.lineTo(7.01f, 8.73f);
        b.curveTo(6.39f, 9.08f, 6.0f, 9.74f, 6.0f, 10.46f);
        b.verticalLineTo(13.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(0.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineToRelative(-2.54f);
        b.lineToRelative(1.5f, -0.85f);
        b.curveTo(9.18f, 10.71f, 9.0f, 11.85f, 9.0f, 13.0f);
        b.verticalLineToRelative(5.33f);
        b.lineTo(7.0f, 21.0f);
        b.curveToRelative(-0.33f, 0.44f, -0.24f, 1.07f, 0.2f, 1.4f);
        b.curveToRelative(0.44f, 0.33f, 1.07f, 0.24f, 1.4f, -0.2f);
        b.lineToRelative(2.04f, -2.72f);
        b.curveToRelative(0.23f, -0.31f, 0.37f, -0.69f, 0.4f, -1.08f);
        b.lineToRelative(0.18f, -2.94f);
        b.lineTo(13.0f, 18.0f);
        b.verticalLineToRelative(4.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(0.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineToRelative(-4.87f);
        b.curveToRelative(0.0f, -0.41f, -0.13f, -0.81f, -0.36f, -1.15f);
        b.lineToRelative(-1.6f, -2.29f);
        b.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.01f);
        b.curveToRelative(-0.11f, -1.16f, 0.07f, -2.32f, 0.46f, -3.4f);
        b.curveToRelative(0.81f, 1.23f, 2.05f, 2.14f, 3.51f, 2.52f);
        b.verticalLineToRelative(0.03f);
        b.verticalLineTo(13.0f);
        b.curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        b.reflectiveCurveTo(18.0f, 13.28f, 18.0f, 13.0f);
        b.verticalLineToRelative(-0.16f);
        b.verticalLineTo(12.5f);
        b.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        b.reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f);
        b.verticalLineToRelative(10.0f);
        b.curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        b.reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f);
        b.verticalLineToRelative(-10.0f);
        b.curveTo(20.0f, 11.68f, 19.34f, 10.99f, 18.53f, 11.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _elderly = build;
        build.getClass();
        return build;
    }
}
