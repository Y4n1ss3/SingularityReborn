package androidx.compose.material.icons.filled;

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
public final class NightlightRoundKt {
    private static ImageVector _nightlightRound;

    public static final ImageVector getNightlightRound(Icons.Filled filled) {
        ImageVector imageVector = _nightlightRound;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.NightlightRound", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.01f, 12.0f);
        b.curveToRelative(0.0f, -3.57f, 2.2f, -6.62f, 5.31f, -7.87f);
        b.curveToRelative(0.89f, -0.36f, 0.75f, -1.69f, -0.19f, -1.9f);
        b.curveToRelative(-1.1f, -0.24f, -2.27f, -0.3f, -3.48f, -0.14f);
        b.curveToRelative(-4.51f, 0.6f, -8.12f, 4.31f, -8.59f, 8.83f);
        b.curveTo(4.44f, 16.93f, 9.13f, 22.0f, 15.01f, 22.0f);
        b.curveToRelative(0.73f, 0.0f, 1.43f, -0.08f, 2.12f, -0.23f);
        b.curveToRelative(0.95f, -0.21f, 1.1f, -1.53f, 0.2f, -1.9f);
        b.curveToRelative(-3.22f, -1.29f, -5.33f, -4.41f, -5.32f, -7.87f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _nightlightRound = build;
        build.getClass();
        return build;
    }
}
