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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Brightness2Kt {
    private static ImageVector _brightness2;

    public static final ImageVector getBrightness2(Icons.TwoTone twoTone) {
        ImageVector imageVector = _brightness2;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Brightness2", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.0f, 12.0f);
        b.curveToRelative(0.0f, -4.41f, -3.59f, -8.0f, -8.0f, -8.0f);
        b.curveToRelative(-0.34f, 0.0f, -0.68f, 0.02f, -1.01f, 0.07f);
        b.curveTo(10.9f, 6.23f, 12.0f, 9.05f, 12.0f, 12.0f);
        b.curveToRelative(0.0f, 2.95f, -1.1f, 5.77f, -3.01f, 7.93f);
        b.curveToRelative(0.33f, 0.05f, 0.67f, 0.07f, 1.01f, 0.07f);
        b.curveToRelative(4.41f, 0.0f, 8.0f, -3.59f, 8.0f, -8.0f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(5.0f, 20.65f);
        b2.curveTo(6.47f, 21.5f, 8.18f, 22.0f, 10.0f, 22.0f);
        b2.curveToRelative(5.52f, 0.0f, 10.0f, -4.48f, 10.0f, -10.0f);
        b2.reflectiveCurveTo(15.52f, 2.0f, 10.0f, 2.0f);
        b2.curveToRelative(-1.82f, 0.0f, -3.53f, 0.5f, -5.0f, 1.35f);
        b2.curveTo(7.99f, 5.08f, 10.0f, 8.3f, 10.0f, 12.0f);
        b2.reflectiveCurveToRelative(-2.01f, 6.92f, -5.0f, 8.65f);
        b2.close();
        b2.moveTo(12.0f, 12.0f);
        b2.curveToRelative(0.0f, -2.95f, -1.1f, -5.77f, -3.01f, -7.93f);
        b2.curveTo(9.32f, 4.02f, 9.66f, 4.0f, 10.0f, 4.0f);
        b2.curveToRelative(4.41f, 0.0f, 8.0f, 3.59f, 8.0f, 8.0f);
        b2.reflectiveCurveToRelative(-3.59f, 8.0f, -8.0f, 8.0f);
        b2.curveToRelative(-0.34f, 0.0f, -0.68f, -0.02f, -1.01f, -0.07f);
        b2.curveTo(10.9f, 17.77f, 12.0f, 14.95f, 12.0f, 12.0f);
        b2.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _brightness2 = build;
        build.getClass();
        return build;
    }
}
