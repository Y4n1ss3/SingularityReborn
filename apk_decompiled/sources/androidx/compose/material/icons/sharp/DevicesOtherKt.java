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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DevicesOtherKt {
    private static ImageVector _devicesOther;

    public static final ImageVector getDevicesOther(Icons.Sharp sharp) {
        ImageVector imageVector = _devicesOther;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.DevicesOther", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(3.0f, 6.0f, 18.0f, 21.0f, 4.0f);
        af0.m(p, 1.0f, 4.0f, 16.0f, 6.0f);
        p.verticalLineToRelative(-2.0f);
        r6.C(p, 3.0f, 18.0f, 3.0f, 6.0f);
        p.moveTo(13.0f, 12.0f);
        p.lineTo(9.0f, 12.0f);
        p.verticalLineToRelative(1.78f);
        p.curveToRelative(-0.61f, 0.55f, -1.0f, 1.33f, -1.0f, 2.22f);
        p.curveToRelative(0.0f, 0.89f, 0.39f, 1.67f, 1.0f, 2.22f);
        fc.w(p, 9.0f, 20.0f, 4.0f, -1.78f);
        p.curveToRelative(0.61f, -0.55f, 1.0f, -1.34f, 1.0f, -2.22f);
        p.reflectiveCurveToRelative(-0.39f, -1.67f, -1.0f, -2.22f);
        uo.l(p, 13.0f, 12.0f, 11.0f, 17.5f);
        p.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        p.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        p.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        p.reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f);
        r6.B(p, 23.0f, 8.0f, -8.0f, 12.0f);
        gy.n(p, 8.0f, 23.0f, 8.0f);
        k4.C(p, 21.0f, 18.0f, -4.0f, -8.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.v(p, 4.0f, 8.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _devicesOther = build;
        build.getClass();
        return build;
    }
}
