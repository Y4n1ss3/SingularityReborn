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
import defpackage.fc;
import defpackage.k4;
import defpackage.kp0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SmokeFreeKt {
    private static ImageVector _smokeFree;

    public static final ImageVector getSmokeFree(Icons.Filled filled) {
        ImageVector imageVector = _smokeFree;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SmokeFree", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(2.0f, 6.0f, 6.99f, 7.0f);
        af0.m(e, 2.0f, 13.0f, 3.0f, 9.99f);
        e.lineToRelative(7.0f, 7.0f);
        fc.C(e, 1.26f, -1.25f, -17.0f, -17.0f);
        e.moveTo(20.5f, 13.0f);
        kp0.x(e, 22.0f, 13.0f, 3.0f, -1.5f);
        k4.C(e, 18.0f, 13.0f, 1.5f, 3.0f);
        uo.l(e, 18.0f, 16.0f, 18.85f, 4.88f);
        e.curveToRelative(0.62f, -0.61f, 1.0f, -1.45f, 1.0f, -2.38f);
        e.horizontalLineToRelative(-1.5f);
        e.curveToRelative(0.0f, 1.02f, -0.83f, 1.85f, -1.85f, 1.85f);
        e.verticalLineToRelative(1.5f);
        e.curveToRelative(2.24f, 0.0f, 4.0f, 1.83f, 4.0f, 4.07f);
        e.lineTo(20.5f, 12.0f);
        e.lineTo(22.0f, 12.0f);
        e.lineTo(22.0f, 9.92f);
        e.curveToRelative(0.0f, -2.23f, -1.28f, -4.15f, -3.15f, -5.04f);
        af0.l(e, 14.5f, 8.7f, 1.53f);
        e.curveToRelative(1.05f, 0.0f, 1.97f, 0.74f, 1.97f, 2.05f);
        fc.w(e, 18.0f, 12.0f, 1.5f, -1.59f);
        e.curveToRelative(0.0f, -1.8f, -1.6f, -3.16f, -3.47f, -3.16f);
        e.lineTo(14.5f, 7.25f);
        e.curveToRelative(-1.02f, 0.0f, -1.85f, -0.98f, -1.85f, -2.0f);
        e.reflectiveCurveToRelative(0.83f, -1.75f, 1.85f, -1.75f);
        e.lineTo(14.5f, 2.0f);
        e.curveToRelative(-1.85f, 0.0f, -3.35f, 1.5f, -3.35f, 3.35f);
        e.reflectiveCurveToRelative(1.5f, 3.35f, 3.35f, 3.35f);
        k4.r(e, 17.0f, 15.93f, 17.0f, 13.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.d(e, -2.93f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _smokeFree = build;
        build.getClass();
        return build;
    }
}
