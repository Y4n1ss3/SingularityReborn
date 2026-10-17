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
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PropaneKt {
    private static ImageVector _propane;

    public static final ImageVector getPropane(Icons.Rounded rounded) {
        ImageVector imageVector = _propane;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Propane", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder u = kp0.u(16.75f, 6.0f, 16.0f, 6.0f, 5.0f);
        u.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        u.horizontalLineToRelative(-4.0f);
        u.curveTo(8.9f, 3.0f, 8.0f, 3.9f, 8.0f, 5.0f);
        u.verticalLineToRelative(1.0f);
        u.lineTo(7.25f, 6.0f);
        u.curveTo(3.97f, 6.0f, 1.1f, 8.53f, 1.0f, 11.82f);
        u.curveTo(0.9f, 15.21f, 3.62f, 18.0f, 7.0f, 18.0f);
        u.verticalLineToRelative(2.0f);
        u.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        u.horizontalLineToRelative(0.0f);
        u.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        kf0.z(u, -2.0f, 6.0f, 2.0f);
        u.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        u.horizontalLineToRelative(0.0f);
        u.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        u.verticalLineToRelative(-2.0f);
        u.curveToRelative(3.38f, 0.0f, 6.1f, -2.79f, 6.0f, -6.18f);
        u.curveTo(22.9f, 8.53f, 20.03f, 6.0f, 16.75f, 6.0f);
        r6.B(u, 10.0f, 5.0f, 4.0f, 1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(u, -4.0f, 5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _propane = build;
        build.getClass();
        return build;
    }
}
