package androidx.compose.material.icons.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.bv;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ElderlyWomanKt {
    private static ImageVector _elderlyWoman;

    public static final ImageVector getElderlyWoman(Icons.Sharp sharp) {
        ImageVector imageVector = _elderlyWoman;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ElderlyWoman", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.5f, 11.0f);
        b.curveToRelative(-1.56f, 0.0f, -2.92f, -0.9f, -3.58f, -2.21f);
        b.lineToRelative(-0.79f, -1.67f);
        b.lineToRelative(0.0f, 0.0f);
        b.curveTo(14.12f, 7.1f, 13.63f, 6.0f, 12.34f, 6.0f);
        b.lineToRelative(0.0f, 0.0f);
        b.curveTo(8.72f, 6.0f, 6.0f, 16.69f, 6.0f, 19.0f);
        b.horizontalLineToRelative(2.5f);
        b.lineToRelative(-2.1f, 2.8f);
        b.lineTo(8.0f, 23.0f);
        r6.q(b, 3.0f, -4.0f, 2.0f, 4.0f);
        bv.C(b, 2.0f, -4.03f, 13.0f, 13.0f);
        b.lineToRelative(0.49f, -2.71f);
        b.curveToRelative(0.81f, 1.23f, 2.05f, 2.14f, 3.51f, 2.52f);
        kf0.z(b, 0.69f, 1.0f, -1.0f);
        b.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        b.reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f);
        uf.z(b, 23.0f, 1.0f, 12.5f);
        b.curveTo(20.0f, 11.67f, 19.33f, 11.0f, 18.5f, 11.0f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(11.6f, 2.91f);
        b2.curveToRelative(-0.06f, 0.19f, -0.1f, 0.38f, -0.1f, 0.59f);
        b2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b2.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        b2.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        b2.curveToRelative(-0.21f, 0.0f, -0.4f, 0.04f, -0.59f, 0.1f);
        b2.curveTo(12.76f, 1.25f, 12.41f, 1.0f, 12.0f, 1.0f);
        b2.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b2.curveTo(11.0f, 2.41f, 11.25f, 2.76f, 11.6f, 2.91f);
        b2.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _elderlyWoman = build;
        build.getClass();
        return build;
    }
}
