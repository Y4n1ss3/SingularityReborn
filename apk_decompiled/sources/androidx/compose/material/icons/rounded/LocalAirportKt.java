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
import defpackage.kp0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LocalAirportKt {
    private static ImageVector _localAirport;

    public static final ImageVector getLocalAirport(Icons.Rounded rounded) {
        ImageVector imageVector = _localAirport;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.LocalAirport", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder u = kp0.u(21.48f, 13.7f, 13.5f, 9.0f, 3.5f);
        u.curveTo(13.5f, 2.67f, 12.83f, 2.0f, 12.0f, 2.0f);
        u.curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f);
        u.verticalLineTo(9.0f);
        u.lineToRelative(-7.98f, 4.7f);
        u.curveTo(2.2f, 13.88f, 2.0f, 14.23f, 2.0f, 14.6f);
        u.curveToRelative(0.0f, 0.7f, 0.67f, 1.2f, 1.34f, 1.01f);
        u.lineToRelative(7.16f, -2.1f);
        u.verticalLineTo(19.0f);
        u.lineToRelative(-2.26f, 1.35f);
        u.curveTo(8.09f, 20.44f, 8.0f, 20.61f, 8.0f, 20.78f);
        r6.q(u, 0.0f, 0.5f, 0.0f, 0.08f);
        u.curveToRelative(0.0f, 0.33f, 0.31f, 0.57f, 0.62f, 0.49f);
        u.lineToRelative(2.92f, -0.73f);
        u.lineTo(12.0f, 21.0f);
        u.lineToRelative(0.38f, 0.09f);
        u.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        u.lineToRelative(0.42f, 0.11f);
        u.lineToRelative(1.9f, 0.48f);
        u.lineToRelative(0.0f, 0.0f);
        u.lineToRelative(0.67f, 0.17f);
        u.curveToRelative(0.32f, 0.08f, 0.62f, -0.16f, 0.62f, -0.49f);
        u.verticalLineToRelative(-0.37f);
        u.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        u.verticalLineToRelative(-0.21f);
        u.curveToRelative(0.0f, -0.18f, -0.09f, -0.34f, -0.24f, -0.43f);
        u.lineTo(13.5f, 19.0f);
        u.verticalLineToRelative(-5.5f);
        u.lineToRelative(7.16f, 2.1f);
        u.curveTo(21.33f, 15.8f, 22.0f, 15.3f, 22.0f, 14.6f);
        u.curveTo(22.0f, 14.23f, 21.8f, 13.88f, 21.48f, 13.7f);
        u.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, u.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _localAirport = build;
        build.getClass();
        return build;
    }
}
