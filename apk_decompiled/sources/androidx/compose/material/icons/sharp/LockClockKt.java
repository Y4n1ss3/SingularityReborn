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
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LockClockKt {
    private static ImageVector _lockClock;

    public static final ImageVector getLockClock(Icons.Sharp sharp) {
        ImageVector imageVector = _lockClock;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.LockClock", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.0f, 11.0f);
        b.curveToRelative(0.7f, 0.0f, 1.37f, 0.1f, 2.0f, 0.29f);
        uf.z(b, 8.0f, -3.0f, 6.21f);
        b.curveToRelative(0.0f, -2.61f, -1.91f, -4.94f, -4.51f, -5.19f);
        b.curveTo(9.51f, 0.74f, 7.0f, 3.08f, 7.0f, 6.0f);
        af0.B(b, 2.0f, 4.0f, 14.0f, 8.26f);
        b.curveTo(11.47f, 20.87f, 11.0f, 19.49f, 11.0f, 18.0f);
        b.curveTo(11.0f, 14.13f, 14.13f, 11.0f, 18.0f, 11.0f);
        b.close();
        b.moveTo(9.0f, 6.0f);
        b.curveToRelative(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f);
        b.reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f);
        gy.s(b, 2.0f, 9.0f, 6.0f);
        b.moveTo(18.0f, 13.0f);
        b.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        b.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        b.reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f);
        b.reflectiveCurveTo(20.76f, 13.0f, 18.0f, 13.0f);
        k4.x(b, 19.65f, 20.35f, -2.15f, -2.15f);
        kf0.r(b, 15.0f, 1.0f, 2.79f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(b, 1.85f, 1.85f, 19.65f, 20.35f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _lockClock = build;
        build.getClass();
        return build;
    }
}
