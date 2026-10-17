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
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HomeMiniKt {
    private static ImageVector _homeMini;

    public static final ImageVector getHomeMini(Icons.TwoTone twoTone) {
        ImageVector imageVector = _homeMini;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.HomeMini", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 7.0f);
        b.curveToRelative(-7.91f, 0.0f, -8.0f, 4.8f, -8.0f, 5.0f);
        b.horizontalLineToRelative(16.0f);
        b.curveTo(19.99f, 11.51f, 19.64f, 7.0f, 12.0f, 7.0f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(9.14f, 17.0f, 5.72f);
        a.curveToRelative(2.1f, 0.0f, 3.92f, -1.24f, 4.71f, -3.0f);
        a.horizontalLineTo(4.42f);
        a.curveTo(5.22f, 15.76f, 7.04f, 17.0f, 9.14f, 17.0f);
        a.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, a.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(12.0f, 5.0f);
        b2.curveTo(4.19f, 5.0f, 2.0f, 9.48f, 2.0f, 12.0f);
        b2.curveToRelative(0.0f, 3.86f, 3.13f, 7.0f, 6.99f, 7.0f);
        b2.horizontalLineToRelative(6.02f);
        b2.curveToRelative(2.69f, 0.0f, 6.99f, -2.08f, 6.99f, -7.0f);
        b2.curveTo(22.0f, 12.0f, 22.0f, 5.0f, 12.0f, 5.0f);
        r6.g(b2, 14.86f, 17.0f, 9.14f);
        b2.curveToRelative(-2.1f, 0.0f, -3.92f, -1.24f, -4.71f, -3.0f);
        b2.horizontalLineToRelative(15.15f);
        b2.curveTo(18.78f, 15.76f, 16.96f, 17.0f, 14.86f, 17.0f);
        b2.close();
        b2.moveTo(4.0f, 12.0f);
        b2.curveToRelative(0.0f, -0.2f, 0.09f, -5.0f, 8.0f, -5.0f);
        b2.curveToRelative(7.64f, 0.0f, 7.99f, 4.51f, 8.0f, 5.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.h(b2, 4.0f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _homeMini = build;
        build.getClass();
        return build;
    }
}
