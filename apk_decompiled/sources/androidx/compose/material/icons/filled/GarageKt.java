package androidx.compose.material.icons.filled;

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
import defpackage.fc;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GarageKt {
    private static ImageVector _garage;

    public static final ImageVector getGarage(Icons.Filled filled) {
        ImageVector imageVector = _garage;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Garage", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = af0.b(15.0f, 13.0f, -1.0f, 0.0f);
        b.arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f);
        b.arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = af0.b(9.0f, 13.0f, -1.0f, 0.0f);
        b2.arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f);
        b2.arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(k4.e(8.33f, 7.5f, -0.66f, 2.0f), 8.66f, 0.0f, -0.66f, -2.0f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m4787getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, companion2.m5135getButtKaPHkGw(), companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(20.0f, 2.0f, 4.0f);
        d.curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f);
        d.verticalLineToRelative(16.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(16.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineTo(4.0f);
        d.curveTo(22.0f, 2.9f, 21.1f, 2.0f, 20.0f, 2.0f);
        d.close();
        d.moveTo(19.0f, 17.69f);
        d.curveToRelative(0.0f, 0.45f, -0.35f, 0.81f, -0.78f, 0.81f);
        d.horizontalLineToRelative(-0.44f);
        d.curveToRelative(-0.44f, 0.0f, -0.78f, -0.36f, -0.78f, -0.81f);
        r6.v(d, 16.5f, 7.0f, 1.19f);
        d.curveToRelative(0.0f, 0.45f, -0.35f, 0.81f, -0.78f, 0.81f);
        d.horizontalLineTo(5.78f);
        d.curveTo(5.35f, 18.5f, 5.0f, 18.14f, 5.0f, 17.69f);
        d.verticalLineToRelative(-6.5f);
        d.curveTo(5.82f, 8.72f, 6.34f, 7.16f, 6.56f, 6.5f);
        d.curveToRelative(0.05f, -0.16f, 0.12f, -0.29f, 0.19f, -0.4f);
        d.curveTo(6.77f, 6.08f, 6.78f, 6.06f, 6.8f, 6.04f);
        d.curveTo(7.18f, 5.51f, 7.72f, 5.5f, 7.72f, 5.5f);
        d.horizontalLineToRelative(8.56f);
        d.curveToRelative(0.0f, 0.0f, 0.54f, 0.01f, 0.92f, 0.53f);
        d.curveToRelative(0.02f, 0.03f, 0.03f, 0.05f, 0.05f, 0.07f);
        d.curveToRelative(0.07f, 0.11f, 0.14f, 0.24f, 0.19f, 0.4f);
        d.curveToRelative(0.22f, 0.66f, 0.74f, 2.23f, 1.56f, 4.69f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(d, 17.69f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _garage = build;
        build.getClass();
        return build;
    }
}
