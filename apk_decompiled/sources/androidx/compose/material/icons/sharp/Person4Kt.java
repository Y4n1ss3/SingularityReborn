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
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Person4Kt {
    private static ImageVector _person4;

    public static final ImageVector getPerson4(Icons.Sharp sharp) {
        ImageVector imageVector = _person4;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Person4", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.39f, 14.56f);
        b.curveTo(16.71f, 13.7f, 14.53f, 13.0f, 12.0f, 13.0f);
        b.curveToRelative(-2.53f, 0.0f, -4.71f, 0.7f, -6.39f, 1.56f);
        b.curveTo(4.61f, 15.07f, 4.0f, 16.1f, 4.0f, 17.22f);
        kf0.r(b, 20.0f, 16.0f, -2.78f);
        b.curveTo(20.0f, 16.1f, 19.39f, 15.07f, 18.39f, 14.56f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(12.0f, 12.0f);
        b2.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        b2.curveToRelative(0.0f, -1.37f, 0.0f, -3.5f, 0.0f, -3.5f);
        b2.curveTo(16.0f, 3.67f, 15.33f, 3.0f, 14.5f, 3.0f);
        b2.curveToRelative(-0.52f, 0.0f, -0.98f, 0.27f, -1.25f, 0.67f);
        b2.curveTo(12.98f, 3.27f, 12.52f, 3.0f, 12.0f, 3.0f);
        b2.reflectiveCurveToRelative(-0.98f, 0.27f, -1.25f, 0.67f);
        b2.curveTo(10.48f, 3.27f, 10.02f, 3.0f, 9.5f, 3.0f);
        b2.curveTo(8.67f, 3.0f, 8.0f, 3.67f, 8.0f, 4.5f);
        b2.curveToRelative(0.0f, 0.0f, 0.0f, 2.12f, 0.0f, 3.5f);
        b2.curveTo(8.0f, 10.21f, 9.79f, 12.0f, 12.0f, 12.0f);
        b2.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _person4 = build;
        build.getClass();
        return build;
    }
}
