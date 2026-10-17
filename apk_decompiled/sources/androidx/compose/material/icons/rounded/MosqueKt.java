package androidx.compose.material.icons.rounded;

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
import defpackage.gy;
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MosqueKt {
    private static ImageVector _mosque;

    public static final ImageVector getMosque(Icons.Rounded rounded) {
        ImageVector imageVector = _mosque;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Mosque", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(7.0f, 8.0f, 10.0f);
        a.curveToRelative(0.29f, 0.0f, 0.57f, 0.06f, 0.84f, 0.13f);
        a.curveTo(17.93f, 7.8f, 18.0f, 7.46f, 18.0f, 7.09f);
        a.curveToRelative(0.0f, -1.31f, -0.65f, -2.53f, -1.74f, -3.25f);
        a.lineTo(12.0f, 1.0f);
        a.lineTo(7.74f, 3.84f);
        a.curveTo(6.65f, 4.56f, 6.0f, 5.78f, 6.0f, 7.09f);
        a.curveTo(6.0f, 7.46f, 6.07f, 7.8f, 6.16f, 8.13f);
        a.curveTo(6.43f, 8.06f, 6.71f, 8.0f, 7.0f, 8.0f);
        a.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, a.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(24.0f, 7.0f);
        b.curveToRelative(0.0f, -1.1f, -2.0f, -3.0f, -2.0f, -3.0f);
        b.reflectiveCurveToRelative(-2.0f, 1.9f, -2.0f, 3.0f);
        b.curveToRelative(0.0f, 0.74f, 0.4f, 1.38f, 1.0f, 1.72f);
        kf0.r(b, 13.0f, -2.0f, -2.0f);
        b.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        b.horizontalLineTo(7.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        gy.i(b, 2.0f, 3.0f, 8.72f);
        b.curveTo(3.6f, 8.38f, 4.0f, 7.74f, 4.0f, 7.0f);
        b.curveToRelative(0.0f, -1.1f, -2.0f, -3.0f, -2.0f, -3.0f);
        b.reflectiveCurveTo(0.0f, 5.9f, 0.0f, 7.0f);
        b.curveToRelative(0.0f, 0.74f, 0.4f, 1.38f, 1.0f, 1.72f);
        kf0.r(b, 21.0f, 9.0f, -4.0f);
        b.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        b.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        bv.x(b, 4.0f, 9.0f, 8.72f);
        b.curveTo(23.6f, 8.38f, 24.0f, 7.74f, 24.0f, 7.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _mosque = build;
        build.getClass();
        return build;
    }
}
