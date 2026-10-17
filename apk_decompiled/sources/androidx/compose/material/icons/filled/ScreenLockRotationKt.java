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
import defpackage.fc;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ScreenLockRotationKt {
    private static ImageVector _screenLockRotation;

    public static final ImageVector getScreenLockRotation(Icons.Filled filled) {
        ImageVector imageVector = _screenLockRotation;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ScreenLockRotation", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(23.25f, 12.77f, -2.57f, -2.57f);
        e.lineToRelative(-1.41f, 1.41f);
        e.lineToRelative(2.22f, 2.22f);
        e.lineToRelative(-5.66f, 5.66f);
        e.lineTo(4.51f, 8.17f);
        e.lineToRelative(5.66f, -5.66f);
        e.lineToRelative(2.1f, 2.1f);
        e.lineToRelative(1.41f, -1.41f);
        e.lineTo(11.23f, 0.75f);
        e.curveToRelative(-0.59f, -0.59f, -1.54f, -0.59f, -2.12f, 0.0f);
        e.lineTo(2.75f, 7.11f);
        e.curveToRelative(-0.59f, 0.59f, -0.59f, 1.54f, 0.0f, 2.12f);
        e.lineToRelative(12.02f, 12.02f);
        e.curveToRelative(0.59f, 0.59f, 1.54f, 0.59f, 2.12f, 0.0f);
        e.lineToRelative(6.36f, -6.36f);
        e.curveToRelative(0.59f, -0.59f, 0.59f, -1.54f, 0.0f, -2.12f);
        e.close();
        e.moveTo(8.47f, 20.48f);
        e.curveTo(5.2f, 18.94f, 2.86f, 15.76f, 2.5f, 12.0f);
        e.lineTo(1.0f, 12.0f);
        e.curveToRelative(0.51f, 6.16f, 5.66f, 11.0f, 11.95f, 11.0f);
        e.lineToRelative(0.66f, -0.03f);
        fc.C(e, -3.81f, -3.82f, -1.33f, 1.33f);
        e.moveTo(16.0f, 9.0f);
        e.horizontalLineToRelative(5.0f);
        e.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        e.lineTo(22.0f, 4.0f);
        e.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        e.verticalLineToRelative(-0.5f);
        e.curveTo(21.0f, 1.12f, 19.88f, 0.0f, 18.5f, 0.0f);
        e.reflectiveCurveTo(16.0f, 1.12f, 16.0f, 2.5f);
        e.lineTo(16.0f, 3.0f);
        e.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        e.verticalLineToRelative(4.0f);
        e.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        e.close();
        e.moveTo(16.8f, 2.5f);
        e.curveToRelative(0.0f, -0.94f, 0.76f, -1.7f, 1.7f, -1.7f);
        e.reflectiveCurveToRelative(1.7f, 0.76f, 1.7f, 1.7f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.x(e, 20.2f, 3.0f, -3.4f, -0.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _screenLockRotation = build;
        build.getClass();
        return build;
    }
}
