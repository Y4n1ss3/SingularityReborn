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
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AirplanemodeInactiveKt {
    private static ImageVector _airplanemodeInactive;

    public static final ImageVector getAirplanemodeInactive(Icons.Rounded rounded) {
        ImageVector imageVector = _airplanemodeInactive;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AirplanemodeInactive", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(22.0f, 14.6f);
        b.curveToRelative(0.0f, 0.7f, -0.67f, 1.2f, -1.34f, 1.01f);
        b.lineToRelative(-3.15f, -0.93f);
        b.lineTo(10.5f, 7.67f);
        b.verticalLineTo(3.5f);
        b.curveTo(10.5f, 2.67f, 11.17f, 2.0f, 12.0f, 2.0f);
        b.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        b.verticalLineTo(9.0f);
        b.lineToRelative(7.98f, 4.7f);
        b.curveTo(21.8f, 13.88f, 22.0f, 14.23f, 22.0f, 14.6f);
        k4.r(b, 13.5f, 13.5f, 9.56f, 9.56f);
        b.lineTo(3.51f, 3.51f);
        b.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        b.lineToRelative(0.0f, 0.0f);
        b.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        b.lineToRelative(5.67f, 5.67f);
        b.lineTo(2.52f, 13.7f);
        b.curveTo(2.2f, 13.88f, 2.0f, 14.23f, 2.0f, 14.6f);
        b.curveToRelative(0.0f, 0.7f, 0.67f, 1.2f, 1.34f, 1.01f);
        b.lineToRelative(7.16f, -2.1f);
        b.verticalLineTo(19.0f);
        b.lineToRelative(-2.26f, 1.35f);
        b.curveTo(8.09f, 20.44f, 8.0f, 20.61f, 8.0f, 20.78f);
        r6.q(b, 0.0f, 0.5f, 0.0f, 0.08f);
        b.curveToRelative(0.0f, 0.33f, 0.31f, 0.57f, 0.62f, 0.49f);
        b.lineToRelative(2.92f, -0.73f);
        b.lineTo(12.0f, 21.0f);
        b.lineToRelative(0.38f, 0.09f);
        b.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        b.lineToRelative(0.42f, 0.11f);
        b.lineToRelative(1.9f, 0.48f);
        b.lineToRelative(0.0f, 0.0f);
        b.lineToRelative(0.67f, 0.17f);
        b.curveToRelative(0.32f, 0.08f, 0.62f, -0.16f, 0.62f, -0.49f);
        b.verticalLineToRelative(-0.37f);
        b.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        b.verticalLineToRelative(-0.21f);
        b.curveToRelative(0.0f, -0.18f, -0.09f, -0.34f, -0.24f, -0.43f);
        b.lineTo(13.5f, 19.0f);
        r6.h(b, -2.67f, 5.57f, 5.57f, 0.0f);
        b.lineToRelative(0.0f, 0.0f);
        b.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        b.reflectiveCurveToRelative(0.39f, -1.02f, 0.0f, -1.41f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b, 13.5f, 13.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _airplanemodeInactive = build;
        build.getClass();
        return build;
    }
}
