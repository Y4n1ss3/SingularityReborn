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
import defpackage.gy;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class KeyOffKt {
    private static ImageVector _keyOff;

    public static final ImageVector getKeyOff(Icons.Rounded rounded) {
        ImageVector imageVector = _keyOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.KeyOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(12.83f, 10.0f, 4.09f, 4.09f);
        e.lineTo(17.0f, 14.0f);
        e.lineToRelative(1.29f, 1.29f);
        e.curveToRelative(0.39f, 0.39f, 1.03f, 0.39f, 1.42f, 0.0f);
        e.lineToRelative(2.59f, -2.61f);
        e.curveToRelative(0.39f, -0.39f, 0.39f, -1.03f, -0.01f, -1.42f);
        e.lineToRelative(-0.99f, -0.97f);
        e.curveTo(21.1f, 10.1f, 20.85f, 10.0f, 20.59f, 10.0f);
        k4.w(e, 12.83f, 19.07f, 21.9f);
        e.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        e.reflectiveCurveToRelative(0.39f, -1.02f, 0.0f, -1.41f);
        e.lineTo(3.51f, 3.51f);
        e.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        e.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        e.lineToRelative(1.88f, 1.88f);
        e.curveTo(2.2f, 7.85f, 1.0f, 9.79f, 1.0f, 12.0f);
        e.curveToRelative(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f);
        e.curveToRelative(2.21f, 0.0f, 4.15f, -1.2f, 5.18f, -2.99f);
        uo.l(e, 19.07f, 21.9f, 9.91f, 12.74f);
        e.curveTo(9.58f, 14.03f, 8.4f, 15.0f, 7.0f, 15.0f);
        e.curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f);
        e.curveToRelative(0.0f, -1.4f, 0.97f, -2.58f, 2.26f, -2.91f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(e, 9.91f, 12.74f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _keyOff = build;
        build.getClass();
        return build;
    }
}
