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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LocationDisabledKt {
    private static ImageVector _locationDisabled;

    public static final ImageVector getLocationDisabled(Icons.TwoTone twoTone) {
        ImageVector imageVector = _locationDisabled;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.LocationDisabled", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder m = fc.m(23.0f, 13.0f, -2.0f, -2.06f);
        m.curveToRelative(-0.46f, -4.17f, -3.77f, -7.48f, -7.94f, -7.94f);
        kf0.r(m, 1.0f, -2.0f, 2.06f);
        m.curveToRelative(-0.98f, 0.11f, -1.91f, 0.38f, -2.77f, 0.78f);
        m.lineToRelative(1.53f, 1.53f);
        m.curveTo(10.46f, 5.13f, 11.22f, 5.0f, 12.0f, 5.0f);
        m.curveToRelative(3.87f, 0.0f, 7.0f, 3.13f, 7.0f, 7.0f);
        m.curveToRelative(0.0f, 0.79f, -0.13f, 1.54f, -0.37f, 2.24f);
        m.lineToRelative(1.53f, 1.53f);
        m.curveToRelative(0.4f, -0.86f, 0.67f, -1.79f, 0.78f, -2.77f);
        k4.w(m, 23.0f, 4.41f, 2.86f);
        m.lineTo(3.0f, 4.27f);
        m.lineToRelative(2.04f, 2.04f);
        m.curveTo(3.97f, 7.62f, 3.26f, 9.23f, 3.06f, 11.0f);
        af0.u(m, 1.0f, 2.0f, 2.06f);
        m.curveToRelative(0.46f, 4.17f, 3.77f, 7.48f, 7.94f, 7.94f);
        kf0.r(m, 23.0f, 2.0f, -2.06f);
        m.curveToRelative(1.77f, -0.2f, 3.38f, -0.91f, 4.69f, -1.98f);
        m.lineTo(19.73f, 21.0f);
        gy.B(m, 1.41f, -1.41f, 4.41f, 2.86f);
        m.moveTo(12.0f, 19.0f);
        m.curveToRelative(-3.87f, 0.0f, -7.0f, -3.13f, -7.0f, -7.0f);
        m.curveToRelative(0.0f, -1.61f, 0.55f, -3.09f, 1.46f, -4.27f);
        m.lineToRelative(9.81f, 9.81f);
        m.curveTo(15.09f, 18.45f, 13.61f, 19.0f, 12.0f, 19.0f);
        m.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, m.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _locationDisabled = build;
        build.getClass();
        return build;
    }
}
