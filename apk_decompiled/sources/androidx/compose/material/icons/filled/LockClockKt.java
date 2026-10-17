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
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LockClockKt {
    private static ImageVector _lockClock;

    public static final ImageVector getLockClock(Icons.Filled filled) {
        ImageVector imageVector = _lockClock;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.LockClock", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(14.5f, 14.2f, 2.9f, 1.7f);
        e.lineToRelative(-0.8f, 1.3f);
        af0.m(e, 13.0f, 15.0f, -5.0f, 1.5f);
        r6.l(e, 4.2f, 22.0f, 14.0f);
        e.curveToRelative(0.0f, 4.41f, -3.59f, 8.0f, -8.0f, 8.0f);
        e.curveToRelative(-2.02f, 0.0f, -3.86f, -0.76f, -5.27f, -2.0f);
        e.lineTo(4.0f, 20.0f);
        e.curveToRelative(-1.15f, 0.0f, -2.0f, -0.85f, -2.0f, -2.0f);
        e.lineTo(2.0f, 9.0f);
        e.curveToRelative(0.0f, -1.12f, 0.89f, -1.96f, 2.0f, -2.0f);
        e.verticalLineToRelative(-0.5f);
        e.curveTo(4.0f, 4.01f, 6.01f, 2.0f, 8.5f, 2.0f);
        e.curveToRelative(2.34f, 0.0f, 4.24f, 1.79f, 4.46f, 4.08f);
        e.curveToRelative(0.34f, -0.05f, 0.69f, -0.08f, 1.04f, -0.08f);
        e.curveToRelative(4.41f, 0.0f, 8.0f, 3.59f, 8.0f, 8.0f);
        r6.B(e, 6.0f, 7.0f, 5.0f, -0.74f);
        e.curveTo(10.88f, 4.99f, 9.8f, 4.0f, 8.5f, 4.0f);
        e.curveTo(7.12f, 4.0f, 6.0f, 5.12f, 6.0f, 6.5f);
        uo.l(e, 6.0f, 7.0f, 20.0f, 14.0f);
        e.curveToRelative(0.0f, -3.31f, -2.69f, -6.0f, -6.0f, -6.0f);
        e.reflectiveCurveToRelative(-6.0f, 2.69f, -6.0f, 6.0f);
        e.reflectiveCurveToRelative(2.69f, 6.0f, 6.0f, 6.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(e, 6.0f, -2.69f, 6.0f, -6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _lockClock = build;
        build.getClass();
        return build;
    }
}
