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
import defpackage.gy;
import defpackage.k4;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LocalDrinkKt {
    private static ImageVector _localDrink;

    public static final ImageVector getLocalDrink(Icons.Rounded rounded) {
        ImageVector imageVector = _localDrink;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.LocalDrink", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(5.23f, 2.0f);
        b.curveTo(4.04f, 2.0f, 3.11f, 3.04f, 3.24f, 4.22f);
        b.lineToRelative(1.77f, 16.01f);
        b.curveTo(5.13f, 21.23f, 5.97f, 22.0f, 7.0f, 22.0f);
        b.horizontalLineToRelative(10.0f);
        b.curveToRelative(1.03f, 0.0f, 1.87f, -0.77f, 1.99f, -1.77f);
        b.lineToRelative(1.77f, -16.01f);
        b.curveToRelative(0.13f, -1.18f, -0.8f, -2.22f, -1.99f, -2.22f);
        uo.l(b, 5.23f, 2.0f, 12.0f, 19.0f);
        b.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        b.curveToRelative(0.0f, -1.55f, 1.81f, -3.95f, 2.62f, -4.94f);
        b.curveToRelative(0.2f, -0.25f, 0.57f, -0.25f, 0.77f, 0.0f);
        b.curveToRelative(0.81f, 1.0f, 2.62f, 3.39f, 2.62f, 4.94f);
        b.curveToRelative(-0.01f, 1.66f, -1.35f, 3.0f, -3.01f, 3.0f);
        k4.r(b, 18.33f, 8.0f, 5.67f, 8.0f);
        b.lineToRelative(-0.32f, -2.89f);
        b.curveToRelative(-0.06f, -0.59f, 0.4f, -1.11f, 1.0f, -1.11f);
        b.horizontalLineToRelative(11.3f);
        b.curveToRelative(0.59f, 0.0f, 1.06f, 0.52f, 0.99f, 1.11f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b, 18.33f, 8.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _localDrink = build;
        build.getClass();
        return build;
    }
}
