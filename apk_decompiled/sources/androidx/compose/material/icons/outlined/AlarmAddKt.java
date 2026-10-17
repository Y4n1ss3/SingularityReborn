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
import defpackage.bv;
import defpackage.fc;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AlarmAddKt {
    private static ImageVector _alarmAdd;

    public static final ImageVector getAlarmAdd(Icons.Outlined outlined) {
        ImageVector imageVector = _alarmAdd;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.AlarmAdd", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(17.337f, 1.81f, 4.607f, 3.845f);
        fc.C(e, -1.28f, 1.535f, -4.61f, -3.843f);
        e.moveTo(6.663f, 1.81f);
        e.lineToRelative(1.282f, 1.536f);
        bv.o(e, 3.337f, 7.19f, -1.28f, -1.536f);
        e.moveTo(12.0f, 4.0f);
        e.curveToRelative(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
        e.reflectiveCurveToRelative(4.03f, 9.0f, 9.0f, 9.0f);
        e.reflectiveCurveToRelative(9.0f, -4.03f, 9.0f, -9.0f);
        e.reflectiveCurveToRelative(-4.03f, -9.0f, -9.0f, -9.0f);
        e.close();
        e.moveTo(12.0f, 20.0f);
        e.curveToRelative(-3.86f, 0.0f, -7.0f, -3.14f, -7.0f, -7.0f);
        e.reflectiveCurveToRelative(3.14f, -7.0f, 7.0f, -7.0f);
        e.reflectiveCurveToRelative(7.0f, 3.14f, 7.0f, 7.0f);
        e.reflectiveCurveToRelative(-3.14f, 7.0f, -7.0f, 7.0f);
        r6.B(e, 13.0f, 9.0f, -2.0f, 3.0f);
        af0.m(e, 8.0f, 12.0f, 2.0f, 3.0f);
        r6.D(e, 3.0f, 2.0f, -3.0f, 3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.s(e, -2.0f, -3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _alarmAdd = build;
        build.getClass();
        return build;
    }
}
