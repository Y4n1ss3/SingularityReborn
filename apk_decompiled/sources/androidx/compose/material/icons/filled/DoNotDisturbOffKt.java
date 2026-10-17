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
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DoNotDisturbOffKt {
    private static ImageVector _doNotDisturbOff;

    public static final ImageVector getDoNotDisturbOff(Icons.Filled filled) {
        ImageVector imageVector = _doNotDisturbOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.DoNotDisturbOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder m = fc.m(17.0f, 11.0f, 2.0f, -1.46f);
        m.lineToRelative(4.68f, 4.68f);
        m.curveTo(21.34f, 16.07f, 22.0f, 14.11f, 22.0f, 12.0f);
        m.curveToRelative(0.0f, -5.52f, -4.48f, -10.0f, -10.0f, -10.0f);
        m.curveToRelative(-2.11f, 0.0f, -4.07f, 0.66f, -5.68f, 1.78f);
        kf0.h(m, 13.54f, 11.0f, 17.0f);
        m.moveTo(2.27f, 2.27f);
        m.lineTo(1.0f, 3.54f);
        m.lineToRelative(2.78f, 2.78f);
        m.curveTo(2.66f, 7.93f, 2.0f, 9.89f, 2.0f, 12.0f);
        m.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        m.curveToRelative(2.11f, 0.0f, 4.07f, -0.66f, 5.68f, -1.78f);
        m.lineTo(20.46f, 23.0f);
        m.lineToRelative(1.27f, -1.27f);
        r6.C(m, 11.0f, 11.0f, 2.27f, 2.27f);
        bv.y(m, 7.0f, 13.0f, -2.0f, 1.46f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.d(m, 2.0f, 2.0f, 7.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _doNotDisturbOff = build;
        build.getClass();
        return build;
    }
}
