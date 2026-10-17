package androidx.compose.material.icons.sharp;

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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AlarmOffKt {
    private static ImageVector _alarmOff;

    public static final ImageVector getAlarmOff(Icons.Sharp sharp) {
        ImageVector imageVector = _alarmOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.AlarmOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(10.04f, 6.29f);
        b.curveTo(10.66f, 6.11f, 11.32f, 6.0f, 12.0f, 6.0f);
        b.curveToRelative(3.86f, 0.0f, 7.0f, 3.14f, 7.0f, 7.0f);
        b.curveToRelative(0.0f, 0.68f, -0.11f, 1.34f, -0.29f, 1.96f);
        b.lineToRelative(1.56f, 1.56f);
        b.curveToRelative(0.47f, -1.08f, 0.73f, -2.27f, 0.73f, -3.52f);
        b.curveToRelative(0.0f, -4.97f, -4.03f, -9.0f, -9.0f, -9.0f);
        b.curveToRelative(-1.25f, 0.0f, -2.44f, 0.26f, -3.53f, 0.72f);
        fc.B(b, 1.57f, 1.57f, 17.337f, 1.81f);
        b.lineToRelative(4.607f, 3.845f);
        fc.C(b, -1.28f, 1.535f, -4.61f, -3.843f);
        b.moveTo(3.02f, 2.1f);
        b.lineTo(1.61f, 3.51f);
        b.lineToRelative(1.37f, 1.37f);
        b.lineToRelative(-0.92f, 0.77f);
        b.lineToRelative(1.28f, 1.54f);
        b.lineToRelative(1.06f, -0.88f);
        b.lineToRelative(0.8f, 0.8f);
        b.curveTo(3.83f, 8.69f, 3.0f, 10.75f, 3.0f, 13.0f);
        b.curveToRelative(0.0f, 4.97f, 4.03f, 9.0f, 9.0f, 9.0f);
        b.curveToRelative(2.25f, 0.0f, 4.31f, -0.83f, 5.89f, -2.2f);
        b.lineToRelative(2.1f, 2.1f);
        gy.B(b, 1.41f, -1.41f, 3.02f, 2.1f);
        b.moveTo(12.0f, 20.0f);
        b.curveToRelative(-3.86f, 0.0f, -7.0f, -3.14f, -7.0f, -7.0f);
        b.curveToRelative(0.0f, -1.7f, 0.61f, -3.26f, 1.62f, -4.47f);
        b.lineToRelative(9.85f, 9.85f);
        b.curveTo(15.26f, 19.39f, 13.7f, 20.0f, 12.0f, 20.0f);
        k4.x(b, 7.48f, 3.73f, 0.46f, -0.38f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(b, -1.28f, -1.54f, -0.6f, 0.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _alarmOff = build;
        build.getClass();
        return build;
    }
}
