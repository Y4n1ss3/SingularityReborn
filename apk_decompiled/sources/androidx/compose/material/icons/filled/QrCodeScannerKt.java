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
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class QrCodeScannerKt {
    private static ImageVector _qrCodeScanner;

    public static final ImageVector getQrCodeScanner(Icons.Filled filled) {
        ImageVector imageVector = _qrCodeScanner;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.QrCodeScanner", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = kp0.s(9.5f, 6.5f, 3.0f, -3.0f, -3.0f);
        r6.z(s, 9.5f, 11.0f, 5.0f, 5.0f);
        bv.x(s, 6.0f, 6.0f, 5.0f);
        uo.l(s, 11.0f, 5.0f, 9.5f, 14.5f);
        uf.s(s, 3.0f, -3.0f, -3.0f, 9.5f);
        k4.A(s, 11.0f, 13.0f, 5.0f, 6.0f);
        uf.w(s, 6.0f, 13.0f, 11.0f, 13.0f);
        bv.y(s, 17.5f, 6.5f, 3.0f, -3.0f);
        s.verticalLineToRelative(-3.0f);
        s.horizontalLineTo(17.5f);
        s.moveTo(19.0f, 5.0f);
        af0.w(s, -6.0f, 6.0f, 6.0f, 5.0f);
        uo.l(s, 19.0f, 5.0f, 13.0f, 13.0f);
        gy.t(s, 1.5f, 1.5f, 13.0f, 13.0f);
        uo.p(s, 14.5f, 14.5f, 16.0f, 16.0f);
        uo.r(s, -1.5f, 14.5f, 16.0f, 13.0f);
        gy.t(s, 1.5f, 1.5f, 16.0f, 13.0f);
        k4.C(s, 13.0f, 16.0f, 1.5f, 1.5f);
        bv.s(s, 13.0f, 16.0f, 14.5f, 17.5f);
        uo.o(s, 16.0f, 19.0f, -1.5f, 17.5f);
        k4.C(s, 16.0f, 16.0f, 1.5f, 1.5f);
        bv.s(s, 16.0f, 16.0f, 17.5f, 14.5f);
        uo.o(s, 19.0f, 16.0f, -1.5f, 14.5f);
        uo.p(s, 17.5f, 17.5f, 19.0f, 19.0f);
        uo.r(s, -1.5f, 17.5f, 22.0f, 7.0f);
        af0.n(s, -2.0f, 4.0f, -3.0f, 2.0f);
        uo.r(s, 5.0f, 7.0f, 22.0f, 22.0f);
        r6.D(s, -5.0f, -2.0f, 3.0f, -3.0f);
        kf0.n(s, 2.0f, 22.0f, 2.0f, 22.0f);
        af0.z(s, 5.0f, -2.0f, 4.0f, -3.0f);
        bv.s(s, 2.0f, 22.0f, 2.0f, 2.0f);
        k4.l(s, 5.0f, 2.0f, 4.0f, 3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.e(s, 2.0f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _qrCodeScanner = build;
        build.getClass();
        return build;
    }
}
