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
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TaxiAlertKt {
    private static ImageVector _taxiAlert;

    public static final ImageVector getTaxiAlert(Icons.Filled filled) {
        ImageVector imageVector = _taxiAlert;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.TaxiAlert", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(23.0f, 8.0f);
        b.arcTo(7.0f, 7.0f, 0.0f, false, false, 9.68f, 5.0f);
        b.lineTo(7.0f, 5.0f);
        b.verticalLineToRelative(2.0f);
        b.lineTo(4.5f, 7.0f);
        b.arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.42f, 1.01f);
        b.lineTo(1.0f, 14.0f);
        b.verticalLineToRelative(8.0f);
        b.arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f);
        b.horizontalLineToRelative(1.0f);
        b.arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f);
        kf0.z(b, -1.0f, 12.0f, 1.0f);
        b.arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f);
        b.horizontalLineToRelative(1.0f);
        b.arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f);
        b.verticalLineToRelative(-7.68f);
        b.arcTo(7.01f, 7.01f, 0.0f, false, false, 23.0f, 8.0f);
        af0.l(b, 4.5f, 8.5f, 4.53f);
        b.arcToRelative(6.93f, 6.93f, 0.0f, false, false, 2.08f, 4.5f);
        bv.o(b, 3.0f, 13.0f, 1.5f, -4.5f);
        b.moveTo(4.5f, 18.0f);
        b.arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, -3.0f);
        b.arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f);
        b.close();
        b.moveTo(15.5f, 18.0f);
        b.arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, -3.0f);
        b.arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f);
        k4.x(b, 18.43f, 12.37f, -0.21f, 0.11f);
        b.lineToRelative(-0.18f, 0.09f);
        b.arcToRelative(4.97f, 4.97f, 0.0f, false, true, -0.42f, 0.16f);
        b.lineToRelative(-0.22f, 0.07f);
        b.lineToRelative(-0.23f, 0.06f);
        b.lineToRelative(-0.2f, 0.05f);
        b.arcToRelative(5.0f, 5.0f, 0.0f, false, true, -5.94f, -4.41f);
        b.arcTo(4.07f, 4.07f, 0.0f, false, true, 11.0f, 8.0f);
        b.lineToRelative(0.02f, -0.47f);
        b.lineToRelative(0.02f, -0.17f);
        b.lineToRelative(0.04f, -0.28f);
        b.lineToRelative(0.04f, -0.21f);
        b.lineToRelative(0.05f, -0.21f);
        b.lineToRelative(0.07f, -0.24f);
        b.lineToRelative(0.05f, -0.13f);
        b.arcToRelative(4.99f, 4.99f, 0.0f, false, true, 9.69f, 1.7f);
        b.arcToRelative(4.96f, 4.96f, 0.0f, false, true, -2.55f, 4.38f);
        r6.B(b, 15.0f, 4.0f, 2.0f, 5.0f);
        kp0.A(b, -2.0f, 15.0f, 10.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.s(b, 2.0f, -2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _taxiAlert = build;
        build.getClass();
        return build;
    }
}
