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
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PaletteKt {
    private static ImageVector _palette;

    public static final ImageVector getPalette(Icons.Rounded rounded) {
        ImageVector imageVector = _palette;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Palette", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveTo(6.49f, 2.0f, 2.0f, 6.49f, 2.0f, 12.0f);
        b.reflectiveCurveToRelative(4.49f, 10.0f, 10.0f, 10.0f);
        b.curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        b.curveToRelative(0.0f, -0.61f, -0.23f, -1.2f, -0.64f, -1.67f);
        b.curveToRelative(-0.08f, -0.1f, -0.13f, -0.21f, -0.13f, -0.33f);
        b.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        b.horizontalLineTo(16.0f);
        b.curveToRelative(3.31f, 0.0f, 6.0f, -2.69f, 6.0f, -6.0f);
        b.curveTo(22.0f, 6.04f, 17.51f, 2.0f, 12.0f, 2.0f);
        b.close();
        b.moveTo(17.5f, 13.0f);
        b.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        b.curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f);
        b.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        b.curveTo(19.0f, 12.33f, 18.33f, 13.0f, 17.5f, 13.0f);
        b.close();
        b.moveTo(14.5f, 9.0f);
        b.curveTo(13.67f, 9.0f, 13.0f, 8.33f, 13.0f, 7.5f);
        b.curveTo(13.0f, 6.67f, 13.67f, 6.0f, 14.5f, 6.0f);
        b.reflectiveCurveTo(16.0f, 6.67f, 16.0f, 7.5f);
        b.curveTo(16.0f, 8.33f, 15.33f, 9.0f, 14.5f, 9.0f);
        b.close();
        b.moveTo(5.0f, 11.5f);
        b.curveTo(5.0f, 10.67f, 5.67f, 10.0f, 6.5f, 10.0f);
        b.reflectiveCurveTo(8.0f, 10.67f, 8.0f, 11.5f);
        b.curveTo(8.0f, 12.33f, 7.33f, 13.0f, 6.5f, 13.0f);
        b.reflectiveCurveTo(5.0f, 12.33f, 5.0f, 11.5f);
        b.close();
        b.moveTo(11.0f, 7.5f);
        b.curveTo(11.0f, 8.33f, 10.33f, 9.0f, 9.5f, 9.0f);
        b.reflectiveCurveTo(8.0f, 8.33f, 8.0f, 7.5f);
        b.curveTo(8.0f, 6.67f, 8.67f, 6.0f, 9.5f, 6.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 11.0f, 6.67f, 11.0f, 7.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _palette = build;
        build.getClass();
        return build;
    }
}
