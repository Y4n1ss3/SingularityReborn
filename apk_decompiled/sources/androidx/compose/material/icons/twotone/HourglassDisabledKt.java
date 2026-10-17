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
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.kp0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HourglassDisabledKt {
    private static ImageVector _hourglassDisabled;

    public static final ImageVector getHourglassDisabled(Icons.TwoTone twoTone) {
        ImageVector imageVector = _hourglassDisabled;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.HourglassDisabled", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(8.0f, 4.0f, 8.0f, 0.0f);
        e.lineToRelative(0.0f, 3.5f);
        e.lineToRelative(-2.84f, 2.84f);
        e.lineToRelative(1.25f, 1.25f);
        e.lineToRelative(3.59f, -3.58f);
        e.lineToRelative(-0.01f, -0.01f);
        e.lineToRelative(0.01f, 0.0f);
        e.lineToRelative(0.0f, -6.0f);
        e.lineToRelative(-12.0f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, 0.0f, 1.17f, 2.0f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(2.1f, 2.1f, 0.69f, 3.51f);
        i.lineToRelative(8.9f, 8.9f);
        i.lineTo(6.0f, 16.0f);
        kp0.v(i, 0.01f, 0.01f, 6.0f, 22.0f);
        bv.p(i, 12.0f, -1.17f, 2.49f, 2.49f);
        gy.B(i, 1.41f, -1.41f, 2.1f, 2.1f);
        k4.A(i, 16.0f, 20.0f, 8.0f, -3.5f);
        i.lineToRelative(2.84f, -2.84f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.l(i, 16.0f, 18.83f, 20.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hourglassDisabled = build;
        build.getClass();
        return build;
    }
}
