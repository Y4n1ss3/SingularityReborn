package androidx.compose.material.icons.twotone;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.af0;
import defpackage.fc;
import defpackage.j50;
import defpackage.k4;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EmergencyRecordingKt {
    private static ImageVector _emergencyRecording;

    public static final ImageVector getEmergencyRecording(Icons.TwoTone twoTone) {
        ImageVector imageVector = _emergencyRecording;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.EmergencyRecording", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder w = kp0.w(4.0f, 6.0f, 12.0f, 12.0f, 6.0f);
        k4.w(w, 4.0f, 15.0f, 13.73f);
        w.lineToRelative(-1.0f, 1.73f);
        uo.x(w, -3.0f, -1.73f, 17.0f, 9.0f);
        w.verticalLineToRelative(-3.27f);
        w.lineToRelative(-3.0f, 1.73f);
        w.lineToRelative(-1.0f, -1.73f);
        w.lineTo(8.0f, 12.0f);
        w.lineToRelative(-3.0f, -1.73f);
        w.lineToRelative(1.0f, -1.73f);
        fc.u(w, 3.0f, 1.73f, 7.0f, 2.0f);
        w.verticalLineToRelative(3.27f);
        w.lineToRelative(3.0f, -1.73f);
        w.lineToRelative(1.0f, 1.73f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(w, 12.0f, 12.0f, 15.0f, 13.73f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(18.0f, 10.48f, 6.0f);
        d.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        d.horizontalLineTo(4.0f);
        d.curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f);
        d.verticalLineToRelative(12.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(12.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        j50.A(d, -4.48f, 4.0f, 3.98f, -11.0f);
        uo.l(d, 18.0f, 10.48f, 16.0f, 18.0f);
        uo.o(d, 4.0f, 6.0f, 12.0f, 18.0f);
        d.moveTo(12.0f, 12.0f);
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
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(d, 1.0f, 1.73f, 12.0f, 12.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _emergencyRecording = build;
        build.getClass();
        return build;
    }
}
