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
import defpackage.bv;
import defpackage.fc;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AlarmOnKt {
    private static ImageVector _alarmOn;

    public static final ImageVector getAlarmOn(Icons.TwoTone twoTone) {
        ImageVector imageVector = _alarmOn;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.AlarmOn", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 6.0f);
        b.curveToRelative(-3.86f, 0.0f, -7.0f, 3.14f, -7.0f, 7.0f);
        b.reflectiveCurveToRelative(3.14f, 7.0f, 7.0f, 7.0f);
        b.reflectiveCurveToRelative(7.0f, -3.14f, 7.0f, -7.0f);
        b.reflectiveCurveToRelative(-3.14f, -7.0f, -7.0f, -7.0f);
        k4.x(b, 10.53f, 16.64f, -3.18f, -3.18f);
        b.lineToRelative(1.06f, -1.06f);
        b.lineToRelative(2.13f, 2.13f);
        b.lineToRelative(4.93f, -4.95f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(b, 1.06f, 1.06f, -6.0f, 6.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(10.54f, 14.53f, 8.41f, 12.4f);
        i.lineToRelative(-1.06f, 1.06f);
        i.lineToRelative(3.18f, 3.18f);
        fc.C(i, 6.0f, -6.0f, -1.06f, -1.06f);
        i.moveTo(17.337f, 1.81f);
        i.lineToRelative(4.607f, 3.845f);
        fc.C(i, -1.28f, 1.535f, -4.61f, -3.843f);
        i.moveTo(6.663f, 1.81f);
        i.lineToRelative(1.282f, 1.536f);
        bv.o(i, 3.337f, 7.19f, -1.28f, -1.536f);
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
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(i, -3.14f, 7.0f, -7.0f, 7.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _alarmOn = build;
        build.getClass();
        return build;
    }
}
