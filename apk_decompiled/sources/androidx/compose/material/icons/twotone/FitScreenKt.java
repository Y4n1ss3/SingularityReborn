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
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FitScreenKt {
    private static ImageVector _fitScreen;

    public static final ImageVector getFitScreen(Icons.TwoTone twoTone) {
        ImageVector imageVector = _fitScreen;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.FitScreen", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.c(8.0f, 10.0f, 8.0f, 4.0f, -8.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder v = uo.v(6.0f, 16.0f, 12.0f, 8.0f, 6.0f);
        k4.D(v, 16.0f, 8.0f, 10.0f, 8.0f);
        gy.s(v, 4.0f, 8.0f, 10.0f);
        k4.A(v, 4.0f, 15.0f, 2.0f, 3.0f);
        v.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        gy.t(v, 3.0f, -2.0f, 4.0f, 15.0f);
        j50.y(v, 4.0f, 6.0f, 3.0f, 4.0f);
        v.horizontalLineTo(4.0f);
        v.curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f);
        k4.p(v, 3.0f, 2.0f, 6.0f);
        k4.C(v, 20.0f, 4.0f, -3.0f, 2.0f);
        af0.w(v, 3.0f, 3.0f, 2.0f, 6.0f);
        v.curveTo(22.0f, 4.9f, 21.1f, 4.0f, 20.0f, 4.0f);
        r6.B(v, 20.0f, 18.0f, -3.0f, 2.0f);
        v.horizontalLineToRelative(3.0f);
        v.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.f(v, -3.0f, -2.0f, 18.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fitScreen = build;
        build.getClass();
        return build;
    }
}
