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
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DirectionsOffKt {
    private static ImageVector _directionsOff;

    public static final ImageVector getDirectionsOff(Icons.Filled filled) {
        ImageVector imageVector = _directionsOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.DirectionsOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = j50.e(12.83f, 10.0f, 0.67f, 7.5f);
        e.lineTo(17.0f, 11.0f);
        e.lineToRelative(-1.59f, 1.59f);
        e.lineTo(18.83f, 16.0f);
        e.lineToRelative(2.59f, -2.59f);
        e.curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0.0f, -2.83f);
        e.lineToRelative(-7.99f, -8.0f);
        e.curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(e, 8.0f, 5.17f, 12.83f, 10.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(2.81f, 2.81f, 1.39f, 4.22f);
        i.lineTo(5.17f, 8.0f);
        i.lineToRelative(-2.59f, 2.59f);
        i.curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0.0f, 2.83f);
        i.lineToRelative(8.01f, 8.0f);
        i.curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0.0f);
        i.lineTo(16.0f, 18.83f);
        i.lineToRelative(3.78f, 3.78f);
        gy.B(i, 1.41f, -1.41f, 2.81f, 2.81f);
        k4.A(i, 10.0f, 15.0f, 8.0f, -4.0f);
        i.curveToRelative(0.0f, -0.05f, 0.02f, -0.09f, 0.03f, -0.14f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.l(i, 10.0f, 12.83f, 15.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _directionsOff = build;
        build.getClass();
        return build;
    }
}
