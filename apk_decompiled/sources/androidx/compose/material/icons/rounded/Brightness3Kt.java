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
public final class Brightness3Kt {
    private static ImageVector _brightness3;

    public static final ImageVector getBrightness3(Icons.Rounded rounded) {
        ImageVector imageVector = _brightness3;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Brightness3", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(8.93f, 2.0f);
        b.curveTo(8.88f, 2.0f, 8.84f, 2.0f, 8.79f, 2.0f);
        b.curveTo(7.96f, 2.02f, 7.7f, 3.12f, 8.4f, 3.56f);
        b.curveToRelative(2.78f, 1.77f, 4.63f, 4.89f, 4.63f, 8.44f);
        b.curveToRelative(0.0f, 3.55f, -1.84f, 6.66f, -4.62f, 8.43f);
        b.curveTo(7.7f, 20.89f, 7.98f, 21.98f, 8.82f, 22.0f);
        b.curveToRelative(0.07f, 0.0f, 0.14f, 0.0f, 0.21f, 0.0f);
        b.curveToRelative(6.05f, 0.0f, 10.86f, -5.39f, 9.87f, -11.63f);
        b.curveTo(18.14f, 5.53f, 13.83f, 1.95f, 8.93f, 2.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _brightness3 = build;
        build.getClass();
        return build;
    }
}
