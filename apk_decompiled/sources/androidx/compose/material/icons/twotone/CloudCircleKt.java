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
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CloudCircleKt {
    private static ImageVector _cloudCircle;

    public static final ImageVector getCloudCircle(Icons.TwoTone twoTone) {
        ImageVector imageVector = _cloudCircle;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.CloudCircle", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 4.0f);
        b.curveToRelative(-4.41f, 0.0f, -8.0f, 3.59f, -8.0f, 8.0f);
        b.reflectiveCurveToRelative(3.59f, 8.0f, 8.0f, 8.0f);
        b.reflectiveCurveToRelative(8.0f, -3.59f, 8.0f, -8.0f);
        b.reflectiveCurveToRelative(-3.59f, -8.0f, -8.0f, -8.0f);
        k4.r(b, 16.08f, 16.0f, 8.5f, 16.0f);
        b.curveTo(6.57f, 16.0f, 5.0f, 14.43f, 5.0f, 12.5f);
        b.curveToRelative(0.0f, -1.8f, 1.36f, -3.29f, 3.12f, -3.48f);
        b.curveToRelative(0.73f, -1.4f, 2.19f, -2.36f, 3.88f, -2.36f);
        b.curveToRelative(2.12f, 0.0f, 3.89f, 1.51f, 4.29f, 3.52f);
        b.curveToRelative(1.52f, 0.1f, 2.71f, 1.35f, 2.71f, 2.89f);
        b.curveToRelative(0.0f, 1.62f, -1.31f, 2.93f, -2.92f, 2.93f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(12.0f, 2.0f);
        b2.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b2.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        b2.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        b2.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        b2.close();
        b2.moveTo(12.0f, 20.0f);
        b2.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        b2.reflectiveCurveToRelative(3.59f, -8.0f, 8.0f, -8.0f);
        b2.reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f);
        b2.reflectiveCurveToRelative(-3.59f, 8.0f, -8.0f, 8.0f);
        b2.close();
        b2.moveTo(16.29f, 10.19f);
        b2.curveToRelative(-0.4f, -2.01f, -2.16f, -3.52f, -4.29f, -3.52f);
        b2.curveToRelative(-1.69f, 0.0f, -3.15f, 0.96f, -3.88f, 2.36f);
        b2.curveTo(6.36f, 9.21f, 5.0f, 10.7f, 5.0f, 12.5f);
        b2.curveTo(5.0f, 14.43f, 6.57f, 16.0f, 8.5f, 16.0f);
        b2.horizontalLineToRelative(7.58f);
        b2.curveToRelative(1.61f, 0.0f, 2.92f, -1.31f, 2.92f, -2.92f);
        b2.curveToRelative(0.0f, -1.54f, -1.2f, -2.79f, -2.71f, -2.89f);
        k4.r(b2, 16.0f, 14.0f, 8.5f, 14.0f);
        b2.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        b2.reflectiveCurveTo(7.67f, 11.0f, 8.5f, 11.0f);
        b2.horizontalLineToRelative(0.9f);
        b2.lineToRelative(0.49f, -1.05f);
        b2.curveToRelative(0.41f, -0.79f, 1.22f, -1.28f, 2.11f, -1.28f);
        b2.curveToRelative(1.13f, 0.0f, 2.11f, 0.8f, 2.33f, 1.91f);
        b2.lineToRelative(0.28f, 1.42f);
        b2.lineTo(16.0f, 12.0f);
        b2.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(b2, -0.45f, 1.0f, -1.0f, 1.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cloudCircle = build;
        build.getClass();
        return build;
    }
}
