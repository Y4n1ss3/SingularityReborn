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
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PinDropKt {
    private static ImageVector _pinDrop;

    public static final ImageVector getPinDrop(Icons.TwoTone twoTone) {
        ImageVector imageVector = _pinDrop;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.PinDrop", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 3.0f);
        b.curveTo(9.19f, 3.0f, 6.0f, 5.11f, 6.0f, 9.13f);
        b.curveToRelative(0.0f, 2.68f, 2.0f, 5.49f, 6.0f, 8.44f);
        b.curveToRelative(4.0f, -2.95f, 6.0f, -5.77f, 6.0f, -8.44f);
        b.curveTo(18.0f, 5.11f, 14.81f, 3.0f, 12.0f, 3.0f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(12.0f, 4.0f);
        b2.curveToRelative(1.93f, 0.0f, 5.0f, 1.4f, 5.0f, 5.15f);
        b2.curveToRelative(0.0f, 2.16f, -1.72f, 4.67f, -5.0f, 7.32f);
        b2.curveToRelative(-3.28f, -2.65f, -5.0f, -5.17f, -5.0f, -7.32f);
        b2.curveTo(7.0f, 5.4f, 10.07f, 4.0f, 12.0f, 4.0f);
        b2.moveTo(12.0f, 2.0f);
        b2.curveTo(8.73f, 2.0f, 5.0f, 4.46f, 5.0f, 9.15f);
        b2.curveToRelative(0.0f, 3.12f, 2.33f, 6.41f, 7.0f, 9.85f);
        b2.curveToRelative(4.67f, -3.44f, 7.0f, -6.73f, 7.0f, -9.85f);
        b2.curveTo(19.0f, 4.46f, 15.27f, 2.0f, 12.0f, 2.0f);
        b2.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b3 = uf.b(12.0f, 7.0f);
        b3.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        b3.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        b3.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        b3.reflectiveCurveTo(13.1f, 7.0f, 12.0f, 7.0f);
        r6.B(b3, 5.0f, 20.0f, 14.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.o(b3, 5.0f, 20.0f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pinDrop = build;
        build.getClass();
        return build;
    }
}
