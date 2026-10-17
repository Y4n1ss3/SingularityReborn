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
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NoFoodKt {
    private static ImageVector _noFood;

    public static final ImageVector getNoFood(Icons.Filled filled) {
        ImageVector imageVector = _noFood;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.NoFood", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder k = gy.k(11.35f, 8.52f, 11.0f, 5.0f, 5.0f);
        uf.p(k, 1.0f, 2.0f, 4.0f, 5.0f);
        gy.B(k, -1.38f, 13.79f, 11.35f, 8.52f);
        k.moveTo(1.0f, 21.0f);
        k.verticalLineToRelative(1.0f);
        k.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        k.horizontalLineToRelative(13.0f);
        k.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        kf0.n(k, -1.0f, 1.0f, 21.9f, 21.9f);
        k.lineTo(2.1f, 2.1f);
        k.lineTo(0.69f, 3.51f);
        k.lineToRelative(5.7f, 5.7f);
        k.curveTo(3.28f, 9.87f, 1.0f, 11.99f, 1.0f, 15.0f);
        r6.t(k, 11.17f, 2.0f, 2.0f, 1.0f);
        kf0.z(k, 2.0f, 15.0f, -0.17f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(k, 4.49f, 4.49f, 21.9f, 21.9f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noFood = build;
        build.getClass();
        return build;
    }
}
