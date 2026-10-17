package androidx.compose.material.icons.rounded;

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
import defpackage.fc;
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DoNotDisturbOffKt {
    private static ImageVector _doNotDisturbOff;

    public static final ImageVector getDoNotDisturbOff(Icons.Rounded rounded) {
        ImageVector imageVector = _doNotDisturbOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.DoNotDisturbOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        m.moveTo(2.1f, 4.93f);
        m.lineToRelative(1.56f, 1.56f);
        m.curveToRelative(-1.37f, 2.07f, -2.0f, 4.68f, -1.48f, 7.45f);
        m.curveToRelative(0.75f, 3.95f, 3.92f, 7.13f, 7.88f, 7.88f);
        m.curveToRelative(2.77f, 0.52f, 5.38f, -0.1f, 7.45f, -1.48f);
        m.lineToRelative(1.56f, 1.56f);
        m.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        m.lineToRelative(0.0f, 0.0f);
        m.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        m.lineTo(3.51f, 3.51f);
        m.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        m.lineToRelative(0.0f, 0.0f);
        m.curveTo(1.71f, 3.91f, 1.71f, 4.54f, 2.1f, 4.93f);
        af0.l(m, 7.0f, 11.0f, 1.17f);
        m.lineToRelative(2.0f, 2.0f);
        m.horizontalLineTo(7.0f);
        m.verticalLineTo(11.0f);
        m.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, m.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _doNotDisturbOff = build;
        build.getClass();
        return build;
    }
}
