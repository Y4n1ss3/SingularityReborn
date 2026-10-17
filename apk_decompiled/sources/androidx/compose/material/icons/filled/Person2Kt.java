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
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Person2Kt {
    private static ImageVector _person2;

    public static final ImageVector getPerson2(Icons.Filled filled) {
        ImageVector imageVector = _person2;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Person2", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        PathBuilder a = af0.a(9.78f, 12.0f, 4.44f);
        a.curveToRelative(1.21f, 0.0f, 2.14f, -1.06f, 1.98f, -2.26f);
        a.lineToRelative(-0.32f, -2.45f);
        a.curveTo(15.57f, 5.39f, 13.92f, 4.0f, 12.0f, 4.0f);
        a.reflectiveCurveTo(8.43f, 5.39f, 8.12f, 7.29f);
        a.lineTo(7.8f, 9.74f);
        a.curveTo(7.64f, 10.94f, 8.57f, 12.0f, 9.78f, 12.0f);
        a.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, a.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _person2 = build;
        build.getClass();
        return build;
    }
}
