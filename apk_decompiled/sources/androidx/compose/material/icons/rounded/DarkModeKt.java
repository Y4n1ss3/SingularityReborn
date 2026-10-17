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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DarkModeKt {
    private static ImageVector _darkMode;

    public static final ImageVector getDarkMode(Icons.Rounded rounded) {
        ImageVector imageVector = _darkMode;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.DarkMode", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(11.01f, 3.05f);
        b.curveTo(6.51f, 3.54f, 3.0f, 7.36f, 3.0f, 12.0f);
        b.curveToRelative(0.0f, 4.97f, 4.03f, 9.0f, 9.0f, 9.0f);
        b.curveToRelative(4.63f, 0.0f, 8.45f, -3.5f, 8.95f, -8.0f);
        b.curveToRelative(0.09f, -0.79f, -0.78f, -1.42f, -1.54f, -0.95f);
        b.curveToRelative(-0.84f, 0.54f, -1.84f, 0.85f, -2.91f, 0.85f);
        b.curveToRelative(-2.98f, 0.0f, -5.4f, -2.42f, -5.4f, -5.4f);
        b.curveToRelative(0.0f, -1.06f, 0.31f, -2.06f, 0.84f, -2.89f);
        b.curveTo(12.39f, 3.94f, 11.9f, 2.98f, 11.01f, 3.05f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _darkMode = build;
        build.getClass();
        return build;
    }
}
