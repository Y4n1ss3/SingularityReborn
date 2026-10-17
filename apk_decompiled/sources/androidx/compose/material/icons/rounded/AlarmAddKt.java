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
import defpackage.af0;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AlarmAddKt {
    private static ImageVector _alarmAdd;

    public static final ImageVector getAlarmAdd(Icons.Rounded rounded) {
        ImageVector imageVector = _alarmAdd;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AlarmAdd", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(21.18f, 5.01f, 18.1f, 2.45f);
        i.curveToRelative(-0.42f, -0.35f, -1.05f, -0.3f, -1.41f, 0.13f);
        i.curveToRelative(-0.35f, 0.42f, -0.29f, 1.05f, 0.13f, 1.41f);
        i.lineToRelative(3.07f, 2.56f);
        i.curveToRelative(0.42f, 0.35f, 1.05f, 0.3f, 1.41f, -0.13f);
        i.curveToRelative(0.36f, -0.42f, 0.3f, -1.05f, -0.12f, -1.41f);
        k4.x(i, 4.1f, 6.55f, 3.07f, -2.56f);
        i.curveToRelative(0.43f, -0.36f, 0.49f, -0.99f, 0.13f, -1.41f);
        i.curveToRelative(-0.35f, -0.43f, -0.98f, -0.48f, -1.4f, -0.13f);
        i.lineTo(2.82f, 5.01f);
        i.curveToRelative(-0.42f, 0.36f, -0.48f, 0.99f, -0.12f, 1.41f);
        i.curveToRelative(0.35f, 0.43f, 0.98f, 0.48f, 1.4f, 0.13f);
        i.close();
        i.moveTo(12.0f, 4.0f);
        i.curveToRelative(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
        i.reflectiveCurveToRelative(4.03f, 9.0f, 9.0f, 9.0f);
        i.reflectiveCurveToRelative(9.0f, -4.03f, 9.0f, -9.0f);
        i.reflectiveCurveToRelative(-4.03f, -9.0f, -9.0f, -9.0f);
        i.close();
        i.moveTo(12.0f, 20.0f);
        i.curveToRelative(-3.86f, 0.0f, -7.0f, -3.14f, -7.0f, -7.0f);
        i.reflectiveCurveToRelative(3.14f, -7.0f, 7.0f, -7.0f);
        i.reflectiveCurveToRelative(7.0f, 3.14f, 7.0f, 7.0f);
        i.reflectiveCurveToRelative(-3.14f, 7.0f, -7.0f, 7.0f);
        r6.B(i, 15.0f, 12.0f, -2.0f, -2.0f);
        i.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        i.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        i.verticalLineToRelative(2.0f);
        i.lineTo(9.0f, 12.0f);
        i.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        i.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        i.horizontalLineToRelative(2.0f);
        i.verticalLineToRelative(2.0f);
        i.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        i.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        i.verticalLineToRelative(-2.0f);
        i.horizontalLineToRelative(2.0f);
        i.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(i, -0.45f, -1.0f, -1.0f, -1.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _alarmAdd = build;
        build.getClass();
        return build;
    }
}
