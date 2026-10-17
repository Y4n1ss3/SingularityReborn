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
import defpackage.bv;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FlightTakeoffKt {
    private static ImageVector _flightTakeoff;

    public static final ImageVector getFlightTakeoff(Icons.Filled filled) {
        ImageVector imageVector = _flightTakeoff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.FlightTakeoff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(2.5f, 19.0f, 19.0f, 2.0f, -19.0f);
        bv.t(n, 19.0f, 22.07f, 9.64f);
        n.curveToRelative(-0.21f, -0.8f, -1.04f, -1.28f, -1.84f, -1.06f);
        n.lineTo(14.92f, 10.0f);
        n.lineToRelative(-6.9f, -6.43f);
        n.lineTo(6.09f, 4.08f);
        n.lineToRelative(4.14f, 7.17f);
        n.lineToRelative(-4.97f, 1.33f);
        n.lineToRelative(-1.97f, -1.54f);
        n.lineToRelative(-1.45f, 0.39f);
        n.lineToRelative(2.59f, 4.49f);
        n.curveToRelative(0.0f, 0.0f, 7.12f, -1.9f, 16.57f, -4.43f);
        n.curveTo(21.81f, 11.26f, 22.28f, 10.44f, 22.07f, 9.64f);
        n.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, n.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _flightTakeoff = build;
        build.getClass();
        return build;
    }
}
