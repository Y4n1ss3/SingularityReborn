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
import defpackage.k4;
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HowToRegKt {
    private static ImageVector _howToReg;

    public static final ImageVector getHowToReg(Icons.Rounded rounded) {
        ImageVector imageVector = _howToReg;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.HowToReg", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(12.0f, 20.0f, -0.86f, -0.86f);
        e.curveToRelative(-1.18f, -1.18f, -1.17f, -3.1f, 0.02f, -4.26f);
        e.lineToRelative(0.84f, -0.82f);
        e.curveToRelative(-0.39f, -0.04f, -0.68f, -0.06f, -1.0f, -0.06f);
        e.curveToRelative(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f);
        kf0.C(e, 2.0f, 9.0f, 11.0f, 12.0f);
        e.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        e.reflectiveCurveToRelative(-1.79f, -4.0f, -4.0f, -4.0f);
        e.reflectiveCurveToRelative(-4.0f, 1.79f, -4.0f, 4.0f);
        e.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(16.18f, 19.78f);
        b.curveToRelative(-0.39f, 0.39f, -1.03f, 0.39f, -1.42f, 0.0f);
        b.lineToRelative(-2.07f, -2.09f);
        b.curveToRelative(-0.38f, -0.39f, -0.38f, -1.01f, 0.0f, -1.39f);
        b.lineToRelative(0.01f, -0.01f);
        b.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.4f, 0.0f);
        b.lineToRelative(1.37f, 1.37f);
        b.lineToRelative(4.43f, -4.46f);
        b.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        b.lineToRelative(0.01f, 0.01f);
        b.curveToRelative(0.38f, 0.39f, 0.38f, 1.01f, 0.0f, 1.39f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.g(b, -5.14f, 5.18f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _howToReg = build;
        build.getClass();
        return build;
    }
}
