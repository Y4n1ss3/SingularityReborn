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
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MinorCrashKt {
    private static ImageVector _minorCrash;

    public static final ImageVector getMinorCrash(Icons.Sharp sharp) {
        ImageVector imageVector = _minorCrash;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.MinorCrash", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder l = uf.l(18.57f, 8.0f, 5.43f, 3.0f, 15.0f);
        r6.D(l, 9.0f, 3.0f, -2.0f, 12.0f);
        kf0.z(l, 2.0f, 3.0f, -9.0f);
        uo.l(l, 18.57f, 8.0f, 6.85f, 10.0f);
        r6.t(l, 10.29f, 1.04f, 3.0f, 5.81f);
        uo.l(l, 6.85f, 10.0f, 6.0f, 17.5f);
        l.curveTo(6.0f, 16.67f, 6.67f, 16.0f, 7.5f, 16.0f);
        l.reflectiveCurveTo(9.0f, 16.67f, 9.0f, 17.5f);
        l.reflectiveCurveTo(8.33f, 19.0f, 7.5f, 19.0f);
        l.reflectiveCurveTo(6.0f, 18.33f, 6.0f, 17.5f);
        l.close();
        l.moveTo(15.0f, 17.5f);
        l.curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f);
        l.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        l.reflectiveCurveTo(17.33f, 19.0f, 16.5f, 19.0f);
        l.reflectiveCurveTo(15.0f, 18.33f, 15.0f, 17.5f);
        k4.r(l, 9.41f, 5.0f, 8.0f, 6.41f);
        l.lineToRelative(-3.0f, -3.0f);
        r6.C(l, 6.41f, 2.0f, 9.41f, 5.0f);
        l.moveTo(16.0f, 6.41f);
        l.lineTo(14.59f, 5.0f);
        l.lineToRelative(3.0f, -3.0f);
        r6.C(l, 19.0f, 3.41f, 16.0f, 6.41f);
        j50.y(l, 13.0f, 5.0f, -2.0f, 0.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(l, 2.0f, 5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _minorCrash = build;
        build.getClass();
        return build;
    }
}
