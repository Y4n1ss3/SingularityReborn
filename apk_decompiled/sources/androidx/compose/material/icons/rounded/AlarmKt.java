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
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AlarmKt {
    private static ImageVector _alarm;

    public static final ImageVector getAlarm(Icons.Rounded rounded) {
        ImageVector imageVector = _alarm;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Alarm", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(15.87f, 15.25f, -3.37f, -2.0f);
        e.lineTo(12.5f, 8.72f);
        e.curveToRelative(0.0f, -0.4f, -0.32f, -0.72f, -0.72f, -0.72f);
        e.horizontalLineToRelative(-0.06f);
        e.curveToRelative(-0.4f, 0.0f, -0.72f, 0.32f, -0.72f, 0.72f);
        e.verticalLineToRelative(4.72f);
        e.curveToRelative(0.0f, 0.35f, 0.18f, 0.68f, 0.49f, 0.86f);
        e.lineToRelative(3.65f, 2.19f);
        e.curveToRelative(0.34f, 0.2f, 0.78f, 0.1f, 0.98f, -0.24f);
        e.curveToRelative(0.21f, -0.35f, 0.1f, -0.8f, -0.25f, -1.0f);
        k4.r(e, 21.18f, 5.01f, 18.1f, 2.45f);
        e.curveToRelative(-0.42f, -0.35f, -1.05f, -0.3f, -1.41f, 0.13f);
        e.curveToRelative(-0.35f, 0.42f, -0.29f, 1.05f, 0.13f, 1.41f);
        e.lineToRelative(3.07f, 2.56f);
        e.curveToRelative(0.42f, 0.35f, 1.05f, 0.3f, 1.41f, -0.13f);
        e.curveToRelative(0.36f, -0.42f, 0.3f, -1.05f, -0.12f, -1.41f);
        k4.x(e, 4.1f, 6.55f, 3.07f, -2.56f);
        e.curveToRelative(0.43f, -0.36f, 0.49f, -0.99f, 0.13f, -1.41f);
        e.curveToRelative(-0.35f, -0.43f, -0.98f, -0.48f, -1.4f, -0.13f);
        e.lineTo(2.82f, 5.01f);
        e.curveToRelative(-0.42f, 0.36f, -0.48f, 0.99f, -0.12f, 1.41f);
        e.curveToRelative(0.35f, 0.43f, 0.98f, 0.48f, 1.4f, 0.13f);
        e.close();
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
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(e, -3.14f, 7.0f, -7.0f, 7.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _alarm = build;
        build.getClass();
        return build;
    }
}
