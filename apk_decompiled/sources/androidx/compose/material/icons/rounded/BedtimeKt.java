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
public final class BedtimeKt {
    private static ImageVector _bedtime;

    public static final ImageVector getBedtime(Icons.Rounded rounded) {
        ImageVector imageVector = _bedtime;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Bedtime", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(11.65f, 3.46f);
        b.curveToRelative(0.27f, -0.71f, -0.36f, -1.45f, -1.12f, -1.34f);
        b.curveToRelative(-5.52f, 0.8f, -9.47f, 6.07f, -8.34f, 11.88f);
        b.curveToRelative(0.78f, 4.02f, 4.09f, 7.21f, 8.14f, 7.87f);
        b.curveToRelative(3.74f, 0.61f, 7.16f, -0.87f, 9.32f, -3.44f);
        b.curveToRelative(0.48f, -0.57f, 0.19f, -1.48f, -0.55f, -1.62f);
        b.curveTo(13.08f, 15.66f, 9.42f, 9.27f, 11.65f, 3.46f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bedtime = build;
        build.getClass();
        return build;
    }
}
