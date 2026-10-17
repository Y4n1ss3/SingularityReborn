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
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class StrikethroughSKt {
    private static ImageVector _strikethroughS;

    public static final ImageVector getStrikethroughS(Icons.Filled filled) {
        ImageVector imageVector = _strikethroughS;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.StrikethroughS", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(6.85f, 7.08f);
        b.curveTo(6.85f, 4.37f, 9.45f, 3.0f, 12.24f, 3.0f);
        b.curveToRelative(1.64f, 0.0f, 3.0f, 0.49f, 3.9f, 1.28f);
        b.curveToRelative(0.77f, 0.65f, 1.46f, 1.73f, 1.46f, 3.24f);
        b.horizontalLineToRelative(-3.01f);
        b.curveToRelative(0.0f, -0.31f, -0.05f, -0.59f, -0.15f, -0.85f);
        b.curveToRelative(-0.29f, -0.86f, -1.2f, -1.28f, -2.25f, -1.28f);
        b.curveToRelative(-1.86f, 0.0f, -2.34f, 1.02f, -2.34f, 1.7f);
        b.curveToRelative(0.0f, 0.48f, 0.25f, 0.88f, 0.74f, 1.21f);
        b.curveTo(10.97f, 8.55f, 11.36f, 8.78f, 12.0f, 9.0f);
        b.horizontalLineTo(7.39f);
        b.curveTo(7.18f, 8.66f, 6.85f, 8.11f, 6.85f, 7.08f);
        af0.A(b, 21.0f, 12.0f, -2.0f, 3.0f);
        b.verticalLineToRelative(2.0f);
        b.horizontalLineToRelative(9.62f);
        b.curveToRelative(1.15f, 0.45f, 1.96f, 0.75f, 1.96f, 1.97f);
        b.curveToRelative(0.0f, 1.0f, -0.81f, 1.67f, -2.28f, 1.67f);
        b.curveToRelative(-1.54f, 0.0f, -2.93f, -0.54f, -2.93f, -2.51f);
        b.horizontalLineTo(6.4f);
        b.curveToRelative(0.0f, 0.55f, 0.08f, 1.13f, 0.24f, 1.58f);
        b.curveToRelative(0.81f, 2.29f, 3.29f, 3.3f, 5.67f, 3.3f);
        b.curveToRelative(2.27f, 0.0f, 5.3f, -0.89f, 5.3f, -4.05f);
        b.curveToRelative(0.0f, -0.3f, -0.01f, -1.16f, -0.48f, -1.94f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.o(b, 21.0f, 12.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _strikethroughS = build;
        build.getClass();
        return build;
    }
}
