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
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TimerOffKt {
    private static ImageVector _timerOff;

    public static final ImageVector getTimerOff(Icons.Filled filled) {
        ImageVector imageVector = _timerOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.TimerOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.c(9.0f, 1.0f, 6.0f, 2.0f, -6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder n = kp0.n(13.0f, 8.0f, 2.17f, 6.98f, 6.98f);
        n.curveTo(20.63f, 15.91f, 21.0f, 14.5f, 21.0f, 13.0f);
        n.curveToRelative(0.0f, -2.12f, -0.74f, -4.07f, -1.97f, -5.61f);
        n.lineToRelative(1.42f, -1.42f);
        n.curveToRelative(-0.43f, -0.51f, -0.9f, -0.99f, -1.41f, -1.41f);
        n.lineToRelative(-1.42f, 1.42f);
        n.curveTo(16.07f, 4.74f, 14.12f, 4.0f, 12.0f, 4.0f);
        n.curveToRelative(-1.5f, 0.0f, -2.91f, 0.37f, -4.15f, 1.02f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.v(n, 10.83f, 8.0f, 13.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(2.81f, 2.81f, 1.39f, 4.22f);
        i.lineToRelative(3.4f, 3.4f);
        i.curveTo(3.67f, 9.12f, 3.0f, 10.98f, 3.0f, 13.0f);
        i.curveToRelative(0.0f, 4.97f, 4.02f, 9.0f, 9.0f, 9.0f);
        i.curveToRelative(2.02f, 0.0f, 3.88f, -0.67f, 5.38f, -1.79f);
        i.lineToRelative(2.4f, 2.4f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(i, 1.41f, -1.41f, 2.81f, 2.81f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _timerOff = build;
        build.getClass();
        return build;
    }
}
