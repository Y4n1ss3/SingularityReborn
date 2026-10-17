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
import defpackage.c21;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TimerKt {
    private static ImageVector _timer;

    public static final ImageVector getTimer(Icons.Sharp sharp) {
        ImageVector imageVector = _timer;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Timer", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = r6.i(15.0f, 1.0f, 9.0f, 2.0f, 6.0f);
        k4.D(i, 1.0f, 11.0f, 14.0f, 2.0f);
        c21.c(i, 8.0f, -2.0f, 14.0f);
        i.moveTo(19.03f, 7.39f);
        i.lineToRelative(1.42f, -1.42f);
        i.curveToRelative(-0.43f, -0.51f, -0.9f, -0.99f, -1.41f, -1.41f);
        i.lineToRelative(-1.42f, 1.42f);
        i.curveTo(16.07f, 4.74f, 14.12f, 4.0f, 12.0f, 4.0f);
        i.curveToRelative(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
        i.reflectiveCurveToRelative(4.02f, 9.0f, 9.0f, 9.0f);
        i.reflectiveCurveToRelative(9.0f, -4.03f, 9.0f, -9.0f);
        i.curveTo(21.0f, 10.88f, 20.26f, 8.93f, 19.03f, 7.39f);
        i.close();
        i.moveTo(12.0f, 20.0f);
        i.curveToRelative(-3.87f, 0.0f, -7.0f, -3.13f, -7.0f, -7.0f);
        i.reflectiveCurveToRelative(3.13f, -7.0f, 7.0f, -7.0f);
        i.reflectiveCurveToRelative(7.0f, 3.13f, 7.0f, 7.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(i, 15.87f, 20.0f, 12.0f, 20.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _timer = build;
        build.getClass();
        return build;
    }
}
