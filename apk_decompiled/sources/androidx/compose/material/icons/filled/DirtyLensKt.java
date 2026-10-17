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
import defpackage.af0;
import defpackage.gy;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DirtyLensKt {
    private static ImageVector _dirtyLens;

    public static final ImageVector getDirtyLens(Icons.Filled filled) {
        ImageVector imageVector = _dirtyLens;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.DirtyLens", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(12.95f, 19.0f, 20.0f, 19.0f);
        i.lineTo(20.0f, 7.0f);
        af0.m(i, 4.0f, 7.0f, 12.0f, 7.24f);
        i.curveToRelative(0.14f, -0.98f, 0.42f, -2.05f, -0.16f, -2.43f);
        i.curveToRelative(-0.89f, -0.59f, -1.27f, 2.06f, -2.8f, 1.35f);
        i.curveToRelative(-1.39f, -1.12f, 1.05f, -1.29f, 0.5f, -3.27f);
        i.curveToRelative(-0.22f, -0.79f, -2.28f, 0.36f, -2.4f, -1.24f);
        i.curveToRelative(-0.08f, -1.0f, 1.49f, -0.74f, 1.51f, -1.49f);
        i.curveToRelative(0.03f, -0.75f, -1.03f, -1.05f, -0.25f, -1.91f);
        i.curveToRelative(0.22f, -0.24f, 0.71f, -0.26f, 0.91f, -0.19f);
        i.curveToRelative(0.79f, 0.27f, 1.55f, 1.82f, 2.51f, 1.19f);
        i.curveToRelative(1.03f, -0.66f, -1.88f, -2.35f, 0.0f, -2.86f);
        i.curveToRelative(1.64f, -0.44f, 1.31f, 2.08f, 2.65f, 2.44f);
        i.curveToRelative(1.94f, 0.52f, 2.65f, -4.55f, 4.41f, -2.33f);
        i.curveToRelative(1.85f, 2.33f, -3.43f, 2.27f, -2.85f, 4.01f);
        i.curveToRelative(0.34f, 1.01f, 2.15f, -1.2f, 2.76f, 0.53f);
        i.curveToRelative(0.64f, 1.83f, -3.09f, 0.82f, -3.04f, 1.66f);
        i.curveToRelative(0.06f, 0.83f, 2.41f, 0.55f, 1.64f, 2.12f);
        i.curveToRelative(-1.14f, 1.86f, -3.0f, -1.03f, -3.81f, 0.09f);
        i.curveToRelative(-0.39f, 0.57f, -0.09f, 1.49f, 0.13f, 2.33f);
        i.close();
        i.moveTo(20.0f, 5.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        i.verticalLineToRelative(12.0f);
        i.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        i.lineTo(4.0f, 21.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        i.lineTo(2.0f, 7.0f);
        i.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        uo.n(i, 3.17f, 9.0f, 3.0f, 6.0f);
        gy.B(i, 1.83f, 2.0f, 20.0f, 5.0f);
        i.moveTo(18.14f, 18.01f);
        i.curveToRelative(-0.47f, 0.0f, -0.86f, -0.38f, -0.86f, -0.86f);
        i.reflectiveCurveToRelative(0.38f, -0.86f, 0.86f, -0.86f);
        i.curveToRelative(0.47f, 0.0f, 0.86f, 0.38f, 0.86f, 0.86f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(i, -0.38f, 0.86f, -0.86f, 0.86f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dirtyLens = build;
        build.getClass();
        return build;
    }
}
