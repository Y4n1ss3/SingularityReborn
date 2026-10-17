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
import defpackage.bv;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AirplanemodeInactiveKt {
    private static ImageVector _airplanemodeInactive;

    public static final ImageVector getAirplanemodeInactive(Icons.TwoTone twoTone) {
        ImageVector imageVector = _airplanemodeInactive;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.AirplanemodeInactive", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(10.5f, 7.67f, 3.5f);
        d.curveTo(10.5f, 2.67f, 11.17f, 2.0f, 12.0f, 2.0f);
        d.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        k4.y(d, 9.0f, 8.5f, 5.0f, 2.0f);
        gy.B(d, -4.49f, -1.32f, 10.5f, 7.67f);
        d.moveTo(19.78f, 22.61f);
        d.lineToRelative(1.41f, -1.41f);
        d.lineTo(13.5f, 13.5f);
        d.lineTo(9.56f, 9.56f);
        d.lineTo(2.81f, 2.81f);
        d.lineTo(1.39f, 4.22f);
        d.lineToRelative(6.38f, 6.38f);
        d.lineTo(2.0f, 14.0f);
        k4.z(d, 2.0f, 8.5f, -2.5f, 19.0f);
        d.lineTo(8.0f, 20.5f);
        d.lineTo(8.0f, 22.0f);
        d.lineToRelative(4.0f, -1.0f);
        d.lineToRelative(4.0f, 1.0f);
        d.lineToRelative(0.0f, -1.5f);
        d.lineTo(13.5f, 19.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.j(d, -2.67f, 19.78f, 22.61f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _airplanemodeInactive = build;
        build.getClass();
        return build;
    }
}
