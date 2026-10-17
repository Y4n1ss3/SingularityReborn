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
import defpackage.j50;
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ScaleKt {
    private static ImageVector _scale;

    public static final ImageVector getScale(Icons.TwoTone twoTone) {
        ImageVector imageVector = _scale;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Scale", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.87f, 4.0f);
        b.curveTo(17.5f, 5.19f, 15.0f, 6.12f, 12.0f, 6.12f);
        b.curveTo(9.0f, 6.12f, 6.5f, 5.19f, 5.13f, 4.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.h(b, 18.87f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(14.0f, 11.0f, 8.0f);
        d.curveToRelative(4.56f, -0.58f, 8.0f, -3.1f, 8.0f, -6.0f);
        d.horizontalLineTo(2.0f);
        d.curveToRelative(0.0f, 2.9f, 3.44f, 5.42f, 8.0f, 6.0f);
        d.lineToRelative(0.0f, 3.0f);
        d.curveToRelative(-3.68f, 0.73f, -8.0f, 3.61f, -8.0f, 11.0f);
        k4.k(d, 6.0f, -2.0f, 4.13f);
        d.curveToRelative(0.93f, -6.83f, 6.65f, -7.2f, 7.87f, -7.2f);
        d.reflectiveCurveToRelative(6.94f, 0.37f, 7.87f, 7.2f);
        af0.u(d, 16.0f, 2.0f, 6.0f);
        d.curveTo(22.0f, 14.61f, 17.68f, 11.73f, 14.0f, 11.0f);
        d.close();
        d.moveTo(18.87f, 4.0f);
        d.curveTo(17.5f, 5.19f, 15.0f, 6.12f, 12.0f, 6.12f);
        d.curveTo(9.0f, 6.12f, 6.5f, 5.19f, 5.13f, 4.0f);
        k4.w(d, 18.87f, 12.0f, 22.0f);
        d.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        d.curveToRelative(0.0f, -0.55f, 0.22f, -1.05f, 0.59f, -1.41f);
        d.curveTo(11.39f, 17.79f, 16.0f, 16.0f, 16.0f, 16.0f);
        d.reflectiveCurveToRelative(-1.79f, 4.61f, -2.59f, 5.41f);
        d.curveTo(13.05f, 21.78f, 12.55f, 22.0f, 12.0f, 22.0f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _scale = build;
        build.getClass();
        return build;
    }
}
