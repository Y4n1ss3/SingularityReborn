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
import defpackage.af0;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class OpacityKt {
    private static ImageVector _opacity;

    public static final ImageVector getOpacity(Icons.TwoTone twoTone) {
        ImageVector imageVector = _opacity;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Opacity", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(16.24f, 9.65f, 12.0f, 5.27f);
        i.lineTo(7.76f, 9.6f);
        i.curveTo(6.62f, 10.73f, 6.01f, 12.0f, 6.0f, 14.0f);
        i.horizontalLineToRelative(12.0f);
        i.curveToRelative(-0.01f, -2.0f, -0.62f, -3.23f, -1.76f, -4.35f);
        i.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i2 = af0.i(17.66f, 8.0f, 12.0f, 2.35f);
        i2.lineTo(6.34f, 8.0f);
        i2.curveTo(4.78f, 9.56f, 4.0f, 11.64f, 4.0f, 13.64f);
        i2.reflectiveCurveToRelative(0.78f, 4.11f, 2.34f, 5.67f);
        i2.reflectiveCurveToRelative(3.61f, 2.35f, 5.66f, 2.35f);
        i2.reflectiveCurveToRelative(4.1f, -0.79f, 5.66f, -2.35f);
        i2.reflectiveCurveTo(20.0f, 15.64f, 20.0f, 13.64f);
        i2.reflectiveCurveTo(19.22f, 9.56f, 17.66f, 8.0f);
        i2.close();
        i2.moveTo(6.0f, 14.0f);
        i2.curveToRelative(0.01f, -2.0f, 0.62f, -3.27f, 1.76f, -4.4f);
        i2.lineTo(12.0f, 5.27f);
        i2.lineToRelative(4.24f, 4.38f);
        i2.curveTo(17.38f, 10.77f, 17.99f, 12.0f, 18.0f, 14.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.h(i2, 6.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _opacity = build;
        build.getClass();
        return build;
    }
}
