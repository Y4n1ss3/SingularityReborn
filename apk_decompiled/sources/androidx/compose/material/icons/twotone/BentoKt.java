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
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BentoKt {
    private static ImageVector _bento;

    public static final ImageVector getBento(Icons.TwoTone twoTone) {
        ImageVector imageVector = _bento;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Bento", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder v = uo.v(4.0f, 17.0f, 8.0f, 7.0f, 4.0f);
        bv.t(v, 17.0f, 8.0f, 10.5f);
        v.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        v.reflectiveCurveTo(8.83f, 13.5f, 8.0f, 13.5f);
        v.reflectiveCurveTo(6.5f, 12.83f, 6.5f, 12.0f);
        v.reflectiveCurveTo(7.17f, 10.5f, 8.0f, 10.5f);
        r6.B(v, 14.0f, 13.0f, 6.0f, 4.0f);
        uo.r(v, -6.0f, 13.0f, 20.0f, 7.0f);
        v.verticalLineToRelative(4.0f);
        v.horizontalLineToRelative(-6.0f);
        v.verticalLineTo(7.0f);
        v.horizontalLineTo(20.0f);
        v.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, v.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(20.0f, 5.0f, 4.0f);
        d.curveTo(2.9f, 5.0f, 2.0f, 5.9f, 2.0f, 7.0f);
        d.verticalLineToRelative(10.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(16.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineTo(7.0f);
        d.curveTo(22.0f, 5.9f, 21.1f, 5.0f, 20.0f, 5.0f);
        af0.r(d, 20.0f, 11.0f, -6.0f, 7.0f);
        uo.r(d, 6.0f, 11.0f, 4.0f, 7.0f);
        gy.t(d, 8.0f, 10.0f, 4.0f, 7.0f);
        bv.y(d, 14.0f, 17.0f, -4.0f, 6.0f);
        kf0.n(d, 4.0f, 14.0f, 9.5f, 12.0f);
        d.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        d.reflectiveCurveTo(6.5f, 12.83f, 6.5f, 12.0f);
        d.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(d, 9.5f, 11.17f, 9.5f, 12.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bento = build;
        build.getClass();
        return build;
    }
}
