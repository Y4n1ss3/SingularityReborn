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
import defpackage.bv;
import defpackage.fc;
import defpackage.kf0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SnoozeKt {
    private static ImageVector _snooze;

    public static final ImageVector getSnooze(Icons.Sharp sharp) {
        ImageVector imageVector = _snooze;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Snooze", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(9.0f, 11.0f, 3.63f, 9.0f, 15.2f);
        fc.w(p, 9.0f, 17.0f, 6.0f, -2.0f);
        p.horizontalLineToRelative(-3.63f);
        p.lineTo(15.0f, 10.8f);
        p.lineTo(15.0f, 9.0f);
        bv.r(p, 9.0f, 9.0f, 2.0f);
        p.moveTo(16.056f, 3.346f);
        p.lineToRelative(1.282f, -1.535f);
        fc.C(p, 4.607f, 3.85f, -1.28f, 1.54f);
        p.moveTo(3.336f, 7.19f);
        p.lineToRelative(-1.28f, -1.536f);
        bv.o(p, 6.662f, 1.81f, 1.28f, 1.536f);
        p.moveTo(12.0f, 6.0f);
        p.curveToRelative(3.86f, 0.0f, 7.0f, 3.14f, 7.0f, 7.0f);
        p.reflectiveCurveToRelative(-3.14f, 7.0f, -7.0f, 7.0f);
        p.reflectiveCurveToRelative(-7.0f, -3.14f, -7.0f, -7.0f);
        p.reflectiveCurveToRelative(3.14f, -7.0f, 7.0f, -7.0f);
        p.moveToRelative(0.0f, -2.0f);
        p.curveToRelative(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
        p.reflectiveCurveToRelative(4.03f, 9.0f, 9.0f, 9.0f);
        p.reflectiveCurveToRelative(9.0f, -4.03f, 9.0f, -9.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(p, -4.03f, -9.0f, -9.0f, -9.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _snooze = build;
        build.getClass();
        return build;
    }
}
