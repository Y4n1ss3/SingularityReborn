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
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AlarmKt {
    private static ImageVector _alarm;

    public static final ImageVector getAlarm(Icons.Filled filled) {
        ImageVector imageVector = _alarm;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Alarm", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        e.moveTo(12.5f, 8.0f);
        e.lineTo(11.0f, 8.0f);
        e.verticalLineToRelative(6.0f);
        e.lineToRelative(4.75f, 2.85f);
        e.lineToRelative(0.75f, -1.23f);
        gy.B(e, -4.0f, -2.37f, 12.5f, 8.0f);
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
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(e, -3.13f, 7.0f, -7.0f, 7.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _alarm = build;
        build.getClass();
        return build;
    }
}
