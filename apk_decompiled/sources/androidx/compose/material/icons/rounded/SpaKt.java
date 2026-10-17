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
public final class SpaKt {
    private static ImageVector _spa;

    public static final ImageVector getSpa(Icons.Rounded rounded) {
        ImageVector imageVector = _spa;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Spa", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(15.49f, 9.63f);
        b.curveToRelative(-0.16f, -2.42f, -1.03f, -4.79f, -2.64f, -6.76f);
        b.curveToRelative(-0.41f, -0.5f, -1.16f, -0.5f, -1.57f, 0.0f);
        b.curveToRelative(-1.65f, 1.98f, -2.57f, 4.35f, -2.77f, 6.76f);
        b.curveToRelative(1.28f, 0.68f, 2.46f, 1.56f, 3.49f, 2.63f);
        b.curveToRelative(1.03f, -1.06f, 2.21f, -1.94f, 3.49f, -2.63f);
        b.close();
        b.moveTo(8.99f, 12.28f);
        b.curveToRelative(-0.14f, -0.1f, -0.3f, -0.19f, -0.45f, -0.29f);
        b.curveToRelative(0.15f, 0.11f, 0.31f, 0.19f, 0.45f, 0.29f);
        b.close();
        b.moveTo(15.41f, 12.03f);
        b.curveToRelative(-0.13f, 0.09f, -0.27f, 0.16f, -0.4f, 0.26f);
        b.curveToRelative(0.13f, -0.1f, 0.27f, -0.17f, 0.4f, -0.26f);
        b.close();
        b.moveTo(12.0f, 15.45f);
        b.curveToRelative(-1.95f, -2.97f, -5.14f, -5.03f, -8.83f, -5.39f);
        b.curveToRelative(-0.64f, -0.06f, -1.17f, 0.47f, -1.11f, 1.11f);
        b.curveToRelative(0.45f, 4.8f, 3.65f, 8.78f, 7.98f, 10.33f);
        b.curveToRelative(0.63f, 0.23f, 1.29f, 0.4f, 1.97f, 0.51f);
        b.curveToRelative(0.68f, -0.12f, 1.33f, -0.29f, 1.97f, -0.51f);
        b.curveToRelative(4.33f, -1.55f, 7.53f, -5.52f, 7.98f, -10.33f);
        b.curveToRelative(0.06f, -0.64f, -0.48f, -1.17f, -1.11f, -1.11f);
        b.curveToRelative(-3.71f, 0.36f, -6.9f, 2.42f, -8.85f, 5.39f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _spa = build;
        build.getClass();
        return build;
    }
}
