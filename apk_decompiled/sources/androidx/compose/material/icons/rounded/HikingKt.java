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
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HikingKt {
    private static ImageVector _hiking;

    public static final ImageVector getHiking(Icons.Rounded rounded) {
        ImageVector imageVector = _hiking;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Hiking", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(13.5f, 5.5f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        b.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        b.reflectiveCurveTo(12.4f, 5.5f, 13.5f, 5.5f);
        b.close();
        b.moveTo(18.25f, 9.0f);
        b.curveToRelative(-0.41f, 0.0f, -0.75f, 0.34f, -0.75f, 0.75f);
        b.lineToRelative(0.0f, 1.03f);
        b.curveToRelative(-1.23f, -0.37f, -2.22f, -1.17f, -2.8f, -2.18f);
        b.lineToRelative(-1.0f, -1.6f);
        b.curveToRelative(-0.41f, -0.65f, -1.11f, -1.0f, -1.84f, -1.0f);
        b.curveToRelative(-0.78f, 0.0f, -1.59f, 0.5f, -1.78f, 1.44f);
        b.lineTo(7.25f, 21.76f);
        b.curveTo(7.12f, 22.4f, 7.61f, 23.0f, 8.27f, 23.0f);
        b.curveToRelative(0.49f, 0.0f, 0.91f, -0.34f, 1.02f, -0.81f);
        b.lineTo(10.9f, 15.0f);
        b.lineToRelative(2.1f, 2.0f);
        b.verticalLineToRelative(5.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineToRelative(-5.64f);
        b.curveToRelative(0.0f, -0.55f, -0.22f, -1.07f, -0.62f, -1.45f);
        b.lineTo(12.9f, 13.5f);
        b.lineToRelative(0.6f, -3.0f);
        b.curveToRelative(1.0f, 1.15f, 2.41f, 2.01f, 4.0f, 2.34f);
        b.verticalLineToRelative(9.41f);
        b.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        b.reflectiveCurveTo(19.0f, 22.66f, 19.0f, 22.25f);
        b.verticalLineTo(9.75f);
        b.curveTo(19.0f, 9.34f, 18.66f, 9.0f, 18.25f, 9.0f);
        k4.x(b, 7.43f, 13.13f, -2.12f, -0.41f);
        b.curveToRelative(-0.54f, -0.11f, -0.9f, -0.63f, -0.79f, -1.17f);
        b.lineToRelative(0.76f, -3.93f);
        b.curveToRelative(0.21f, -1.08f, 1.26f, -1.79f, 2.34f, -1.58f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(b, 1.16f, 0.23f, 7.43f, 13.13f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hiking = build;
        build.getClass();
        return build;
    }
}
