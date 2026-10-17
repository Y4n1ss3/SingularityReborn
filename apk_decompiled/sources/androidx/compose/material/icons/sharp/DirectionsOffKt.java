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
import defpackage.bv;
import defpackage.k4;
import defpackage.kp0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DirectionsOffKt {
    private static ImageVector _directionsOff;

    public static final ImageVector getDirectionsOff(Icons.Sharp sharp) {
        ImageVector imageVector = _directionsOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.DirectionsOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(13.0f, 7.5f, 3.5f, 3.5f);
        e.lineToRelative(-1.33f, 1.34f);
        e.lineToRelative(3.45f, 3.45f);
        e.lineToRelative(3.79f, -3.79f);
        e.lineToRelative(-10.4f, -10.42f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, -3.8f, 3.8f, 4.79f, 4.79f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e2 = k4.e(1.39f, 4.22f, 3.99f, 3.99f);
        e2.lineToRelative(-3.79f, 3.79f);
        e2.lineTo(12.01f, 22.4f);
        e2.lineToRelative(3.79f, -3.79f);
        e2.lineToRelative(3.99f, 3.99f);
        e2.lineToRelative(1.41f, -1.41f);
        r6.C(e2, 2.81f, 2.81f, 1.39f, 4.22f);
        kp0.t(e2, 9.99f, 12.82f, 15.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.j(e2, -4.18f, 9.99f, 12.82f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _directionsOff = build;
        build.getClass();
        return build;
    }
}
