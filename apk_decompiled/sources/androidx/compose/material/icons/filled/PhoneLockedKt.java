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
import defpackage.bv;
import defpackage.fc;
import defpackage.j50;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PhoneLockedKt {
    private static ImageVector _phoneLocked;

    public static final ImageVector getPhoneLocked(Icons.Filled filled) {
        ImageVector imageVector = _phoneLocked;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.PhoneLocked", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(20.0f, 5.0f, 4.0f);
        d.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        d.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        r6.D(d, 1.0f, -1.0f, 5.0f, 6.0f);
        bv.z(d, 5.0f, 20.0f, 19.0f, 5.0f);
        d.horizontalLineToRelative(-2.0f);
        d.verticalLineTo(4.0f);
        d.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        d.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(d, 5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(15.63f, 14.4f, -2.52f, 2.5f);
        e.curveToRelative(-2.5f, -1.43f, -4.57f, -3.5f, -6.0f, -6.0f);
        e.lineToRelative(2.5f, -2.52f);
        e.curveToRelative(0.23f, -0.24f, 0.33f, -0.57f, 0.27f, -0.9f);
        e.lineTo(9.13f, 3.8f);
        e.curveTo(9.04f, 3.34f, 8.63f, 3.0f, 8.15f, 3.0f);
        e.lineTo(4.0f, 3.0f);
        e.curveTo(3.44f, 3.0f, 2.97f, 3.47f, 3.0f, 4.03f);
        e.curveTo(3.17f, 6.92f, 4.05f, 9.63f, 5.43f, 12.0f);
        e.curveToRelative(1.58f, 2.73f, 3.85f, 4.99f, 6.57f, 6.57f);
        e.curveToRelative(2.37f, 1.37f, 5.08f, 2.26f, 7.97f, 2.43f);
        e.curveToRelative(0.56f, 0.03f, 1.03f, -0.44f, 1.03f, -1.0f);
        e.lineToRelative(0.0f, -4.15f);
        e.curveToRelative(0.0f, -0.48f, -0.34f, -0.89f, -0.8f, -0.98f);
        e.lineToRelative(-3.67f, -0.73f);
        e.curveTo(16.2f, 14.07f, 15.86f, 14.17f, 15.63f, 14.4f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phoneLocked = build;
        build.getClass();
        return build;
    }
}
