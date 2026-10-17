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
import defpackage.j50;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EmergencyRecordingKt {
    private static ImageVector _emergencyRecording;

    public static final ImageVector getEmergencyRecording(Icons.Rounded rounded) {
        ImageVector imageVector = _emergencyRecording;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.EmergencyRecording", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(18.0f, 10.48f, 6.0f);
        d.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        d.horizontalLineTo(4.0f);
        d.curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f);
        d.verticalLineToRelative(12.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(12.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineToRelative(-4.48f);
        d.lineToRelative(3.15f, 3.13f);
        d.curveTo(21.46f, 16.97f, 22.0f, 16.74f, 22.0f, 16.3f);
        d.verticalLineTo(7.7f);
        d.curveToRelative(0.0f, -0.44f, -0.54f, -0.67f, -0.85f, -0.35f);
        uo.l(d, 18.0f, 10.48f, 14.5f, 14.6f);
        d.curveToRelative(-0.28f, 0.48f, -0.89f, 0.64f, -1.37f, 0.37f);
        d.lineTo(11.0f, 13.73f);
        d.verticalLineTo(16.0f);
        d.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        d.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        d.verticalLineToRelative(-2.27f);
        d.lineToRelative(-2.13f, 1.23f);
        d.curveToRelative(-0.48f, 0.28f, -1.09f, 0.11f, -1.37f, -0.37f);
        d.curveToRelative(-0.28f, -0.48f, -0.11f, -1.09f, 0.37f, -1.37f);
        d.lineTo(8.0f, 12.0f);
        d.lineToRelative(-2.13f, -1.23f);
        d.curveTo(5.39f, 10.49f, 5.22f, 9.88f, 5.5f, 9.4f);
        d.curveToRelative(0.28f, -0.48f, 0.89f, -0.64f, 1.37f, -0.37f);
        d.lineTo(9.0f, 10.27f);
        d.verticalLineTo(8.0f);
        d.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        d.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        d.verticalLineToRelative(2.27f);
        d.lineToRelative(2.13f, -1.23f);
        d.curveToRelative(0.48f, -0.28f, 1.09f, -0.11f, 1.37f, 0.37f);
        d.curveToRelative(0.28f, 0.48f, 0.11f, 1.09f, -0.37f, 1.37f);
        d.lineTo(12.0f, 12.0f);
        d.lineToRelative(2.13f, 1.23f);
        d.curveTo(14.61f, 13.51f, 14.78f, 14.12f, 14.5f, 14.6f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _emergencyRecording = build;
        build.getClass();
        return build;
    }
}
