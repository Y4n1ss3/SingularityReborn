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
import defpackage.bv;
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AlarmOffKt {
    private static ImageVector _alarmOff;

    public static final ImageVector getAlarmOff(Icons.Filled filled) {
        ImageVector imageVector = _alarmOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.AlarmOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 6.0f);
        b.curveToRelative(3.87f, 0.0f, 7.0f, 3.13f, 7.0f, 7.0f);
        b.curveToRelative(0.0f, 0.84f, -0.16f, 1.65f, -0.43f, 2.4f);
        b.lineToRelative(1.52f, 1.52f);
        b.curveToRelative(0.58f, -1.19f, 0.91f, -2.51f, 0.91f, -3.92f);
        b.curveToRelative(0.0f, -4.97f, -4.03f, -9.0f, -9.0f, -9.0f);
        b.curveToRelative(-1.41f, 0.0f, -2.73f, 0.33f, -3.92f, 0.91f);
        b.lineTo(9.6f, 6.43f);
        b.curveTo(10.35f, 6.16f, 11.16f, 6.0f, 12.0f, 6.0f);
        k4.x(b, 22.0f, 5.72f, -4.6f, -3.86f);
        b.lineToRelative(-1.29f, 1.53f);
        gy.B(b, 4.6f, 3.86f, 22.0f, 5.72f);
        b.moveTo(2.92f, 2.29f);
        b.lineTo(1.65f, 3.57f);
        b.lineTo(2.98f, 4.9f);
        b.lineToRelative(-1.11f, 0.93f);
        b.lineToRelative(1.42f, 1.42f);
        b.lineToRelative(1.11f, -0.94f);
        b.lineToRelative(0.8f, 0.8f);
        b.curveTo(3.83f, 8.69f, 3.0f, 10.75f, 3.0f, 13.0f);
        b.curveToRelative(0.0f, 4.97f, 4.02f, 9.0f, 9.0f, 9.0f);
        b.curveToRelative(2.25f, 0.0f, 4.31f, -0.83f, 5.89f, -2.2f);
        b.lineToRelative(2.2f, 2.2f);
        b.lineToRelative(1.27f, -1.27f);
        bv.o(b, 3.89f, 3.27f, -0.97f, -0.98f);
        b.moveTo(16.47f, 18.39f);
        b.curveTo(15.26f, 19.39f, 13.7f, 20.0f, 12.0f, 20.0f);
        b.curveToRelative(-3.87f, 0.0f, -7.0f, -3.13f, -7.0f, -7.0f);
        b.curveToRelative(0.0f, -1.7f, 0.61f, -3.26f, 1.61f, -4.47f);
        fc.B(b, 9.86f, 9.86f, 8.02f, 3.28f);
        b.lineTo(6.6f, 1.86f);
        b.lineToRelative(-0.86f, 0.71f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(b, 1.42f, 1.42f, 0.86f, -0.71f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _alarmOff = build;
        build.getClass();
        return build;
    }
}
