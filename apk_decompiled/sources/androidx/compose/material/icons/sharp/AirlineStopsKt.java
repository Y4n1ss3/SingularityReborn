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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AirlineStopsKt {
    private static ImageVector _airlineStops;

    public static final ImageVector getAirlineStops(Icons.Sharp sharp) {
        ImageVector imageVector = _airlineStops;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.AirlineStops", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.21f, 9.21f);
        b.curveTo(15.93f, 10.78f, 13.45f, 13.3f, 13.0f, 17.0f);
        af0.z(b, 2.0f, 2.0f, 9.0f, -2.0f);
        b.horizontalLineToRelative(2.0f);
        b.curveToRelative(-0.5f, -4.5f, -4.37f, -8.0f, -9.0f, -8.0f);
        b.verticalLineTo(7.0f);
        b.curveToRelative(4.39f, 0.0f, 8.22f, 2.55f, 10.0f, 6.3f);
        b.curveToRelative(1.13f, -2.43f, 2.99f, -4.25f, 4.78f, -5.52f);
        fc.w(b, 14.0f, 5.0f, 7.0f, 7.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b, 18.21f, 9.21f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _airlineStops = build;
        build.getClass();
        return build;
    }
}
