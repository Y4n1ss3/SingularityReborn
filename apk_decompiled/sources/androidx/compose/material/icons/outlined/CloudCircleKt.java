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
import defpackage.k4;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CloudCircleKt {
    private static ImageVector _cloudCircle;

    public static final ImageVector getCloudCircle(Icons.Outlined outlined) {
        ImageVector imageVector = _cloudCircle;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.CloudCircle", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        b.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        b.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        b.close();
        b.moveTo(12.0f, 20.0f);
        b.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        b.reflectiveCurveToRelative(3.59f, -8.0f, 8.0f, -8.0f);
        b.reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f);
        b.reflectiveCurveToRelative(-3.59f, 8.0f, -8.0f, 8.0f);
        b.close();
        b.moveTo(16.29f, 10.19f);
        b.curveToRelative(-0.4f, -2.01f, -2.16f, -3.52f, -4.29f, -3.52f);
        b.curveToRelative(-1.69f, 0.0f, -3.15f, 0.96f, -3.88f, 2.36f);
        b.curveTo(6.36f, 9.21f, 5.0f, 10.7f, 5.0f, 12.5f);
        b.curveTo(5.0f, 14.43f, 6.57f, 16.0f, 8.5f, 16.0f);
        b.horizontalLineToRelative(7.58f);
        b.curveToRelative(1.61f, 0.0f, 2.92f, -1.31f, 2.92f, -2.92f);
        b.curveToRelative(0.0f, -1.54f, -1.2f, -2.79f, -2.71f, -2.89f);
        k4.r(b, 16.0f, 14.0f, 8.5f, 14.0f);
        b.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        b.reflectiveCurveTo(7.67f, 11.0f, 8.5f, 11.0f);
        b.horizontalLineToRelative(0.9f);
        b.lineToRelative(0.49f, -1.05f);
        b.curveToRelative(0.41f, -0.79f, 1.22f, -1.28f, 2.11f, -1.28f);
        b.curveToRelative(1.13f, 0.0f, 2.11f, 0.8f, 2.33f, 1.91f);
        b.lineToRelative(0.28f, 1.42f);
        b.lineTo(16.0f, 12.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(b, -0.45f, 1.0f, -1.0f, 1.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cloudCircle = build;
        build.getClass();
        return build;
    }
}
