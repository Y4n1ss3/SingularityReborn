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
import defpackage.bv;
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VapeFreeKt {
    private static ImageVector _vapeFree;

    public static final ImageVector getVapeFree(Icons.TwoTone twoTone) {
        ImageVector imageVector = _vapeFree;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.VapeFree", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = af0.b(10.5f, 17.5f, -0.5f, 0.0f);
        b.arcToRelative(0.5f, 0.5f, 0.0f, true, true, 1.0f, 0.0f);
        b.arcToRelative(0.5f, 0.5f, 0.0f, true, true, -1.0f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(2.0f, 16.5f, 1.0f);
        a.curveToRelative(1.33f, 0.0f, 2.71f, -0.18f, 4.0f, -0.5f);
        a.verticalLineToRelative(3.0f);
        a.curveToRelative(-1.29f, -0.32f, -2.67f, -0.5f, -4.0f, -0.5f);
        bv.s(a, 2.0f, 16.5f, 16.17f, 19.0f);
        af0.u(a, 8.0f, -3.0f, 5.17f);
        a.lineTo(1.39f, 4.22f);
        a.lineToRelative(1.41f, -1.41f);
        a.lineToRelative(18.38f, 18.38f);
        gy.B(a, -1.41f, 1.41f, 16.17f, 19.0f);
        k4.A(a, 18.83f, 16.0f, 22.0f, 3.0f);
        gy.n(a, -0.17f, 18.83f, 16.0f);
        a.moveTo(11.0f, 17.5f);
        a.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        a.reflectiveCurveTo(10.0f, 17.22f, 10.0f, 17.5f);
        a.curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        a.reflectiveCurveTo(11.0f, 17.78f, 11.0f, 17.5f);
        fc.A(a, 22.0f, 12.76f, 15.0f, -1.5f);
        a.verticalLineToRelative(-2.23f);
        a.curveToRelative(0.0f, -2.24f, -1.76f, -4.07f, -4.0f, -4.07f);
        a.verticalLineTo(7.2f);
        a.curveToRelative(1.02f, 0.0f, 1.85f, -0.83f, 1.85f, -1.85f);
        a.reflectiveCurveTo(17.52f, 3.5f, 16.5f, 3.5f);
        a.verticalLineTo(2.0f);
        a.curveToRelative(1.85f, 0.0f, 3.35f, 1.5f, 3.35f, 3.35f);
        a.curveToRelative(0.0f, 0.93f, -0.38f, 1.77f, -1.0f, 2.38f);
        a.curveTo(20.72f, 8.62f, 22.0f, 10.54f, 22.0f, 12.76f);
        a.close();
        a.moveTo(11.15f, 8.32f);
        a.curveToRelative(0.0f, -0.01f, 0.0f, -0.01f, 0.0f, -0.02f);
        a.curveToRelative(0.0f, -1.85f, 1.5f, -3.35f, 3.35f, -3.35f);
        a.verticalLineToRelative(1.5f);
        a.curveToRelative(-1.02f, 0.0f, -1.85f, 0.73f, -1.85f, 1.75f);
        a.reflectiveCurveToRelative(0.83f, 2.0f, 1.85f, 2.0f);
        a.horizontalLineToRelative(1.53f);
        a.curveToRelative(1.87f, 0.0f, 3.47f, 1.35f, 3.47f, 3.16f);
        r6.v(a, 15.0f, 18.0f, -1.3f);
        a.curveToRelative(0.0f, -1.31f, -0.92f, -2.05f, -1.97f, -2.05f);
        a.horizontalLineTo(14.5f);
        a.curveToRelative(-0.01f, 0.0f, -0.01f, 0.0f, -0.02f, 0.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(a, 11.15f, 8.32f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _vapeFree = build;
        build.getClass();
        return build;
    }
}
