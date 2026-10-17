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
import defpackage.j50;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EnhancedEncryptionKt {
    private static ImageVector _enhancedEncryption;

    public static final ImageVector getEnhancedEncryption(Icons.Sharp sharp) {
        ImageVector imageVector = _enhancedEncryption;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.EnhancedEncryption", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = j50.e(20.0f, 8.0f, -3.0f, 6.22f);
        e.curveToRelative(0.0f, -2.61f, -1.91f, -4.94f, -4.51f, -5.19f);
        e.curveTo(9.51f, 0.74f, 7.0f, 3.08f, 7.0f, 6.0f);
        af0.B(e, 2.0f, 4.0f, 14.0f, 16.0f);
        bv.t(e, 8.0f, 8.9f, 6.0f);
        e.curveToRelative(0.0f, -1.71f, 1.39f, -3.1f, 3.1f, -3.1f);
        e.reflectiveCurveToRelative(3.1f, 1.39f, 3.1f, 3.1f);
        gy.s(e, 2.0f, 8.9f, 6.0f);
        k4.C(e, 16.0f, 16.0f, -3.0f, 3.0f);
        af0.z(e, -2.0f, -3.0f, 8.0f, -2.0f);
        af0.v(e, 3.0f, -3.0f, 2.0f, 3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.v(e, 3.0f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _enhancedEncryption = build;
        build.getClass();
        return build;
    }
}
