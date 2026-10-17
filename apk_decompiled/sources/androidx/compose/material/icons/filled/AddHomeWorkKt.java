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
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AddHomeWorkKt {
    private static ImageVector _addHomeWork;

    public static final ImageVector getAddHomeWork(Icons.Filled filled) {
        ImageVector imageVector = _addHomeWork;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.AddHomeWork", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder j = af0.j(15.0f, 11.68f, 11.0f, 8.0f, 6.0f);
        r6.A(j, -7.0f, 5.0f, 10.0f, 5.0f);
        r6.D(j, -6.0f, 4.0f, 6.0f, 1.68f);
        j.curveTo(11.25f, 20.09f, 11.0f, 19.08f, 11.0f, 18.0f);
        j.curveTo(11.0f, 15.21f, 12.64f, 12.81f, 15.0f, 11.68f);
        j.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, j.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder f = j50.f(23.0f, 13.11f, 3.0f, 10.0f, 1.97f);
        f.lineToRelative(7.0f, 5.0f);
        f.verticalLineToRelative(1.11f);
        f.curveToRelative(0.33f, -0.05f, 0.66f, -0.08f, 1.0f, -0.08f);
        f.curveTo(19.96f, 11.0f, 21.73f, 11.81f, 23.0f, 13.11f);
        r6.B(f, 17.0f, 7.0f, 2.0f, 2.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(f, -2.0f, 7.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(23.0f, 18.0f);
        b.curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        b.reflectiveCurveToRelative(-5.0f, 2.24f, -5.0f, 5.0f);
        b.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        b.reflectiveCurveTo(23.0f, 20.76f, 23.0f, 18.0f);
        af0.A(b, 17.5f, 21.0f, -2.5f, 15.0f);
        k4.l(b, -1.0f, 2.5f, 15.0f, 1.0f);
        af0.B(b, 2.5f, 21.0f, 1.0f, -2.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.e(b, 21.0f, 17.5f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addHomeWork = build;
        build.getClass();
        return build;
    }
}
