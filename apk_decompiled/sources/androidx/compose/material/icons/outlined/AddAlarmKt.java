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
import defpackage.af0;
import defpackage.fc;
import defpackage.gy;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AddAlarmKt {
    private static ImageVector _addAlarm;

    public static final ImageVector getAddAlarm(Icons.Outlined outlined) {
        ImageVector imageVector = _addAlarm;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.AddAlarm", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(7.88f, 3.39f, 6.6f, 1.86f);
        i.lineTo(2.0f, 5.71f);
        fc.C(i, 1.29f, 1.53f, 4.59f, -3.85f);
        i.moveTo(22.0f, 5.72f);
        i.lineToRelative(-4.6f, -3.86f);
        i.lineToRelative(-1.29f, 1.53f);
        gy.B(i, 4.6f, 3.86f, 22.0f, 5.72f);
        i.moveTo(12.0f, 4.0f);
        i.curveToRelative(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
        i.reflectiveCurveToRelative(4.02f, 9.0f, 9.0f, 9.0f);
        i.curveToRelative(4.97f, 0.0f, 9.0f, -4.03f, 9.0f, -9.0f);
        i.reflectiveCurveToRelative(-4.03f, -9.0f, -9.0f, -9.0f);
        i.close();
        i.moveTo(12.0f, 20.0f);
        i.curveToRelative(-3.87f, 0.0f, -7.0f, -3.13f, -7.0f, -7.0f);
        i.reflectiveCurveToRelative(3.13f, -7.0f, 7.0f, -7.0f);
        i.reflectiveCurveToRelative(7.0f, 3.13f, 7.0f, 7.0f);
        i.reflectiveCurveToRelative(-3.13f, 7.0f, -7.0f, 7.0f);
        r6.B(i, 13.0f, 9.0f, -2.0f, 3.0f);
        af0.m(i, 8.0f, 12.0f, 2.0f, 3.0f);
        r6.D(i, 3.0f, 2.0f, -3.0f, 3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.e(i, -2.0f, -3.0f, 13.0f, 9.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addAlarm = build;
        build.getClass();
        return build;
    }
}
