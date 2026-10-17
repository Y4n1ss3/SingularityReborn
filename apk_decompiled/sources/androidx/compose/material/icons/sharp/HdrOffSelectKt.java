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
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HdrOffSelectKt {
    private static ImageVector _hdrOffSelect;

    public static final ImageVector getHdrOffSelect(Icons.Sharp sharp) {
        ImageVector imageVector = _hdrOffSelect;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.HdrOffSelect", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = kp0.s(18.0f, 20.0f, -4.0f, -5.0f, 6.0f);
        kf0.x(s, 1.5f, -2.0f, 1.1f);
        s.lineToRelative(0.9f, 2.0f);
        s.horizontalLineTo(18.0f);
        gy.B(s, -0.86f, -2.0f, 18.0f, 20.0f);
        k4.C(s, 16.5f, 18.5f, -2.0f, -1.0f);
        uo.r(s, 2.0f, 18.5f, 3.5f, 18.0f);
        af0.z(s, -2.0f, -2.0f, 0.0f, 6.0f);
        af0.w(s, 1.5f, -2.5f, 2.0f, 22.0f);
        s.horizontalLineTo(5.0f);
        s.verticalLineToRelative(-6.0f);
        s.horizontalLineTo(3.5f);
        s.verticalLineTo(18.0f);
        s.close();
        k4.A(s, 10.0f, 16.0f, 6.5f, 6.0f);
        s.horizontalLineTo(10.0f);
        s.curveToRelative(0.8f, 0.0f, 1.5f, -0.7f, 1.5f, -1.5f);
        s.verticalLineToRelative(-3.0f);
        s.curveTo(11.5f, 16.7f, 10.8f, 16.0f, 10.0f, 16.0f);
        uo.q(s, 10.0f, 20.5f, 8.0f, -3.0f);
        uo.r(s, 2.0f, 20.5f, 24.0f, 20.0f);
        af0.v(s, -2.0f, 2.0f, -1.5f, -2.0f);
        af0.v(s, -2.0f, -1.5f, 2.0f, -2.0f);
        bv.h(s, 22.0f, 2.0f, 2.0f, 20.0f);
        s.moveTo(10.98f, 4.15f);
        s.lineTo(9.42f, 2.59f);
        s.curveToRelative(5.1f, -2.42f, 10.41f, 2.89f, 7.99f, 7.99f);
        s.lineToRelative(-1.56f, -1.56f);
        s.curveTo(16.66f, 6.06f, 13.94f, 3.34f, 10.98f, 4.15f);
        k4.r(s, 6.34f, 2.34f, 4.93f, 3.76f);
        s.lineToRelative(1.66f, 1.66f);
        s.curveToRelative(-2.42f, 5.1f, 2.89f, 10.41f, 7.99f, 7.99f);
        s.lineToRelative(1.66f, 1.66f);
        gy.B(s, 1.41f, -1.41f, 6.34f, 2.34f);
        s.moveTo(8.15f, 6.98f);
        s.lineToRelative(4.87f, 4.87f);
        s.curveTo(10.06f, 12.66f, 7.34f, 9.94f, 8.15f, 6.98f);
        s.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, s.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hdrOffSelect = build;
        build.getClass();
        return build;
    }
}
