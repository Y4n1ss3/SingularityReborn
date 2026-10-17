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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EmergencyKt {
    private static ImageVector _emergency;

    public static final ImageVector getEmergency(Icons.Rounded rounded) {
        ImageVector imageVector = _emergency;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Emergency", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(20.29f, 8.37f, -1.0f, -1.73f);
        e.curveToRelative(-0.28f, -0.48f, -0.89f, -0.64f, -1.37f, -0.37f);
        e.lineTo(14.0f, 8.54f);
        e.verticalLineTo(4.0f);
        e.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        e.horizontalLineToRelative(-2.0f);
        e.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        e.verticalLineToRelative(4.54f);
        e.lineTo(6.07f, 6.27f);
        e.curveTo(5.59f, 5.99f, 4.98f, 6.16f, 4.71f, 6.63f);
        e.lineToRelative(-1.0f, 1.73f);
        e.curveTo(3.43f, 8.84f, 3.59f, 9.46f, 4.07f, 9.73f);
        e.lineTo(8.0f, 12.0f);
        e.lineToRelative(-3.93f, 2.27f);
        e.curveToRelative(-0.48f, 0.28f, -0.64f, 0.89f, -0.37f, 1.37f);
        e.lineToRelative(1.0f, 1.73f);
        e.curveToRelative(0.28f, 0.48f, 0.89f, 0.64f, 1.37f, 0.37f);
        e.lineTo(10.0f, 15.46f);
        e.verticalLineTo(20.0f);
        e.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        e.horizontalLineToRelative(2.0f);
        e.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        e.verticalLineToRelative(-4.54f);
        e.lineToRelative(3.93f, 2.27f);
        e.curveToRelative(0.48f, 0.28f, 1.09f, 0.11f, 1.37f, -0.37f);
        e.lineToRelative(1.0f, -1.73f);
        e.curveToRelative(0.28f, -0.48f, 0.11f, -1.09f, -0.37f, -1.37f);
        e.lineTo(16.0f, 12.0f);
        e.lineToRelative(3.93f, -2.27f);
        e.curveTo(20.41f, 9.46f, 20.57f, 8.84f, 20.29f, 8.37f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _emergency = build;
        build.getClass();
        return build;
    }
}
