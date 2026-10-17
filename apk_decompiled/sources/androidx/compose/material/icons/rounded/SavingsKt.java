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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SavingsKt {
    private static ImageVector _savings;

    public static final ImageVector getSavings(Icons.Rounded rounded) {
        ImageVector imageVector = _savings;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Savings", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(19.83f, 7.5f, -2.27f, -2.27f);
        e.curveToRelative(0.07f, -0.42f, 0.18f, -0.81f, 0.32f, -1.15f);
        e.curveToRelative(0.11f, -0.26f, 0.15f, -0.56f, 0.09f, -0.87f);
        e.curveTo(17.84f, 2.49f, 17.14f, 1.99f, 16.4f, 2.0f);
        e.curveToRelative(-1.59f, 0.03f, -3.0f, 0.81f, -3.9f, 2.0f);
        e.lineToRelative(-5.0f, 0.0f);
        e.curveTo(4.46f, 4.0f, 2.0f, 6.46f, 2.0f, 9.5f);
        e.curveToRelative(0.0f, 2.25f, 1.37f, 7.48f, 2.08f, 10.04f);
        e.curveTo(4.32f, 20.4f, 5.11f, 21.0f, 6.01f, 21.0f);
        e.lineTo(8.0f, 21.0f);
        e.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        kf0.z(e, 0.0f, 2.0f, 0.0f);
        e.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        e.lineToRelative(2.01f, 0.0f);
        e.curveToRelative(0.88f, 0.0f, 1.66f, -0.58f, 1.92f, -1.43f);
        e.lineToRelative(1.25f, -4.16f);
        e.lineToRelative(2.14f, -0.72f);
        e.curveToRelative(0.41f, -0.14f, 0.68f, -0.52f, 0.68f, -0.95f);
        e.verticalLineTo(8.5f);
        e.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        kp0.B(e, 19.83f, 12.0f, 9.0f, 9.0f);
        e.curveTo(8.45f, 9.0f, 8.0f, 8.55f, 8.0f, 8.0f);
        e.verticalLineToRelative(0.0f);
        e.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        e.horizontalLineToRelative(3.0f);
        e.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        e.verticalLineToRelative(0.0f);
        e.curveTo(13.0f, 8.55f, 12.55f, 9.0f, 12.0f, 9.0f);
        e.close();
        e.moveTo(16.0f, 11.0f);
        e.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        e.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        e.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        e.curveTo(17.0f, 10.55f, 16.55f, 11.0f, 16.0f, 11.0f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _savings = build;
        build.getClass();
        return build;
    }
}
