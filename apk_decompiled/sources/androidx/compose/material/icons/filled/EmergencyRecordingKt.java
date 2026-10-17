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
import defpackage.j50;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EmergencyRecordingKt {
    private static ImageVector _emergencyRecording;

    public static final ImageVector getEmergencyRecording(Icons.Filled filled) {
        ImageVector imageVector = _emergencyRecording;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.EmergencyRecording", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        j50.A(d, -4.48f, 4.0f, 3.98f, -11.0f);
        uo.l(d, 18.0f, 10.48f, 12.0f, 12.0f);
        d.lineToRelative(3.0f, 1.73f);
        d.lineToRelative(-1.0f, 1.73f);
        uo.x(d, -3.0f, -1.73f, 17.0f, 9.0f);
        d.verticalLineToRelative(-3.27f);
        d.lineToRelative(-3.0f, 1.73f);
        d.lineToRelative(-1.0f, -1.73f);
        d.lineTo(8.0f, 12.0f);
        d.lineToRelative(-3.0f, -1.73f);
        d.lineToRelative(1.0f, -1.73f);
        fc.u(d, 3.0f, 1.73f, 7.0f, 2.0f);
        d.verticalLineToRelative(3.27f);
        d.lineToRelative(3.0f, -1.73f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(d, 1.0f, 1.73f, 12.0f, 12.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _emergencyRecording = build;
        build.getClass();
        return build;
    }
}
