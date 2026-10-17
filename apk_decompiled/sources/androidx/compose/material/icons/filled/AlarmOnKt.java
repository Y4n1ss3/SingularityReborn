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
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AlarmOnKt {
    private static ImageVector _alarmOn;

    public static final ImageVector getAlarmOn(Icons.Filled filled) {
        ImageVector imageVector = _alarmOn;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.AlarmOn", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(22.0f, 5.72f, -4.6f, -3.86f);
        e.lineToRelative(-1.29f, 1.53f);
        gy.B(e, 4.6f, 3.86f, 22.0f, 5.72f);
        e.moveTo(7.88f, 3.39f);
        e.lineTo(6.6f, 1.86f);
        e.lineTo(2.0f, 5.71f);
        fc.C(e, 1.29f, 1.53f, 4.59f, -3.85f);
        e.moveTo(12.0f, 4.0f);
        e.curveToRelative(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
        e.reflectiveCurveToRelative(4.02f, 9.0f, 9.0f, 9.0f);
        e.curveToRelative(4.97f, 0.0f, 9.0f, -4.03f, 9.0f, -9.0f);
        e.reflectiveCurveToRelative(-4.03f, -9.0f, -9.0f, -9.0f);
        e.close();
        e.moveTo(12.0f, 20.0f);
        e.curveToRelative(-3.87f, 0.0f, -7.0f, -3.13f, -7.0f, -7.0f);
        e.reflectiveCurveToRelative(3.13f, -7.0f, 7.0f, -7.0f);
        e.reflectiveCurveToRelative(7.0f, 3.13f, 7.0f, 7.0f);
        e.reflectiveCurveToRelative(-3.13f, 7.0f, -7.0f, 7.0f);
        k4.r(e, 10.54f, 14.53f, 8.41f, 12.4f);
        e.lineToRelative(-1.06f, 1.06f);
        e.lineToRelative(3.18f, 3.18f);
        e.lineToRelative(6.0f, -6.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, -1.06f, -1.06f, -4.93f, 4.95f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _alarmOn = build;
        build.getClass();
        return build;
    }
}
