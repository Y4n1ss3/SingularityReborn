package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AirlineStopsKt {
    private static ImageVector _airlineStops;

    public static final ImageVector getAirlineStops(Icons.Rounded rounded) {
        ImageVector imageVector = _airlineStops;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AirlineStops", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(15.0f, 18.0f);
        b.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        b.horizontalLineToRelative(-4.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        b.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        b.horizontalLineToRelative(1.0f);
        b.curveToRelative(-0.47f, -4.21f, -3.89f, -7.55f, -8.12f, -7.96f);
        b.curveTo(2.37f, 8.99f, 2.0f, 8.56f, 2.0f, 8.05f);
        b.curveToRelative(0.0f, -0.59f, 0.52f, -1.06f, 1.11f, -1.0f);
        b.curveTo(7.03f, 7.44f, 10.37f, 9.87f, 12.0f, 13.3f);
        b.curveToRelative(1.13f, -2.43f, 2.99f, -4.25f, 4.78f, -5.52f);
        b.lineToRelative(-1.92f, -1.92f);
        b.curveTo(14.54f, 5.54f, 14.76f, 5.0f, 15.21f, 5.0f);
        b.horizontalLineToRelative(5.29f);
        b.curveTo(20.78f, 5.0f, 21.0f, 5.22f, 21.0f, 5.5f);
        b.verticalLineToRelative(5.29f);
        b.curveToRelative(0.0f, 0.45f, -0.54f, 0.67f, -0.85f, 0.35f);
        b.lineToRelative(-1.94f, -1.94f);
        b.curveTo(15.93f, 10.78f, 13.45f, 13.3f, 13.0f, 17.0f);
        b.horizontalLineToRelative(1.0f);
        b.curveTo(14.55f, 17.0f, 15.0f, 17.45f, 15.0f, 18.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _airlineStops = build;
        build.getClass();
        return build;
    }
}
