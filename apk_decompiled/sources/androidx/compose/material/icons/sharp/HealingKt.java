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
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HealingKt {
    private static ImageVector _healing;

    public static final ImageVector getHealing(Icons.Sharp sharp) {
        ImageVector imageVector = _healing;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Healing", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(17.74f, 12.01f, 4.68f, -4.68f);
        e.lineToRelative(-5.75f, -5.75f);
        e.lineToRelative(-4.68f, 4.68f);
        e.lineTo(7.3f, 1.58f);
        e.lineTo(1.55f, 7.34f);
        e.lineToRelative(4.68f, 4.69f);
        e.lineToRelative(-4.68f, 4.68f);
        e.lineToRelative(5.75f, 5.75f);
        e.lineToRelative(4.68f, -4.68f);
        e.lineToRelative(4.69f, 4.69f);
        fc.C(e, 5.76f, -5.76f, -4.69f, -4.7f);
        e.moveTo(12.0f, 9.0f);
        e.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        e.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        e.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        e.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        k4.r(e, 7.29f, 10.96f, 3.66f, 7.34f);
        e.lineToRelative(3.63f, -3.63f);
        fc.C(e, 3.62f, 3.62f, -3.62f, 3.63f);
        e.moveTo(10.0f, 13.0f);
        e.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        e.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        e.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        e.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        e.close();
        e.moveTo(12.0f, 15.0f);
        e.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        e.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        e.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        e.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        e.close();
        e.moveTo(14.0f, 11.0f);
        e.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        e.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        e.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        e.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        k4.x(e, 16.66f, 20.34f, -3.63f, -3.62f);
        e.lineToRelative(3.63f, -3.63f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, 3.62f, 3.62f, -3.62f, 3.63f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _healing = build;
        build.getClass();
        return build;
    }
}
