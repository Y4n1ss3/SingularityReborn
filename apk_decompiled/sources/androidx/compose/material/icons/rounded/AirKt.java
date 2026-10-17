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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AirKt {
    private static ImageVector _air;

    public static final ImageVector getAir(Icons.Rounded rounded) {
        ImageVector imageVector = _air;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Air", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(14.35f, 17.95f);
        b.curveToRelative(-0.28f, 0.89f, -1.01f, 1.62f, -1.9f, 1.9f);
        b.curveToRelative(-1.51f, 0.48f, -2.94f, -0.23f, -3.59f, -1.42f);
        b.curveTo(8.51f, 17.78f, 9.03f, 17.0f, 9.77f, 17.0f);
        b.horizontalLineToRelative(0.01f);
        b.curveToRelative(0.34f, 0.0f, 0.68f, 0.16f, 0.84f, 0.46f);
        b.curveToRelative(0.17f, 0.32f, 0.5f, 0.54f, 0.89f, 0.54f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        b.horizontalLineTo(3.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        b.verticalLineToRelative(0.0f);
        b.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        b.horizontalLineToRelative(8.5f);
        b.curveTo(13.46f, 14.0f, 15.0f, 15.9f, 14.35f, 17.95f);
        b.close();
        b.moveTo(18.91f, 5.67f);
        b.curveToRelative(-0.29f, -1.26f, -1.32f, -2.29f, -2.58f, -2.58f);
        b.curveToRelative(-1.76f, -0.4f, -3.37f, 0.53f, -4.02f, 1.98f);
        b.curveTo(12.0f, 5.74f, 12.48f, 6.5f, 13.21f, 6.5f);
        b.horizontalLineToRelative(0.0f);
        b.curveToRelative(0.39f, 0.0f, 0.75f, -0.22f, 0.9f, -0.57f);
        b.curveTo(14.34f, 5.38f, 14.87f, 5.0f, 15.5f, 5.0f);
        b.curveTo(16.33f, 5.0f, 17.0f, 5.67f, 17.0f, 6.5f);
        b.reflectiveCurveTo(16.33f, 8.0f, 15.5f, 8.0f);
        b.horizontalLineTo(3.0f);
        b.curveTo(2.45f, 8.0f, 2.0f, 8.45f, 2.0f, 9.0f);
        b.verticalLineToRelative(0.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(12.5f);
        b.curveTo(17.7f, 10.0f, 19.43f, 7.96f, 18.91f, 5.67f);
        k4.r(b, 18.4f, 11.0f, 3.0f, 11.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.verticalLineToRelative(0.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(15.5f);
        b.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        b.curveToRelative(0.0f, 0.63f, -0.38f, 1.16f, -0.93f, 1.39f);
        b.curveToRelative(-0.36f, 0.15f, -0.57f, 0.51f, -0.57f, 0.9f);
        b.verticalLineToRelative(0.0f);
        b.curveToRelative(0.0f, 0.73f, 0.76f, 1.21f, 1.43f, 0.91f);
        b.curveToRelative(1.43f, -0.64f, 2.35f, -2.21f, 2.0f, -3.93f);
        b.curveTo(21.59f, 12.13f, 20.07f, 11.0f, 18.4f, 11.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _air = build;
        build.getClass();
        return build;
    }
}
