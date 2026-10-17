package androidx.compose.material.icons.sharp;

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
import defpackage.k4;
import defpackage.kf0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HdrOnSelectKt {
    private static ImageVector _hdrOnSelect;

    public static final ImageVector getHdrOnSelect(Icons.Sharp sharp) {
        ImageVector imageVector = _hdrOnSelect;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.HdrOnSelect", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder c = af0.c(18.0f, 19.9f, 16.0f, -5.0f, 6.0f);
        kf0.x(c, 1.5f, -2.0f, 1.1f);
        c.lineToRelative(0.9f, 2.0f);
        c.horizontalLineTo(18.0f);
        c.lineToRelative(-0.9f, -2.1f);
        c.horizontalLineTo(18.0f);
        c.close();
        k4.C(c, 16.5f, 18.5f, -2.0f, -1.0f);
        uo.r(c, 2.0f, 18.5f, 3.5f, 18.0f);
        af0.z(c, -2.0f, -2.0f, 0.0f, 6.0f);
        af0.w(c, 1.5f, -2.5f, 2.0f, 22.0f);
        c.horizontalLineTo(5.0f);
        c.verticalLineToRelative(-6.0f);
        c.horizontalLineTo(3.5f);
        c.verticalLineTo(18.0f);
        c.close();
        k4.A(c, 10.0f, 16.0f, 6.5f, 6.0f);
        c.horizontalLineTo(10.0f);
        c.curveToRelative(0.8f, 0.0f, 1.5f, -0.7f, 1.5f, -1.5f);
        c.verticalLineToRelative(-3.0f);
        c.curveTo(11.5f, 16.7f, 10.8f, 16.0f, 10.0f, 16.0f);
        uo.q(c, 10.0f, 20.5f, 8.0f, -3.0f);
        uo.r(c, 2.0f, 20.5f, 24.0f, 20.0f);
        af0.v(c, -2.0f, 2.0f, -1.5f, -2.0f);
        af0.v(c, -2.0f, -1.5f, 2.0f, -2.0f);
        bv.h(c, 22.0f, 2.0f, 2.0f, 20.0f);
        c.moveTo(12.0f, 4.0f);
        c.curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f);
        c.reflectiveCurveToRelative(-1.79f, 4.0f, -4.0f, 4.0f);
        c.reflectiveCurveToRelative(-4.0f, -1.79f, -4.0f, -4.0f);
        c.reflectiveCurveTo(9.79f, 4.0f, 12.0f, 4.0f);
        c.moveTo(12.0f, 2.0f);
        c.curveTo(8.69f, 2.0f, 6.0f, 4.69f, 6.0f, 8.0f);
        c.reflectiveCurveToRelative(2.69f, 6.0f, 6.0f, 6.0f);
        c.reflectiveCurveToRelative(6.0f, -2.69f, 6.0f, -6.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(c, 15.31f, 2.0f, 12.0f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hdrOnSelect = build;
        build.getClass();
        return build;
    }
}
