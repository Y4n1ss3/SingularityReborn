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
import defpackage.af0;
import defpackage.fc;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MicOffKt {
    private static ImageVector _micOff;

    public static final ImageVector getMicOff(Icons.Filled filled) {
        ImageVector imageVector = _micOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.MicOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(19.0f, 11.0f, -1.7f);
        a.curveToRelative(0.0f, 0.74f, -0.16f, 1.43f, -0.43f, 2.05f);
        a.lineToRelative(1.23f, 1.23f);
        a.curveToRelative(0.56f, -0.98f, 0.9f, -2.09f, 0.9f, -3.28f);
        a.close();
        a.moveTo(14.98f, 11.17f);
        a.curveToRelative(0.0f, -0.06f, 0.02f, -0.11f, 0.02f, -0.17f);
        a.lineTo(15.0f, 5.0f);
        a.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        a.reflectiveCurveTo(9.0f, 3.34f, 9.0f, 5.0f);
        uo.t(a, 0.18f, 5.98f, 5.99f);
        a.moveTo(4.27f, 3.0f);
        a.lineTo(3.0f, 4.27f);
        a.lineToRelative(6.01f, 6.01f);
        a.lineTo(9.01f, 11.0f);
        a.curveToRelative(0.0f, 1.66f, 1.33f, 3.0f, 2.99f, 3.0f);
        a.curveToRelative(0.22f, 0.0f, 0.44f, -0.03f, 0.65f, -0.08f);
        a.lineToRelative(1.66f, 1.66f);
        a.curveToRelative(-0.71f, 0.33f, -1.5f, 0.52f, -2.31f, 0.52f);
        a.curveToRelative(-2.76f, 0.0f, -5.3f, -2.1f, -5.3f, -5.1f);
        a.lineTo(5.0f, 11.0f);
        a.curveToRelative(0.0f, 3.41f, 2.72f, 6.23f, 6.0f, 6.72f);
        fc.w(a, 11.0f, 21.0f, 2.0f, -3.28f);
        a.curveToRelative(0.91f, -0.13f, 1.77f, -0.45f, 2.54f, -0.9f);
        a.lineTo(19.73f, 21.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(a, 21.0f, 19.73f, 4.27f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _micOff = build;
        build.getClass();
        return build;
    }
}
