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
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AutoFixNormalKt {
    private static ImageVector _autoFixNormal;

    public static final ImageVector getAutoFixNormal(Icons.Rounded rounded) {
        ImageVector imageVector = _autoFixNormal;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AutoFixNormal", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(20.45f, 6.0f, 0.49f, -1.06f);
        e.lineTo(22.0f, 4.45f);
        e.curveToRelative(0.39f, -0.18f, 0.39f, -0.73f, 0.0f, -0.91f);
        e.lineToRelative(-1.06f, -0.49f);
        e.lineTo(20.45f, 2.0f);
        e.curveToRelative(-0.18f, -0.39f, -0.73f, -0.39f, -0.91f, 0.0f);
        e.lineToRelative(-0.49f, 1.06f);
        e.lineTo(18.0f, 3.55f);
        e.curveToRelative(-0.39f, 0.18f, -0.39f, 0.73f, 0.0f, 0.91f);
        e.lineToRelative(1.06f, 0.49f);
        e.lineTo(19.55f, 6.0f);
        e.curveTo(19.72f, 6.39f, 20.28f, 6.39f, 20.45f, 6.0f);
        e.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e2 = k4.e(17.71f, 9.12f, -2.83f, -2.83f);
        e2.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        e2.lineTo(2.29f, 17.46f);
        e2.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        e2.lineToRelative(2.83f, 2.83f);
        e2.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        e2.lineToRelative(11.17f, -11.17f);
        e2.curveTo(18.1f, 10.15f, 18.1f, 9.51f, 17.71f, 9.12f);
        k4.x(e2, 14.21f, 11.21f, -1.41f, -1.41f);
        e2.lineToRelative(1.38f, -1.38f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(e2, 1.41f, 1.41f, 14.21f, 11.21f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _autoFixNormal = build;
        build.getClass();
        return build;
    }
}
