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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.kp0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PhonelinkOffKt {
    private static ImageVector _phonelinkOff;

    public static final ImageVector getPhonelinkOff(Icons.TwoTone twoTone) {
        ImageVector imageVector = _phonelinkOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.PhonelinkOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(kp0.s(22.0f, 17.0f, -7.0f, -4.0f, 4.61f), 20.39f, 17.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(23.0f, 8.0f, -6.0f);
        a.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        a.verticalLineToRelative(3.61f);
        a.lineToRelative(2.0f, 2.0f);
        fc.w(a, 18.0f, 10.0f, 4.0f, 7.0f);
        a.horizontalLineToRelative(-1.61f);
        a.lineToRelative(2.93f, 2.93f);
        a.curveToRelative(0.39f, -0.13f, 0.68f, -0.49f, 0.68f, -0.93f);
        a.lineTo(24.0f, 9.0f);
        a.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        k4.r(a, 22.0f, 6.0f, 22.0f, 4.0f);
        bv.o(a, 7.39f, 4.0f, 2.0f, 2.0f);
        a.moveTo(0.65f, 2.92f);
        a.lineToRelative(1.82f, 1.82f);
        a.curveTo(2.18f, 5.08f, 2.0f, 5.52f, 2.0f, 6.0f);
        bv.q(a, 11.0f, 0.0f, 17.0f, 3.0f);
        a.horizontalLineToRelative(17.73f);
        a.lineToRelative(2.35f, 2.35f);
        a.lineToRelative(1.41f, -1.41f);
        r6.C(a, 2.06f, 1.51f, 0.65f, 2.92f);
        a.moveTo(4.0f, 6.27f);
        a.lineTo(14.73f, 17.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(a, 4.0f, 17.0f, 4.0f, 6.27f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phonelinkOff = build;
        build.getClass();
        return build;
    }
}
