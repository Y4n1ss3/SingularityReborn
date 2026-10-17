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
import defpackage.gy;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RadarKt {
    private static ImageVector _radar;

    public static final ImageVector getRadar(Icons.Outlined outlined) {
        ImageVector imageVector = _radar;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Radar", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(19.74f, 18.33f);
        b.curveTo(21.15f, 16.6f, 22.0f, 14.4f, 22.0f, 12.0f);
        b.curveToRelative(0.0f, -5.52f, -4.48f, -10.0f, -10.0f, -10.0f);
        b.reflectiveCurveTo(2.0f, 6.48f, 2.0f, 12.0f);
        b.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        b.curveToRelative(2.4f, 0.0f, 4.6f, -0.85f, 6.33f, -2.26f);
        b.curveToRelative(0.27f, -0.22f, 0.53f, -0.46f, 0.78f, -0.71f);
        b.curveToRelative(0.03f, -0.03f, 0.05f, -0.06f, 0.07f, -0.08f);
        b.curveTo(19.38f, 18.75f, 19.57f, 18.54f, 19.74f, 18.33f);
        b.close();
        b.moveTo(12.0f, 20.0f);
        b.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        b.reflectiveCurveToRelative(3.59f, -8.0f, 8.0f, -8.0f);
        b.reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f);
        b.curveToRelative(0.0f, 1.85f, -0.63f, 3.54f, -1.69f, 4.9f);
        b.lineToRelative(-1.43f, -1.43f);
        b.curveToRelative(0.69f, -0.98f, 1.1f, -2.17f, 1.1f, -3.46f);
        b.curveToRelative(0.0f, -3.31f, -2.69f, -6.0f, -6.0f, -6.0f);
        b.reflectiveCurveToRelative(-6.0f, 2.69f, -6.0f, 6.0f);
        b.reflectiveCurveToRelative(2.69f, 6.0f, 6.0f, 6.0f);
        b.curveToRelative(1.3f, 0.0f, 2.51f, -0.42f, 3.49f, -1.13f);
        b.lineToRelative(1.42f, 1.42f);
        b.curveTo(15.54f, 19.37f, 13.85f, 20.0f, 12.0f, 20.0f);
        b.close();
        b.moveTo(13.92f, 12.51f);
        b.curveToRelative(0.17f, -0.66f, 0.02f, -1.38f, -0.49f, -1.9f);
        b.lineToRelative(-0.02f, -0.02f);
        b.curveToRelative(-0.77f, -0.77f, -2.0f, -0.78f, -2.78f, -0.04f);
        b.curveToRelative(-0.01f, 0.01f, -0.03f, 0.02f, -0.05f, 0.04f);
        b.curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0.0f, 2.83f);
        b.lineToRelative(0.02f, 0.02f);
        b.curveToRelative(0.52f, 0.51f, 1.25f, 0.67f, 1.91f, 0.49f);
        b.lineToRelative(1.51f, 1.51f);
        b.curveToRelative(-0.6f, 0.36f, -1.29f, 0.58f, -2.04f, 0.58f);
        b.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        b.reflectiveCurveToRelative(1.79f, -4.0f, 4.0f, -4.0f);
        b.reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f);
        b.curveToRelative(0.0f, 0.73f, -0.21f, 1.41f, -0.56f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b, 13.92f, 12.51f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _radar = build;
        build.getClass();
        return build;
    }
}
