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
import defpackage.j50;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CribKt {
    private static ImageVector _crib;

    public static final ImageVector getCrib(Icons.Rounded rounded) {
        ImageVector imageVector = _crib;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Crib", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.32f, 18.32f);
        b.curveToRelative(-0.36f, -0.36f, -0.92f, -0.4f, -1.31f, -0.08f);
        b.curveToRelative(-0.32f, 0.25f, -0.65f, 0.48f, -1.0f, 0.69f);
        b.verticalLineTo(16.0f);
        b.horizontalLineToRelative(2.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.verticalLineToRelative(-3.0f);
        b.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        b.horizontalLineToRelative(-6.0f);
        b.verticalLineTo(6.0f);
        b.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        b.horizontalLineTo(8.0f);
        b.curveTo(5.79f, 4.0f, 4.0f, 5.79f, 4.0f, 8.0f);
        b.verticalLineToRelative(6.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.horizontalLineToRelative(2.0f);
        b.verticalLineToRelative(2.93f);
        b.curveToRelative(-0.35f, -0.2f, -0.69f, -0.43f, -1.0f, -0.69f);
        b.curveToRelative(-0.39f, -0.32f, -0.96f, -0.27f, -1.31f, 0.08f);
        b.curveToRelative(-0.42f, 0.42f, -0.39f, 1.12f, 0.08f, 1.5f);
        b.curveTo(7.47f, 21.18f, 9.64f, 22.0f, 12.0f, 22.0f);
        b.curveToRelative(2.36f, 0.0f, 4.53f, -0.82f, 6.24f, -2.18f);
        b.curveTo(18.71f, 19.44f, 18.74f, 18.74f, 18.32f, 18.32f);
        b.close();
        b.moveTo(14.0f, 19.75f);
        b.curveTo(13.36f, 19.91f, 12.69f, 20.0f, 12.0f, 20.0f);
        b.curveToRelative(-0.69f, 0.0f, -1.36f, -0.09f, -2.0f, -0.25f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.r(b, 16.0f, 4.0f, 19.75f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _crib = build;
        build.getClass();
        return build;
    }
}
