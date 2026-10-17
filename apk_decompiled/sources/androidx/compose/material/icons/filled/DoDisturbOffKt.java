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
import defpackage.fc;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DoDisturbOffKt {
    private static ImageVector _doDisturbOff;

    public static final ImageVector getDoDisturbOff(Icons.Filled filled) {
        ImageVector imageVector = _doDisturbOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.DoDisturbOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder m = fc.m(17.0f, 11.0f, 2.0f, -1.17f);
        m.lineToRelative(4.51f, 4.51f);
        m.curveTo(21.39f, 15.93f, 22.0f, 14.04f, 22.0f, 12.0f);
        m.curveToRelative(0.0f, -5.52f, -4.48f, -10.0f, -10.0f, -10.0f);
        m.curveTo(9.96f, 2.0f, 8.07f, 2.61f, 6.49f, 3.66f);
        kf0.h(m, 13.83f, 11.0f, 17.0f);
        m.moveTo(1.39f, 4.22f);
        m.lineToRelative(2.27f, 2.27f);
        m.curveTo(2.61f, 8.07f, 2.0f, 9.96f, 2.0f, 12.0f);
        m.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        m.curveToRelative(2.04f, 0.0f, 3.93f, -0.61f, 5.51f, -1.66f);
        m.lineToRelative(2.27f, 2.27f);
        m.lineToRelative(1.41f, -1.41f);
        r6.C(m, 2.81f, 2.81f, 1.39f, 4.22f);
        m.moveTo(7.0f, 11.0f);
        r6.t(m, 1.17f, 2.0f, 2.0f, 7.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(m, 11.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _doDisturbOff = build;
        build.getClass();
        return build;
    }
}
