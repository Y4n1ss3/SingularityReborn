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
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ModeFanOffKt {
    private static ImageVector _modeFanOff;

    public static final ImageVector getModeFanOff(Icons.Rounded rounded) {
        ImageVector imageVector = _modeFanOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ModeFanOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(16.34f, 8.36f, -2.29f, 0.82f);
        e.curveToRelative(-0.18f, -0.13f, -0.38f, -0.25f, -0.58f, -0.34f);
        e.curveToRelative(0.17f, -0.83f, 0.63f, -1.58f, 1.36f, -2.06f);
        e.curveTo(16.85f, 5.44f, 16.18f, 2.0f, 13.39f, 2.0f);
        e.curveToRelative(-3.08f, 0.0f, -4.9f, 1.47f, -5.3f, 3.26f);
        e.lineTo(18.73f, 15.9f);
        e.curveToRelative(1.5f, 0.39f, 3.27f, -0.51f, 3.27f, -2.51f);
        e.curveTo(22.0f, 9.0f, 18.99f, 7.16f, 16.34f, 8.36f);
        e.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(2.1f, 3.51f, 2.1f, 3.51f);
        i.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        i.lineTo(5.27f, 8.1f);
        i.curveTo(3.77f, 7.7f, 2.0f, 8.61f, 2.0f, 10.61f);
        i.curveToRelative(0.0f, 4.4f, 3.01f, 6.24f, 5.66f, 5.03f);
        i.lineToRelative(2.29f, -0.82f);
        i.curveToRelative(0.18f, 0.13f, 0.38f, 0.25f, 0.58f, 0.34f);
        i.curveToRelative(-0.17f, 0.83f, -0.63f, 1.58f, -1.36f, 2.06f);
        i.curveTo(7.15f, 18.56f, 7.82f, 22.0f, 10.61f, 22.0f);
        i.curveToRelative(3.08f, 0.0f, 4.9f, -1.47f, 5.3f, -3.26f);
        i.lineToRelative(3.16f, 3.16f);
        i.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        i.lineToRelative(0.0f, 0.0f);
        i.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        i.lineTo(3.51f, 3.51f);
        i.curveTo(3.12f, 3.12f, 2.49f, 3.12f, 2.1f, 3.51f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _modeFanOff = build;
        build.getClass();
        return build;
    }
}
