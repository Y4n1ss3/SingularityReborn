package androidx.compose.material.icons.outlined;

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
public final class AccessAlarmsKt {
    private static ImageVector _accessAlarms;

    public static final ImageVector getAccessAlarms(Icons.Outlined outlined) {
        ImageVector imageVector = _accessAlarms;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.AccessAlarms", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(22.0f, 5.7f, -4.6f, -3.9f);
        e.lineToRelative(-1.3f, 1.5f);
        gy.B(e, 4.6f, 3.9f, 22.0f, 5.7f);
        e.moveTo(7.9f, 3.4f);
        e.lineTo(6.6f, 1.9f);
        e.lineTo(2.0f, 5.7f);
        fc.C(e, 1.3f, 1.5f, 4.6f, -3.8f);
        e.moveTo(12.5f, 8.0f);
        e.lineTo(11.0f, 8.0f);
        e.verticalLineToRelative(6.0f);
        e.lineToRelative(4.7f, 2.9f);
        e.lineToRelative(0.8f, -1.2f);
        gy.B(e, -4.0f, -2.4f, 12.5f, 8.0f);
        e.moveTo(12.0f, 4.0f);
        e.curveToRelative(-5.0f, 0.0f, -9.0f, 4.0f, -9.0f, 9.0f);
        e.reflectiveCurveToRelative(4.0f, 9.0f, 9.0f, 9.0f);
        e.reflectiveCurveToRelative(9.0f, -4.0f, 9.0f, -9.0f);
        e.reflectiveCurveToRelative(-4.0f, -9.0f, -9.0f, -9.0f);
        e.close();
        e.moveTo(12.0f, 20.0f);
        e.curveToRelative(-3.9f, 0.0f, -7.0f, -3.1f, -7.0f, -7.0f);
        e.reflectiveCurveToRelative(3.1f, -7.0f, 7.0f, -7.0f);
        e.reflectiveCurveToRelative(7.0f, 3.1f, 7.0f, 7.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(e, -3.1f, 7.0f, -7.0f, 7.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _accessAlarms = build;
        build.getClass();
        return build;
    }
}
