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
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AddAlarmKt {
    private static ImageVector _addAlarm;

    public static final ImageVector getAddAlarm(Icons.TwoTone twoTone) {
        ImageVector imageVector = _addAlarm;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.AddAlarm", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 6.0f);
        b.curveToRelative(-3.87f, 0.0f, -7.0f, 3.13f, -7.0f, 7.0f);
        b.reflectiveCurveToRelative(3.13f, 7.0f, 7.0f, 7.0f);
        b.reflectiveCurveToRelative(7.0f, -3.13f, 7.0f, -7.0f);
        b.reflectiveCurveToRelative(-3.13f, -7.0f, -7.0f, -7.0f);
        r6.B(b, 16.0f, 14.0f, -3.0f, 3.0f);
        bv.C(b, -2.0f, -3.0f, 8.0f, 14.0f);
        uo.B(b, -2.0f, 3.0f, 11.0f, 9.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.k(b, 2.0f, 3.0f, 3.0f, 2.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(12.0f, 4.0f);
        b2.curveToRelative(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
        b2.reflectiveCurveToRelative(4.02f, 9.0f, 9.0f, 9.0f);
        b2.curveToRelative(4.97f, 0.0f, 9.0f, -4.03f, 9.0f, -9.0f);
        b2.reflectiveCurveToRelative(-4.03f, -9.0f, -9.0f, -9.0f);
        b2.close();
        b2.moveTo(12.0f, 20.0f);
        b2.curveToRelative(-3.87f, 0.0f, -7.0f, -3.13f, -7.0f, -7.0f);
        b2.reflectiveCurveToRelative(3.13f, -7.0f, 7.0f, -7.0f);
        b2.reflectiveCurveToRelative(7.0f, 3.13f, 7.0f, 7.0f);
        b2.reflectiveCurveToRelative(-3.13f, 7.0f, -7.0f, 7.0f);
        r6.B(b2, 13.0f, 9.0f, -2.0f, 3.0f);
        af0.m(b2, 8.0f, 12.0f, 2.0f, 3.0f);
        r6.D(b2, 3.0f, 2.0f, -3.0f, 3.0f);
        kf0.C(b2, -2.0f, -3.0f, 22.0f, 5.72f);
        b2.lineToRelative(-4.6f, -3.86f);
        fc.C(b2, -1.29f, 1.53f, 4.6f, 3.86f);
        b2.moveTo(7.88f, 3.39f);
        b2.lineTo(6.6f, 1.86f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.u(b2, 2.0f, 5.71f, 1.29f, 1.53f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addAlarm = build;
        build.getClass();
        return build;
    }
}
