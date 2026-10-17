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
import defpackage.bv;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HdrOnSelectKt {
    private static ImageVector _hdrOnSelect;

    public static final ImageVector getHdrOnSelect(Icons.Filled filled) {
        ImageVector imageVector = _hdrOnSelect;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.HdrOnSelect", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(18.0f, 18.5f, -1.0f);
        h.curveToRelative(0.0f, -0.8f, -0.7f, -1.5f, -1.5f, -1.5f);
        uf.k(h, 13.0f, 6.0f, 1.5f, -2.0f);
        r6.t(h, 1.1f, 0.9f, 2.0f, 18.0f);
        h.lineToRelative(-0.9f, -2.1f);
        h.curveTo(17.6f, 19.6f, 18.0f, 19.1f, 18.0f, 18.5f);
        r6.B(h, 16.5f, 18.5f, -2.0f, -1.0f);
        uo.r(h, 2.0f, 18.5f, 3.5f, 18.0f);
        af0.z(h, -2.0f, -2.0f, 0.0f, 6.0f);
        af0.w(h, 1.5f, -2.5f, 2.0f, 22.0f);
        h.horizontalLineTo(5.0f);
        h.verticalLineToRelative(-6.0f);
        h.horizontalLineTo(3.5f);
        h.verticalLineTo(18.0f);
        h.close();
        k4.A(h, 10.0f, 16.0f, 6.5f, 6.0f);
        h.horizontalLineTo(10.0f);
        h.curveToRelative(0.8f, 0.0f, 1.5f, -0.7f, 1.5f, -1.5f);
        h.verticalLineToRelative(-3.0f);
        h.curveTo(11.5f, 16.7f, 10.8f, 16.0f, 10.0f, 16.0f);
        uo.q(h, 10.0f, 20.5f, 8.0f, -3.0f);
        uo.r(h, 2.0f, 20.5f, 24.0f, 20.0f);
        af0.v(h, -2.0f, 2.0f, -1.5f, -2.0f);
        af0.v(h, -2.0f, -1.5f, 2.0f, -2.0f);
        bv.h(h, 22.0f, 2.0f, 2.0f, 20.0f);
        h.moveTo(12.0f, 4.0f);
        h.curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f);
        h.reflectiveCurveToRelative(-1.79f, 4.0f, -4.0f, 4.0f);
        h.reflectiveCurveToRelative(-4.0f, -1.79f, -4.0f, -4.0f);
        h.reflectiveCurveTo(9.79f, 4.0f, 12.0f, 4.0f);
        h.moveTo(12.0f, 2.0f);
        h.curveTo(8.69f, 2.0f, 6.0f, 4.69f, 6.0f, 8.0f);
        h.reflectiveCurveToRelative(2.69f, 6.0f, 6.0f, 6.0f);
        h.reflectiveCurveToRelative(6.0f, -2.69f, 6.0f, -6.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(h, 15.31f, 2.0f, 12.0f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hdrOnSelect = build;
        build.getClass();
        return build;
    }
}
