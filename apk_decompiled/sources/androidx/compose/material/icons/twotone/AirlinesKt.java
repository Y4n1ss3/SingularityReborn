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
import defpackage.gy;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AirlinesKt {
    private static ImageVector _airlines;

    public static final ImageVector getAirlines(Icons.TwoTone twoTone) {
        ImageVector imageVector = _airlines;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Airlines", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder k = gy.k(14.05f, 6.0f, 5.8f, 18.0f, 11.54f);
        gy.w(k, 2.25f, -12.0f, 14.05f);
        k.moveTo(14.5f, 14.0f);
        k.curveToRelative(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f);
        k.curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f);
        k.reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f);
        k.curveTo(17.0f, 12.88f, 15.88f, 14.0f, 14.5f, 14.0f);
        k.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, k.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder a = r6.a(17.34f, 18.0f, 5.8f, 8.25f, -12.0f);
        gy.n(a, 5.54f, 17.34f, 18.0f);
        a.moveTo(13.0f, 4.0f);
        a.lineTo(2.0f, 20.0f);
        uf.A(a, 17.0f, 3.0f, -16.0f, 13.0f);
        a.moveTo(14.5f, 9.0f);
        a.curveToRelative(-1.38f, 0.0f, -2.5f, 1.12f, -2.5f, 2.5f);
        a.reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f);
        a.reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(a, 15.88f, 9.0f, 14.5f, 9.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _airlines = build;
        build.getClass();
        return build;
    }
}
