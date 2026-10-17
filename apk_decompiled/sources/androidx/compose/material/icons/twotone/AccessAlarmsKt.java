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
import defpackage.fc;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AccessAlarmsKt {
    private static ImageVector _accessAlarms;

    public static final ImageVector getAccessAlarms(Icons.TwoTone twoTone) {
        ImageVector imageVector = _accessAlarms;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.AccessAlarms", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 6.0f);
        b.curveToRelative(-3.9f, 0.0f, -7.0f, 3.1f, -7.0f, 7.0f);
        b.reflectiveCurveToRelative(3.1f, 7.0f, 7.0f, 7.0f);
        b.reflectiveCurveToRelative(7.0f, -3.1f, 7.0f, -7.0f);
        b.reflectiveCurveToRelative(-3.1f, -7.0f, -7.0f, -7.0f);
        k4.r(b, 15.7f, 16.9f, 11.0f, 14.0f);
        fc.w(b, 11.0f, 8.0f, 1.5f, 5.3f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(b, 4.0f, 2.4f, -0.8f, 1.2f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(22.0f, 5.7f, -4.6f, -3.9f);
        fc.C(e, -1.3f, 1.5f, 4.6f, 3.9f);
        e.moveTo(12.5f, 8.0f);
        e.lineTo(11.0f, 8.0f);
        e.verticalLineToRelative(6.0f);
        e.lineToRelative(4.7f, 2.9f);
        fc.C(e, 0.8f, -1.2f, -4.0f, -2.4f);
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
        e.reflectiveCurveToRelative(-3.1f, 7.0f, -7.0f, 7.0f);
        k4.r(e, 7.9f, 3.4f, 6.6f, 1.9f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.u(e, 2.0f, 5.7f, 1.3f, 1.5f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _accessAlarms = build;
        build.getClass();
        return build;
    }
}
