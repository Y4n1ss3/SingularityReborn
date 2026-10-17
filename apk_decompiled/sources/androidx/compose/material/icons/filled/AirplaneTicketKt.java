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
import defpackage.er;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AirplaneTicketKt {
    private static ImageVector _airplaneTicket;

    public static final ImageVector getAirplaneTicket(Icons.Filled filled) {
        ImageVector imageVector = _airplaneTicket;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.AirplaneTicket", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(20.19f, 4.0f, 4.0f);
        d.curveTo(2.9f, 4.0f, 2.01f, 4.9f, 2.01f, 6.0f);
        d.verticalLineToRelative(4.0f);
        d.curveTo(3.11f, 10.0f, 4.0f, 10.9f, 4.0f, 12.0f);
        d.reflectiveCurveToRelative(-0.89f, 2.0f, -2.0f, 2.0f);
        d.verticalLineToRelative(4.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(16.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineTo(6.0f);
        d.curveTo(22.0f, 4.9f, 21.19f, 4.0f, 20.19f, 4.0f);
        k4.x(d, 17.73f, 13.3f, -8.86f, 2.36f);
        d.lineToRelative(-1.66f, -2.88f);
        d.lineToRelative(0.93f, -0.25f);
        d.lineToRelative(1.26f, 0.99f);
        d.lineToRelative(2.39f, -0.64f);
        d.lineToRelative(-2.4f, -4.16f);
        d.lineToRelative(1.4f, -0.38f);
        d.lineToRelative(4.01f, 3.74f);
        d.lineToRelative(2.44f, -0.65f);
        d.curveToRelative(0.51f, -0.14f, 1.04f, 0.17f, 1.18f, 0.68f);
        d.curveTo(18.55f, 12.62f, 18.25f, 13.15f, 17.73f, 13.3f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _airplaneTicket = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getAirplaneTicket$annotations(Icons.Filled filled) {
    }
}
