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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ModeEditOutlineKt {
    private static ImageVector _modeEditOutline;

    public static final ImageVector getModeEditOutline(Icons.Rounded rounded) {
        ImageVector imageVector = _modeEditOutline;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ModeEditOutline", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(3.0f, 17.46f, 0.0f, 3.04f);
        e.curveTo(3.0f, 20.78f, 3.22f, 21.0f, 3.5f, 21.0f);
        e.horizontalLineToRelative(3.04f);
        e.curveToRelative(0.13f, 0.0f, 0.26f, -0.05f, 0.35f, -0.15f);
        e.lineTo(17.81f, 9.94f);
        e.lineToRelative(-3.75f, -3.75f);
        e.lineTo(3.15f, 17.1f);
        e.curveTo(3.05f, 17.2f, 3.0f, 17.32f, 3.0f, 17.46f);
        e.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e2 = k4.e(20.71f, 5.63f, -2.34f, -2.34f);
        e2.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        e2.lineToRelative(-1.83f, 1.83f);
        e2.lineToRelative(3.75f, 3.75f);
        e2.lineToRelative(1.83f, -1.83f);
        e2.curveTo(21.1f, 6.65f, 21.1f, 6.02f, 20.71f, 5.63f);
        e2.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _modeEditOutline = build;
        build.getClass();
        return build;
    }
}
