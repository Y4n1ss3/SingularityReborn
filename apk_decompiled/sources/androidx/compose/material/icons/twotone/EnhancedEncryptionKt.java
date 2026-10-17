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
import defpackage.bv;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EnhancedEncryptionKt {
    private static ImageVector _enhancedEncryption;

    public static final ImageVector getEnhancedEncryption(Icons.TwoTone twoTone) {
        ImageVector imageVector = _enhancedEncryption;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.EnhancedEncryption", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(6.0f, 20.0f, 12.0f, 18.0f, 10.0f);
        bv.r(p, 6.0f, 10.0f, 10.0f);
        k4.C(p, 8.0f, 14.0f, 3.0f, -3.0f);
        af0.v(p, 2.0f, 3.0f, 3.0f, 2.0f);
        af0.v(p, -3.0f, 3.0f, -2.0f, -3.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.f(p, 8.0f, 16.0f, -2.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder p2 = kf0.p(18.0f, 8.0f, -1.0f, 17.0f, 6.0f);
        p2.curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        p2.reflectiveCurveTo(7.0f, 3.24f, 7.0f, 6.0f);
        p2.verticalLineToRelative(2.0f);
        p2.lineTo(6.0f, 8.0f);
        p2.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        p2.verticalLineToRelative(10.0f);
        p2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        p2.horizontalLineToRelative(12.0f);
        p2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        p2.lineTo(20.0f, 10.0f);
        p2.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        p2.close();
        p2.moveTo(8.9f, 6.0f);
        p2.curveToRelative(0.0f, -1.71f, 1.39f, -3.1f, 3.1f, -3.1f);
        p2.curveToRelative(1.71f, 0.0f, 3.1f, 1.39f, 3.1f, 3.1f);
        p2.verticalLineToRelative(2.0f);
        r6.C(p2, 8.9f, 8.0f, 8.9f, 6.0f);
        p2.moveTo(18.0f, 20.0f);
        p2.lineTo(6.0f, 20.0f);
        r6.m(p2, 6.0f, 10.0f, 12.0f, 10.0f);
        k4.C(p2, 11.0f, 19.0f, 2.0f, -3.0f);
        af0.v(p2, 3.0f, -2.0f, -3.0f, -3.0f);
        bv.C(p2, -2.0f, 3.0f, 8.0f, 14.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.s(p2, 2.0f, 3.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _enhancedEncryption = build;
        build.getClass();
        return build;
    }
}
