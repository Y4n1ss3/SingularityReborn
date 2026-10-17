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
import defpackage.gy;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EnergySavingsLeafKt {
    private static ImageVector _energySavingsLeaf;

    public static final ImageVector getEnergySavingsLeaf(Icons.Filled filled) {
        ImageVector imageVector = _energySavingsLeaf;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.EnergySavingsLeaf", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 3.0f);
        b.curveToRelative(-4.8f, 0.0f, -9.0f, 3.86f, -9.0f, 9.0f);
        b.curveToRelative(0.0f, 2.12f, 0.74f, 4.07f, 1.97f, 5.61f);
        b.lineTo(3.0f, 19.59f);
        b.lineTo(4.41f, 21.0f);
        b.lineToRelative(1.97f, -1.97f);
        b.curveTo(7.93f, 20.26f, 9.88f, 21.0f, 12.0f, 21.0f);
        b.curveToRelative(2.3f, 0.0f, 4.61f, -0.88f, 6.36f, -2.64f);
        b.curveTo(20.12f, 16.61f, 21.0f, 14.3f, 21.0f, 12.0f);
        gy.B(b, 0.0f, -9.0f, 12.0f, 3.0f);
        b.moveTo(15.83f, 12.26f);
        b.lineToRelative(-5.16f, 4.63f);
        b.curveToRelative(-0.16f, 0.15f, -0.41f, 0.14f, -0.56f, -0.01f);
        b.curveToRelative(-0.14f, -0.14f, -0.16f, -0.36f, -0.04f, -0.52f);
        b.lineToRelative(2.44f, -3.33f);
        b.lineToRelative(-4.05f, -0.4f);
        b.curveToRelative(-0.44f, -0.04f, -0.63f, -0.59f, -0.3f, -0.89f);
        b.lineToRelative(5.16f, -4.63f);
        b.curveToRelative(0.16f, -0.15f, 0.41f, -0.14f, 0.56f, 0.01f);
        b.curveToRelative(0.14f, 0.14f, 0.16f, 0.36f, 0.04f, 0.52f);
        b.lineToRelative(-2.44f, 3.33f);
        b.lineToRelative(4.05f, 0.4f);
        b.curveTo(15.98f, 11.41f, 16.16f, 11.96f, 15.83f, 12.26f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _energySavingsLeaf = build;
        build.getClass();
        return build;
    }
}
