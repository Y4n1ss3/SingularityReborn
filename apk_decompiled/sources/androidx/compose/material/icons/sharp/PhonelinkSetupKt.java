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
import defpackage.gy;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PhonelinkSetupKt {
    private static ImageVector _phonelinkSetup;

    public static final ImageVector getPhonelinkSetup(Icons.Sharp sharp) {
        ImageVector imageVector = _phonelinkSetup;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.PhonelinkSetup", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder m = fc.m(7.0f, 1.0f, 5.0f, 2.0f);
        fc.w(m, 9.0f, 4.0f, 10.0f, 16.0f);
        m.lineTo(9.0f, 20.0f);
        bv.q(m, -2.0f, 7.0f, 18.0f, 5.0f);
        gy.n(m, 14.0f, 21.0f, 1.0f);
        m.moveTo(9.5f, 15.5f);
        m.curveToRelative(0.29f, -0.12f, 0.55f, -0.29f, 0.8f, -0.48f);
        m.lineToRelative(-0.02f, 0.03f);
        m.lineToRelative(1.41f, 0.55f);
        m.lineToRelative(1.27f, -2.2f);
        m.lineToRelative(-1.18f, -0.95f);
        m.lineToRelative(-0.02f, 0.03f);
        m.curveToRelative(0.02f, -0.16f, 0.05f, -0.32f, 0.05f, -0.48f);
        m.reflectiveCurveToRelative(-0.03f, -0.32f, -0.05f, -0.48f);
        m.lineToRelative(0.02f, 0.03f);
        m.lineToRelative(1.18f, -0.95f);
        m.lineToRelative(-1.26f, -2.2f);
        m.lineToRelative(-1.41f, 0.55f);
        m.lineToRelative(0.02f, 0.03f);
        m.curveToRelative(-0.26f, -0.19f, -0.52f, -0.36f, -0.81f, -0.48f);
        m.lineTo(9.27f, 7.0f);
        m.lineTo(6.73f, 7.0f);
        m.lineTo(6.5f, 8.5f);
        m.curveToRelative(-0.29f, 0.12f, -0.55f, 0.29f, -0.8f, 0.48f);
        m.lineToRelative(0.02f, -0.03f);
        m.lineTo(4.3f, 8.4f);
        m.lineToRelative(-1.27f, 2.2f);
        m.lineToRelative(1.18f, 0.95f);
        m.lineToRelative(0.02f, -0.03f);
        m.curveToRelative(-0.01f, 0.16f, -0.04f, 0.32f, -0.04f, 0.48f);
        m.reflectiveCurveToRelative(0.03f, 0.32f, 0.05f, 0.48f);
        m.lineToRelative(-0.02f, -0.03f);
        m.lineToRelative(-1.18f, 0.95f);
        m.lineToRelative(1.27f, 2.2f);
        m.lineToRelative(1.41f, -0.55f);
        m.lineToRelative(-0.02f, -0.03f);
        m.curveToRelative(0.25f, 0.19f, 0.51f, 0.36f, 0.8f, 0.48f);
        m.lineToRelative(0.23f, 1.5f);
        uo.w(m, 2.54f, 0.23f, -1.5f);
        m.moveTo(6.0f, 12.0f);
        m.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        m.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        m.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(m, -2.0f, -0.9f, -2.0f, -2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phonelinkSetup = build;
        build.getClass();
        return build;
    }
}
