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
import defpackage.bv;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EnergySavingsLeafKt {
    private static ImageVector _energySavingsLeaf;

    public static final ImageVector getEnergySavingsLeaf(Icons.Sharp sharp) {
        ImageVector imageVector = _energySavingsLeaf;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.EnergySavingsLeaf", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        bv.z(b, 3.0f, 12.0f, 10.5f, 17.0f);
        b.lineTo(10.0f, 16.5f);
        b.lineToRelative(2.5f, -3.5f);
        b.lineToRelative(-5.0f, -0.5f);
        b.lineToRelative(6.0f, -5.5f);
        b.lineTo(14.0f, 7.5f);
        b.lineTo(11.5f, 11.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(b, 5.0f, 0.5f, 10.5f, 17.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _energySavingsLeaf = build;
        build.getClass();
        return build;
    }
}
