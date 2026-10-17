package androidx.compose.material.icons.outlined;

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
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MpKt {
    private static ImageVector _mp;

    public static final ImageVector getMp(Icons.Outlined outlined) {
        ImageVector imageVector = _mp;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Mp", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder d = gy.d(17.0f, 9.0f, -3.5f, 6.0f, 15.0f);
        d.verticalLineToRelative(-1.5f);
        d.horizontalLineToRelative(2.0f);
        d.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        d.verticalLineTo(10.0f);
        d.curveTo(18.0f, 9.45f, 17.55f, 9.0f, 17.0f, 9.0f);
        uo.q(d, 16.5f, 12.0f, 15.0f, -1.5f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(d, 1.5f, 12.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder d2 = k4.d(11.5f, 9.0f, 7.0f);
        d2.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        r6.D(d2, 5.0f, 1.5f, -4.5f, 1.0f);
        af0.B(d2, 3.0f, 10.0f, -3.0f, 1.0f);
        kf0.r(d2, 15.0f, 1.5f, -5.0f);
        d2.curveTo(12.5f, 9.45f, 12.05f, 9.0f, 11.5f, 9.0f);
        d2.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, d2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder d3 = k4.d(19.0f, 3.0f, 5.0f);
        d3.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        d3.verticalLineTo(19.0f);
        d3.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d3.horizontalLineTo(19.0f);
        d3.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d3.verticalLineTo(5.0f);
        d3.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        k4.r(d3, 5.0f, 19.0f, 5.0f, 5.0f);
        d3.horizontalLineToRelative(14.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(d3, 0.0f, 14.0f, 5.0f, 19.0f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _mp = build;
        build.getClass();
        return build;
    }
}
