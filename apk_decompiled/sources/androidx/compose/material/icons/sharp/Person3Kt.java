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
public final class Person3Kt {
    private static ImageVector _person3;

    public static final ImageVector getPerson3(Icons.Sharp sharp) {
        ImageVector imageVector = _person3;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Person3", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        PathBuilder b2 = uf.b(10.0f, 12.0f);
        b2.curveToRelative(0.17f, 0.0f, 3.83f, 0.0f, 4.0f, 0.0f);
        b2.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        b2.curveToRelative(0.0f, -0.73f, -0.27f, -1.4f, -0.71f, -1.92f);
        b2.curveTo(16.42f, 6.75f, 16.5f, 6.38f, 16.5f, 6.0f);
        b2.curveToRelative(0.0f, -1.25f, -0.77f, -2.32f, -1.86f, -2.77f);
        b2.curveTo(14.0f, 2.48f, 13.06f, 2.0f, 12.0f, 2.0f);
        b2.reflectiveCurveToRelative(-2.0f, 0.48f, -2.64f, 1.23f);
        b2.curveTo(8.27f, 3.68f, 7.5f, 4.75f, 7.5f, 6.0f);
        b2.curveToRelative(0.0f, 0.38f, 0.08f, 0.75f, 0.21f, 1.08f);
        b2.curveTo(7.27f, 7.6f, 7.0f, 8.27f, 7.0f, 9.0f);
        b2.curveTo(7.0f, 10.66f, 8.34f, 12.0f, 10.0f, 12.0f);
        b2.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _person3 = build;
        build.getClass();
        return build;
    }
}
