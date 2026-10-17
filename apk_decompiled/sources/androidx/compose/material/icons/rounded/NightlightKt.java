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
public final class NightlightKt {
    private static ImageVector _nightlight;

    public static final ImageVector getNightlight(Icons.Rounded rounded) {
        ImageVector imageVector = _nightlight;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Nightlight", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(11.57f, 2.3f);
        b.curveToRelative(2.38f, -0.59f, 4.68f, -0.27f, 6.63f, 0.64f);
        b.curveToRelative(0.35f, 0.16f, 0.41f, 0.64f, 0.1f, 0.86f);
        b.curveTo(15.7f, 5.6f, 14.0f, 8.6f, 14.0f, 12.0f);
        b.reflectiveCurveToRelative(1.7f, 6.4f, 4.3f, 8.2f);
        b.curveToRelative(0.32f, 0.22f, 0.26f, 0.7f, -0.09f, 0.86f);
        b.curveTo(16.93f, 21.66f, 15.5f, 22.0f, 14.0f, 22.0f);
        b.curveToRelative(-6.05f, 0.0f, -10.85f, -5.38f, -9.87f, -11.6f);
        b.curveTo(4.74f, 6.48f, 7.72f, 3.24f, 11.57f, 2.3f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _nightlight = build;
        build.getClass();
        return build;
    }
}
