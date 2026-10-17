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
import defpackage.bv;
import defpackage.fc;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AlarmKt {
    private static ImageVector _alarm;

    public static final ImageVector getAlarm(Icons.TwoTone twoTone) {
        ImageVector imageVector = _alarm;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Alarm", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        k4.r(b, 15.75f, 16.85f, 11.0f, 14.0f);
        fc.w(b, 11.0f, 8.0f, 1.5f, 5.25f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(b, 4.0f, 2.37f, -0.75f, 1.23f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(12.5f, 8.0f, 11.0f, 8.0f, 6.0f);
        s.lineToRelative(4.75f, 2.85f);
        fc.C(s, 0.75f, -1.23f, -4.0f, -2.37f);
        s.moveTo(17.337f, 1.81f);
        s.lineToRelative(4.607f, 3.845f);
        fc.C(s, -1.28f, 1.535f, -4.61f, -3.843f);
        s.moveTo(6.663f, 1.81f);
        s.lineToRelative(1.282f, 1.536f);
        bv.o(s, 3.337f, 7.19f, -1.28f, -1.536f);
        s.moveTo(12.0f, 4.0f);
        s.curveToRelative(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
        s.reflectiveCurveToRelative(4.03f, 9.0f, 9.0f, 9.0f);
        s.reflectiveCurveToRelative(9.0f, -4.03f, 9.0f, -9.0f);
        s.reflectiveCurveToRelative(-4.03f, -9.0f, -9.0f, -9.0f);
        s.close();
        s.moveTo(12.0f, 20.0f);
        s.curveToRelative(-3.86f, 0.0f, -7.0f, -3.14f, -7.0f, -7.0f);
        s.reflectiveCurveToRelative(3.14f, -7.0f, 7.0f, -7.0f);
        s.reflectiveCurveToRelative(7.0f, 3.14f, 7.0f, 7.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(s, -3.14f, 7.0f, -7.0f, 7.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _alarm = build;
        build.getClass();
        return build;
    }
}
