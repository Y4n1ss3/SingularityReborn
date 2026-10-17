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
import defpackage.af0;
import defpackage.bv;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.kp0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CleanHandsKt {
    private static ImageVector _cleanHands;

    public static final ImageVector getCleanHands(Icons.Sharp sharp) {
        ImageVector imageVector = _cleanHands;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.CleanHands", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(14.99f, 7.0f, 1.37f, -0.63f);
        e.lineTo(16.99f, 5.0f);
        e.lineToRelative(0.63f, 1.37f);
        e.lineTo(18.99f, 7.0f);
        e.lineToRelative(-1.37f, 0.63f);
        e.lineTo(16.99f, 9.0f);
        gy.B(e, -0.63f, -1.37f, 14.99f, 7.0f);
        e.moveTo(20.0f, 14.0f);
        e.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        e.curveToRelative(0.0f, -1.1f, -2.0f, -4.0f, -2.0f, -4.0f);
        e.reflectiveCurveToRelative(-2.0f, 2.9f, -2.0f, 4.0f);
        e.curveTo(18.0f, 13.1f, 18.9f, 14.0f, 20.0f, 14.0f);
        af0.r(e, 1.0f, 22.0f, 4.0f, 11.0f);
        bv.s(e, 1.0f, 22.0f, 9.24f, 9.5f);
        e.lineTo(15.0f, 11.65f);
        e.verticalLineTo(11.0f);
        e.curveToRelative(0.0f, -2.42f, -1.72f, -4.44f, -4.0f, -4.9f);
        e.verticalLineTo(4.0f);
        e.horizontalLineToRelative(2.0f);
        e.curveToRelative(0.57f, 0.0f, 1.1f, 0.17f, 1.55f, 0.45f);
        e.lineToRelative(1.43f, -1.43f);
        e.curveTo(15.15f, 2.39f, 14.13f, 2.0f, 13.0f, 2.0f);
        e.curveToRelative(-1.48f, 0.0f, -5.5f, 0.0f, -5.5f, 0.0f);
        r6.s(e, 2.0f, 9.0f, 2.11f);
        e.curveTo(7.22f, 6.48f, 5.8f, 7.79f, 5.25f, 9.5f);
        kp0.r(e, 9.24f, 22.0f, 17.0f, -9.0f);
        e.lineToRelative(-2.09f, -0.73f);
        e.lineToRelative(0.33f, -0.94f);
        e.lineTo(13.0f, 16.0f);
        e.horizontalLineToRelative(4.0f);
        e.lineToRelative(0.0f, -2.0f);
        j50.x(e, -8.03f, -3.0f, 7.0f, 9.02f);
        e.lineTo(14.0f, 22.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.j(e, 8.0f, -3.0f, 17.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cleanHands = build;
        build.getClass();
        return build;
    }
}
