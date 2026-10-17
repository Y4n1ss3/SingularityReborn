package androidx.compose.material.icons.sharp;

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
public final class BuildKt {
    private static ImageVector _build;

    public static final ImageVector getBuild(Icons.Sharp sharp) {
        ImageVector imageVector = _build;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Build", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.09f, 2.91f);
        b.curveTo(10.08f, 0.9f, 7.07f, 0.49f, 4.65f, 1.67f);
        b.lineToRelative(4.34f, 4.34f);
        b.lineToRelative(-3.0f, 3.0f);
        b.lineToRelative(-4.34f, -4.34f);
        b.curveTo(0.48f, 7.1f, 0.89f, 10.09f, 2.9f, 12.1f);
        b.curveToRelative(1.86f, 1.86f, 4.58f, 2.35f, 6.89f, 1.48f);
        b.lineToRelative(9.82f, 9.82f);
        b.lineToRelative(3.71f, -3.71f);
        b.lineToRelative(-9.78f, -9.79f);
        b.curveToRelative(0.92f, -2.34f, 0.44f, -5.1f, -1.45f, -6.99f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _build = build;
        build.getClass();
        return build;
    }
}
