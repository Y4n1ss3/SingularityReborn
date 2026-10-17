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
import defpackage.fc;
import defpackage.k4;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PermScanWifiKt {
    private static ImageVector _permScanWifi;

    public static final ImageVector getPermScanWifi(Icons.TwoTone twoTone) {
        ImageVector imageVector = _permScanWifi;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.PermScanWifi", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 5.0f);
        b.curveToRelative(-3.26f, 0.0f, -6.2f, 0.85f, -9.08f, 2.65f);
        b.lineTo(12.0f, 18.83f);
        b.lineToRelative(9.08f, -11.16f);
        b.curveTo(18.18f, 5.85f, 15.25f, 5.0f, 12.0f, 5.0f);
        r6.B(b, 13.0f, 16.0f, -2.0f, -6.0f);
        fc.x(b, 2.0f, 6.0f, 11.0f, 8.0f);
        fc.w(b, 11.0f, 6.0f, 2.0f, 2.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.d(b, -2.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(12.0f, 3.0f);
        b2.curveTo(6.95f, 3.0f, 3.15f, 4.85f, 0.0f, 7.23f);
        b2.lineTo(12.0f, 22.0f);
        b2.lineTo(24.0f, 7.25f);
        b2.curveTo(20.85f, 4.87f, 17.05f, 3.0f, 12.0f, 3.0f);
        b2.close();
        b2.moveTo(2.92f, 7.65f);
        b2.curveTo(5.8f, 5.85f, 8.74f, 5.0f, 12.0f, 5.0f);
        b2.curveToRelative(3.25f, 0.0f, 6.18f, 0.85f, 9.08f, 2.67f);
        r6.C(b2, 12.0f, 18.83f, 2.92f, 7.65f);
        k4.C(b2, 11.0f, 10.0f, 2.0f, 6.0f);
        kp0.A(b2, -2.0f, 11.0f, 6.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.s(b2, 2.0f, -2.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _permScanWifi = build;
        build.getClass();
        return build;
    }
}
